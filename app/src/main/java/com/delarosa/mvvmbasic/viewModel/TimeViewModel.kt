package com.delarosa.mvvmbasic.viewModel

import android.arch.lifecycle.MutableLiveData

class TimeViewModel {
    var actualTime = MutableLiveData<String>()

    fun getCurrentTime() {
        val newTime =actualTime.value
    }

    init {
        actualTime.value="La hora actual es: "
    }
}