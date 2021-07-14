package org.geeksforgeeks.textviewstyleprogrammatically

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.textView1)

        var toggle = true
        tv1.setOnClickListener {
            if(toggle){
                tv1.setTextAppearance(R.style.whiteText)
                tv1.setBackgroundResource(R.color.gfg_green)
            } else {
                tv1.setTextAppearance(R.style.gfgGreenText)
                tv1.setBackgroundResource(R.color.white)
            }
            toggle = !toggle
        }
    }
}