package com.cellstudio.kaodimhackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.bottom_sheet.*
import android.util.DisplayMetrics
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_maps.*


class MapsActivity : AppCompatActivity() {

    private var everythingChoose: Boolean = false

    private lateinit var mMap: GoogleMap
    private lateinit var sheetBehavior: BottomSheetBehavior<LinearLayout>

    fun dpToPx(dp: Int): Int {
        val displayMetrics = this.getResources().getDisplayMetrics()
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        sheetBehavior = BottomSheetBehavior.from(bottomSheet)

        bottomSheet.setOnClickListener {
            if (!everythingChoose) {
                bottomSheet.restart(1125.0f, 675.0f)
                sheetBehavior.peekHeight = dpToPx(300)

                bottomSheet.background =
                    ContextCompat.getDrawable(this@MapsActivity, R.drawable.are_looking_plumbing)

                fisherman1.visibility = View.VISIBLE
                fisherman2.visibility = View.VISIBLE
                fisherman3.visibility = View.VISIBLE

                fisherman1.setOnClickListener {
                    val intent = Intent(this@MapsActivity, DetailsActivity::class.java)
            this.startActivity(intent)
                }
                fisherman2.setOnClickListener {
                    val intent = Intent(this@MapsActivity, DetailsActivity::class.java)
                    this.startActivity(intent)
                }
                fisherman3.setOnClickListener {
                    val intent = Intent(this@MapsActivity, DetailsActivity::class.java)
                    this.startActivity(intent)
                }


                everythingChoose = true

            } else {
                Toast.makeText(
                    this@MapsActivity,
                    "Successful request all vendors",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
