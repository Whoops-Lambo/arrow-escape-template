package com.google.android.gms.internal.ads;

import defpackage.e32;
import defpackage.nj;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzasd {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public final void a() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        int length = String.valueOf(i2).length();
        String str = this.a;
        this.e = pv1.l(i2, str, new StringBuilder(str.length() + length));
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        e32.i("generateNewId() must be called before retrieving ids.");
    }

    public zzasd(int i, int i2, int i3) {
        String strL;
        if (i == Integer.MIN_VALUE) {
            strL = "";
        } else {
            strL = nj.l(i, "/", new StringBuilder(String.valueOf(i).length() + 1));
        }
        this.a = strL;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
