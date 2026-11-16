package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ironsource.F2;
import com.ironsource.Ia;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class o extends FrameLayout {
    private ISBannerSize a;
    private String b;
    private boolean c;
    private a d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void onWindowFocusChanged(boolean z);
    }

    public void a() {
        this.c = true;
        this.a = null;
        this.b = null;
        this.d = null;
        F2.a().a((Ia) null);
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

    public boolean b() {
        return this.c;
    }

    public o c() {
        o oVar = new o(getContext(), this.a);
        oVar.b = this.b;
        return oVar;
    }

    public ISBannerSize getSize() {
        return this.a;
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.a = iSBannerSize;
    }

    public o(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.c = false;
        this.a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z);
        }
    }

    public o(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.c = false;
        this.a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public o(Context context) {
        super(context);
        this.c = false;
    }
}
