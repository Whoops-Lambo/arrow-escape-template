package com.moloco.sdk.internal.unity_bridge;

import com.ironsource.Yf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;", "", "", "adUnitId", "Laz2;", "onAdLoadSuccess", "(Ljava/lang/String;)V", "error", Yf.b, "(Ljava/lang/String;Ljava/lang/String;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MolocoUnityLoadCallback {
    void onAdLoadFailed(@NotNull String adUnitId, @NotNull String error);

    void onAdLoadSuccess(@NotNull String adUnitId);
}
