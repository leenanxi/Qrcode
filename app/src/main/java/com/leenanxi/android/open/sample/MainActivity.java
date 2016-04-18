package com.leenanxi.android.open.sample;

import android.graphics.Bitmap;
import android.widget.Toast;

import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.leenanxi.android.open.qrcode.CaptureActivity;

public class MainActivity extends CaptureActivity {

    @Override
    public void onHandleDecode(Result rawResult, Bitmap barcode, float scaleFactor) {
        super.onHandleDecode(rawResult,barcode,scaleFactor);
        Toast.makeText(this,
                "Scan Result:" + ResultParser.parseResult(rawResult).toString(),
                Toast.LENGTH_SHORT).show();

    }






}
