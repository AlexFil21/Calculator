package com.example.calculator.viewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MyViewModel: ViewModel() {
    var liveData = MutableLiveData<String>()
    var counter: Int = 0
    var sum: Int = 0;

    fun changeRes (text: String) {
        if (counter.equals(0)) {
            liveData.postValue(text)
            counter = text.toInt();
        } else {
            liveData.postValue(counter.toString() + text)
            counter = (counter.toString() + text).toInt()
        }
    }

    fun resetData () {
        counter = 0
        liveData.postValue("0")
    }

    fun getSum () {
        sum += counter
        liveData.postValue("+")
        counter = 0
    }

    fun result (){
        sum += counter
        counter = 0
        liveData.postValue(sum.toString())
    }
}