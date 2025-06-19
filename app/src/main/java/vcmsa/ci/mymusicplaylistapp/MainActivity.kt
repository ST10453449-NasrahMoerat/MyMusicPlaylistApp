package vcmsa.ci.mymusicplaylistapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val addtoplaylistButton = findViewById<Button>(R.id.addplaylistBtn)
        val nextButton = findViewById<Button>(R.id.nextbutton)
        val exitButton = findViewById<Button>(R.id.exitbutton)

        addtoplaylistButton.setOnClickListener {
            // Naviagte to ask to enter the details of the playlist
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            nextButton.setOnClickListener {
                // Navigate to the second screen
                val intent = Intent(this, MainActivity::class.java)
            }

            exitButton.setOnClickListener {
                // To exit the application
                finishAffinity() // This will close the app and remove it from the recent apps list
            }
        }
    }
}

