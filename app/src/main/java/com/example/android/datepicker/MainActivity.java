package com.example.android.datepicker;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
void setdat(String s){
    TextView textView=findViewById(R.id.startdate);
    textView.setText(s);
}

    public void fff(View view) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        Fre fre=new Fre();
        fre.show(fragmentManager,"f");
    }
}
























