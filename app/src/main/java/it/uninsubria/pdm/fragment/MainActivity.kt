package it.uninsubria.pdm.fragment

import android.app.Fragment
import android.app.FragmentManager
import android.app.FragmentTransaction
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tag = main_activity_layout.tag

        if(tag.equals("large_screen")){
            button3.isEnabled = false
            button4.isEnabled = false
        }else {
            val fr: Fragment = FragmentOne()
            val fm: FragmentManager = getFragmentManager()
            val fragmentTransaction: FragmentTransaction = fm.beginTransaction()
            fragmentTransaction.add(R.id.fragment_container, fr)
            fragmentTransaction.commit()
        }
    }

    fun selectFragment(view: View){
        if (view == button2) {
// replace FragmentOne with FragmentTwo
            val fm: FragmentManager = getFragmentManager()
            val fragmentTransaction = fm.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, FragmentTwo())
            fragmentTransaction.commit()
        } else {
// replace FragmentTwo with FragmentOne
            val fm: FragmentManager = getFragmentManager()
            val fragmentTransaction = fm.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, FragmentOne())
            fragmentTransaction.commit()
        }
    }
}
