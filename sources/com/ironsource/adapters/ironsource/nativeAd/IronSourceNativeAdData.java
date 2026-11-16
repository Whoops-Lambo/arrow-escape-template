package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.H8;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class IronSourceNativeAdData extends AdapterNativeAdData {

    @Nullable
    private final String advertiser;

    @Nullable
    private final String body;

    @Nullable
    private final String callToAction;

    @Nullable
    private final NativeAdDataInterface.Image icon;

    @Nullable
    private final String title;

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        return this.title;
    }

    public IronSourceNativeAdData(@NotNull H8 h8) {
        h8.getClass();
        this.title = h8.n();
        this.advertiser = h8.h();
        this.body = h8.i();
        this.callToAction = h8.j();
        this.icon = new NativeAdDataInterface.Image(h8.k(), null);
    }
}
