package com.webovix.searchfilters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    SearchableAdapter arrayAdapter;
    EditText etSearch;
    List<String> nw = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        etSearch = findViewById(R.id.etSearch);
        nw.add( "Aaditya");
        nw.add( "Aarya");
        nw.add("Abhay");
        nw.add("Abhijeet");
        nw.add( "Abhinandan");
        nw.add( "Abhinay");
        nw.add( "Abhishek");
        nw.add("Abimanyu");
        nw.add( "Aditya");
        nw.add( "Akhil");
        nw.add( " Akshat");
        nw.add( "Anil");
        nw.add( "Avi");
        nw.add( "Balaraam");
        nw.add( "Bharat");
        nw.add( "Bhaskar");
        nw.add( "Bhaumik");
        nw.add( "Bijay");
        nw.add( "Brijesh");
        nw.add( "Chandan");
        nw.add( "Chetan");
        nw.add( "Chirag");
        nw.add( "Chiranjeeve");
        nw.add( "Daksh");
        nw.add( "Daman");
        nw.add( "Depen");
        nw.add( "Dev");
        nw.add( "Dhruv");
        nw.add( " Divyanshu");
        nw.add( " Ekambar");
        nw.add( " Ekansh");
        nw.add( " Ekaraj");
        nw.add( " Eklavya");
        nw.add( "Elilarasan");
        nw.add( "Falak");
        nw.add( "Gagan");
        nw.add( " Gajendra");
        nw.add( " Garv");
        nw.add( " Gaurav");
        nw.add( " Gautam");
        nw.add( " Hardik");
        nw.add( " Harsh");
        nw.add( " Hemant");
        nw.add( " Hridaya");
        nw.add( " Indivar");
        nw.add( "Indra");
        nw.add( "Indraneel");
        nw.add( " Ishaan");
        nw.add( " Ishwar");
        nw.add( "Jai");
        nw.add( "Karishma");
        nw.add( "Kashish");
        nw.add( "Khushi");
        nw.add( "Kinjal");
        nw.add( "Kirti");
        nw.add( "Komal");
        nw.add( "Koyal");
        nw.add( "Kshipra");
        nw.add( "Latika");
        nw.add( "Laveena");
        nw.add( "Lavleen");
        nw.add( "Lipi");
        nw.add( "Lipika");
        nw.add( "Madhuri");
        nw.add( "Mallika");
        nw.add( "Mansi");
        nw.add( "Mayuari");
        nw.add( "Mehar");
        nw.add( "Mridul");
        nw.add( "Naina");
        nw.add( "Nandini");
        nw.add( "Neeta");
        nw.add( "Neharika");
        nw.add( "Nidhi");
        nw.add( "Niyati");
        nw.add( "Nupur");
        nw.add( "Ojaswini");
        nw.add( "Palak");
        nw.add( "Pallavi");
        nw.add( "Pari");
        nw.add( "Prajakta");
        nw.add( "Pratibha");
        nw.add( "Praveen");
        nw.add( "Preeti");
        nw.add( "Prerena");
        nw.add( "Priya");
        nw.add( "Raakhi");
        nw.add( "Raashi");
        nw.add( "Radha");
        nw.add( "Ragini");
        nw.add( "Rajni");
        nw.add( "Riya");
        nw.add( "Ruhi");
        nw.add( "Sachi");
        nw.add( "Saloni");
        nw.add( "Sejal");
        nw.add( "Shagun");
        nw.add( "Shefali");
        nw.add( "Shilpa");
        nw.add( "Vasudha");





        arrayAdapter = new SearchableAdapter(this,nw);
        listView.setAdapter(arrayAdapter);
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                arrayAdapter.getFilter().filter(s);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

}
