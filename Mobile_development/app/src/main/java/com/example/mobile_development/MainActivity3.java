package com.example.mobile_development;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private static final String TAG ="MainActivity3" ;
    String[] data = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};

    GridView gvMain;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);

        gvMain = (GridView) findViewById(R.id.grid);
        gvMain.setAdapter(adapter);
       // adapter.getView(1,)
        adjustGridView();


        }




    private void adjustGridView() {
       // gvMain.setNumColumns(GridView.AUTO_FIT);
        //gvMain.setColumnWidth(50);
        gvMain.setNumColumns(10);
        gvMain.setColumnWidth(80);
        gvMain.setVerticalSpacing(5);
        gvMain.setHorizontalSpacing(5);
        gvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            TextView temp=(TextView) view.findViewById(R.id.tvText);
            temp.setBackgroundColor(Color.RED);
            data[3]="zz";
            adapter.notifyDataSetChanged();
                            temp.setText(temp.getText().equals("*")?"3 3 3":"*");
                Toast.makeText(MainActivity3.this, " qqqqq "+String.valueOf(i), Toast.LENGTH_SHORT).show();
            }
        });

    }

//        GridLayout gridLayout = new GridLayout(getApplicationContext());
//
//// Add Title
//        GridLayout.Spec titleTxtSpecColumn = GridLayout.spec(2, GridLayout.BASELINE);
//        GridLayout.Spec titleRowSpec = GridLayout.spec(0);
//        TextView titleText = new TextView(getApplicationContext());
//        titleText.setText("Title");
//
//        gridLayout.addView(titleText, new GridLayout.LayoutParams(titleRowSpec , titleTxtSpecColumn));


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        
    }

    public void qwerty(View view) {
        Toast.makeText(MainActivity3.this, " qqqqq ", Toast.LENGTH_SHORT).show();
    }
}