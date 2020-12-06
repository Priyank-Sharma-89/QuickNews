package com.example.quicknews.ui.zeenews;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ZeeNewsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ZeeNewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Zee News fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}