package com.example.android.ud_tour_guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    private static String mTittle;
    private static String mDescription;
    private static int mImageID;
    private ImageView mLocationIV;
    private TextView mLocationTV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Bundle extras = getIntent().getExtras();
        mTittle = extras.getString("LocationName");
        mDescription = extras.getString("LocationDescription");
        mImageID = extras.getInt("LocationImage");
        getSupportActionBar().setTitle(mTittle);

        mLocationIV = findViewById(R.id.desc_image);
        mLocationIV.setImageDrawable(getDrawable(mImageID));

        mLocationTV = findViewById(R.id.location_desc);
        mLocationTV.setText(mDescription);

    }
}
