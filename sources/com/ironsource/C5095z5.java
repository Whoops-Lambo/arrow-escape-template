package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5095z5 {

    @NotNull
    public static final C5095z5 a = new C5095z5();

    private final IronSourceError a(EnumC4722e8 enumC4722e8, IronSourceError ironSourceError) {
        String strD;
        if (ironSourceError != null) {
            strD = enumC4722e8.d() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            strD = enumC4722e8.d();
        }
        return new IronSourceError(enumC4722e8.c(), strD);
    }

    public static /* synthetic */ IronSourceError b(C5095z5 c5095z5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c5095z5.b(str);
    }

    public static /* synthetic */ IronSourceError c(C5095z5 c5095z5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c5095z5.d(str);
    }

    @NotNull
    public final IronSourceError d() {
        return a(this, EnumC4722e8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    @NotNull
    public final IronSourceError e() {
        return a(this, EnumC4722e8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    @NotNull
    public final IronSourceError f() {
        return a(this, EnumC4722e8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    @NotNull
    public final IronSourceError g() {
        return a(this, EnumC4722e8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError h() {
        return a(this, EnumC4722e8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    @NotNull
    public final IronSourceError i() {
        return a(this, EnumC4722e8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    @NotNull
    public final IronSourceError j() {
        return a(this, EnumC4722e8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError k() {
        return a(this, EnumC4722e8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError l() {
        return a(this, EnumC4722e8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    @NotNull
    public final IronSourceError m() {
        return a(this, EnumC4722e8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError n() {
        return a(this, EnumC4722e8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    @NotNull
    public final IronSourceError o() {
        return a(this, EnumC4722e8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError p() {
        return a(this, EnumC4722e8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    @NotNull
    public final IronSourceError q() {
        return a(this, EnumC4722e8.ISErrorLoadNullADM, null, 2, null);
    }

    @NotNull
    public final IronSourceError r() {
        return a(this, EnumC4722e8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    @NotNull
    public final IronSourceError s() {
        return a(this, EnumC4722e8.ISErrorLoadTimedOut, null, 2, null);
    }

    @NotNull
    public final IronSourceError t() {
        return a(this, EnumC4722e8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private C5095z5() {
    }

    @NotNull
    public final IronSourceError d(@Nullable String str) {
        return a(EnumC4722e8.ISErrorRewardedLoadNoConfig, str);
    }

    @NotNull
    public final IronSourceError b(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        return a(EnumC4722e8.ISErrorLoadNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError c(@NotNull String str) {
        str.getClass();
        return a(EnumC4722e8.ISErrorLoadNetworkFailed, str);
    }

    @NotNull
    public final IronSourceError b() {
        return a(this, EnumC4722e8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    @NotNull
    public final IronSourceError c(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        return a(EnumC4722e8.ISErrorShowNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError b(@Nullable String str) {
        return a(EnumC4722e8.ISErrorInterstitialLoadNoConfig, str);
    }

    @NotNull
    public final IronSourceError c() {
        return a(this, EnumC4722e8.ISErrorInitInvalidResponse, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C5095z5 c5095z5, EnumC4722e8 enumC4722e8, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c5095z5.a(enumC4722e8, ironSourceError);
    }

    private final IronSourceError a(EnumC4722e8 enumC4722e8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC4722e8.d();
        }
        return new IronSourceError(enumC4722e8.c(), str);
    }

    @NotNull
    public final IronSourceError a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        return a(EnumC4722e8.ISErrorInitNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError a() {
        return a(this, EnumC4722e8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C5095z5 c5095z5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c5095z5.a(str);
    }

    @NotNull
    public final IronSourceError a(@Nullable String str) {
        return a(EnumC4722e8.ISErrorBannerLoadNoConfig, str);
    }
}
