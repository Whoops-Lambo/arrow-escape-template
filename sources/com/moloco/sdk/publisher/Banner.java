package com.moloco.sdk.publisher;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import defpackage.l22;
import defpackage.np1;
import defpackage.qb5;
import defpackage.vi2;
import defpackage.xi2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/moloco/sdk/publisher/Banner;", "Landroid/widget/FrameLayout;", "Lcom/moloco/sdk/publisher/AdLoad;", "Lcom/moloco/sdk/publisher/Destroyable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "changedView", "", "visibility", "Laz2;", "onVisibilityChanged", "(Landroid/view/View;I)V", "Lcom/moloco/sdk/publisher/BannerAdShowListener;", "adShowListener", "Lcom/moloco/sdk/publisher/BannerAdShowListener;", "getAdShowListener", "()Lcom/moloco/sdk/publisher/BannerAdShowListener;", "setAdShowListener", "(Lcom/moloco/sdk/publisher/BannerAdShowListener;)V", "Lnp1;", "", "_isViewShown", "Lnp1;", "Lvi2;", "isViewShown", "Lvi2;", "()Lvi2;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Banner extends FrameLayout implements AdLoad, Destroyable {
    public static final int $stable = 8;

    @NotNull
    private final np1 _isViewShown;

    @Nullable
    private BannerAdShowListener adShowListener;

    @NotNull
    private final vi2 isViewShown;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.D, this, me);
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

    @Nullable
    public BannerAdShowListener getAdShowListener() {
        return this.adShowListener;
    }

    @NotNull
    /* JADX INFO: renamed from: isViewShown, reason: from getter */
    public vi2 getIsViewShown() {
        return this.isViewShown;
    }

    public void setAdShowListener(@Nullable BannerAdShowListener bannerAdShowListener) {
        this.adShowListener = bannerAdShowListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(@NotNull Context context) {
        super(context);
        context.getClass();
        setTag("MolocoBannerView");
        xi2 xi2VarA = qb5.a(Boolean.FALSE);
        this._isViewShown = xi2VarA;
        this.isViewShown = new l22(xi2VarA);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        changedView.getClass();
        np1 np1Var = this._isViewShown;
        Boolean boolValueOf = Boolean.valueOf(changedView.isShown());
        xi2 xi2Var = (xi2) np1Var;
        xi2Var.getClass();
        xi2Var.k(null, boolValueOf);
    }
}
