package com.lizoknovakova.cosmetics.ui.colorscience;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ColorscienceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ColorscienceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is colorscience fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}