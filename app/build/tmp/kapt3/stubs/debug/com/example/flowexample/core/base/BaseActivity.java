package com.example.flowexample.core.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\'J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J&\u0010\u0018\u001a\u00020\u00142\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/flowexample/core/base/BaseActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "isPaused", "", "()Z", "setPaused", "(Z)V", "savedIntent", "Landroid/content/Intent;", "savedOptions", "Landroid/os/Bundle;", "savedRequestCode", "", "wasInBackground", "isAppInBackground", "context", "Landroid/content/Context;", "layoutRes", "onCreate", "", "savedInstanceState", "onPause", "onResume", "startActivityForResult", "intent", "requestCode", "options", "app_debug"})
public abstract class BaseActivity extends dagger.android.support.DaggerAppCompatActivity {
    private android.content.Intent savedIntent;
    private int savedRequestCode = -1;
    private android.os.Bundle savedOptions;
    private boolean wasInBackground = false;
    private boolean isPaused = false;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int layoutRes();
    
    public final boolean isPaused() {
        return false;
    }
    
    public final void setPaused(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void startActivityForResult(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresPermission()
    android.content.Intent intent, int requestCode, @org.jetbrains.annotations.Nullable()
    android.os.Bundle options) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * requires android.permission.GET_TASKS for kitkat and below
     *
     * @param context
     * @return is app in background
     */
    public boolean isAppInBackground(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}