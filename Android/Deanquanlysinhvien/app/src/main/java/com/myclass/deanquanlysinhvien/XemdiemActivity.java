package com.myclass.deanquanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class XemdiemActivity extends AppCompatActivity {
    private ListView lvXemdiem;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_xemdiem );
        lvXemdiem = (ListView) findViewById( R.id.listviewXemdiem);
        arrayList = new ArrayList<>();
        arrayList.add( "Cấu trúc dữ liệu và giải thuật" );
        arrayList.add("Hệ điều hành");
        arrayList.add("CC");
        final ArrayAdapter adapter = new ArrayAdapter( XemdiemActivity.this ,
                android.R.layout.simple_list_item_1,
                arrayList);
        lvXemdiem.setAdapter( adapter );
    }
}
