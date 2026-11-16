package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {
    private static final String t = "MBNativeAdvancedWebview";
    private AdSession r;
    private NetWorkStateReceiver s;

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
            AdSession adSession = this.r;
            if (adSession != null) {
                adSession.finish();
                this.r = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e) {
            q0.a("OMSDK", e.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.r;
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.s == null) {
                this.s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.s, intentFilter);
        } catch (Throwable th) {
            q0.a(t, th.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.r = adSession;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.a();
                getContext().unregisterReceiver(this.s);
            }
        } catch (Throwable th) {
            q0.a(t, th.getMessage());
        }
    }

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }
}
