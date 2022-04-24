package com.myclass.deanquanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.myclass.deanquanlysinhvien.tkb.ThuHaiActivity;

import java.util.ArrayList;

public class ThoiKhoaBieu extends AppCompatActivity {
    ListView lvTKB;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_thoi_khoa_bieu );
        lvTKB = (ListView) findViewById( R.id.listviewTKB );
        arrayList = new ArrayList<>();
        arrayList.add( "Thứ 2" );
        arrayList.add( "Thứ 3" );
        arrayList.add( "Thứ 4" );
        arrayList.add( "Thứ 5" );
        arrayList.add( "Thứ 6" );
        arrayList.add( "Thứ 7" );
        arrayList.add("Chủ nhật");
        final ArrayAdapter adapter = new ArrayAdapter( ThoiKhoaBieu.this ,
                android.R.layout.simple_list_item_1,
                arrayList);
        lvTKB.setAdapter( adapter );
        lvTKB.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
               if (i==0){
                   Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                   startActivityForResult( intent,0 );
               }
                if (i==1){
                    Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                    startActivityForResult( intent,0 );
                }
                if (i==2){
                    Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                    startActivityForResult( intent,0 );
                }
                if (i==3){
                    Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                    startActivityForResult( intent,0 );
                }
                if (i==4){
                    Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                    startActivityForResult( intent,0 );
                }
                if (i==5){
                    Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                    startActivityForResult( intent,0 );
                }
                if (i==6){
                    Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                    startActivityForResult( intent,0 );
                }
                if (i==7){
                    Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                    startActivityForResult( intent,0 );
                }
                if (i==8){
                    Intent intent = new Intent( view.getContext(),ThuHaiActivity.class );
                    startActivityForResult( intent,0 );
                }
            }
        } );
    }
}
