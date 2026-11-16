package com.vungle.ads.internal;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k0 {
    public l0 a;
    public l0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return s71.b(this.a, k0Var.a) && s71.b(this.b, k0Var.b);
    }

    public final boolean c() {
        l0 l0Var = this.a;
        if (l0Var.a == Integer.MIN_VALUE || l0Var.b == Integer.MIN_VALUE) {
            return false;
        }
        l0 l0Var2 = this.b;
        return (l0Var2.a == Integer.MIN_VALUE || l0Var2.b == Integer.MIN_VALUE) ? false : true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("ClickCoordinate(downCoordinate=");
        sbA.append(this.a);
        sbA.append(", upCoordinate=");
        sbA.append(this.b);
        sbA.append(')');
        return sbA.toString();
    }

    public k0(l0 l0Var, l0 l0Var2) {
        l0Var.getClass();
        l0Var2.getClass();
        this.a = l0Var;
        this.b = l0Var2;
    }

    public final void a(l0 l0Var) {
        l0Var.getClass();
        this.a = l0Var;
    }

    public final void b(l0 l0Var) {
        l0Var.getClass();
        this.b = l0Var;
    }

    public final l0 a() {
        return this.a;
    }

    public final l0 b() {
        return this.b;
    }
}
