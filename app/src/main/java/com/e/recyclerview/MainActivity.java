package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerView =findViewById(R.id.recyclerView);

        List <Contacts>  contactsList= new ArrayList<>(  );
        contactsList.add( new Contacts ("Saugat Malla","9852142336",R.drawable.saugat ) );
        contactsList.add( new Contacts ("Rajesh Hamal","9852568658",R.drawable.rajesh ) );
        contactsList.add( new Contacts ("Bhuwan Kc",   "985256166",R.drawable.bhuwan) );
        contactsList.add( new Contacts ("Dayahang Rai","9852125356",R.drawable.dahayang) );

        ContactAdapter contactAdapter= new ContactAdapter( this,contactsList );
        recyclerView.setAdapter( contactAdapter );
        recyclerView.setLayoutManager(new LinearLayoutManager( this ) );

    }
}
