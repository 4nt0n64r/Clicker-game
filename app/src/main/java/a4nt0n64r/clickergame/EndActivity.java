package a4nt0n64r.clickergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    private TextView mResultText;
    private TextView mResultsNumber;

    private Button mRestart;

    private int mPointsEarned = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Intent intent = getIntent();
        mPointsEarned = intent.getIntExtra("points_from_game",0);//get points from GameActivity

        mResultText = (TextView) findViewById(R.id.text_results);
        mResultsNumber = (TextView) findViewById(R.id.points_results);

        //congrats player for points
        if (mPointsEarned == 0){
            mResultsNumber.setText(getString(R.string.zero_or_one_earned,mPointsEarned)); //0
            mResultText.setText(R.string.text_zero_points_earned);
        }else if (mPointsEarned == 1){
            mResultsNumber.setText(getString(R.string.zero_or_one_earned,mPointsEarned));//1
            mResultText.setText(R.string.text_one_points_earned);
        }else if (mPointsEarned >= 2 && mPointsEarned <= 30){
            mResultsNumber.setText(getString(R.string.points_earned,mPointsEarned));// 2<x<30
            mResultText.setText(R.string.less_than_30_points_earned);
        }else if (mPointsEarned > 30 && mPointsEarned < 100){
            mResultsNumber.setText(getString(R.string.points_earned,mPointsEarned));// 30<x<100
            mResultText.setText(R.string.more_than_30_less_than_100_points_earned);
        }else if (mPointsEarned >= 100 && mPointsEarned < 200){
            mResultsNumber.setText(getString(R.string.points_earned,mPointsEarned));// 100+
            mResultText.setText(R.string.more_than_100_points_earned);
        }else if (mPointsEarned >= 200 && mPointsEarned < 300){
            mResultsNumber.setText(getString(R.string.points_earned,mPointsEarned));// 200+
            mResultText.setText(R.string.more_than_200_points_earned);
        }else if (mPointsEarned >= 300 && mPointsEarned < 400){
            mResultsNumber.setText(getString(R.string.points_earned,mPointsEarned));// 300+
            mResultText.setText(R.string.more_than_300_points_earned);
        }else if (mPointsEarned >= 400 && mPointsEarned < 500){
            mResultsNumber.setText(getString(R.string.points_earned,mPointsEarned));// 400+
            mResultText.setText(R.string.more_than_400_points_earned);
        }else if (mPointsEarned >= 500 && mPointsEarned < 1000){
            mResultsNumber.setText(getString(R.string.points_earned,mPointsEarned));// 500+
            mResultText.setText(R.string.more_than_500_points_earned);
        }else if (mPointsEarned >= 1000){
            mResultsNumber.setText(getString(R.string.points_earned,mPointsEarned));// 1K+
            mResultText.setText(R.string.more_than_1k_points_earned);
        }


        mRestart = (Button) findViewById(R.id.restart_button);

        mRestart.setOnClickListener(new View.OnClickListener() {        //begin new game
            @Override
            public void onClick(View v){
                //start MainActivity
                Intent intent = new Intent(EndActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
