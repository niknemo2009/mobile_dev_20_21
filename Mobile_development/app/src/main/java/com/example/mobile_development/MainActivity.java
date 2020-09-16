package com.example.mobile_development;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    final String TAG = "MainActivity";
Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: " + " qwertyuiop");
        save=findViewById(R.id.button_save33);
        save.setText("Save 33");
//        save.setOnClickListener(v->{
//            Toast.makeText(getApplicationContext(), "77777", Toast.LENGTH_LONG).show();
//        });
        save.setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
    }

    public void qwerty(View view) {
        Toast.makeText(getApplicationContext(), "qwerty ", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button5:{
                Toast.makeText(getApplicationContext(), "butto 5555555", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.button6:{
                Toast.makeText(getApplicationContext(), "button 66666666", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(this,MainActivity2.class);
                startActivity(intent);
                finish();
                break;
            }
        }

    }
}