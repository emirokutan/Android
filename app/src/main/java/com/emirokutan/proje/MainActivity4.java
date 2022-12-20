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

public class MainActivity4 extends AppCompatActivity {
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
                Intent h = new Intent(MainActivity4.this,MainActivity.class);
                Toast.makeText(getApplicationContext(),"HESAP MAKİNESİ!",Toast.LENGTH_SHORT).show();
                startActivity(h);
            case R.id.menu_item_2:
                Intent a = new Intent(MainActivity4.this, MainActivity2.class);
                Toast.makeText(getApplicationContext(),"MONOFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(a);
                return true;
            case R.id.menu_item_3:
                Intent b = new Intent(MainActivity4.this,MainActivity3.class);
                Toast.makeText(getApplicationContext(),"TRİFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(b);
                return true;
            case R.id.menu_item_4:
                Intent c = new Intent(MainActivity4.this,MainActivity4.class);
                Toast.makeText(getApplicationContext(),"TRAFO GÜÇ AMPER DEĞERİ!",Toast.LENGTH_SHORT).show();
                startActivity(c);
                return true;
            case R.id.menu_item_5:
                Intent d = new Intent(MainActivity4.this,MainActivity5.class);
                Toast.makeText(getApplicationContext(),"TALEP GÜÇ ORANI",Toast.LENGTH_SHORT).show();
                startActivity(d);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public EditText trafoguc;
    TextView sonuc3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

         trafoguc = findViewById(R.id.trafoguc);
          sonuc3 = findViewById(R.id.sonuc3);
    }
    public void hesapla2 (View view){
        double trafohesap = Integer.parseInt(trafoguc.getText().toString());
        double sonuc2 = trafohesap / (1.73 * 380);
        sonuc3.setText("Trafo Güç Amper Değeri:" + sonuc2);
    }

}