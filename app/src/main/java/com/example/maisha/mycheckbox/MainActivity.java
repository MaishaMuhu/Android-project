package com.example.maisha.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkChechBox,sugarChechBox,waterChechBox;
    private Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkChechBox = (CheckBox) findViewById(R.id.milkCheckBoxId);
        sugarChechBox = (CheckBox) findViewById(R.id.sugarCheckBoxId);
        waterChechBox = (CheckBox) findViewById(R.id.waterCheckBoxId);
        showButton = (Button) findViewById(R.id.showButtonId);
        resultTextView = (TextView) findViewById(R.id.resultTextViewId);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if(milkChechBox.isChecked()){
                    String value = milkChechBox.getText().toString();
                    stringBuilder.append(value + " "+ "is ordered\n ");
                }if(sugarChechBox.isChecked()){
                    String value = sugarChechBox.getText().toString();
                    stringBuilder.append(value + " "+ "is ordered\n ");
                }if(waterChechBox.isChecked()){
                    String value = waterChechBox.getText().toString();
                    stringBuilder.append(value + " "+ "is ordered\n ");
                }
                resultTextView.setText(stringBuilder);
            }
        });

    }
}
