package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CafeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cafe_detail, container, false)
        val textView = view.findViewById<TextView>(R.id.cafe_detail_text)

        val position = arguments?.getInt(ARG_POSITION) ?: 0
        textView.text = getString(TABS_FIXED[position])

        return view
    }

    companion object {
        private const val ARG_POSITION = "position"

        fun newInstance(position: Int) = CafeDetailFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_POSITION, position)
            }
        }
    }
}
