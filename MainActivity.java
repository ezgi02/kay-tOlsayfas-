package com.example.projerastgale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

import java.time.Clock;

public class MainActivity extends AppCompatActivity {
    private EditText editAd,editSoyad,editSehir,editYas;
    private CheckBox checkOyun,checkMusic,checkBook;
    private RadioButton radioK,radioE;
    private String ad,soyad,sehir,yas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //EditBox
        editAd=findViewById(R.id.editAd);
        editSoyad=findViewById(R.id.editSoyad);
        editSehir=findViewById(R.id.editSehir);
        editYas=findViewById(R.id.editYas);
        //CheckBox
        checkOyun=findViewById(R.id.checkOyun);
        checkBook=findViewById(R.id.checkBook);
        checkMusic=findViewById(R.id.checkMusic);
        //Radiobutton
        radioE=findViewById(R.id.radioE);
        radioK=findViewById(R.id.radioK);

    }
    public void btnKayitOl(View v){
        ad=editAd.getText().toString();
        soyad=editSoyad.getText().toString();
        sehir=editSehir.getText().toString();
        yas=editYas.getText().toString();
        if(!TextUtils.isEmpty(ad)&&!TextUtils.isEmpty(sehir)&&!TextUtils.isEmpty(soyad)&&!TextUtils.isEmpty(yas)){
            System.out.println("-----Bilgileriniz-----");
            System.out.println("Adınız"+ad);
            System.out.println("Soyadınız"+soyad);
            System.out.println("Yasadıgınız sehriniz"+sehir);
            System.out.println("Yasınız"+yas);
            System.out.println("-----Hobileriniz-----");
            if(checkOyun.isChecked())
                System.out.println(checkOyun.getText().toString());
            if ((checkBook.isChecked()))
                System.out.println(checkBook.getText().toString());
            if (checkMusic.isChecked())
                System.out.println(checkMusic.getText().toString());
            if (radioK.isChecked())
                System.out.println(radioK.getText().toString());
            else
                System.out.println(radioE.getText().toString());
        }
    }
}