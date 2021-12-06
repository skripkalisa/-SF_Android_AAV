package com.example.filmsearch

import android.app.Application
import android.os.Environment
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
// Testing storage. Safe to delete
open class TestStorage : Application(){
    internal fun testStorage() {
        //Имя файла
        val filename = "MyFile"
        //Содержимое файла
        val contents = "Contents"
        //Открываем поток для записи
        this.openFileOutput(filename, MODE_PRIVATE).use {
            it.write(contents.toByteArray())
        }

        this.openFileInput(filename).bufferedReader().useLines { lines ->
            var result = ""
            lines.forEach {
                result += it
            }
            println(result)


            val externalState = Environment.getExternalStorageState()
            println(externalState)

            //Получаем состояние хранилища

            //Название файла
            val externalFileName = "MyExternalFile"
            //Производим проверку состояния
            if (externalState == Environment.MEDIA_MOUNTED) {
                //Создаем файл в хранилище
                val file = File(this.getExternalFilesDir(null), externalFileName)
                //Создаем буфер для записи, используем use, чтобы закрыть потом поток
                BufferedWriter(FileWriter(file)).use {
                    //Пишем в файл
                    it.write("123")
                }
            }
        }
    }

}