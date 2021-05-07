package com.soapgu.hellohilt;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ObservableViewModel {
    private String message = "hello view model";

    @Inject
    public MainViewModel( @NonNull Application application , String hiltMessage ){
        super(application);
        this.setMessage( hiltMessage );
    }

    @Bindable
    public String getMessage() {
        return message + this.getApplication().getString(R.string.app_name) + "from AndroidViewModel";
    }

    public void setMessage(String message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }
}
