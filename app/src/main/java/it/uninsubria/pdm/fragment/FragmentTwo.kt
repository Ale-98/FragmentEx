package it.uninsubria.pdm.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment() {

    companion object {
        val fragmentTwo:FragmentTwo? = null
        fun getInstance():FragmentTwo{
            if(fragmentTwo == null) return FragmentTwo()
            return fragmentTwo
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }
}