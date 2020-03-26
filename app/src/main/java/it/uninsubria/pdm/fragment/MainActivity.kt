package it.uninsubria.pdm.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        if (tag.equals("large_screen")) {
            button3.isEnabled = false
            button4.isEnabled = false
        } else {
            val fr: Fragment = FragmentOne.getInstance()
            val fm: FragmentManager = supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fm.beginTransaction()
            fragmentTransaction.add(R.id.fragment_container, fr)
            fragmentTransaction.commit()
        }
    }

    fun selectFragment(view: View) {
        when (view) {
// replace FragmentOne with FragmentTwo
            button2 -> {
                val fm: FragmentManager = supportFragmentManager
                val fragmentTransaction = fm.beginTransaction()
                fragmentTransaction.replace(R.id.fragment_container, FragmentTwo.getInstance())
                fragmentTransaction.commit()
            }

            button -> {
// replace FragmentTwo with FragmentOne
                val fm: FragmentManager = supportFragmentManager
                val fragmentTransaction = fm.beginTransaction()
                fragmentTransaction.replace(R.id.fragment_container, FragmentOne.getInstance())
                fragmentTransaction.commit()
            }
        }
    }
}
