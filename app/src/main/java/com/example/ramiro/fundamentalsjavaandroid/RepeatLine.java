package com.example.ramiro.fundamentalsjavaandroid;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RepeatLine extends AppCompatActivity {

    EditText amountOfLines;
    Button makeOperation;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repeat_line);
        amountOfLines = (EditText)findViewById(R.id.amounOfLines);
        makeOperation = (Button)findViewById(R.id.makeOperation);
        makeOperation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                int numberOfLines = Integer.getInteger(amountOfLines.getText().toString());
                writeTheText(numberOfLines);          }
        });

    }

    public void writeTheText(int value){
        if(value <= 0){
            result.setText("Please, enter a positive number");
        }else{
            for(int i = 1; i <= value; i++){
                result.setText(("Line " + i + "/n"));
            }
        }
    }
}
