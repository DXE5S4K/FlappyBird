package de.schroeter.flappybird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import de.schroeter.flappybird.de.schroeter.flappybird.enums.Appstate;

public class MainActivity extends AppCompatActivity {
    Appstate gameAppstate = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameAppstate = Appstate.PLAYING;

        switch (gameAppstate){
            case STOP:
            {
                Log.i("Appstate", "STOP");
                break;
            }
            case PLAYING:
            {
                Log.i("Appstate", "RUNNING");
                break;
            }
            case PAUSED:
            {
                Log.i("Appstate", "PAUSED");
                break;
            }
            case GAMEOVER:
            {
                Log.i("Appstate", "GAMEOVER");
                break;
            }
            case WAITING:
            {
                Log.i("Appstate", "WAITING");
                break;
            }

            default:
            {
                Log.i("Appstate:", "Unknown gamestate!");
                break;
            }
        }

    }
}
