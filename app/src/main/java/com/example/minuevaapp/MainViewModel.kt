package com.example.minuevaapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _resultLiveData = MutableLiveData<String>()
    val resultLiveData: LiveData<String>
        get() = _resultLiveData

    fun compareTexts(text1: String, text2: String): Boolean {
        return text1 == text2
    }
}