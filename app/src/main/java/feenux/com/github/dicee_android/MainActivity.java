package feenux.com.github.dicee_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int[] diceArray = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.roll_button);
        ImageView leftDice = findViewById(R.id.image_left_dice);
        ImageView rightDice = findViewById(R.id.image_right_dice);

        rollButton.setOnClickListener((v) -> {
            Random random = new Random();
            int numberLeft = random.nextInt(6);
            int numberRight = random.nextInt(6);
            leftDice.setImageResource(diceArray[numberLeft]);
            rightDice.setImageResource(diceArray[numberRight]);
        });
    }
}
