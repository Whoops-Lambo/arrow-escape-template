package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import com.ironsource.C4744fc;
import com.ironsource.C4780hc;
import com.ironsource.C4870md;
import com.ironsource.C4950r4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.ae1;
import defpackage.e80;
import defpackage.r70;
import defpackage.tk0;
import defpackage.ue0;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    @Nullable
    private String a;

    @Nullable
    private C4870md b;

    @Nullable
    private LevelPlayNativeAdListener c;

    @Nullable
    private C4744fc d;

    @Nullable
    private AdapterNativeAdData e;

    @Nullable
    private AdapterNativeAdViewBinder f;

    @NotNull
    private final AtomicBoolean g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {

        @Nullable
        private String a;

        @Nullable
        private LevelPlayNativeAdListener b;

        @NotNull
        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        @Nullable
        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.b;
        }

        @Nullable
        public final String getMPlacementName$mediationsdk_release() {
            return this.a;
        }

        public final void setMListener$mediationsdk_release(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(@Nullable String str) {
            this.a = str;
        }

        @NotNull
        public final Builder withPlacementName(@Nullable String str) {
            this.a = str;
            return this;
        }

        @NotNull
        public final Builder withActivity(@Nullable Activity activity) {
            int iHashCode;
            ContextProvider.getInstance().updateActivity(activity);
            IronLog ironLog = IronLog.INTERNAL;
            if (activity != null) {
                iHashCode = activity.hashCode();
            } else {
                iHashCode = 0;
            }
            ironLog.verbose("activity is updated to: " + iHashCode);
            return this;
        }

        @NotNull
        public final Builder withListener(@NotNull LevelPlayNativeAdListener levelPlayNativeAdListener) {
            levelPlayNativeAdListener.getClass();
            this.b = levelPlayNativeAdListener;
            return this;
        }
    }

    private final void b() {
        if (this.g.compareAndSet(false, true)) {
            C4744fc c4744fcC = p.g().c();
            this.d = c4744fcC;
            if (c4744fcC != null) {
                c4744fcC.a(this);
                C4780hc c4780hcI = p.g().i(this.a);
                c4780hcI.getClass();
                this.b = new C4870md(c4780hcI);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            C4744fc c4744fc = this.d;
            if (c4744fc != null) {
                c4744fc.J();
            }
        } catch (Throwable th) {
            C4950r4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    @Nullable
    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f;
    }

    @Nullable
    public final UUID getObjectId() {
        C4744fc c4744fc = this.d;
        if (c4744fc != null) {
            return c4744fc.h();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String strB = p.g().b();
        strB.getClass();
        if (strB.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new ue0(this, 11));
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): ".concat(strB), IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(@Nullable AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new ae1(this, adInfo, 0), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(@Nullable AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new ae1(this, adInfo, 1), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new tk0(24, this, ironSourceError), 0L, 2, null);
    }

    public final void setListener(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.c = levelPlayNativeAdListener;
    }

    private LevelPlayNativeAd(Builder builder) {
        this.g = new AtomicBoolean(false);
        this.a = builder.getMPlacementName$mediationsdk_release();
        this.c = builder.getMListener$mediationsdk_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd) {
        levelPlayNativeAd.b();
        C4744fc c4744fc = levelPlayNativeAd.d;
        if (c4744fc != null) {
            c4744fc.a(levelPlayNativeAd.b);
        } else {
            levelPlayNativeAd.a();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(@Nullable AdInfo adInfo, @NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new r70(this, adapterNativeAdData, adapterNativeAdViewBinder, adInfo, 9), 0L, 2, null);
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder, AdInfo adInfo) {
        levelPlayNativeAd.e = adapterNativeAdData;
        levelPlayNativeAd.f = adapterNativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, IronSourceError ironSourceError) {
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(levelPlayNativeAd, ironSourceError);
        }
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, e80 e80Var) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(levelPlayNativeAd, adInfo);
        }
    }
}
