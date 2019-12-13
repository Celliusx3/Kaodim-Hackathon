package com.cellstudio.kaodimhackathon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_maps.*
import kotlinx.android.synthetic.main.bottom_sheet.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_details)

        ivTest5.setOnClickListener {
            ivTest5.setImageResource(R.drawable.graph_slots_available)
            ivTest5.restart(996.0f,438.0f)
        }

        ivGGTest.setOnClickListener {
            Toast.makeText(
                this@DetailsActivity,
                "Successful request vendors",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
