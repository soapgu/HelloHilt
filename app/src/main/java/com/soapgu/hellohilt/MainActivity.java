package com.soapgu.hellohilt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Build;
import android.os.Bundle;

import com.orhanobut.logger.Logger;
import com.soapgu.hellohilt.databinding.ActivityMainBinding;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.migration.OptionalInject;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    SimpleExport simpleExportOne;

    @Inject
    SimpleExport simpleExportTwo;

    @Inject
    Map<String, IPrint> prints;

    @Inject
    Provider<Optional<ILog>> log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        ActivityMainBinding binding  = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setDataContext( viewModel );

        Logger.i( "Get SimpleExport-simpleExportOne:%s",simpleExportOne.toString() );
        Logger.i( "Get SimpleExport-simpleExportTwo:%s",simpleExportTwo.toString() );
        Logger.i( "Print from print:%s",prints.get("One").output() );
        Logger.i( "Print from print:%s",prints.get("Two").output() );


        Optional<ILog> logSet = log.get();
        if(  logSet.isPresent() ) {
            Logger.i("Print from log:%s", logSet.get().toString());
        }
        else {
            Logger.i( "log is not export" );
        }

        Logger.i( "MODEL:%s",android.os.Build.MODEL );
    }
}