package com.example.project_cal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edt1 , edt2 , edt3 ;
    Button btntong , btnhieu, btntich , btnthuong ;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        btntong = findViewById(R.id.btntong);
        btnhieu = findViewById(R.id.btnhieu);
        btntich = findViewById(R.id.btntich);
        btnthuong = findViewById(R.id.btnthuong);

        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0" + edt1.getText().toString());
                int b = Integer.parseInt("0" + edt2.getText().toString());

                int c = a + b ;
                edt3.setText(c+"");
            }
        });

        btnhieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0" + edt1.getText().toString());
                int b = Integer.parseInt("0" + edt2.getText().toString());

                int c = a - b ;
                edt3.setText(c+"");
            }
        });

        btntich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0" + edt1.getText().toString());
                int b = Integer.parseInt("0" + edt2.getText().toString());

                int c = a * b ;
                edt3.setText(c+"");
            }
        });

        btnthuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt("0" + edt1.getText().toString());
                int b = Integer.parseInt("0" + edt2.getText().toString());

                if(b == 0 ){
                    edt3.setText("B phai khac 0");
                }else{
                    int c = a / b ;
                    edt3.setText(c+"");
                }

            }
        });
    }
}