package io.p071bidmachine.media3.exoplayer.hls.playlist;

import android.net.Uri;
import defpackage.d31;
import defpackage.y32;
import io.p071bidmachine.media3.common.util.a;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final d31 l;
    public final d31 m;
    public final d31 n;

    public e(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, y32 y32Var) {
        a.c((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = d31.A(arrayList2);
        this.m = d31.A(arrayList3);
        this.n = d31.A(y32Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.i == eVar.i && this.j == eVar.j && this.k == eVar.k && Objects.equals(this.a, eVar.a) && Objects.equals(this.b, eVar.b) && Objects.equals(this.c, eVar.c) && Objects.equals(this.h, eVar.h) && Objects.equals(this.l, eVar.l) && Objects.equals(this.m, eVar.m) && Objects.equals(this.n, eVar.n);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n);
    }
}
