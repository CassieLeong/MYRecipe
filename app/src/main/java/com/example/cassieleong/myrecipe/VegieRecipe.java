package com.example.cassieleong.myrecipe;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class VegieRecipe extends Activity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegie_recipe);


        ImageButton fab22 = (ImageButton) findViewById(R.id.imageButton22);
        fab22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VegieRecipe.this, VegetarianOysterSauceBroccoli.class);
                startActivity(intent);
            }
        });

        ImageButton fab23 = (ImageButton) findViewById(R.id.imageButton23);
        fab23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VegieRecipe.this, EggplantSalad.class);
                startActivity(intent);
            }
        });

        ImageButton fab21 = (ImageButton) findViewById(R.id.imageButton21);
        fab21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VegieRecipe.this, AcarVegie.class);
                startActivity(intent);
            }
        });

    }
}


