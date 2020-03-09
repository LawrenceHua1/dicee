package lawrence.hua.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button roll_button;
        roll_button = (Button) findViewById(R.id.rollbutton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {
          R.drawable.dice1,
          R.drawable.dice2,
          R.drawable.dice3,
          R.drawable.dice4,
          R.drawable.dice5,
          R.drawable.dice6
        };

        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "The Button has been pressed! ");

                Random randomNumberGenerator = new Random();

                int randNumber1 = randomNumberGenerator.nextInt(6);
                int randNumber2 = randomNumberGenerator.nextInt(6);



                leftDice.setImageResource(diceArray[randNumber1]);

                randNumber2 = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[randNumber2]);




            }
        });
    }
}
