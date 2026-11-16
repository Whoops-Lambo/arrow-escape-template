package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.ironsource.C4664b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class WindVaneWebViewForNV extends WindVaneWebView {
    private com.mbridge.msdk.nativex.listener.b r;
    private boolean s;

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        com.mbridge.msdk.nativex.listener.b bVar;
        if (i != 4 || (bVar = this.r) == null) {
            return super.onKeyDown(i, keyEvent);
        }
        bVar.a();
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.s) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void orientation(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(C4664b4.i.n, C4664b4.i.C);
            } else {
                jSONObject.put(C4664b4.i.n, C4664b4.i.D);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this, C4664b4.i.n, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setBackListener(com.mbridge.msdk.nativex.listener.b bVar) {
        this.r = bVar;
    }

    public void setInterceptTouch(boolean z) {
        this.s = z;
    }

    public WindVaneWebViewForNV(Context context) {
        super(context);
        this.s = false;
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        int i;
        try {
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this, "webviewshow", "");
            n nVar = new n();
            nVar.n(campaignEx.getRequestId());
            nVar.o(campaignEx.getRequestIdNotice());
            if (getContext() != null && getContext().getApplicationContext() != null) {
                nVar.b(campaignEx.getId());
                if (campaignEx.isMraid()) {
                    i = n.N;
                } else {
                    i = n.O;
                }
                nVar.b(i);
                g.d(nVar, getContext().getApplicationContext(), str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = false;
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = false;
    }
}
