package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CafeDetailFragment : Fragment() {

    companion object {
        private const val ARG_DESC = "arg_desc"

        fun newInstance(desc: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val bundle = Bundle()
            bundle.putString(ARG_DESC, desc)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cafe_detail, container, false)

        // ambil argumen
        val desc = arguments?.getString(ARG_DESC)

        // pasang ke TextView
        val textView = view.findViewById<TextView>(R.id.cafeDesc)
        textView.text = desc

        return view
    }
}
