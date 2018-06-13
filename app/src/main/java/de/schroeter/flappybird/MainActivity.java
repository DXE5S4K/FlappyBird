package de.schroeter.flappybird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import de.schroeter.flappybird.de.schroeter.flappybird.enums.Gamestate;

public class MainActivity extends AppCompatActivity {
    Gamestate gameState = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameState = Gamestate.MULLEFUK;

        switch (gameState){
            case STOP:
            {
                Log.i("Gamestate", "STOP");
                break;
            }
            case RUNNING:
            {
                Log.i("Gamestate", "RUNNING");
                break;
            }
            case PAUSED:
            {
                Log.i("Gamestate", "PAUSED");
                break;
            }
            case GAMEOVER:
            {
                Log.i("Gamestate", "GAMEOVER");
                break;
            }
            default:
            {
                Log.i("Gamestate:", "Unknown gamestate!");
                break;
            }
        }

    }
}
