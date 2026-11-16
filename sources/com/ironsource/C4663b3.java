package com.ironsource;

import defpackage.h50;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4663b3 {
    private static final int p = 0;
    private R1 a;
    private int b;
    private long c;
    private boolean d;
    private ArrayList<C4842l3> e;
    private C4842l3 f;
    private int g;
    private int h;
    private A2 i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;

    public C4842l3 a(String str) {
        ArrayList<C4842l3> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C4842l3 c4842l3 = arrayList.get(i);
            i++;
            C4842l3 c4842l4 = c4842l3;
            if (c4842l4.c().equals(str)) {
                return c4842l4;
            }
        }
        return null;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public A2 d() {
        return this.i;
    }

    public long e() {
        return this.k;
    }

    public int f() {
        return this.h;
    }

    public R1 g() {
        return this.a;
    }

    public int h() {
        return this.g;
    }

    @NotNull
    public C4842l3 i() {
        ArrayList<C4842l3> arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C4842l3 c4842l3 = arrayList.get(i);
            i++;
            C4842l3 c4842l4 = c4842l3;
            if (c4842l4.d()) {
                return c4842l4;
            }
        }
        C4842l3 c4842l5 = this.f;
        return c4842l5 != null ? c4842l5 : new C4898o5();
    }

    public long j() {
        return this.o;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerConfigurations{parallelLoad=");
        sb.append(this.b);
        sb.append(", bidderExclusive=");
        return h50.m(sb, this.d, '}');
    }

    public C4663b3(int i, long j, boolean z, R1 r1, int i2, A2 a2, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.e = new ArrayList<>();
        this.b = i;
        this.c = j;
        this.d = z;
        this.a = r1;
        this.g = i2;
        this.h = i3;
        this.i = a2;
        this.j = z2;
        this.k = j2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = j3;
    }

    public void a(C4842l3 c4842l3) {
        if (c4842l3 != null) {
            this.e.add(c4842l3);
            if (this.f == null) {
                this.f = c4842l3;
            } else if (c4842l3.a(0)) {
                this.f = c4842l3;
            }
        }
    }

    public int a() {
        return this.b;
    }

    public C4663b3() {
        this.a = new R1();
        this.e = new ArrayList<>();
    }
}
