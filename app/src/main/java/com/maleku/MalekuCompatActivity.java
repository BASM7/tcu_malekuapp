package com.maleku;

import android.content.ContentResolver;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MalekuCompatActivity extends AppCompatActivity {
    @SuppressWarnings("FieldMayBeFinal")
    private MediaPlayer mediaPlayer = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }

    protected Uri getUriFromFile(int resID) {
        return Uri.parse(
                ContentResolver.SCHEME_ANDROID_RESOURCE + "://" +
                        getApplication().getApplicationContext().getPackageName() + "/" +
                        resID);
    }

    protected boolean isPlaying(){
        return this.getMediaPlayer() != null && this.getMediaPlayer().isPlaying();
    }

    protected void play(int resID) {
        if (this.isPlaying())
            this.getMediaPlayer().stop();

        MediaPlayer newMediaPlayer = MediaPlayer.create(
                this,
                this.getUriFromFile(resID)
        );
        this.setMediaPlayer(newMediaPlayer);
        this.getMediaPlayer().start();
    }

    protected void switchActivity(MalekuCompatActivity currentActivity, Class<?> nextActivityClass){
        if (currentActivity.isPlaying())
            currentActivity.getMediaPlayer().stop();
        Intent newIntent = new Intent(currentActivity, nextActivityClass);
        startActivity(newIntent);
    }
}
