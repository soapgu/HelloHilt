package com.soapgu.hellohilt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.orhanobut.logger.Logger;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    SimpleExport simpleExportOne;

    @Inject
    SimpleExport simpleExportTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.i( "Get SimpleExport-simpleExportOne:%s",simpleExportOne.toString() );
        Logger.i( "Get SimpleExport-simpleExportTwo:%s",simpleExportTwo.toString() );
    }
}