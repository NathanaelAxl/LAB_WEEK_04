package com.example.lab_week_04

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

// List judul tab (title string resource)
val TABS_TITLES = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

// List deskripsi tab (desc string resource)
val TABS_DESC = listOf(
    R.string.starbucks_desc,
    R.string.janjijiwa_desc,
    R.string.kopikenangan_desc,
)

class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val context: Context
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = TABS_TITLES.size

    override fun createFragment(position: Int): Fragment {
        val desc = context.getString(TABS_DESC[position])
        return CafeDetailFragment.newInstance(desc)
    }
}
