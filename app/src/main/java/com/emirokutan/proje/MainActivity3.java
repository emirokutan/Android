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

public class MainActivity3 extends AppCompatActivity {
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
                Intent h = new Intent(MainActivity3.this,MainActivity.class);
                Toast.makeText(getApplicationContext(),"HESAP MAKİNESİ!",Toast.LENGTH_SHORT).show();
                startActivity(h);
            case R.id.menu_item_2:
                Intent a = new Intent(MainActivity3.this, MainActivity2.class);
                Toast.makeText(getApplicationContext(),"MONOFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(a);
                return true;
            case R.id.menu_item_3:
                Intent b = new Intent(MainActivity3.this,MainActivity3.class);
                Toast.makeText(getApplicationContext(),"TRİFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(b);
                return true;
            case R.id.menu_item_4:
                Intent c = new Intent(MainActivity3.this,MainActivity4.class);
                Toast.makeText(getApplicationContext(),"TRAFO GÜÇ AMPER DEĞERİ!",Toast.LENGTH_SHORT).show();
                startActivity(c);
                return true;
            case R.id.menu_item_5:
                Intent d = new Intent(MainActivity3.this,MainActivity5.class);
                Toast.makeText(getApplicationContext(),"TALEP GÜÇ ORANI",Toast.LENGTH_SHORT).show();
                startActivity(d);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }




    public EditText editext1;
    public EditText editext2;
    public EditText editext3;
    public TextView sonuctextt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



            editext1 = findViewById(R.id.editext1);
            editext2 = findViewById(R.id.editext2);
            editext3 = findViewById(R.id.editext3);
            sonuctextt = findViewById(R.id.sonuctextt);
        }
        public void hesaplasnc (View view){
            double trifaze1 = Integer.parseInt(editext1.getText().toString());
            double trifaze2 = Integer.parseInt(editext2.getText().toString());
            double trifaze3 = Integer.parseInt(editext3.getText().toString());
            double sonucc = (0.0124 * trifaze1 * trifaze2/trifaze3);
            sonuctextt.setText("Trifaze Oranı:" + sonucc);
        }

    }
