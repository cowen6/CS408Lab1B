package com.example.cs408lab1b;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cs408lab1b.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int PlayerScore, ComputerScore;
    private Weapon PlayerWeapon, ComputerWeapon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String PlayerChoice = getResources().getString(R.string.player);
        String ComputerChoice = getResources().getString(R.string.computer);

        binding.rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView score = binding.scoreText;
                TextView player = binding.playerWeapon;
                TextView computer = binding.computerWeapon;
                TextView result = binding.resultText;

                String Results = "";

                PlayerWeapon = Weapon.ROCK;
                int num = new Random().nextInt(3);
                if(num == 0) {
                    ComputerWeapon = Weapon.ROCK;
                } else if (num == 1) {
                    ComputerWeapon = Weapon.PAPER;
                } else {
                    ComputerWeapon = Weapon.SCISSORS;
                }

                if (PlayerWeapon == ComputerWeapon) {  //Draw
                    Results = "Draw: " + getResources().getString(R.string.draw);
                } else if (ComputerWeapon == Weapon.SCISSORS) { //Win
                    PlayerScore++;
                    Results = "Player Wins: " + getResources().getString(R.string.rockWin);
                } else { //Lose
                    ComputerScore++;
                    Results = "Computer Wins: " + getResources().getString(R.string.paperWin);
                }

                String scoreString = "Player: " + PlayerScore + ", Computer: " + ComputerScore;
                String PlayChoice = PlayerChoice + " " + PlayerWeapon.toString();
                String CompChoice = ComputerChoice + " " + ComputerWeapon.toString();
                score.setText(scoreString);
                player.setText(PlayChoice);
                computer.setText(CompChoice);
                result.setText(Results);
            }
        });

        binding.paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView score = binding.scoreText;
                TextView player = binding.playerWeapon;
                TextView computer = binding.computerWeapon;
                TextView result = binding.resultText;

                String Results = "";

                PlayerWeapon = Weapon.PAPER;
                int num = new Random().nextInt(3);
                if(num == 0){
                    ComputerWeapon = Weapon.ROCK;
                } else if (num == 1) {
                    ComputerWeapon = Weapon.PAPER;
                } else {
                    ComputerWeapon = Weapon.SCISSORS;
                }

                if (PlayerWeapon == ComputerWeapon) {  //Draw
                    Results = "Draw: " + getResources().getString(R.string.draw);
                } else if (ComputerWeapon == Weapon.ROCK) { //Win
                    PlayerScore++;
                    Results = "Player Wins: " + getResources().getString(R.string.paperWin);
                } else { //Lose
                    ComputerScore++;
                    Results = "Computer Wins: " + getResources().getString(R.string.scissorsWin);
                }

                String scoreString = "Player: " + PlayerScore + ", Computer: " + ComputerScore;
                String PlayChoice = PlayerChoice + " " + PlayerWeapon.toString();
                String CompChoice = ComputerChoice + " " + ComputerWeapon.toString();
                score.setText(scoreString);
                player.setText(PlayChoice);
                computer.setText(CompChoice);
                result.setText(Results);
            }
        });

        binding.scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView score = binding.scoreText;
                TextView player = binding.playerWeapon;
                TextView computer = binding.computerWeapon;
                TextView result = binding.resultText;

                String Results = "";

                PlayerWeapon = Weapon.SCISSORS;
                int num = new Random().nextInt(3);
                if(num == 0){
                    ComputerWeapon = Weapon.ROCK;
                } else if (num == 1) {
                    ComputerWeapon = Weapon.PAPER;
                } else {
                    ComputerWeapon = Weapon.SCISSORS;
                }

                if (PlayerWeapon == ComputerWeapon) {  //Draw
                    Results = "Draw: " + getResources().getString(R.string.draw);
                } else if (ComputerWeapon == Weapon.PAPER) { //Win
                    PlayerScore++;
                    Results = "Player Wins: " + getResources().getString(R.string.scissorsWin);
                } else { //Lose
                    ComputerScore++;
                    Results = "Computer Wins: " + getResources().getString(R.string.rockWin);
                }

                String scoreString = "Player: " + PlayerScore + ", Computer: " + ComputerScore;
                String PlayChoice = PlayerChoice + " " + PlayerWeapon.toString();
                String CompChoice = ComputerChoice + " " + ComputerWeapon.toString();
                score.setText(scoreString);
                player.setText(PlayChoice);
                computer.setText(CompChoice);
                result.setText(Results);
            }
        });
    }
}