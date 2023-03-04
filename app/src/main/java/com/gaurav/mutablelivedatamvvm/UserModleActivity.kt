package com.gaurav.mutablelivedatamvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserModleActivity : ViewModel(){
    var text:MutableLiveData<String> =MutableLiveData("qwe")
    var intValue=MutableLiveData(0)
}