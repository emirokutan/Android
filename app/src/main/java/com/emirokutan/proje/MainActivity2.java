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

public class MainActivity2 extends AppCompatActivity {
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
                Intent h = new Intent(MainActivity2.this,MainActivity.class);
                Toast.makeText(getApplicationContext(),"HESAP MAKİNESİ!",Toast.LENGTH_SHORT).show();
                startActivity(h);
            case R.id.menu_item_2:
                Intent a = new Intent(MainActivity2.this, MainActivity.class);
                Toast.makeText(getApplicationContext(),"MONOFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(a);
                return true;
            case R.id.menu_item_3:
                Intent b = new Intent(MainActivity2.this,MainActivity3.class);
                Toast.makeText(getApplicationContext(),"TRİFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(b);
                return true;
            case R.id.menu_item_4:
                Intent c = new Intent(MainActivity2.this,MainActivity4.class);
                Toast.makeText(getApplicationContext(),"TRAFO GÜÇ AMPER DEĞERİ!",Toast.LENGTH_SHORT).show();
                startActivity(c);
                return true;
            case R.id.menu_item_5:
                Intent d = new Intent(MainActivity2.this,MainActivity5.class);
                Toast.makeText(getApplicationContext(),"TALEP GÜÇ ORANI",Toast.LENGTH_SHORT).show();
                startActivity(d);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    EditText edittextnumber1 ;
    EditText edittextnumber2 ;
    EditText edittextnumber3 ;
    TextView sonuctext ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        edittextnumber1 = findViewById(R.id.edittextnumber1);
        edittextnumber2 = findViewById(R.id.edittextnumber2);
        edittextnumber3 = findViewById(R.id.edittextnumber3);
        sonuctext = findViewById(R.id.sonuctext);
        //Id leri ile uygulamamıza gerekli layoutları çağırdım

    }
    public void hesapla(View view){
        double mono1 = Integer.parseInt(edittextnumber1.getText().toString());
        double mono2 = Integer.parseInt(edittextnumber2.getText().toString());
        double mono3 = Integer.parseInt(edittextnumber3.getText().toString());
        double sonuc = 0.074 * mono1*mono2/mono3;
            sonuctext.setText("Monofaze Oranı:" + sonuc);
            //Formül Kısmı

    }


}
