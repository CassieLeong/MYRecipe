package com.example.cassieleong.myrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class BabySquids extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener {

    private static final int RECOVERY_REQUEST = 10;
    public static final String API_KEY = "AIzaSyD_nEKzUc25AKUlt0fgRx-a2sb1FnVtbNQ";
    private String VIDEO_ID = "uMvxvzAn0yY"; // youtube URL after v=

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        //TODO Auto-generated method stub
        super.onCreate(saveInstanceState);
        setContentView(R.layout.content_baby_squids);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView)

                findViewById(R.id.youtube_view2);
        youTubePlayerView.initialize(API_KEY, this);

    }


    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
        if(errorReason.isUserRecoverableError()){
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String errorMessage = String.format("YouTube Error (%1$s)",
                    errorReason.toString());
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        if(!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == RECOVERY_REQUEST) {
            getYouTubePlayerProvider().initialize(API_KEY, this);
        }
    }

    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView) findViewById(R.id.youtube_view2);
    }

}
