package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.p0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import defpackage.cm2;
import defpackage.cz;
import defpackage.dy;
import defpackage.ep0;
import defpackage.if2;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.qq0;
import defpackage.sr0;
import defpackage.tb5;
import defpackage.vi2;
import defpackage.x23;
import defpackage.xi2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f extends FrameLayout implements o, i, g, p {
    public final cz a;
    public j b;
    public View c;
    public final cm2 d;
    public final xi2 e;
    public final cm2 f;

    @VisibleForTesting
    public static /* synthetic */ void getAdView$annotations() {
    }

    public abstract void b();

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public abstract i getAdLoader();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    @Nullable
    public abstract /* synthetic */ n getCreativeType();

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void a(long j, h hVar) {
        tb5.t(this.a, null, null, new x23(this, j, hVar, (dy) null, 5), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public void destroy() {
        kc2.g(this.a, null);
        setAdView(null);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Nullable
    public j getAdShowListener() {
        return this.b;
    }

    @Nullable
    public final View getAdView() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final vi2 isLoaded() {
        return (vi2) this.d.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public vi2 l() {
        return (vi2) this.f.getValue();
    }

    public void setAdShowListener(@Nullable j jVar) {
        this.b = jVar;
    }

    public final void setAdView(@Nullable View view) {
        View view2 = this.c;
        this.c = view;
        removeAllViews();
        try {
            ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
            if (composeView != null) {
                composeView.c();
            }
        } catch (ClassNotFoundException e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "XenossBannerView", "Compose not available, skipping ComposeView disposeComposition", e, false, 8, null);
        } catch (NoClassDefFoundError e2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "XenossBannerView", "Compose not available, skipping ComposeView disposeComposition", e2, false, 8, null);
        }
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, cz czVar) {
        super(context);
        context.getClass();
        czVar.getClass();
        this.a = czVar;
        final int i = 0;
        this.d = new cm2(new sr0(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        return fVar.getAdLoader().isLoaded();
                    default:
                        return ep0.G(new qq0(fVar.isLoaded(), fVar.e, new p0(3, null, 1)), fVar.a, if2.a, Boolean.FALSE);
                }
            }
        });
        this.e = qb5.a(Boolean.FALSE);
        final int i2 = 1;
        this.f = new cm2(new sr0(this) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i3 = i2;
                f fVar = this.b;
                switch (i3) {
                    case 0:
                        return fVar.getAdLoader().isLoaded();
                    default:
                        return ep0.G(new qq0(fVar.isLoaded(), fVar.e, new p0(3, null, 1)), fVar.a, if2.a, Boolean.FALSE);
                }
            }
        });
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        view.getClass();
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        xi2 xi2Var = this.e;
        xi2Var.getClass();
        xi2Var.k(null, boolValueOf);
    }
}
