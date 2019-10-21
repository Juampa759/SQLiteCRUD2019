package com.example.menu;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRecicleViewListUSer extends RecyclerView.Adapter<AdapterRecicleViewListUSer.Holder>{
    List<DataAccessUsers> listUsers;

    public AdapterRecicleViewListUSer(List<DataAccessUsers> listUsers) {
        this.listUsers = listUsers;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdatauser,parent,false);
        AdapterRecicleViewListUSer.Holder holder = new AdapterRecicleViewListUSer.Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.Correo.setText(""+listUsers.get(position).getEmail());
        holder.Nombre.setText(listUsers.get(position).getName());
    }

    @Override
    public int getItemCount() {

        return listUsers.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView Nombre,Correo;
        public Holder(@NonNull View itemView) {
            super(itemView);
            Nombre = itemView.findViewById(R.id.txtIName);
            Correo = itemView.findViewById(R.id.txtIEmail);

        }
    }
}
