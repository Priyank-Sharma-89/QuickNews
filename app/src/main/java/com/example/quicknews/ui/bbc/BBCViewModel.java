package com.example.quicknews.ui.bbc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BBCViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BBCViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is BBC fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}