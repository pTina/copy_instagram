package com.example.copy_instagram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private val adapter by lazy {VpSecondActivityAdapter(supportFragmentManager)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        vpActivityMain.adapter = SecondActivity@adapter


        vpActivityMain.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{

            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                ciMainActivity.selectDot(position)
            }
        })

        ciMainActivity.createDotPanel(2,R.drawable.indicator_dot_off,R.drawable.indicator_dot_on,0)


    }
}