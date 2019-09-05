package dev.weslley.plutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager

class MainActivity(var tab_layout: TableLayout?, var viewpager: ViewPager) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.viewpager = findViewById(R.id.viewpager)
        this.tab_layout = findViewById(R.id.tab_layout)
    }
}
