package com.example.ramiro.fundamentalsjavaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button navegationButton;
    EditText monthToShow;
    EditText monthShowed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monthToShow = (EditText)findViewById(R.id.monthToShow);
        monthShowed = (EditText)findViewById(R.id.monthShowed);
        button = (Button)findViewById(R.id.button);
        navegationButton = (Button)findViewById(R.id.goTO);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                showMonth(monthToShow.getText().toString());          }
        });

        navegationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0)
            {
                Intent intent = new Intent(MainActivity.this, Operation.class);
                startActivity(intent);

            }
        });

    }

    public void showMonth(String numberOfMonth){
        int numberOfMonthToShow = Integer.parseInt(numberOfMonth);
        switch (numberOfMonthToShow){
            case 1:
                monthShowed.setText("January");
                break;
            case 2:
                monthShowed.setText("February");
                break;
            case 3:
                monthShowed.setText("March");
                break;
            case 4:
                monthShowed.setText("April");
                break;
            case 5:
                monthShowed.setText("May");
                break;
            case 6:
                monthShowed.setText("June");
                break;
            case 7:
                monthShowed.setText("July");
                break;
            case 8:
                monthShowed.setText("August");
                break;
            case 9:
                monthShowed.setText("September");
                break;
            case 10:
                monthShowed.setText("October");
                break;
            case 11:
                monthShowed.setText("November");
                break;
            case 12:
                monthShowed.setText("December");
                break;
            default:
                monthShowed.setText("Please, enter a number since 1 to 12");
        }
    }

}
