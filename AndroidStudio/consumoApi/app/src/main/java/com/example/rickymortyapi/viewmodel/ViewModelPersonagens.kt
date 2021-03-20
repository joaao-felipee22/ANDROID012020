package com.example.rickymortyapi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rickymortyapi.model.Result
import com.example.rickymortyapi.repository.RepositoryApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModelPersonagens : ViewModel() {

    val listMutableCharacter = MutableLiveData<List<Result>>()
    private val repository = RepositoryApi()

    fun getAllCharacters() = CoroutineScope(Dispatchers.IO).launch {
        repository.getCharacterService().let { charactersResponse ->
            listMutableCharacter.postValue(charactersResponse.results)
        }
    }

}