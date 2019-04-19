package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactAdapter;
import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class DetailsActivity extends AppCompatActivity {
     TextView tvFullName, tvPhoneNo;
     CircleImageView circImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_details );

        circImg = findViewById( R.id.circImg );
        tvFullName = findViewById( R.id.tvFullName );
        tvPhoneNo = findViewById( R.id.tvPhoneNo );

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            circImg.setImageResource( bundle.getInt( "image" ) );
            tvFullName.setText( bundle.getString( "name" ) );
            tvPhoneNo.setText( bundle.getString( "phone" ) );

        }
    }
}
