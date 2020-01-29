package com.example.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textbox;
    private  Button buttonAge;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAge = (Button) findViewById(R.id.BTDescobrir);
        textbox= (EditText) findViewById(R.id.TXTEdit);
        result = (TextView) findViewById(R.id.TXTResultado);

        buttonAge.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               String currentText = textbox.getText().toString();
               if(currentText.isEmpty())
               {
                   result.setText("Nenhum número digitado");
               }else {
                   int valueTyped = Integer.parseInt(currentText);
                   int finalResult = valueTyped *7;

                   result.setText("A idade do Cachorro em anos humanos é "+ finalResult + " anos");
               }
            }
        });

    }
}
