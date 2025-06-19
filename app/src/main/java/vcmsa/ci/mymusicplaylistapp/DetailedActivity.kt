package vcmsa.ci.mymusicplaylistapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed)


        val song = intent.getStringArrayExtra("Song A, Song B , Song C, Song D")
        val artist = intent.getStringArrayExtra("Artist A, Artist B, Artist C, Artist D")
        val Rating = intent.getStringArrayExtra("4,1,2,3")
        val comment = intent.getStringArrayExtra("Rap, Dance song, Best Love song, Memories")

        val tvPlaylists = findViewById<TextView>(R.id.playlist_text)
        val avgButton = findViewById<Button>(R.id.btn_avg)
        val backButton = findViewById<Button>(R.id.returnbtn)
        val displayList = findViewById<Button>(R.id.btn_show_songs)

        // Display all the songs
        var playlistText = ""
        if (MainActivity.songs.isEmpty()) {
            playlistText = "Playlist is empty."
        } else {
            playlistText = "Current Playlist:\n\n"
            for ((index, song) in MainActivity.songs.withIndex()) {
                playlistText += "${index + 1}.${song.title} - ${song.artist}\n" +
                        " Rating: ${"*".repeat(song.rating)} (${song.artist}\n" +
                        "Comment: ${song.comment}\n\n"
            }
        }
        tvPlaylists.text = playlistText

        avgButton.setOnClickListener {
            if (MainActivity.songs.isEmpty()) {
                Toast.makeText(this, "Playlist is empty", Toast.LENGTH_SHORT).show()
            } else{
                var total=0.0
                for(song in MainActivity.songs) {
                    total+=song.rating
                }
                val avg = total/ MainActivity.songs.size

                AlertDialog.Builder(this)
                    .setTitle("Average Rating")
                    .setMessage("This average rating is:%.2f.format(average))


        }
    }
    }
}

