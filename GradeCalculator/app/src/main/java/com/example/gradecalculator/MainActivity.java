package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText N1;
    private EditText N2;
    private EditText N3;
    private EditText N4;
    private TextView N5;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        N1 = (EditText) findViewById(R.id.N1);
        N2 = (EditText) findViewById(R.id.N2);
        N3 = (EditText) findViewById(R.id.N3);
        N4 = (EditText) findViewById(R.id.N4);
        N5 = (TextView) findViewById(R.id.N5);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                N1.setText("");
                N2.setText("");
                N3.setText("");
                N4.setText("");
                N5.setText("YOUR REUSALT");
            }
        });


        View.OnClickListener OnClickListener = new View.OnClickListener () {

            @Override
            public void onClick(View v) {
               String str = N5.getText().toString();

               int A = Integer.parseInt(N1.getText().toString());
                int B = Integer.parseInt(N2.getText().toString());
                int C = Integer.parseInt(N3.getText().toString());
                int D = Integer.parseInt(N4.getText().toString());
               Toast.makeText(MainActivity.this, "Well Done", Toast.LENGTH_SHORT).show();
               N5.setText(grades(A+B+C+D));
                if ((A+B+C+D)  >=90){
                    N5.setTextColor(Color.GREEN);
                }else if ((A+B+C+D)  >= 80){
                    N5.setTextColor(Color.BLUE);

                }else if ((A+B+C+D)  >= 70){
                    N5.setTextColor(Color.YELLOW);
                }else if ((A+B+C+D)  >=60){
                   N5.setTextColor(Color.BLACK);
                }else{
                   N5.setTextColor(Color.RED);
                }





            }
        };
        button.setOnClickListener(OnClickListener);

    }
    public String  grades(int student){

        if (student  >=90){
            return("A");
        }else if (student >= 80){
            return("B");
        }else if (student >= 70){
            return("C");
        }else if (student >=60){
            return("D");
        }else{
            return("F");}


    }
}




