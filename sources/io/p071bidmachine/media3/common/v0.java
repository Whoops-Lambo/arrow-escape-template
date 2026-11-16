package io.p071bidmachine.media3.common;

import defpackage.d31;
import defpackage.y21;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.media3.common.util.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class v0 {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public boolean h = true;
    public d31 i;
    public d31 j;
    public d31 k;
    public int l;
    public int m;
    public d31 n;
    public u0 o;
    public d31 p;
    public boolean q;
    public int r;
    public HashMap s;
    public HashSet t;

    public void a(int i) {
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            if (((t0) it.next()).a.c == i) {
                it.remove();
            }
        }
    }

    public final void b(w0 w0Var) {
        this.a = w0Var.a;
        this.b = w0Var.b;
        this.c = w0Var.c;
        this.d = w0Var.d;
        this.e = w0Var.e;
        this.f = w0Var.f;
        this.g = w0Var.g;
        this.h = w0Var.h;
        this.i = w0Var.i;
        this.j = w0Var.j;
        this.k = w0Var.k;
        this.l = w0Var.l;
        this.m = w0Var.m;
        this.n = w0Var.n;
        this.o = w0Var.o;
        this.p = w0Var.p;
        this.q = w0Var.q;
        this.r = w0Var.r;
        this.t = new HashSet(w0Var.t);
        this.s = new HashMap(w0Var.s);
    }

    public v0() {
        z21 z21Var = d31.b;
        y32 y32Var = y32.e;
        this.i = y32Var;
        this.j = y32Var;
        this.k = y32Var;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = y32Var;
        this.o = u0.a;
        this.p = y32Var;
        this.q = true;
        this.r = 0;
        this.s = new HashMap();
        this.t = new HashSet();
    }

    public v0 c(String... strArr) {
        y21 y21VarX = d31.x();
        for (String str : strArr) {
            str.getClass();
            y21VarX.a(x.M(str));
        }
        this.p = y21VarX.g();
        this.q = false;
        return this;
    }
}
