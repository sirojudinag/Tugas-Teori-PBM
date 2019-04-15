package com.example.sirojudin.tugas;

//TODO 1: merupakan package yang perlu diimport untuk membuat aplikasi
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class Biodata extends AppCompatActivity {
    //TODO 2: pembuatan variabel yang dibutuhkan untuk validasi password
    String nim0,nama0,alamat0,email0,notelp0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    //metode yang digunakan untuk menerima action ketika button ditekan
    public void onClick(View view){
        //pembuatan onjek intent i dengan memanggil class detaill
        Intent i = new Intent(this,Detaill.class);
        //pembuatan bundle b (bungkusan) untuk menampung objek yang akan dikirimkan ke intents
        Bundle b = new Bundle();
        //mengambil data dari pallete edittext dengan id nim pada layout activity_biodata untuk disimpan pada objek ambilnim
        EditText ambilnim=(EditText)findViewById(R.id.nim) ;
        //mengambil data dari pallete edittext dengan id nama pada layout activity_biodata untuk disimpan pada objek ambil nama
        EditText ambilnama=(EditText)findViewById(R.id.nama) ;
        //mengambil data dari pallete edittext dengan id alamat pada layout activity_biodata untuk disimpan pada objek ambilalamat
        EditText ambilalamat=(EditText)findViewById(R.id.alamat) ;
        //mengambil data dari pallete edittext dengan id email pada layout activity_biodata untuk disimpan pada objek ambilemail
        EditText ambilemail=(EditText)findViewById(R.id.email) ;
        //mengambil data dari pallete edittext dengan id notelp pada layout activity_biodata untuk disimpan pada objek ambilnotelp
        EditText ambilnotelp=(EditText)findViewById(R.id.notelp) ;


        //mengambil nilai dari objek ambilnim menggunakan metode getText dan mengkonversinya menjadi string ke dalam variabel nim0
        nim0=ambilnim.getText().toString();
        //mengambil nilai dari objek ambilnama menggunakan metode getText dan mengkonversinya menjadi string ke dalam variabel nama0
        nama0=ambilnama.getText().toString();
        //mengambil nilai dari objek ambilalamat menggunakan metode getText dan mengkonversinya menjadi string ke dalam variabel alamat0
        alamat0=ambilalamat.getText().toString();
        //mengambil nilai dari objek ambilemail menggunakan metode getText dan mengkonversinya menjadi string ke dalam variabel email0
        email0=ambilemail.getText().toString();
        //mengambil nilai dari objek ambilnotelp menggunakan metode getText dan mengkonversinya menjadi string ke dalam variabel notelp0
        notelp0=ambilnotelp.getText().toString();

        //membundle variabel nim0 kedalam bundle b dengan key nim1
        b.putString("nim1",nim0);
        //membundle variabel nama0 kedalam bundle b dengan key nama1
        b.putString("nama1",nama0);
        //membundle variabel alamat0 kedalam bundle b dengan key alamat1
        b.putString("alamat1",alamat0);
        //membundle variabel email0 kedalam bundle b dengan key email1
        b.putString("email1",email0);
        //membundle variabel notelp0 kedalam bundle b dengan key notelp1
        b.putString("notelp1",notelp0);

        //memasukkan bundle b kedalam intents i
        i.putExtras(b);
        //memulai activity i
        startActivity(i);
    }
}
