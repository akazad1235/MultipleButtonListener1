package com.example.akazad.secondproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView text;
    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (TextView) findViewById(R.id.TextId);
        button1=(Button) findViewById(R.id.ButtonId1);
        button2=(Button) findViewById(R.id.ButtonId2);
        button3=(Button) findViewById(R.id.ButtonId3);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ButtonId1){

            text.setText("Clicked button 1");
        }else if(v.getId()==R.id.ButtonId2){
            text.setText("clicked button 2");
        }
        else{
            text.setText("clicket on the button 3");
        }
    }
}
