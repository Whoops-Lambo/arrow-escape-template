package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.view.MotionEvent;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class MBSplashWebview extends WindVaneWebView {
    private String r;
    private AdSession s;

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.s;
            if (adSession != null) {
                adSession.finish();
                this.s = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e) {
            q0.a("OMSDK", e.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.s;
    }

    public String getRequestId() {
        return this.r;
    }

    public void setAdSession(AdSession adSession) {
        this.s = adSession;
    }

    public void setRequestId(String str) {
        this.r = str;
    }

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }
}
