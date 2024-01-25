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

                score.setText("Player: " + PlayerScore + ", Computer: " + ComputerScore);
                player.setText("");
                computer.setText("");
                result.setText("");
            }
        });

        binding.paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView score = binding.scoreText;
                TextView player = binding.playerWeapon;
                TextView computer = binding.computerWeapon;
                TextView result = binding.resultText;

                score.setText("Player: " + PlayerScore + ", Computer: " + ComputerScore);
                player.setText("");
                computer.setText("");
                result.setText("");
            }
        });

        binding.scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView score = binding.scoreText;
                TextView player = binding.playerWeapon;
                TextView computer = binding.computerWeapon;
                TextView result = binding.resultText;

                score.setText("Player: " + PlayerScore + ", Computer: " + ComputerScore);
                player.setText("");
                computer.setText("");
                result.setText("");
            }
        });
    }
}