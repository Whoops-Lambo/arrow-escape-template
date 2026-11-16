package com.ironsource;

import defpackage.e80;
import defpackage.n30;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.t3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4985t3 {
    private final int a;

    @NotNull
    private final String b;
    private final boolean c;

    @Nullable
    private final C4888nd d;

    public /* synthetic */ AbstractC4985t3(int i, String str, boolean z, C4888nd c4888nd, int i2, e80 e80Var) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c4888nd);
    }

    public final boolean a(int i) {
        return this.a == i;
    }

    public final int b() {
        return this.a;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return n30.y("placement name: ", this.b);
    }

    @Nullable
    public final C4888nd a() {
        return this.d;
    }

    public AbstractC4985t3(int i, @NotNull String str, boolean z, @Nullable C4888nd c4888nd) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = c4888nd;
    }
}
