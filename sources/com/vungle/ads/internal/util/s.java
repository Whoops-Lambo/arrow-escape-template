package com.vungle.ads.internal.util;

import defpackage.jc1;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class s {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public com.vungle.ads.internal.h h;
    public Boolean i;
    public String j;
    public Long k;
    public String l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        s sVar = (s) obj;
        return s71.b(this.a, sVar.a) && s71.b(this.b, sVar.b) && s71.b(this.c, sVar.c) && s71.b(this.d, sVar.d) && s71.b(this.e, sVar.e) && s71.b(this.f, sVar.f) && s71.b(this.g, sVar.g) && this.h == sVar.h && s71.b(this.i, sVar.i) && s71.b(this.j, sVar.j) && s71.b(this.k, sVar.k) && s71.b(this.l, sVar.l);
    }

    public static int a(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.c = str;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final void f(String str) {
        this.e = str;
    }

    public final void g(String str) {
        this.a = str;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int iA = (a(this.f) + ((a(this.e) + ((a(this.d) + ((a(this.c) + ((a(this.b) + (a(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.g;
        int iHashCode = (iA + (bool != null ? bool.hashCode() : 0)) * 31;
        com.vungle.ads.internal.h hVar = this.h;
        int iHashCode2 = (iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Boolean bool2 = this.i;
        int iA2 = (a(this.j) + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31)) * 31;
        Long l = this.k;
        return a(this.l) + ((iA2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.j;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.a;
    }

    public final String l() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEntry(placementRefId=");
        sb.append(this.a);
        sb.append(", creativeId=");
        sb.append(this.b);
        sb.append(", eventId=");
        sb.append(this.c);
        sb.append(", adSource=");
        sb.append(this.d);
        sb.append(", mediationName=");
        sb.append(this.e);
        sb.append(", vmVersion=");
        sb.append(this.f);
        sb.append(", adoEnabled=");
        sb.append(this.g);
        sb.append(", adState=");
        sb.append(this.h);
        sb.append(" adPoddingEnabled=");
        sb.append(this.i);
        sb.append(", experiments=");
        sb.append(this.j);
        sb.append(", adLoadType=");
        sb.append(this.k);
        sb.append(", adapterAdFormat=");
        return jc1.q(sb, this.l, ')');
    }

    public final void b(Boolean bool) {
        this.g = bool;
    }

    public final String c() {
        return this.d;
    }

    public final com.vungle.ads.internal.h d() {
        return this.h;
    }

    public final String e() {
        return this.l;
    }

    public final Boolean f() {
        return this.g;
    }

    public final String g() {
        return this.b;
    }

    public final void h(String str) {
        this.f = str;
    }

    public final Boolean b() {
        return this.i;
    }

    public final void a(Boolean bool) {
        this.i = bool;
    }

    public final Long a() {
        return this.k;
    }

    public final void a(Long l) {
        this.k = l;
    }

    public final void a(com.vungle.ads.internal.h hVar) {
        this.h = hVar;
    }
}
