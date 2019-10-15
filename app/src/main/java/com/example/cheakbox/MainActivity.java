package com.example.cheakbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CheckBox computer, electronics, mechanical, civil, marine;
    private Button chooseButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        computer = findViewById(R.id.computer_id);
        electronics = findViewById(R.id.electronics_id);
        mechanical = findViewById(R.id.mechanical_id);
        civil = findViewById(R.id.civil_id);
        marine = findViewById(R.id.marine_id);
        chooseButton = findViewById(R.id.chooseBuutton_id);
        resultTextView = findViewById(R.id.resultTextView_id);

        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();                                  // To show the CheakBox message

                if (computer.isChecked()){
                    String value = computer.getText().toString();
                    stringBuilder.append(value+ " is selected \n");
                }
                if (electronics.isChecked()){
                    String value = electronics.getText().toString();
                    stringBuilder.append(value+ " is selected \n");
                }
                if (mechanical.isChecked()){
                    String value = mechanical.getText().toString();
                    stringBuilder.append(value+ " is selected \n");
                }
                if (civil.isChecked()){
                    String value = civil.getText().toString();
                    stringBuilder.append(value+ " is selected \n");
                }
                if (marine.isChecked()){
                    String value = marine.getText().toString();
                    stringBuilder.append(value+ " is selected \n");
                }

                resultTextView.setText(stringBuilder);
            }
        });
    }
}
