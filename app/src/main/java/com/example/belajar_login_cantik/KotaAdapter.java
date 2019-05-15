package com.example.belajar_login_cantik;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class KotaAdapter extends RecyclerView.Adapter<KotaAdapter.KotaViewHolder> {


    private ArrayList<Kota> dataList;

    public KotaAdapter(ArrayList<Kota> dataList) {
        this.dataList = dataList;
    }

    @Override
    public KotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_city, parent, false);
        return new KotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KotaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getSuhu());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KotaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm;

        public KotaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_kota);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_suhu);
        }
    }
}
