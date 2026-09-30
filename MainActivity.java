package com.example.shopassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ربط الزر برمجياً والانتقال لشاشة الجملة
        Button btnWholesale = findViewById(R.id.btnWholesale);
        btnWholesale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WholesaleActivity.class);
                startActivity(intent);
            }
        });
    }
}
