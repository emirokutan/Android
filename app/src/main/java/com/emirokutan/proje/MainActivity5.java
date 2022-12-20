package com.emirokutan.proje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu_item_1:
                System.exit(0);
                return true;
            case R.id.menu_geri:
                this.finish();
                return true;
            case R.id.menu_hesapmak:
                Intent h = new Intent(MainActivity5.this,MainActivity.class);
                Toast.makeText(getApplicationContext(),"HESAP MAKİNESİ!",Toast.LENGTH_SHORT).show();
                startActivity(h);
            case R.id.menu_item_2:
                Intent a = new Intent(MainActivity5.this, MainActivity2.class);
                Toast.makeText(getApplicationContext(),"MONOFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(a);
                return true;
            case R.id.menu_item_3:
                Intent b = new Intent(MainActivity5.this,MainActivity3.class);
                Toast.makeText(getApplicationContext(),"TRİFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(b);
                return true;
            case R.id.menu_item_4:
                Intent c = new Intent(MainActivity5.this,MainActivity4.class);
                Toast.makeText(getApplicationContext(),"TRAFO GÜÇ AMPER DEĞERİ!",Toast.LENGTH_SHORT).show();
                startActivity(c);
                return true;
            case R.id.menu_item_5:
                Intent d = new Intent(MainActivity5.this,MainActivity5.class);
                Toast.makeText(getApplicationContext(),"TALEP GÜÇ ORANI",Toast.LENGTH_SHORT).show();
                startActivity(d);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    EditText sayi5text ;
    TextView kurulusonuc ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        sayi5text = findViewById(R.id.sayi5text);
        kurulusonuc = findViewById(R.id.kurulusonuc);

    }
    public void kuruluguchsp (View view){
            double number11 = Integer.parseInt(sayi5text.getText().toString());
            double yukarı = number11 - 8000 ;
            double emir =   yukarı * 0.4f;
            double kurulusonuc2 = emir + 4800;
        kurulusonuc.setText("Talep Güç Oranı:" + kurulusonuc2);
        if (number11 < 8000){
            kurulusonuc.setText("Sonuç:" + number11);
         //Girdiğimiz sonuç eğer 8000'in altında ise direk sayının kendisi sonuç olarak kabul edilir
            // değilse girdiğimiz sayı 8000 den çıkartılır ve 0.4 ile çarpılıp ardından ise 4800 çıkarılır ve sonuç elde edilir
        }


    }

}