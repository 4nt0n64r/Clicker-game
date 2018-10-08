package a4nt0n64r.clickergame;

import android.content.pm.ActivityInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mTapButton;
    private TextView mCounterTextView;
    private TextView mCountDown;
    private ImageView mStart;

    private int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTapButton = (Button) findViewById(R.id.start_button);
        mCounterTextView = (TextView) findViewById(R.id.counter_text_view);
        mCountDown = (TextView) findViewById(R.id.countDown);

        mTapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter++;
                mCounterTextView.setText("" + mCounter);
            }
        });

        mStart = (ImageView) findViewById(R.id.startImage);

        mStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                new CountDownTimer(60000, 1000) {

                    public void onTick(long l) {
                        mCountDown.setText("" + l/ 1000);
                    }

                    public void onFinish() {
                        mCountDown.setText("-");
                    }
                }.start();

            }
       });





    }
}
