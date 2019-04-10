package com.example.sirojudin.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class Biodata extends AppCompatActivity {
    String nim0,nama0,alamat0,email0,notelp0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void onClick(View view){
        Intent i = new Intent(this,Detaill.class);
        Bundle b = new Bundle();
        EditText ambilnim=(EditText)findViewById(R.id.nim) ;
        EditText ambilnama=(EditText)findViewById(R.id.nama) ;
        EditText ambilalamat=(EditText)findViewById(R.id.alamat) ;
        EditText ambilemail=(EditText)findViewById(R.id.email) ;
        EditText ambilnotelp=(EditText)findViewById(R.id.notelp) ;

        nim0=ambilnim.getText().toString();
        nama0=ambilnama.getText().toString();
        alamat0=ambilalamat.getText().toString();
        email0=ambilemail.getText().toString();
        notelp0=ambilnotelp.getText().toString();

        b.putString("nim1",nim0);
        b.putString("nama1",nama0);
        b.putString("alamat1",alamat0);
        b.putString("email1",email0);
        b.putString("notelp1",notelp0);

        i.putExtras(b);
        startActivity(i);
    }
}
