package com.example.yvtc.my030604;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<Map<String, String>> data;
    SimpleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner =(Spinner)findViewById(R.id.spinner);
        data = new ArrayList<>();

        Map<String,String> m1 = new HashMap();
        m1.put("city","台北");
        m1.put("code","02");
        data.add(m1);

        Map<String,String> m2 = new HashMap();
        m2.put("city","台中");
        m2.put("code","04");
        data.add(m2);

        Map<String,String> m3 = new HashMap();
        m3.put("city","高雄");
        m3.put("code","07");
        data.add(m3);

        adapter = new SimpleAdapter(this,
                data,
                android.R.layout.simple_list_item_2,
                new String[]{"city","code"},
                new int[]{android.R.id.text1,android.R.id.text2}
                );
        spinner.setAdapter(adapter);
    }
}
