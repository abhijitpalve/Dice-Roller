package com.example.asusrockz.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                imageViewDice = findViewById(R.id.image_view_dice);
                imageViewDice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rollDice();
                    }
                });
            }

            private void rollDice() {
                int randomNumber = rng.nextInt(6) + 1;

                switch (randomNumber) {
                    case 1:
                        imageViewDice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imageViewDice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imageViewDice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imageViewDice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imageViewDice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imageViewDice.setImageResource(R.drawable.dice6);
                        break;
                }
            }

        // Example of a call to a native method
       // TextView tv = (TextView) findViewById(R.id.sample_text);
       // tv.setText(stringFromJNI());


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
