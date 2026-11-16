package com.mbridge.msdk.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class MBCommonActivity extends DomainMBCommonActivity {
    public static final /* synthetic */ int e = 0;
    private boolean d = false;

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.o, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void finish() {
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView browserViewRemove = b.a.remove(this.a);
        if (browserViewRemove != null) {
            browserViewRemove.setListener(null);
            browserViewRemove.destroy();
        }
        this.d = true;
        super.finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.d) {
            BrowserView browserView = this.browserView;
            if (browserView != null) {
                browserView.setListener(null);
                this.browserView.destroy();
            }
            BrowserView browserViewRemove = b.a.remove(this.a);
            if (browserViewRemove != null) {
                browserViewRemove.setListener(null);
                browserViewRemove.destroy();
            }
        }
    }
}
