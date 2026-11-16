package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ecffri.arrows.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.ba0;
import defpackage.bp0;
import defpackage.cp0;
import defpackage.cz;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.e80;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.s71;
import defpackage.sr0;
import defpackage.sy;
import defpackage.t50;
import defpackage.tb5;
import defpackage.u12;
import defpackage.ul2;
import defpackage.wg1;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.zr0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred
public final class k extends FrameLayout {

    @NotNull
    public static final a j = new a(null);
    public static final int k = 8;

    @NotNull
    public static final sy l;

    @NotNull
    public final bp0 a;
    public final int b;
    public final int c;

    @Nullable
    public sr0 d;

    @Nullable
    public sr0 e;

    @Nullable
    public cz f;

    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s g;
    public final long h;

    @NotNull
    public final DecelerateInterpolator i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @t50(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearVastIconView$onAttachedToWindow$1", f = "Linear.kt", l = {528}, m = "invokeSuspend")
    public static final class b extends ul2 implements zr0 {
        public int a;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class a<T> implements cp0 {
            public final /* synthetic */ k a;

            public a(k kVar) {
                this.a = kVar;
            }

            @Override // defpackage.cp0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar, dy dyVar) {
                boolean zB = s71.b(sVar, this.a.g);
                az2 az2Var = az2.a;
                if (zB) {
                    return az2Var;
                }
                this.a.g = sVar;
                k kVar = this.a;
                final int i = 0;
                if (sVar == null) {
                    View childAt = kVar.getChildCount() > 0 ? this.a.getChildAt(0) : null;
                    k kVar2 = this.a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(kVar2, false, kVar2.h, this.a.i, new com.moloco.sdk.internal.c(6, childAt, this.a));
                    return az2Var;
                }
                kVar.removeAllViews();
                k kVar3 = this.a;
                Context context = this.a.getContext();
                context.getClass();
                final k kVar4 = this.a;
                final int i2 = 1;
                kVar3.addView(new u(context, sVar, new sr0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0
                    @Override // defpackage.sr0
                    public final Object invoke() {
                        int i3 = i;
                        k kVar5 = kVar4;
                        switch (i3) {
                            case 0:
                                return k.b.a.a(kVar5);
                            default:
                                return k.b.a.b(kVar5);
                        }
                    }
                }, new sr0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0
                    @Override // defpackage.sr0
                    public final Object invoke() {
                        int i3 = i2;
                        k kVar5 = kVar4;
                        switch (i3) {
                            case 0:
                                return k.b.a.a(kVar5);
                            default:
                                return k.b.a.b(kVar5);
                        }
                    }
                }));
                k kVar5 = this.a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(kVar5, true, kVar5.h, this.a.i, null, 8, null);
                return az2Var;
            }

            public static final az2 b(k kVar) {
                sr0 onClick = kVar.getOnClick();
                if (onClick != null) {
                    onClick.invoke();
                }
                return az2.a;
            }

            public static final az2 a(View view, k kVar) {
                if (view != null && view.getParent() == kVar) {
                    kVar.removeView(view);
                }
                return az2.a;
            }

            public static final az2 a(k kVar) {
                sr0 onDisplayed = kVar.getOnDisplayed();
                if (onDisplayed != null) {
                    onDisplayed.invoke();
                }
                return az2.a;
            }
        }

        public b(dy dyVar) {
            super(2, dyVar);
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return k.this.new b(dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            if (i == 0) {
                wz2.a0(obj);
                bp0 bp0Var = k.this.a;
                a aVar = new a(k.this);
                this.a = 1;
                Object objCollect = bp0Var.collect(aVar, this);
                dz dzVar = dz.a;
                if (objCollect == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return az2.a;
        }

        @Override // defpackage.zr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cz czVar, dy dyVar) {
            return ((b) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

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

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @NotNull
        public final sy a() {
            return k.l;
        }

        public a() {
        }
    }

    static {
        ba0 ba0Var = xc0.a;
        l = wg1.a.f;
    }

    @Nullable
    public final sr0 getOnClick() {
        return this.e;
    }

    @Nullable
    public final sr0 getOnDisplayed() {
        return this.d;
    }

    public final void setOnClick(@Nullable sr0 sr0Var) {
        this.e = sr0Var;
    }

    public final void setOnDisplayed(@Nullable sr0 sr0Var) {
        this.d = sr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, @NotNull bp0 bp0Var, int i, int i2) {
        super(context);
        context.getClass();
        bp0Var.getClass();
        this.a = bp0Var;
        this.b = i;
        this.c = i2;
        this.h = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.i = new DecelerateInterpolator();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, i);
        layoutParams.setMargins(i2, i2, i2, i2);
        setLayoutParams(layoutParams);
        setVisibility(8);
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dn dnVarA = kc2.a(qb5.l(u12.a(), l));
        this.f = dnVarA;
        tb5.t(dnVarA, null, null, new b(null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cz czVar = this.f;
        if (czVar != null) {
            kc2.g(czVar, null);
        }
        this.f = null;
    }

    public /* synthetic */ k(Context context, bp0 bp0Var, int i, int i2, int i3, e80 e80Var) {
        this(context, bp0Var, (i3 & 4) != 0 ? 8388691 : i, (i3 & 8) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.moloco_default_ad_button_padding) : i2);
    }
}
