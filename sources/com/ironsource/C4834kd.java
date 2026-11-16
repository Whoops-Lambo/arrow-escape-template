package com.ironsource;

import defpackage.e80;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4834kd {
    private boolean a;

    @NotNull
    private String b;
    private boolean c;
    private int d;

    @Nullable
    private int[] e;

    @Nullable
    private int[] f;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4834kd)) {
            return false;
        }
        C4834kd c4834kd = (C4834kd) obj;
        return this.a == c4834kd.a && s71.b(this.b, c4834kd.b) && this.c == c4834kd.c && this.d == c4834kd.d && s71.b(this.e, c4834kd.e) && s71.b(this.f, c4834kd.f);
    }

    public /* synthetic */ C4834kd(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, e80 e80Var) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C4852ld.a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }

    public static /* synthetic */ C4834kd a(C4834kd c4834kd, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c4834kd.a;
        }
        if ((i2 & 2) != 0) {
            str = c4834kd.b;
        }
        if ((i2 & 4) != 0) {
            z2 = c4834kd.c;
        }
        if ((i2 & 8) != 0) {
            i = c4834kd.d;
        }
        if ((i2 & 16) != 0) {
            iArr = c4834kd.e;
        }
        if ((i2 & 32) != 0) {
            iArr2 = c4834kd.f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c4834kd.a(z, str, z2, i, iArr3, iArr4);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @Nullable
    public final int[] e() {
        return this.e;
    }

    @Nullable
    public final int[] f() {
        return this.f;
    }

    public final boolean g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    public int hashCode() {
        int iD = jc1.d(this.d, jc1.f(n30.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        int[] iArr = this.e;
        int iHashCode = (iD + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f;
        return iHashCode + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.a;
    }

    @NotNull
    public final String j() {
        return this.b;
    }

    @Nullable
    public final int[] k() {
        return this.f;
    }

    @Nullable
    public final int[] l() {
        return this.e;
    }

    @NotNull
    public String toString() {
        boolean z = this.a;
        String str = this.b;
        boolean z2 = this.c;
        int i = this.d;
        String string = Arrays.toString(this.e);
        String string2 = Arrays.toString(this.f);
        StringBuilder sb = new StringBuilder("PixelSettings(pixelEventsEnabled=");
        sb.append(z);
        sb.append(", pixelEventsUrl=");
        sb.append(str);
        sb.append(", pixelEventsCompression=");
        sb.append(z2);
        sb.append(", pixelEventsCompressionLevel=");
        sb.append(i);
        sb.append(", pixelOptOut=");
        return pv1.p(sb, string, ", pixelOptIn=", string2, ")");
    }

    public final void b(boolean z) {
        this.a = z;
    }

    public final void b(@Nullable int[] iArr) {
        this.e = iArr;
    }

    @NotNull
    public final C4834kd a(boolean z, @NotNull String str, boolean z2, int i, @Nullable int[] iArr, @Nullable int[] iArr2) {
        str.getClass();
        return new C4834kd(z, str, z2, i, iArr, iArr2);
    }

    public final boolean a() {
        return this.a;
    }

    public C4834kd(boolean z, @NotNull String str, boolean z2, int i, @Nullable int[] iArr, @Nullable int[] iArr2) {
        str.getClass();
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = i;
        this.e = iArr;
        this.f = iArr2;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.b = str;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(@Nullable int[] iArr) {
        this.f = iArr;
    }

    public C4834kd() {
        this(false, null, false, 0, null, null, 63, null);
    }
}
