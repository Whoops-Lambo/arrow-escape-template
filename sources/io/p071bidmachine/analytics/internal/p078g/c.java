package io.p071bidmachine.analytics.internal.p078g;

import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private final String a;
    private final String b;
    private final long c;
    private final a d;
    private final float e;
    private final g f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s71.b(this.a, cVar.a) && s71.b(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && Float.compare(this.e, cVar.e) == 0 && this.f == cVar.f;
    }

    public final a a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final float d() {
        return this.e;
    }

    public final g e() {
        return this.f;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return this.f.hashCode() + n30.b(this.e, (this.d.hashCode() + pv1.d(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31);
    }

    public c(String str, String str2, long j, a aVar, float f, g gVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = aVar;
        this.e = f;
        this.f = gVar;
    }

    public String toString() {
        return super.toString();
    }
}
