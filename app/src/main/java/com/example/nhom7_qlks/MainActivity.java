package com.example.nhom7_qlks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvSuDungDichVu ;
    ArrayList<SuDungDV> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nhanvientapvu_sungdungdichvu);
        setControl();
        setEvent();
    }

    private void setEvent() {
        khoiTao();
        Apdater_SuDungDV apdater_suDungDV = new Apdater_SuDungDV(this,R.layout.listview_nvtapvu_sudungdichvu,data);
        lvSuDungDichVu.setAdapter(apdater_suDungDV);
    }
    private void setControl() {
        lvSuDungDichVu = findViewById(R.id.lvSuDungDichVu);
    }
    private void khoiTao(){
        data.add(new SuDungDV("Phòng : 2","Hủy dịch vụ sử dụng"));
        data.add(new SuDungDV("Phòng : 3","Hủy dịch vụ sử dụng"));


    }
}