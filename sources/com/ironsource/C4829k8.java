package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.m93;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4829k8 extends FrameLayout implements L8 {
    private static final String b = "IronSourceAdContainer";
    private C4919p8 a;

    /* JADX INFO: renamed from: com.ironsource.k8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4829k8 c4829k8 = C4829k8.this;
            c4829k8.removeView(c4829k8.a.getPresentingView());
            C4829k8.this.a.a(this.a, this.b);
            C4829k8.this.a = null;
        }
    }

    @Override // com.ironsource.L8
    public synchronized void a(String str, String str2) {
        C4919p8 c4919p8 = this.a;
        if (c4919p8 != null && c4919p8.b() != null && this.a.getPresentingView() != null) {
            this.a.b().e();
            V7.a.d(new a(str, str2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void b() throws Exception {
        JSONObject jSONObjectJsonObjectInit;
        try {
            jSONObjectJsonObjectInit = this.a.b().a().getJSONObject(C4811j8.p).getJSONObject(C4811j8.s);
        } catch (Exception e) {
            C4950r4.d().a(e);
            jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        }
        jSONObjectJsonObjectInit.put("adViewId", this.a.a());
        this.a.b().a(C4664b4.h.S, jSONObjectJsonObjectInit);
    }

    @Override // com.ironsource.L8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.L8
    public WebView getPresentingView() {
        return this.a.getPresentingView();
    }

    public C4794i8 getSize() {
        C4919p8 c4919p8 = this.a;
        return c4919p8 != null ? c4919p8.c() : new C4794i8();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Logger.i(b, "onVisibilityChanged: " + i);
        C4919p8 c4919p8 = this.a;
        if (c4919p8 == null) {
            return;
        }
        try {
            c4919p8.b().a(C4811j8.k, i, isShown());
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.i(b, "onWindowVisibilityChanged: " + i);
        C4919p8 c4919p8 = this.a;
        if (c4919p8 == null) {
            return;
        }
        try {
            c4919p8.b().a(C4811j8.l, i, isShown());
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C4829k8(C4919p8 c4919p8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c4919p8.c().c(), c4919p8.c().a()));
        this.a = c4919p8;
        addView(c4919p8.getPresentingView());
    }

    public C4829k8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C4829k8(Context context) {
        super(context);
    }

    public void a() throws Exception {
        C4919p8 c4919p8 = this.a;
        if (c4919p8 != null && c4919p8.b() != null) {
            b();
        } else {
            m93.j("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
    }

    @Override // com.ironsource.L8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.L8
    public void a(String str, String str2, String str3) {
        C4919p8 c4919p8 = this.a;
        if (c4919p8 == null) {
            return;
        }
        c4919p8.a(str, str2, str3);
    }

    @Override // com.ironsource.L8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }
}
