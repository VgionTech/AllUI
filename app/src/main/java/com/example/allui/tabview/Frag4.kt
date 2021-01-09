package com.example.allui.tabview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.allui.R


class Frag4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag4, container, false)
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(): Fragment {
            return Frag4()
        }
    }

}