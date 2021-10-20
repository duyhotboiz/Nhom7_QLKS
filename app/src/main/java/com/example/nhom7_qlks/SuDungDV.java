package com.example.nhom7_qlks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SuDungDV {
    String phong,huyDV;

    public SuDungDV() {
    }

    public SuDungDV(String phong, String huyDV) {
        this.phong = phong;
        this.huyDV = huyDV;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getHuyDV() {
        return huyDV;
    }

    public void setHuyDV(String huyDV) {
        this.huyDV = huyDV;
    }

    @Override
    public String toString() {
        return "SuDungDV{" +
                "phong='" + phong + '\'' +
                ", huyDV='" + huyDV + '\'' +
                '}';
    }
}
