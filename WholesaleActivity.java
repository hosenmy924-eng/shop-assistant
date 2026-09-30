package com.example.shopassistant;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WholesaleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wholesale_activity);

        // إنشاء مادة تجريبية (كمثال لزكة حماية)
        Item sampleItem = new Item("Ceramic Screen Protector", 2500, 50);
        

        // ربط عناصر الشاشة بالمتغيرات برمجياً
        TextView txtName = findViewById(R.id.txtItemName);
        TextView txtPrice = findViewById(R.id.txtWholesalePrice);
        TextView txtQuantity = findViewById(R.id.txtQuantity);

        // عرض البيانات داخل الواجهة
        txtName.setText("اسم النوع: " + sampleItem.getName());
        txtPrice.setText("سعر الجملة: " + sampleItem.getWholesalePrice() + " دينار");
        txtQuantity.setText("العدد: " + sampleItem.getQuantity());
    }
}
