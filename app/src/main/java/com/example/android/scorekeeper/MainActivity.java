package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int yellowTeamA = 0;
    int redTeamA = 0;
    int penaltyTeamA = 0;
    int yellowTeamB = 0;
    int redTeamB = 0;
    int penaltyTeamB = 0;

    /**
     * Increase score for Team A.
     */
    public void addForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }

    /**
     * Increase yellow cards for Team A.
     */
    public void addYellowTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowTeamA(yellowTeamA);
    }

    /**
     * Increase red cards for Team A.
     */
    public void addRedTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayRedTeamA(redTeamA);
    }

    /**
     * Increase penalty for Team A.
     */
    public void addPenaltyTeamA(View v) {
        penaltyTeamA = penaltyTeamA + 1;
        displayPenaltyTeamA(penaltyTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow cards for Team A.
     */
    public void displayYellowTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team A.
     */
    public void displayRedTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalties for Team A.
     */
    public void displayPenaltyTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase score for Team B.
     */
    public void addForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }

    /**
     * Increase yellow cards for Team B.
     */
    public void addYellowTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowTeamB(yellowTeamB);
    }

    /**
     * Increase red cards for Team B.
     */
    public void addRedTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayRedTeamB(redTeamB);
    }

    /**
     * Increase penalty for Team B.
     */
    public void addPenaltyTeamB(View v) {
        penaltyTeamB = penaltyTeamB + 1;
        displayPenaltyTeamB(penaltyTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow cards for Team B.
     */
    public void displayYellowTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red cards for Team B.
     */
    public void displayRedTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalties for Team B.
     */
    public void displayPenaltyTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the score, card and penalties for both teams to 0.
     */
    public void resetScore (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowTeamA(yellowTeamA);
        displayYellowTeamB(yellowTeamB);
        displayRedTeamA(redTeamA);
        displayRedTeamB(redTeamB);
        displayPenaltyTeamA(penaltyTeamA);
        displayPenaltyTeamB(penaltyTeamB);
        }

}

