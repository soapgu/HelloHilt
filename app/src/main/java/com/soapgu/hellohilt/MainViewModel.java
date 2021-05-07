package com.soapgu.hellohilt;

import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ObservableViewModel {
    private String message = "hello view model";

    @Inject
    public MainViewModel( String hiltMessage ){
        this.setMessage( hiltMessage );
    }

    @Bindable
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }
}
