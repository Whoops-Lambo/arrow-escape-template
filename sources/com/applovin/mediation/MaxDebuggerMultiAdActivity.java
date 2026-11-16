package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.mediation.debugger.ui.testmode.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class MaxDebuggerMultiAdActivity extends a {
    @Override // com.applovin.impl.mediation.debugger.ui.testmode.a, com.applovin.impl.r3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.a, me);
        return super.dispatchTouchEvent(me);
    }
}
