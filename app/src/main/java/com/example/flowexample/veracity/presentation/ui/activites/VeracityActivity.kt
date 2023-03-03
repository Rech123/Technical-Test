package com.example.flowexample.veracity.presentation.ui.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import com.example.flowexample.core.base.BaseActivity
import androidx.fragment.app.FragmentTransaction
import com.example.flowexample.R
import com.example.flowexample.veracity.presentation.ui.fragments.VeracityFragment


class VeracityActivity : BaseActivity(){
    override fun layoutRes(): Int = R.layout.new_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDashboardFragment()
    }

    fun getDashboardFragment() {
        // Begin the transaction
        // Begin the transaction
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
// Replace the contents of the container with the new fragment
// Replace the contents of the container with the new fragment
        ft.replace(R.id.myCont, VeracityFragment())
// or ft.add(R.id.your_placeholder, new FooFragment());
// Complete the changes added above
// or ft.add(R.id.your_placeholder, new FooFragment());
// Complete the changes added above
        ft.commit()
    }
}