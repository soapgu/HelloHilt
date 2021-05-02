package com.soapgu.hellohilt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.orhanobut.logger.Logger;

import java.util.Map;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    SimpleExport simpleExportOne;

    @Inject
    SimpleExport simpleExportTwo;

    @Inject
    Map<String, IPrint> prints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.i( "Get SimpleExport-simpleExportOne:%s",simpleExportOne.toString() );
        Logger.i( "Get SimpleExport-simpleExportTwo:%s",simpleExportTwo.toString() );
        Logger.i( "Print from print:%s",prints.get("One").output() );
        Logger.i( "Print from print:%s",prints.get("Two").output() );
    }
}