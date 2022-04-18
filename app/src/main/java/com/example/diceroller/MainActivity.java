package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod(){
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int RollResult = rand.nextInt(6)+1;

                TextView resultView = (TextView) findViewById(R.id.TAPROLL);
                resultView.setText(Integer.toString(RollResult));

                ImageView diceImage = (ImageView) findViewById(R.id.DiceImage);

                switch (RollResult){
                    case 1:
                        diceImage.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        diceImage.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        diceImage.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        diceImage.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        diceImage.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        diceImage.setImageResource(R.drawable.dice6);
                        break;

                }

            }
        });
    }
}