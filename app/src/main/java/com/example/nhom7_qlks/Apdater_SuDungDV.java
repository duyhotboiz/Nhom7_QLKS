package com.example.nhom7_qlks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.ContentView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Apdater_SuDungDV extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<SuDungDV>data;
    public Apdater_SuDungDV(@NonNull Context context, int resource, ArrayList<SuDungDV>data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource,null);
        TextView tvPhong = convertView.findViewById(R.id.tvphong);
        Button btnHuyDv = convertView.findViewById(R.id.btnHuyDV);

        SuDungDV sudung =  data.get(position);
        tvPhong.setText(sudung.getPhong());
        btnHuyDv.setText(sudung.getHuyDV());

        return convertView;

    }
}
