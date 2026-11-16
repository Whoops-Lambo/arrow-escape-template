package com.ironsource;

import defpackage.h50;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class L9 {
    private static final int n = 0;
    private ArrayList<P9> a;
    private R1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private A2 g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private P9 m;

    public P9 a(String str) {
        ArrayList<P9> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            P9 p9 = arrayList.get(i);
            i++;
            P9 p10 = p9;
            if (p10.c().equals(str)) {
                return p10;
            }
        }
        return null;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean f() {
        return this.d;
    }

    public A2 g() {
        return this.g;
    }

    public long h() {
        return this.i;
    }

    public R1 i() {
        return this.b;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InterstitialConfigurations{parallelLoad=");
        sb.append(this.c);
        sb.append(", bidderExclusive=");
        return h50.m(sb, this.d, '}');
    }

    public L9(int i, boolean z, int i2, R1 r1, A2 a2, int i3, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = r1;
        this.g = a2;
        this.j = z3;
        this.k = z4;
        this.f = i3;
        this.h = z2;
        this.i = j;
        this.l = z5;
    }

    public void a(P9 p9) {
        if (p9 != null) {
            this.a.add(p9);
            if (this.m == null) {
                this.m = p9;
            } else if (p9.a(0)) {
                this.m = p9;
            }
        }
    }

    public L9() {
        this.a = new ArrayList<>();
        this.b = new R1();
        this.g = new A2();
    }

    public P9 a() {
        ArrayList<P9> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            P9 p9 = arrayList.get(i);
            i++;
            P9 p10 = p9;
            if (p10.d()) {
                return p10;
            }
        }
        return this.m;
    }
}
