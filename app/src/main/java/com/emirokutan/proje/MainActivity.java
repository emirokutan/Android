package com.emirokutan.proje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


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
            case R.id.menu_item_2:
                Intent a = new Intent(MainActivity.this, MainActivity2.class);
                Toast.makeText(getApplicationContext(),"MONOFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(a);
                return true;
            case R.id.menu_item_3:
                Intent b = new Intent(MainActivity.this,MainActivity3.class);
                Toast.makeText(getApplicationContext(),"TRİFAZE ORANI!",Toast.LENGTH_SHORT).show();
                startActivity(b);
                return true;
            case R.id.menu_item_4:
                Intent c = new Intent(MainActivity.this,MainActivity4.class);
                Toast.makeText(getApplicationContext(),"TRAFO GÜÇ AMPER DEĞERİ!",Toast.LENGTH_SHORT).show();
                startActivity(c);
                return true;
            case R.id.menu_item_5:
                Intent d = new Intent(MainActivity.this,MainActivity5.class);
                Toast.makeText(getApplicationContext(),"TALEP GÜÇ ORANI",Toast.LENGTH_SHORT).show();
                startActivity(d);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



        EditText number1Text;
        EditText number2Text;
        TextView resultText;

//hesap makinesi ana sayfa

        @Override
        protected void onCreate( Bundle savedInstanceState ) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);




            number1Text = findViewById(R.id.number1Text);
            number2Text = findViewById(R.id.number2Text);
            resultText = findViewById(R.id.resultText);

        }

        public void sum( View view ) {
            if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
                  resultText.setText("Numara Girin!");
            } else {
                double number1 = Integer.parseInt(number1Text.getText().toString());
                double number2 = Integer.parseInt(number2Text.getText().toString());
                double result = number1 + number2;
                resultText.setText("Sonuç : " +result);

                //Toplama butonuna onclick olduğu zaman çalışacak kodlar
            }

        }

        public void deduct( View view ) {
            if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
                resultText.setText("Numara Girin!");
            } else {
                int number1 = Integer.parseInt(number1Text.getText().toString());
                int number2 = Integer.parseInt(number2Text.getText().toString());
                int result = number1 - number2;
                resultText.setText("Sonuç : " +result);
                //Çıkarma İşlemi
            }
        }

        public void multiply( View view ) {
            if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
                resultText.setText("Numara Girin!");
            } else {
                double number1 = Integer.parseInt(number1Text.getText().toString());
                double number2 = Integer.parseInt(number2Text.getText().toString());
                double result = number1 * number2;
                resultText.setText("Sonuç : " +result);
                //Çarpma İşlemi
            }
        }

        public void divide( View view ) {
            if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
                resultText.setText("Numara Girin!");
            } else if (number1Text.getText().toString().matches("0") || number2Text.getText().toString().matches("0")) {
                resultText.setText("Sıfıra Bölünemez !");
            } else {
                double number1 = Integer.parseInt(number1Text.getText().toString());
                double number2 = Integer.parseInt(number2Text.getText().toString());
                double result = number1 / number2;
                resultText.setText("Sonuç: " + result);
                //Bölme İşlemi
            }
        }
            }






