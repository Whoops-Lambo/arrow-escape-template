package io.p071bidmachine.media3.extractor.ts;

import defpackage.e32;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        e32.i("generateNewId() must be called before retrieving ids.");
    }

    public f0(int i, int i2, int i3) {
        String strJ;
        if (i == Integer.MIN_VALUE) {
            strJ = "";
        } else {
            strJ = nj.j(i, "/");
        }
        this.a = strJ;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public f0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }
}
