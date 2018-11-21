package a4nt0n64r.clickergame

import android.content.Intent
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class GameActivity : AppCompatActivity() {

    private var mEarnedPoints = 0
    private val timerSeconds = 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val mTapButton = findViewById<Button>(R.id.tap_button)
        val mTimer = findViewById<TextView>(R.id.timer)
        val mPointsTW = findViewById<TextView>(R.id.points)

        object : CountDownTimer((timerSeconds * 1000).toLong(), 1000) {

            override fun onTick(l: Long) {
                mTimer.text = "${l / 1000}"
            }

            override fun onFinish() {
                mTimer.text = "0"
                //start EndActivity with our result
                val intent = Intent(this@GameActivity, EndActivity::class.java)
                intent.putExtra("points_from_game", mEarnedPoints)
                startActivity(intent)
            }
        }.start()


        mTapButton.setOnClickListener {
            //count points
            mEarnedPoints++
            mPointsTW.text = "${mEarnedPoints}"
        }
    }
}
