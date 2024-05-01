package net.erickveil.multiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchViewButton = findViewById<Button>(R.id.but_switchToSecondAct)
        switchViewButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val showFragmentButton = findViewById<Button>(R.id.but_showFrag)
        showFragmentButton.setOnClickListener {
            val popupFragment = BottomSheetFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, popupFragment)
                .commit()
        }

            

    }
}