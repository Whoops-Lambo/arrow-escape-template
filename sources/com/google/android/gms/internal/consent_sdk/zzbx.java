package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import defpackage.pv1;
import defpackage.w14;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@UiThread
public final class zzbx extends WebView {
    public static final /* synthetic */ int d = 0;
    public final Handler a;
    public final w14 b;
    public boolean c;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void a(String str, String str2) {
        final String strW = pv1.w(str, "(", str2, ");");
        this.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbt
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue;
                zzbx zzbxVar = this.a;
                String str3 = strW;
                synchronized (zzda.class) {
                    if (zzda.a == null) {
                        try {
                            zzbxVar.evaluateJavascript("(function(){})()", null);
                            zzda.a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            zzda.a = Boolean.FALSE;
                        }
                        zBooleanValue = zzda.a.booleanValue();
                    } else {
                        zBooleanValue = zzda.a.booleanValue();
                    }
                    throw th;
                }
                if (zBooleanValue) {
                    zzbxVar.evaluateJavascript(str3, null);
                } else {
                    AdMobNetworkBridge.webviewLoadUrl(zzbxVar, "javascript:".concat(str3));
                }
            }
        });
    }

    public zzbx(zzbz zzbzVar, Handler handler, w14 w14Var) {
        super(zzbzVar);
        this.c = false;
        this.a = handler;
        this.b = w14Var;
    }
}
