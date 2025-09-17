package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coffeeList = listOf<View>(
            view.findViewById(R.id.affogato),
            view.findViewById(R.id.americano),
            view.findViewById(R.id.latte)
        )

        coffeeList.forEach { coffee ->
            coffee.setOnClickListener {
                val detailFragment = DetailFragment.newInstance(coffee.id)
                parentFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, detailFragment) // ✅ ganti id
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    companion object {
        const val COFFEE_ID = "COFFEE_ID"
    }
}
