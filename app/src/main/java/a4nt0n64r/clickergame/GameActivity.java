package a4nt0n64r.clickergame;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private Button mTapButton;
    private TextView mTimer;
    private TextView mPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mTapButton = (Button) findViewById(R.id.tap_button);        //прикрепить дисплей из хмл

        mTapButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                new CountDownTimer(60000, 1000) {

                    public void onTick(long l) {
                        mTimer.setText("" + l/ 1000);
                    }

                    public void onFinish() {
                        mTimer.setText("-");
                    }
                }.start();
    }
}
