package com.moloco.sdk.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.ecffri.arrows.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ba0;
import defpackage.bp0;
import defpackage.cw0;
import defpackage.dn;
import defpackage.dy;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.sr0;
import defpackage.tb5;
import defpackage.u12;
import defpackage.vi2;
import defpackage.wg1;
import defpackage.wr0;
import defpackage.xc0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends FrameLayout {
    public static final cw0 j;
    public final bp0 a;
    public final vi2 b;
    public final wr0 c;
    public final sr0 d;
    public final long e;
    public final DecelerateInterpolator f;
    public boolean g;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s h;
    public dn i;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
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

    static {
        ba0 ba0Var = xc0.a;
        j = wg1.a;
    }

    public static final void b(d0 d0Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s sVar = d0Var.h;
        boolean z = d0Var.g && ((sVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.o) || (sVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(d0Var, z, d0Var.e, d0Var.f, null, 8, null);
        if (z) {
            d0Var.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, int i, String str, int i2, int i3, String str2, bp0 bp0Var, vi2 vi2Var, wr0 wr0Var, sr0 sr0Var) {
        super(context);
        context.getClass();
        this.a = bp0Var;
        this.b = vi2Var;
        this.c = wr0Var;
        this.d = sr0Var;
        this.e = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.f = new DecelerateInterpolator();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
        layoutParams.setMargins(i, i, i, i);
        setLayoutParams(layoutParams);
        ViewCompat.G(this, new com.facebook.appevents.p(16));
        addView(new m0(context, str, str2, i2, i3, sr0Var));
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setVisibility(8);
    }

    public final void a() {
        if (getWidth() != 0 && getHeight() != 0) {
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a;
            this.c.invoke(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(cVar.a(iArr[0]), cVar.a(iArr[1])), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(cVar.a(getWidth()), cVar.a(getHeight()))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dn dnVarA = kc2.a(qb5.l(u12.a(), j));
        this.i = dnVarA;
        dy dyVar = null;
        tb5.t(dnVarA, null, null, new c0(this, dyVar, 0), 3);
        tb5.t(dnVarA, null, null, new c0(this, dyVar, 1), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dn dnVar = this.i;
        if (dnVar != null) {
            kc2.g(dnVar, null);
        }
        this.i = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && getVisibility() == 0) {
            a();
        }
    }
}
