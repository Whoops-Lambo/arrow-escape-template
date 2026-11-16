package io.p071bidmachine.internal;

import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 {
    public final a1 a;
    public final a1 b;
    public final a1 c;
    public final a1 d;
    public final a1 e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.a == d1Var.a && this.b == d1Var.b && this.c == d1Var.c && this.d == d1Var.d && this.e == d1Var.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d1(int i) {
        int i2 = i & 2;
        a1 a1Var = a1.c;
        a1 a1Var2 = a1.a;
        this(a1Var2, i2 != 0 ? a1Var2 : a1Var, (i & 4) != 0 ? a1Var2 : a1Var, (i & 8) != 0 ? a1Var2 : a1Var, a1Var2);
    }

    public static void a(d1 d1Var, sr0 sr0Var, sr0 sr0Var2) {
        int i = b1.a[d1Var.a.ordinal()];
        if (i == 1) {
            sr0Var.invoke();
        } else {
            if (i != 2) {
                return;
            }
            sr0Var2.invoke();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2, Runnable runnable3) {
        c1 c1Var = new c1(runnable, 0);
        c1 c1Var2 = new c1(runnable2, 1);
        c1 c1Var3 = new c1(runnable3, 2);
        int i = b1.a[this.a.ordinal()];
        if (i == 1) {
            c1Var.invoke();
        } else if (i == 2) {
            c1Var2.invoke();
        } else {
            if (i != 3) {
                return;
            }
            c1Var3.invoke();
        }
    }

    public final void c(sr0 sr0Var, sr0 sr0Var2) {
        int i = b1.a[this.d.ordinal()];
        if (i == 1) {
            sr0Var.invoke();
        } else {
            if (i != 2) {
                return;
            }
            sr0Var2.invoke();
        }
    }

    public final void d(sr0 sr0Var, sr0 sr0Var2) {
        int i = b1.a[this.c.ordinal()];
        if (i == 1) {
            sr0Var.invoke();
        } else {
            if (i != 2) {
                return;
            }
            sr0Var2.invoke();
        }
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PrivacyGroupRestrictions(sensitiveId=" + this.a + ", network=" + this.b + ", preciseLocation=" + this.c + ", deviceFingerprint=" + this.d + ", demographics=" + this.e + ')';
    }

    public d1(a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5) {
        a1Var2.getClass();
        a1Var3.getClass();
        a1Var4.getClass();
        this.a = a1Var;
        this.b = a1Var2;
        this.c = a1Var3;
        this.d = a1Var4;
        this.e = a1Var5;
    }
}
