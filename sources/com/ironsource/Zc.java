package com.ironsource;

import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Zc {
    private final boolean a;
    private final int b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zc)) {
            return false;
        }
        Zc zc = (Zc) obj;
        return this.a == zc.a && this.b == zc.b;
    }

    public /* synthetic */ Zc(boolean z, int i, int i2, e80 e80Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? com.google.android.exoplayer2.C.ENCODING_PCM_32BIT : i);
    }

    public static /* synthetic */ Zc a(Zc zc, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = zc.a;
        }
        if ((i2 & 2) != 0) {
            i = zc.b;
        }
        return zc.a(z, i);
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @NotNull
    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.a + ", flags=" + this.b + ")";
    }

    public Zc(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @NotNull
    public final Zc a(boolean z, int i) {
        return new Zc(z, i);
    }

    public Zc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.a;
    }
}
