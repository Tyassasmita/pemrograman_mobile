package id.sasmita.recycleview

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ToastActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.list)

        var btn_click_me = findViewById(R.id.ibList) as Button

        btn_click_me.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
        }
    }
}

