package com.unity3d.services.core.domain;

import com.ironsource.C4664b4;
import com.unity3d.ads.BuildConfig;
import defpackage.ba0;
import defpackage.uy;
import defpackage.wg1;
import defpackage.xc0;
import defpackage.y80;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/domain/SDKDispatchers;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "<init>", "()V", "Luy;", "io", "Luy;", "getIo", "()Luy;", BuildConfig.FLAVOR, "getDefault", C4664b4.i.Z, "getMain", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SDKDispatchers implements ISDKDispatchers {

    @NotNull
    private final uy default;

    @NotNull
    private final uy io;

    @NotNull
    private final uy main;

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public uy getDefault() {
        return this.default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public uy getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public uy getMain() {
        return this.main;
    }

    public SDKDispatchers() {
        ba0 ba0Var = xc0.a;
        this.io = y80.c;
        this.default = xc0.a;
        this.main = wg1.a;
    }
}
