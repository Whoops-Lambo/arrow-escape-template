package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public interface AdFormatOrBuilder extends MessageOrBuilder {
    AdFormat.Banner getBanner();

    AdFormat.BannerOrBuilder getBannerOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo250getDefaultInstanceForType();

    AdFormat.Interstitial getInterstitial();

    AdFormat.InterstitialOrBuilder getInterstitialOrBuilder();

    AdFormat.Native getNative();

    AdFormat.NativeOrBuilder getNativeOrBuilder();

    AdFormat.Rewarded getRewarded();

    AdFormat.RewardedOrBuilder getRewardedOrBuilder();

    AdFormat.SpecCase getSpecCase();

    boolean hasBanner();

    boolean hasInterstitial();

    boolean hasNative();

    boolean hasRewarded();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
