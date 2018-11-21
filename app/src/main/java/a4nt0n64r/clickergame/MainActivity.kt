package a4nt0n64r.clickergame

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mStartButton = findViewById<Button>(R.id.start_button)

        mStartButton.setOnClickListener {
            //start game activity
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }

    }
}
