package com.example.rickymortyapi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rickymortyapi.model.Result
import com.example.rickymortyapi.repository.RepositoryApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.net.UnknownHostException

class ViewModelPersonagens : ViewModel() {

    val listMutableCharacter = MutableLiveData<List<Result>>()
    val loading = MutableLiveData<Boolean>()
    val errorMessage = MutableLiveData<String>()
    private val repository = RepositoryApi()

    init {
        getAllCharacters()
    }

    fun getAllCharacters() = CoroutineScope(IO).launch {
        loading.postValue(true)
        try {
            repository.getCharacterService().let { charactersResponse ->
                listMutableCharacter.postValue(charactersResponse.data.results)
                loading.postValue(false)
            }
        }catch (error: Throwable){
            loading.postValue(false)
            handleError(error)
        }
    }

    private fun handleError(error: Throwable) {
        when(error){
            is HttpException -> errorMessage.postValue("Erro de conexão código: ${error.code()}")
            is UnknownHostException -> errorMessage.postValue("Verifique sua conexão")
        }
    }
}