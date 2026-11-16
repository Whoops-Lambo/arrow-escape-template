package com.unity3d.services.core.domain;

import com.ironsource.C4664b4;
import com.unity3d.ads.BuildConfig;
import defpackage.uy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/domain/ISDKDispatchers;", "", "Luy;", "getIo", "()Luy;", "io", "getDefault", BuildConfig.FLAVOR, "getMain", C4664b4.i.Z, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ISDKDispatchers {
    @NotNull
    uy getDefault();

    @NotNull
    uy getIo();

    @NotNull
    uy getMain();
}
