package id.sasmita.tugas8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        private val listSong = listOf(
            Songs(R.drawable.music, "Feenin", "Anderson ft. Kevin Gates"),
            Songs(R.drawable.music, "+DONE161201+", "CL"),
            Songs(R.drawable.music, "Get You (feat. Kali Uchis)", "Daniel Caesar"),
            Songs(R.drawable.music, "Japanese Denim", "Daniel Caesar"),
            Songs(R.drawable.music, "Boo'd Up", "Ella Mai"),
            Songs(R.drawable.music, "Chocolate Legs", "Eric Benet"),
            Songs(R.drawable.music, "Blue Lights", "Jorja Smith"),
            Songs(R.drawable.music, "Honey", "Kehlani"),
            Songs(R.drawable.music, "Take Me", "MISO"),
            Songs(R.drawable.music, "Sunflower", "Post Malone"),
            Songs(R.drawable.music, "Summertime", "Riri"),
            Songs(R.drawable.music, "Sixteen Shots", "Stefflon Don"),
            Songs(R.drawable.music, "Somebody Else", "The 1975"),
            Songs(R.drawable.music, "Faded", "Tink")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mytask8.setHasFixedSize(true)
        mytask8.adapter = Track(listSong)
        mytask8.layoutManager = LinearLayoutManager(this)
    }
}

