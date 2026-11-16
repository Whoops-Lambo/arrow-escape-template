package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.W2;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.s71;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class BannerAdView extends FrameLayout implements X2 {
    private W2 a;

    @Nullable
    private BannerAdViewListener b;

    @NotNull
    public final BannerAdInfo getAdInfo() {
        W2 w2 = this.a;
        if (w2 != null) {
            return w2.c();
        }
        s71.D("bannerAdViewInternal");
        throw null;
    }

    @Nullable
    public final BannerAdViewListener getListener() {
        return this.b;
    }

    @Override // com.ironsource.X2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.X2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(@Nullable BannerAdViewListener bannerAdViewListener) {
        this.b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(@NotNull W2 w2) {
        w2.getClass();
        Context context = w2.d().getContext();
        context.getClass();
        this(context);
        this.a = w2;
        w2.a(new WeakReference<>(this));
        w2.b(new WeakReference<>(this));
    }

    private BannerAdView(Context context) {
        super(context);
    }
}
