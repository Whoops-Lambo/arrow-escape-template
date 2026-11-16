package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b0 extends Exception {
    public final q a;
    private long b;
    private int c;
    private String d;

    public abstract int d();

    public void a(long j) {
        this.b = j;
    }

    public int f() {
        return this.c;
    }

    public b0() {
        this.c = 0;
        this.d = "";
        this.a = null;
    }

    public void a(int i) {
        this.c = i;
    }

    public b0(q qVar) {
        this.c = 0;
        this.d = "";
        this.a = qVar;
    }

    public b0(String str) {
        super(str);
        this.c = 0;
        this.d = "";
        this.a = null;
    }

    public b0(Throwable th) {
        super(th);
        this.c = 0;
        this.d = "";
        this.a = null;
    }
}
