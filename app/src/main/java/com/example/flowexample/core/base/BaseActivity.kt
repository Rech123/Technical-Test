package com.example.flowexample.core.base

import android.app.Activity
import android.app.ActivityManager
import android.app.ActivityManager.RunningAppProcessInfo
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.annotation.RequiresPermission
import dagger.android.support.DaggerAppCompatActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.lang.Exception

abstract class BaseActivity : DaggerAppCompatActivity() {
    @LayoutRes
    abstract fun layoutRes(): Int
    private var savedIntent: Intent? = null
    private var savedRequestCode = -1
    private var savedOptions: Bundle? = null

    private var wasInBackground = false

    var isPaused = false

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(layoutRes())
    }

    override fun startActivityForResult(
        @RequiresPermission intent: Intent?,
        requestCode: Int,
        options: Bundle?
    ) {
        if (!isAppInBackground(this)) {
            wasInBackground = false
            if (!isFinishing) super.startActivityForResult(intent, requestCode, options)
        } else {
            wasInBackground = true
            savedIntent = intent
            savedRequestCode = requestCode
            savedOptions = options
        }
    }

    override fun onPause() {
        super.onPause()
        isPaused = true
    }

    override fun onResume() {
        super.onResume()
        isPaused = false
        if (wasInBackground) {
            if (savedIntent != null) startActivityForResult(
                savedIntent,
                savedRequestCode,
                savedOptions
            )
            wasInBackground = false
        }
    }

    /**
     * requires android.permission.GET_TASKS for kitkat and below
     *
     * @param context
     * @return is app in background
     */
    open fun isAppInBackground(context: Context): Boolean {
        var isInBackground = true
        try {
            val am = context.getSystemService(ACTIVITY_SERVICE) as ActivityManager
            val runningProcesses = am.runningAppProcesses
            for (processInfo in runningProcesses) {
                if (processInfo.importance == RunningAppProcessInfo.IMPORTANCE_FOREGROUND) {
                    for (activeProcess in processInfo.pkgList) {
                        if (activeProcess == context.packageName) {
                            isInBackground = false
                        }
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return isInBackground
    }
}

