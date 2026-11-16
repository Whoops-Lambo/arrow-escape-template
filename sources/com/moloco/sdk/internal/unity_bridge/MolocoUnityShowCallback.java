package com.moloco.sdk.internal.unity_bridge;

import com.ironsource.Yf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;", "", "", "adUnitId", "Laz2;", "onAdShowSuccess", "(Ljava/lang/String;)V", "error", Yf.e, "(Ljava/lang/String;Ljava/lang/String;)V", "onAdHidden", Yf.f, Yf.i, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MolocoUnityShowCallback {
    void onAdClicked(@NotNull String adUnitId);

    void onAdHidden(@NotNull String adUnitId);

    void onAdRewarded(@NotNull String adUnitId);

    void onAdShowFailed(@NotNull String adUnitId, @NotNull String error);

    void onAdShowSuccess(@NotNull String adUnitId);
}
