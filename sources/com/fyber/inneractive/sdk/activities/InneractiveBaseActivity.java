package com.fyber.inneractive.sdk.activities;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class InneractiveBaseActivity extends Activity {
    public b a;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.p, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new b(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.a != null) {
                    getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.a);
                    this.a = null;
                }
            } catch (Exception e) {
                IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            if (frameLayout != null) {
                com.fyber.inneractive.sdk.util.o.a(frameLayout);
            }
        } catch (Exception e) {
            IAlog.f("handleEdgeToEdge failed: %s", e.getMessage());
        }
    }
}
