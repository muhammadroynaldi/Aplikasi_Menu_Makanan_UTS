package com.roynaldi.menu_makanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);

        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Bakso Mercon", "Rasa Pedas Tiada Tanding",R.drawable.baksomercon,"Rp. 30000"));
        listMakanan.add(new Makanan("Bakso Beranak", "Rasa yang disukai semua kalangan",R.drawable.baksoberanak,"Rp. 25000"));
        listMakanan.add(new Makanan("Bakso Lobster", "Rasa Seafood yang dipadukan dengan selimutan daging sapi",R.drawable.baksolobster,"Rp. 50000"));
        listMakanan.add(new Makanan("Bakso Gurita", "Rasa Seafood yang dipadukan dengan selimutan daging sapi",R.drawable.baksogurita,"Rp. 40000"));
        listMakanan.add(new Makanan("Bakso Telur", "Rasa lumer telur didalam bungkusan daging sapi asli halal",R.drawable.baksotelur,"Rp. 20000"));
        listMakanan.add(new Makanan("Bakso Urat", "Rasa urat daging yang sangat lezat",R.drawable.baksourat,"Rp. 25000"));

    }
}