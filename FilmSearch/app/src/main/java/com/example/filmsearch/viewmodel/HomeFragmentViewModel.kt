package com.example.filmsearch.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filmsearch.App
import com.example.filmsearch.domain.Film
import com.example.filmsearch.domain.Interactor
import okhttp3.internal.Internal.instance
import org.koin.core.KoinComponent
import org.koin.core.inject

class HomeFragmentViewModel : ViewModel(), KoinComponent {
    val filmsListLiveData:  MutableLiveData<List<Film>> = MutableLiveData()
    //Инициализируем интерактор
    private val interactor: Interactor by inject()

    init {
        interactor.getFilmsFromApi(1, object : ApiCallback {
            override fun onSuccess(films: List<Film>) {
                filmsListLiveData.postValue(films)
            }

            override fun onFailure() {
            }
        })
    }

    interface ApiCallback {
        fun onSuccess(films: List<Film>)
        fun onFailure()
    }
}
