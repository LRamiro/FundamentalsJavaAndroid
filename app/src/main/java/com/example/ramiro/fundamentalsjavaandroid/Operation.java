package com.example.ramiro.fundamentalsjavaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.math.*;

/**
 * Created by ramiro on 03/01/17.
 */
public class Operation extends AppCompatActivity{

    EditText data1;
    EditText data2;
    EditText data3;
    EditText result;
    Button makeOperation;
    Button navigationButton;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_operation);
        data1 = (EditText)findViewById(R.id.firstValue);
        data2 = (EditText)findViewById(R.id.operation);
        data3 = (EditText)findViewById(R.id.secondValue);
        makeOperation = (Button) findViewById(R.id.makeOperation);
        navigationButton = (Button)findViewById(R.id.navigationButton);

        makeOperation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                if(validateData(data2.getText().toString())){
                    result.setText("Please, enter correct data in the second field");
                }
                else{
                    int value1 = Integer.parseInt(data1.getText().toString());
                    int value2 = Integer.parseInt(data3.getText().toString());
                    calcular(value1, value2, data2.getText().toString());
                }
            }
        });

        navigationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                Intent intent = new Intent(Operation.this, RepeatLine.class);
                startActivity(intent);

            }
        });
    }


    public boolean validateData(String operator){
        if(operator != "+" && operator != "-" && operator != "*" && operator != "/"){
            return false;
        }

        return true;
    }

    public void calcular(int value1, int value2, String simbolo) {
        if (simbolo == "+") {
            result.setText(value1 + value2);
        } else if (simbolo == "-") {
            result.setText(value1 - value2);
        } else if (simbolo == "*") {
            result.setText(value1 * value2);
        } else {
            if (value2 != 0) {
                result.setText(value1 / value2);
            }
            result.setText("Can't divide over 0");
        }
    }
}
