package a4nt0n64r.clickergame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class EndActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val mResultText = findViewById<TextView>(R.id.text_results)
        val mResultsNumber = findViewById<TextView>(R.id.points_results)

        val mRestart: Button = findViewById<Button>(R.id.restart_button)

        val mPointsEarned: Int = intent.getIntExtra("points_from_game", 0)//get points from GameActivity

        //congrats player for points
        when (mPointsEarned) {
            0 -> {
                mResultsNumber.text = getString(R.string.zero_or_one_earned, mPointsEarned) //0
                mResultText.setText(R.string.text_zero_points_earned)
            }

            1 -> {
                mResultsNumber.text = getString(R.string.zero_or_one_earned, mPointsEarned)//1
                mResultText.setText(R.string.text_one_points_earned)
            }

            in (2..30) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 2<x<30
                mResultText.setText(R.string.less_than_30_points_earned)
            }

            in (31..99) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 30<x<100
                mResultText.setText(R.string.more_than_30_less_than_100_points_earned)
            }

            in (31..99) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 30<x<100
                mResultText.setText(R.string.more_than_30_less_than_100_points_earned)
            }

            in (100..199) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 100+
                mResultText.setText(R.string.more_than_100_points_earned)
            }

            in (200..299) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 200+
                mResultText.setText(R.string.more_than_200_points_earned)
            }

            in (300..399) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 300+
                mResultText.setText(R.string.more_than_300_points_earned)
            }

            in (400..499) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 400+
                mResultText.setText(R.string.more_than_400_points_earned)
            }

            in (500..999) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 500+
                mResultText.setText(R.string.more_than_500_points_earned)
            }

            in (1000..Int.MAX_VALUE) -> {
                mResultsNumber.text = getString(R.string.points_earned, mPointsEarned)// 1K+
                mResultText.setText(R.string.more_than_1k_points_earned)
            }
        }

        //begin new game
        mRestart.setOnClickListener {
            //start MainActivity
            val intent = Intent(this@EndActivity, MainActivity::class.java)
            startActivity(intent)
        }


    }
}
