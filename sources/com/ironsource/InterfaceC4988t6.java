package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.t6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4988t6 {
    @InterfaceC5065xb
    void a();

    @InterfaceC5065xb
    void a(@NotNull Activity activity, @Nullable String str);

    @InterfaceC5065xb
    void a(@NotNull LevelPlayAdError levelPlayAdError);

    @NotNull
    LevelPlayAdInfo b();

    @NotNull
    InterfaceC4821k0 c();

    @InterfaceC5065xb
    void loadAd();

    @InterfaceC5065xb
    void onAdClicked();

    @InterfaceC5065xb
    void onAdClosed();

    @InterfaceC5065xb
    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    @InterfaceC5065xb
    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    @InterfaceC5065xb
    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    @InterfaceC5065xb
    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
