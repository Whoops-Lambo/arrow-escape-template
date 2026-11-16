package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"createAdInfo", "Lcom/moloco/sdk/publisher/MolocoAd;", "adUnitId", "", "revenue", "", "creativeId", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/moloco/sdk/publisher/MolocoAd;", "moloco-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MolocoAdKt {
    public static /* synthetic */ MolocoAd createAdInfo$default(String str, Float f, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return createAdInfo(str, f, str2);
    }

    @NotNull
    public static final MolocoAd createAdInfo(@NotNull String str, @Nullable Float f, @Nullable String str2) {
        str.getClass();
        return new MolocoAd("Moloco", str, f, str2);
    }
}
