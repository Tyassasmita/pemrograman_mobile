package id.sasmita.tugas9

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommonViewModel: ViewModel() {
    val data = MutableLiveData<String>()

    fun editData(text:String){
        data.value = text
    }
}