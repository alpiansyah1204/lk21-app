package com.example.submission2.favorite.adapter

import android.content.Context
import androidx.annotation.Nullable
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.submission2.R
import com.example.submission2.favorite.movies.MoviesFavoriteFragment

class SectionPagerFavoriteAdapter(private val mContext: Context, fm : FragmentManager
) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    @StringRes
    private val tabTitles = intArrayOf(R.string.tab3)
    private val fragmentList: ArrayList<Fragment> = ArrayList()

    override fun getItem(position: Int): Fragment {
        if(position ==0){
            fragmentList.add(position, MoviesFavoriteFragment())
        }
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return tabTitles.size
    }

    @Nullable
    override fun getPageTitle(position: Int): CharSequence {
        return mContext.resources.getString(tabTitles[position])
    }
}