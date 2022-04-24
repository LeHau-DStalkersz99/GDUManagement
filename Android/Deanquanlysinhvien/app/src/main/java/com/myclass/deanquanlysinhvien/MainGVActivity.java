package com.myclass.deanquanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainGVActivity extends AppCompatActivity {
    private RelativeLayout gridviewThongTinGV;
    private RelativeLayout gridviewLichDay;
    private  RelativeLayout gridviewDiemDanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main_g_v );
        gridviewThongTinGV = (RelativeLayout) findViewById( R.id.gridviewthongtingv );
        gridviewThongTinGV.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainGVActivity.this, ThongtinGVActivity.class );
                startActivity( intent );
            }
        } );
        gridviewDiemDanh = (RelativeLayout) findViewById( R.id.gridviewdiemdanh );
        gridviewDiemDanh.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainGVActivity.this, ThoiKhoaBieu.class );
                startActivity( intent );
            }
        } );
        gridviewLichDay =(RelativeLayout) findViewById( R.id.gridviewlichday );
        gridviewLichDay.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainGVActivity.this, ThoiKhoaBieu.class );
                startActivity( intent );
            }
        } );
    }
}
