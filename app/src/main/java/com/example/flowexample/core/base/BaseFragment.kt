package com.example.flowexample.core.base

import android.app.Activity
import dagger.android.support.DaggerFragment

open class BaseFragment : DaggerFragment() {

    var mActivity: Activity?  = null

}