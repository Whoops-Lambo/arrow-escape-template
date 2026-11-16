package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.StringExtensionsKt;
import defpackage.dk2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAssetFileName;", "", "<init>", "()V", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetAssetFileName {
    @NotNull
    public final String invoke(@NotNull String url) {
        url.getClass();
        String strT0 = dk2.t0(url, '?');
        String strR0 = dk2.r0('.', dk2.r0('/', strT0, strT0), "");
        if (!dk2.Z(strR0)) {
            return StringExtensionsKt.getSHA256Hash(url) + '.' + strR0;
        }
        return StringExtensionsKt.getSHA256Hash(url);
    }
}
