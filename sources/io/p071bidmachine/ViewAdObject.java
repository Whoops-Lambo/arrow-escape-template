package io.p071bidmachine;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.p071bidmachine.AdRequest;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.models.b;
import io.p071bidmachine.unified.c;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.unified.f;
import io.p071bidmachine.unified.k;
import io.p071bidmachine.utils.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewAdObject<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdType extends k, UnifiedAdRequestParamsType extends d> extends AdObjectImpl<AdRequestType, b, UnifiedAdType, f, UnifiedAdRequestParamsType> {

    @Nullable
    @VisibleForTesting
    View adView;
    private int height;

    @NonNull
    private MeasureMode heightMeasureMode;
    private int width;

    @NonNull
    private MeasureMode widthMeasureMode;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum MeasureMode {
        Match,
        Wrap,
        Direct;

        public int getSize(@NonNull Context context, int i) {
            int i2 = a1.a[ordinal()];
            if (i2 != 1) {
                return i2 != 2 ? -1 : -2;
            }
            float f = i;
            Handler handler = j.a;
            return Math.round(f * context.getResources().getDisplayMetrics().density);
        }
    }

    private int getScaledHeight(@NonNull Context context) {
        return this.heightMeasureMode.getSize(context, getHeight());
    }

    private int getScaledWidth(@NonNull Context context) {
        return this.widthMeasureMode.getSize(context, getWidth());
    }

    @Override // io.p071bidmachine.AdObjectImpl, io.p071bidmachine.models.a
    @NonNull
    public f createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback) {
        return new b1(this, adProcessCallback);
    }

    public int getHeight() {
        return this.height;
    }

    @NonNull
    public MeasureMode getHeightMeasureMode() {
        return this.heightMeasureMode;
    }

    public int getWidth() {
        return this.width;
    }

    @NonNull
    public MeasureMode getWidthMeasureMode() {
        return this.widthMeasureMode;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setHeightMeasureMode(@NonNull MeasureMode measureMode) {
        this.heightMeasureMode = measureMode;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setWidthMeasureMode(@NonNull MeasureMode measureMode) {
        this.widthMeasureMode = measureMode;
    }

    public void show(@Nullable ViewGroup viewGroup, @Nullable RendererConfiguration rendererConfiguration) {
        if (viewGroup == null) {
            c cVar = (f) getUnifiedAdCallback();
            a aVarD = a.d("Target container");
            m mVar = (m) cVar;
            mVar.getClass();
            ((AdProcessCallback) mVar.a).processShowFail(aVarD);
            return;
        }
        View view = this.adView;
        if (view == null) {
            c cVar2 = (f) getUnifiedAdCallback();
            a aVarC = a.c("Ad view is null");
            m mVar2 = (m) cVar2;
            mVar2.getClass();
            ((AdProcessCallback) mVar2.a).processShowFail(aVarC);
            return;
        }
        MeasureMode widthMeasureMode = getWidthMeasureMode();
        MeasureMode measureMode = MeasureMode.Direct;
        if ((widthMeasureMode == measureMode && getWidth() == 0) || (getHeightMeasureMode() == measureMode && getHeight() == 0)) {
            c cVar3 = (f) getUnifiedAdCallback();
            a aVarB = a.b("Width or height are not provided");
            m mVar3 = (m) cVar3;
            mVar3.getClass();
            ((AdProcessCallback) mVar3.a).processShowFail(aVarB);
            return;
        }
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(getScaledWidth(context), getScaledHeight(context), 17) : new ViewGroup.LayoutParams(getScaledWidth(context), getScaledHeight(context));
        startViewabilityTracker(view);
        try {
            viewGroup.removeAllViews();
        } catch (Exception e) {
            io.p071bidmachine.core.a.i(e);
        }
        try {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            viewGroup.addView(view, layoutParams);
        } catch (Exception e2) {
            io.p071bidmachine.core.a.i(e2);
        }
        getAdProcessCallback().processFillAd();
        try {
            getUnifiedAd().f(rendererConfiguration);
        } catch (Throwable th) {
            io.p071bidmachine.core.a.i(th);
        }
    }

    public ViewAdObject(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull b bVar, @NonNull UnifiedAdType unifiedadtype) {
        super(contextProvider, adProcessCallback, adrequesttype, bVar, unifiedadtype);
        MeasureMode measureMode = MeasureMode.Direct;
        this.widthMeasureMode = measureMode;
        this.heightMeasureMode = measureMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdView(@Nullable View view) {
        hide();
        this.adView = view;
    }

    @Override // io.p071bidmachine.AdObjectImpl, io.p071bidmachine.models.a
    public void hide() {
        super.hide();
        stopViewabilityTracker();
        View view = this.adView;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    @Override // io.p071bidmachine.AdObjectImpl, io.p071bidmachine.models.a
    public void onDestroy() {
        hide();
        super.onDestroy();
    }
}
