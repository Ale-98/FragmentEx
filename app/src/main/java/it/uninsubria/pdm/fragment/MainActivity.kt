package it.uninsubria.pdm.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tag = main_activity_layout.tag

        when(tag) {
            "large_screen" -> {
                button3.isEnabled = false
                button4.isEnabled = false
            }
            "normal_screen" -> {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, FragmentOne.getInstance()).commit()
            }
            else -> Log.v("ActivityMain", "Not supported screen size")
        }
    }

    fun selectFragment(view: View) {
        when (view) {
// replace FragmentOne with FragmentTwo
            button2 -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentTwo.getInstance()).commit()
            }

            button -> {
// replace FragmentTwo with FragmentOne
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentOne.getInstance()).commit()
            }
        }
    }
}
