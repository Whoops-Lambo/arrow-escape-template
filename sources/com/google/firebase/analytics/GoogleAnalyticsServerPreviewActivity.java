package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.zzez;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import defpackage.r84;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.google.firebase.analytics", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzez zzezVarC = zzez.c(this, null);
        Intent intent = getIntent();
        zzezVarC.getClass();
        zzezVarC.a(new r84(zzezVarC, intent, 2));
        finish();
    }
}
