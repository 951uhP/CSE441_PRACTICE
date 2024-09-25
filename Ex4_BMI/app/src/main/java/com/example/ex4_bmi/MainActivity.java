package com.example.ex4_bmi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView edtcao, edtnang , edtBMI , edtchuandoan ;
    Button btnBMI ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtcao = findViewById(R.id.edtcao);
        edtnang = findViewById(R.id.edtnang);
        edtBMI = findViewById(R.id.edtBMI);
        edtchuandoan = findViewById(R.id.edtchuandoan);
        btnBMI = findViewById(R.id.btnBMI);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtcao.getText().toString()+ "");
                int b = Integer.parseInt(edtnang.getText().toString() + "");

                double c = b /(a*a);
                if(c < 18){
                    edtchuandoan.setText("Người gầy");
                }else if(c < 25){
                    edtchuandoan.setText("Người bình thường");
                }else if(c < 30){
                    edtchuandoan.setText("Người béo phì độ I");
                }else if (c < 35){
                    edtchuandoan.setText("Người béo phì độ II");
                }else{
                    edtchuandoan.setText("Người béo phì độ III");
                }

                edtBMI.setText(c+"");
            }
        });
    }
}