package com.example.herotruth.arrayadaptercountries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Initializtion
    String[] myCountries = {"China", "India", "US"};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);

        //Initializtion
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (
                    MainActivity.this,
                    R.layout.layout_item,
                    R.id.textView_Item,
                    myCountries
                );

        listView = findViewById(R.id.ListView_basic);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener
                (
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick
                                    (
                                            AdapterView<?> parent,
                                            View view,
                                            int position,
                                            long id
                                    )
                            {
                                //WHERE IS ITEM USED? !!!!!
                                String item = (String)parent.getItemAtPosition(position);
                                Toast.makeText
                                        (
                                            MainActivity.this,
                                            "Name of Country: "
                                                    + item
                                                    + "At Position "
                                                    + position,
                                            Toast.LENGTH_SHORT
                                        ).show();
                            }
                        }
                );
    }
}
