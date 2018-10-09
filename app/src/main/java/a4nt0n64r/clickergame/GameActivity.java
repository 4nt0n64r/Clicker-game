package a4nt0n64r.clickergame;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private Button mTapButton;
    private TextView mTimer;
    private TextView mPointsTW;

    private int mEarnedPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mTapButton = (Button) findViewById(R.id.tap_button);
        mTimer = (TextView) findViewById(R.id.timer);
        mPointsTW = (TextView) findViewById(R.id.points);

        new CountDownTimer(10000, 1000) {

            public void onTick(long l) {
                mTimer.setText("" + l / 1000);
            }       //высунуть таймер из нажатия

            public void onFinish() {
                mTimer.setText("0");
                // сообщение "время вышло"
                //стартуем итоговую активность
                Intent intent = new Intent(GameActivity.this, EndActivity.class);
                startActivity(intent);
            }
        }.start();


        mTapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEarnedPoints++;
                mPointsTW.setText(""+mEarnedPoints);

            }
        });
    }
}
