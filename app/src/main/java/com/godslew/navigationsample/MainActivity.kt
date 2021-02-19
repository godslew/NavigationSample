package com.godslew.navigationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.godslew.navigationsample.ui.main.MainFragment
import com.godslew.navigationsample.ui.main.MainFragmentArgs
import com.godslew.navigationsample.ui.main.Title

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance(Title.Game()))
                    .commitNow()
        }
    }
}