package com.myclass.deanquanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ImageView imageView;
    private RelativeLayout gridviewThongTin;
    private RelativeLayout gridviewThoiKhoaBieu;
    private RelativeLayout gridviewXemDiem;
    private RelativeLayout gridviewTienTrinh;
    private RelativeLayout gridviewLogout;
    Boolean isUpdated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById( R.id.imageView6 );
        gridviewThongTin = (RelativeLayout) findViewById( R.id.gridviewthongtin );
        gridviewThongTin.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent( MainActivity.this, ThongtinActivity.class );
               startActivity( intent );
           }
       } );
        gridviewThoiKhoaBieu = (RelativeLayout) findViewById( R.id.gridviewtkb);
        gridviewThoiKhoaBieu.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this , ThoiKhoaBieu.class );
                startActivity( intent );
            }
        } );
        gridviewXemDiem = (RelativeLayout) findViewById( R.id.gridviewxemdiem );
        gridviewXemDiem.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, XemdiemActivity.class );
                startActivity( intent );
            }
        } );
        gridviewTienTrinh = (RelativeLayout) findViewById( R.id.gridviewtientrinh );
        gridviewTienTrinh.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, TienTrinhActivity.class );
                startActivity( intent );
            }
        } );
        gridviewLogout = (RelativeLayout) findViewById( R.id.gridviewlogout );
        gridviewLogout.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, LoginActivity.class );
                startActivity( intent );
            }
        } );


    }




}
