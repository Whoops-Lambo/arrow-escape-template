package com.facebook.unity;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class FBUnityDeepLinkingActivity extends FBUnityAppLinkBaseActivity {
    @Override // com.facebook.unity.FBUnityAppLinkBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.facebook", me);
        return super.dispatchTouchEvent(me);
    }
}
