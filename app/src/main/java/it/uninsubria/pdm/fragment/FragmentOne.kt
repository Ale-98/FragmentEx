package it.uninsubria.pdm.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {

    companion object {
        val fragmentOne:FragmentOne? = null
        fun getInstance():FragmentOne{
            if(fragmentOne == null) return FragmentOne()
            return fragmentOne
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }
}