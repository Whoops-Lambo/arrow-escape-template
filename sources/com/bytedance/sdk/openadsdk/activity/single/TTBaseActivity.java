package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.window.OnBackInvokedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.component.reward.kgy.fpp;
import com.bytedance.sdk.openadsdk.utils.fpz;
import com.bytedance.sdk.openadsdk.utils.wy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class TTBaseActivity extends Activity {
    private View kgy;
    protected String muf;
    private OnBackInvokedCallback rz;
    protected boolean uxe = false;
    private int ahm = 0;
    private Boolean uq = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> kgy;

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.kgy.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.h_();
            }
        }

        public kgy(TTBaseActivity tTBaseActivity) {
            this.kgy = new WeakReference<>(tTBaseActivity);
        }
    }

    public boolean a_() {
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (uq() && fpz.kgy()) {
            this.rz = new kgy(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.rz);
        }
    }

    public boolean uq() {
        return false;
    }

    private boolean ahm() {
        if (this.uq == null) {
            this.uq = Boolean.valueOf(com.bytedance.sdk.openadsdk.lqi.ct.kgy("auto_size_opt_enable", 0) == 1);
        }
        return this.uq.booleanValue();
    }

    private void kgy(Resources resources) {
        if (resources == null) {
            return;
        }
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
        if (kgy(displayMetrics2, displayMetrics)) {
            displayMetrics2.density = displayMetrics.density;
            displayMetrics2.scaledDensity = displayMetrics.scaledDensity;
            displayMetrics2.densityDpi = displayMetrics.densityDpi;
            Configuration configuration = resources.getConfiguration();
            configuration.densityDpi = displayMetrics.densityDpi;
            resources.updateConfiguration(configuration, displayMetrics2);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            super.onPause();
        } catch (IllegalArgumentException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oPlBC5SMSUQ8FUmAg=", "VOAdlBavbA==", 151);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oPlBC5SMSUQ8FUmAg=", "VOAdlBavbA==", 158);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT > 28) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oPlBC5SMSUQ8FUmAg=", "VOAfkBCpZMI=", 129);
            sx.kgy("TTBaseActivity", "super.onResume() run fail", e);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oPlBC5SMSUQ8FUmAg=", "VOAfkBCpZMI=", 136);
                sx.kgy("TTBaseActivity", "onResume set mCalled fail", e2);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oPlBC5SMSUQ8FUmAg=", "XecjnBC0", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        try {
            if (!ahm()) {
                return super.getResources();
            }
            Resources resources = super.getResources();
            if (resources != null) {
                kgy(resources);
            }
            return resources;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oPlBC5SMSUQ8FUmAg=", "XOs5pwavZtKSSdJO", 178);
            return super.getResources();
        }
    }

    public void h_() {
        onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kgy(true, configuration);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (fpz.kgy() && this.rz != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.rz);
            this.rz = null;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        if (a_()) {
            this.kgy = view;
            kgy(false, (Configuration) null);
        }
    }

    public void um() {
        try {
            if (wy.ahm() && Build.VERSION.SDK_INT >= 29) {
                getWindow().getDecorView().setForceDarkAllowed(false);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9oPlBC5SMSUQ8FUmAg=", "Xec1uCqJQJbSbtZPhzyvLF7i", 245);
        }
    }

    private void kgy(boolean z, @Nullable Configuration configuration) {
        if (a_()) {
            this.ahm = fpp.kgy(this, this.kgy, configuration, this.ahm, z);
        }
    }

    private boolean kgy(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
        if (displayMetrics == null || displayMetrics2 == null) {
            return false;
        }
        return (displayMetrics.density == displayMetrics2.density && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.densityDpi == displayMetrics2.densityDpi) ? false : true;
    }
}
