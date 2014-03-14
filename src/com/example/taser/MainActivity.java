package com.example.taser;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.view.Menu;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	SoundManager snd;
	int tasersound;
	OnClickListener buttonClick;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        snd = new SoundManager(getApplicationContext());
 
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
 
        tasersound = snd.load(R.raw.taser);
	}
	public void clickHandler(View v)
    {
		snd.play(tasersound);
    	Log.i("---","Button1");
    	Vibrator vibrator =(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    	vibrator.vibrate(50);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
