package vcmsa.ci.mymusicplaylistapp

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore.Audio.Artists
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    companion object {
        val songs =
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val dialogView = layoutInflater.inflate(R.layout.dialog_add_song,null)

        val addtoplaylistButton = findViewById<Button>(R.id.addplaylistBtn)
        val nextButton = findViewById<Button>(R.id.nextbutton)
        val exitButton = findViewById<Button>(R.id.exitbutton)

        AlertDialog.Builder(this)
            .setTitle("Add song to playlist")
            .setView(dialogView)
            .setPositiveButton("Add") {_,_ ->

            }

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


