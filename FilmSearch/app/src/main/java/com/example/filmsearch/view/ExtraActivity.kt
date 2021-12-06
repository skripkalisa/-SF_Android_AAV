package com.example.filmsearch.view

import android.Manifest
import android.content.ContentValues
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Build
import android.provider.MediaStore
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

// Testing stuff. Safe to delete
open class ExtraActivity : AppCompatActivity(){
    @RequiresApi(Build.VERSION_CODES.Q)
    internal fun loadToGallery(bitmap: Bitmap) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            //Задаем информацию для файла
            val contentValues = ContentValues().apply {
                //Название файла
                put(MediaStore.Images.Media.DISPLAY_NAME, "Картинка кота")
                //Описание
                put(MediaStore.Images.Media.DESCRIPTION, "Картинка очень смешного кота")
                //Тип файла
                put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
                //Дата создания
                put(MediaStore.Images.Media.DATE_ADDED, System.currentTimeMillis())
                //Опционально можно создать подпапку в галерее
                put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/MyApp")
            }
            //Получаем экземпляр объекта ContentResolver
            val contentResolver = contentResolver
            //Указываем в какую коллекцию будем класть, в данном случае Images
            val uri = contentResolver.insert(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                contentValues
            )
            //Открываем поток
            val outputStream = contentResolver.openOutputStream(uri!!)
            //Загружаем картинку, опционально можно задать уровень компрессии
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
            //Закрываем поток
            outputStream?.close()
        } else {
            @Suppress("DEPRECATION")
            MediaStore.Images.Media.insertImage(
                contentResolver,
                bitmap,
                "Картинка титул",
                "Картинка описание"
            )
        }
    }

    internal fun requestPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
            1
        )
    }

    internal fun checkPermission(): Boolean {
        val result = ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
        return result == PackageManager.PERMISSION_GRANTED
    }
}