package com.example.ex4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtC , edtF ;
    Button btnC , btnF , btnclear;

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
        edtC = findViewById(R.id.edtC);
        edtF = findViewById(R.id.edtF);
        btnC = findViewById(R.id.btnC);
        btnF = findViewById(R.id.btnF);
        btnclear = findViewById(R.id.btnclear);

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtC.setText(" ");
                edtF.setText(" ");
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat dcf  = new DecimalFormat("#.00");
                String doC = edtC.getText() + " ";

                int C = Integer.parseInt(doC);
                edtF.setText("" + dcf.format(C * 1.8 + 32));
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doF = edtF.getText() + "";

                int F = Integer.parseInt(doF);
                edtC.setText(""+dcf.format((F - 32)/1.8));
            }
        });
    }
}