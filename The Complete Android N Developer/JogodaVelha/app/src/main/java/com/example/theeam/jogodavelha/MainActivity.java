package com.example.theeam.jogodavelha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int player = 0;
    // 0 for circle, 1 for cross

    int played = 10;
    //local played

    boolean activeGame = true;


    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    public void play(View view) {
        ImageView img = (ImageView) view;
        played = Integer.parseInt(img.getTag().toString());

        if (gameState[played] == 2 && activeGame) {
            img.setTranslationY(-1000f);
            gameState[played] = player;
            if (player == 0) {
                img.setImageResource(R.drawable.circle);
                player = 1;
            } else {
                img.setImageResource(R.drawable.cross);
                player = 0;
            }

            img.animate().translationYBy(1000f).rotation(360).setDuration(250);
            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                        gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                        gameState[winningPosition[0]] != 2) {

                    String winner = "Cross";
                    if (gameState[winningPosition[0]] == 0) {
                        winner = "Circle";
                    }

                    TextView winnerMsg = findViewById(R.id.winnerMsg);
                    winnerMsg.setText(winner + " has Won!");
                    activeGame = false;

                    LinearLayout ly = findViewById(R.id.playAgainLayout);
                    ly.setVisibility(View.VISIBLE);

                } else {
                    boolean gameOver = true;
                    for (int counterState : gameState) {
                        if (counterState == 2) {
                            gameOver = false;

                        }
                    }
                    if (gameOver) {
                        TextView winnerMsg = findViewById(R.id.winnerMsg);
                        winnerMsg.setText("DRAW!");
                        activeGame = false;

                        LinearLayout ly = findViewById(R.id.playAgainLayout);
                        ly.setVisibility(View.VISIBLE);

                    }
                }
            }

        } else {

        }
    }

    public void retry(View view) {

        activeGame = true;

        LinearLayout ly = findViewById(R.id.playAgainLayout);
        ly.setVisibility(View.INVISIBLE);
        player = 0;

        for (int i = 0; i < gameState.length; i++) {
            gameState[i] = 2;

        }

        GridLayout gl = findViewById(R.id.gridL);
        for (int i = 0; i < gl.getChildCount(); i++) {
            ((ImageView) gl.getChildAt(i)).setImageResource(0);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
