package com.roynaldi.menu_makanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {

    public MakananAdapter(ArrayList<Makanan> listMakanan) {

        this.listMakanan = listMakanan;
    }
    private ArrayList<Makanan> listMakanan;

    @NonNull
    @Override
    public MakananAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_makanan, parent, false));

        return holder;
    }

    public void onBindViewHolder(@NonNull MakananAdapter.ViewHolder holder,int position){
        Makanan makanan = listMakanan.get(position);
        holder.txtNama.setText(makanan.getNama());
        holder.gambar.setImageResource(makanan.getGambar());
        holder.txtHarga.setText(makanan.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), com.roynaldi.menu_makanan.DetailMakanan.class);

                intent.putExtra("nama", makanan.getNama());
                intent.putExtra("deskripsi", makanan.getDeskripsi());
                intent.putExtra("gambar",makanan.getGambar());
                intent.putExtra("harga",makanan.getHarga());

                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNama, txtHarga, txtDeskripsi;
        public ImageView gambar;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtHarga = (TextView) itemView.findViewById(R.id.txtHarga);
            gambar = (ImageView) itemView.findViewById(R.id.imgFoto);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}
