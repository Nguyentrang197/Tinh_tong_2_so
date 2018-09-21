package com.android.nguyentrang.tong_2_so;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btntong;
    EditText edita, editb;
    TextView mkq;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @Override
        public void onClick(View v){
            int kq = Integer.parseInt(edita.getText().toString()) + Integer.parseInt(editb.getText().toString());
            mkq.setText(kq);
        }
    }
}