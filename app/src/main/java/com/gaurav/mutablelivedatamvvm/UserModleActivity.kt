package com.gaurav.mutablelivedatamvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserModleActivity : ViewModel(){
    var text:MutableLiveData<String> =MutableLiveData()
    var intValue=MutableLiveData(0)
}