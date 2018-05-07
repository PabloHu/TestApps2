package com.software.test.huaman.testapps2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.software.test.huaman.otp.CommonClass;
import com.software.test.huaman.otp.OtpActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvOutput = (TextView) findViewById(R.id.tvOutput);
        tvOutput.setText(CommonClass.MESSAGE);
        Intent intent = new Intent(this, OtpActivity.class);
        startActivity(intent);
    }
}
