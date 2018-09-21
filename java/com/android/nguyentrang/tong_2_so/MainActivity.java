package com.android.nguyentrang.tong_2_so;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnkq = (Button) findViewById(R.id.btntong2so);
        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edita = (EditText) findViewById(R.id.editsoa);
                int a = Integer.parseInt(edita.getText() + "");
                EditText editb = (EditText) findViewById(R.id.editsob);
                int b = Integer.parseInt(editb.getText() + "");
                TextView kq = (TextView) findViewById(R.id.kq);
                kq.setText((a + b) + "");
            }
        });


    }

    }

