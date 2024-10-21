package com.example.ex5;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNamDuong;
    Button buttonChuyenDoi;
    TextView textViewNamAm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo các view
        editTextNamDuong = findViewById(R.id.edtDuongLich);
        buttonChuyenDoi = findViewById(R.id.btnConvert);
        textViewNamAm = findViewById(R.id.textViewAmLich);

        // Bắt sự kiện click cho nút Chuyển Đổi
        buttonChuyenDoi.setOnClickListener(v -> {
            try {
                int namDuong = Integer.parseInt(editTextNamDuong.getText().toString());
                String can = getCan(namDuong);
                String chi = getChi(namDuong);
                textViewNamAm.setText(can + " " + chi);
            } catch (NumberFormatException e) {
                textViewNamAm.setText("Vui lòng nhập năm hợp lệ!");
            }
        });
    }

    // Phương thức lấy Can dựa vào năm dương lịch
    private String getCan(int nam) {
        switch (nam % 10) {
            case 0: return "Canh";
            case 1: return "Tân";
            case 2: return "Nhâm";
            case 3: return "Quý";
            case 4: return "Giáp";
            case 5: return "Ất";
            case 6: return "Bính";
            case 7: return "Đinh";
            case 8: return "Mậu";
            case 9: return "Kỷ";
            default: return "";
        }
    }

    // Phương thức lấy Chi dựa vào năm dương lịch
    private String getChi(int nam) {
        switch (nam % 12) {
            case 0: return "Thân";
            case 1: return "Dậu";
            case 2: return "Tuất";
            case 3: return "Hợi";
            case 4: return "Tý";
            case 5: return "Sửu";
            case 6: return "Dần";
            case 7: return "Mão";
            case 8: return "Thìn";
            case 9: return "Tỵ";
            case 10: return "Ngọ";
            case 11: return "Mùi";
            default: return "";
        }
    }
}
