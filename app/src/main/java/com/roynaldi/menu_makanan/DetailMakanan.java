package com.roynaldi.menu_makanan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMakanan extends AppCompatActivity {
    public TextView txtNama,txtDeskripsi,txtHarga;
    public ImageView gambar;

    public String nama,deskripsi,harga;
    public int gambar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_makanan);

        txtNama = findViewById(R.id.txtNamaD);
        txtDeskripsi = findViewById(R.id.txtDeskripsiD);
        txtHarga = findViewById(R.id.txtHargaD);
        gambar = findViewById(R.id.imgFotoD);

        Bundle bundle = getIntent().getExtras();
        nama = bundle.getString("nama");
        deskripsi = bundle.getString("deskripsi");
        harga = bundle.getString("harga");
        gambar2 = bundle.getInt("gambar");

        txtNama.setText(nama);
        txtDeskripsi.setText(deskripsi);
        txtHarga.setText(harga);
        gambar.setImageResource(gambar2);

    }


}
