package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.e80;
import defpackage.sr0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
public final class o {
    public static final int d = 0;

    @Nullable
    public final sr0 a;

    @Nullable
    public final sr0 b;

    @Nullable
    public final sr0 c;

    public /* synthetic */ o(sr0 sr0Var, sr0 sr0Var2, sr0 sr0Var3, int i, e80 e80Var) {
        this((i & 1) != 0 ? null : sr0Var, (i & 2) != 0 ? null : sr0Var2, (i & 4) != 0 ? null : sr0Var3);
    }

    @Nullable
    public final sr0 a() {
        return this.b;
    }

    @Nullable
    public final sr0 b() {
        return this.c;
    }

    @Nullable
    public final sr0 c() {
        return this.a;
    }

    public o(@Nullable sr0 sr0Var, @Nullable sr0 sr0Var2, @Nullable sr0 sr0Var3) {
        this.a = sr0Var;
        this.b = sr0Var2;
        this.c = sr0Var3;
    }

    public o() {
        this(null, null, null, 7, null);
    }
}
