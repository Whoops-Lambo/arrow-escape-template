package com.ironsource;

import defpackage.h50;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.ie, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4800ie {
    private static final int o = 0;
    private ArrayList<C4870md> a;
    private R1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private C4870md l;
    private A2 m;
    private boolean n;

    public C4870md a(String str) {
        ArrayList<C4870md> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C4870md c4870md = arrayList.get(i);
            i++;
            C4870md c4870md2 = c4870md;
            if (c4870md2.c().equals(str)) {
                return c4870md2;
            }
        }
        return null;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.n;
    }

    public ArrayList<C4870md> e() {
        return this.a;
    }

    public boolean f() {
        return this.i;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public A2 k() {
        return this.m;
    }

    public long l() {
        return this.h;
    }

    public R1 m() {
        return this.b;
    }

    public boolean n() {
        return this.k;
    }

    public boolean o() {
        return this.j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardedVideoConfigurations{parallelLoad=");
        sb.append(this.c);
        sb.append(", bidderExclusive=");
        return h50.m(sb, this.d, '}');
    }

    public C4800ie(int i, boolean z, int i2, int i3, R1 r1, A2 a2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = r1;
        this.f = i3;
        this.m = a2;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public void a(C4870md c4870md) {
        if (c4870md != null) {
            this.a.add(c4870md);
            if (this.l == null) {
                this.l = c4870md;
            } else if (c4870md.a(0)) {
                this.l = c4870md;
            }
        }
    }

    public C4800ie() {
        this.a = new ArrayList<>();
        this.b = new R1();
    }

    public C4870md a() {
        ArrayList<C4870md> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C4870md c4870md = arrayList.get(i);
            i++;
            C4870md c4870md2 = c4870md;
            if (c4870md2.d()) {
                return c4870md2;
            }
        }
        return this.l;
    }
}
