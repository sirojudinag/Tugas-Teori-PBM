package com.example.sirojudin.tugas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Detaill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaill);

        //pembuatan bundle untuk menerima data dari intent yang mengirim kemudian disimpan dalam bundle c
        Bundle c = getIntent().getExtras();

        //pembuatan objek textview tampilnim, dengan id outnim
        TextView tampilnim=(TextView) findViewById(R.id.outnim) ;
        //pembuatan objek textview tampilnama, dengan id outnama
        TextView tampilnama=(TextView)findViewById(R.id.outnama) ;
        //pembuatan objek textview tampilalamat, dengan id outalamat
        TextView tampilalamat=(TextView)findViewById(R.id.outalamat);
        //pembuatan objek textview tampilemail, dengan id outemail
        TextView tampilemail=(TextView)findViewById(R.id.outemail) ;
        //pembuatan objek textview tampilnotelp, dengan id outnotelp
        TextView tampilnotelp=(TextView)findViewById(R.id.outnotelp) ;

        //mengambil nilai dari bundle dengan key nim1 kemudian diletakkan ke variabel nim2
        String nim2=c.getString("nim1");
        //mengambil nilai dari bundle dengan key nama1 kemudian diletakkan ke variabel nama2
        String nama2=c.getString("nama1");
        //mengambil nilai dari bundle dengan key alamat1 kemudian diletakkan ke variabel alamat2
        String alamat2=c.getString("alamat1");
        //mengambil nilai dari bundle dengan key email1 kemudian diletakkan ke variabel email2
        String email2=c.getString("email1");
        //mengambil nilai dari bundle dengan key notelp1 kemudian diletakkan ke variabel notelp2
        String notelp2=c.getString("notelp1");

        //memberikan nilai dengan method setText pada id Tampilnim di layout activity_Detaill
        tampilnim.setText(nim2);
        //memberikan nilai dengan method setText pada id Tampilnama di layout activity_Detaill
        tampilnama.setText(nama2);
        //memberikan nilai dengan method setText pada id Tampilalamat di layout activity_Detaill
        tampilalamat.setText(alamat2);
        //memberikan nilai dengan method setText pada id Tampilalamat di layout activity_Detaill
        tampilemail.setText(email2);
        //memberikan nilai dengan method setText pada id Tampilnotelp di layout activity_Detaill
        tampilnotelp.setText(notelp2);

        //menampilkan toas pada intent kedua ddengan tampilan "data berhasil diinputkan""
        Toast.makeText(getApplicationContext(),"Data Berhasil Diinputkan", Toast.LENGTH_LONG).show();
    }
    }