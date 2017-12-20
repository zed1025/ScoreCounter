package inc.thebest.scorecounter;

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
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    //Displays the given score for Team A.
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Buttons for adding score for team A
    public void plus_3_team_a(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void plus_2_team_a(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }


    public void plus_1_team_a(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    //Displays the given score for Team B.
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Buttons for adding score for team B
    public void plus_3_team_b(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void plus_2_team_b(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }


    public void plus_1_team_b(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
