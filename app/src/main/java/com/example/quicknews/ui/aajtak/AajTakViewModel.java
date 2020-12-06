package com.example.quicknews.ui.aajtak;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AajTakViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AajTakViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Aaj Tak fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}