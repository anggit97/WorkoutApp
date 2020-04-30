package com.anggit97.workoutapp.ui.boarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * Created by Anggit Prayogo on 4/30/20.
 */
class SectionPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return BoardingFragment.newInstance(position + 1)
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "SEC1"
            1 -> return "SEC2"
            2 -> return "SEC3"
        }
        return null
    }
}