package com.ren.testapp.common.navigator

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.ren.testapp.R
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command

class Navigator(
    appCompatActivity: AppCompatActivity,
    @IdRes containerId: Int = 0
) : SupportAppNavigator(appCompatActivity, containerId) {

    override fun setupFragmentTransaction(
        command: Command?,
        currentFragment: Fragment?,
        nextFragment: Fragment?,
        fragmentTransaction: FragmentTransaction?
    ) {
        fragmentTransaction?.setCustomAnimations(
            R.anim.screen_fade_in,
            R.anim.screen_fade_out,
            R.anim.screen_fade_in,
            R.anim.screen_fade_out
        )
    }
}