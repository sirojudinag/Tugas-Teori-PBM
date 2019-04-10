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

        Bundle c = getIntent().getExtras();

        TextView tampilnim=(TextView) findViewById(R.id.outnim) ;
        TextView tampilnama=(TextView)findViewById(R.id.outnama) ;
        TextView tampilalamat=(TextView)findViewById(R.id.outalamat);
        TextView tampilemail=(TextView)findViewById(R.id.outemail) ;
        TextView tampilnotelp=(TextView)findViewById(R.id.outnotelp) ;

        String nim2=c.getString("nim1");
        String nama2=c.getString("nama1");
        String alamat2=c.getString("alamat1");
        String email2=c.getString("email1");
        String notelp2=c.getString("notelp1");

        tampilnim.setText(nim2);
        tampilnama.setText(nama2);
        tampilalamat.setText(alamat2);
        tampilemail.setText(email2);
        tampilnotelp.setText(notelp2);

        Toast.makeText(getApplicationContext(),"Data Berhasil Diinputkan", Toast.LENGTH_LONG).show();
    }
    }