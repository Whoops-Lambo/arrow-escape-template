package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements x {
    private int a;
    private long b;
    private int c;
    private final int d;

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i = this.c + 1;
        this.c = i;
        return i <= this.d;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.c;
    }

    public e(int i, long j, int i2) {
        this.b = j;
        this.a = i;
        this.d = i2;
    }

    public e(int i, int i2) {
        this(i, 60000L, i2);
    }

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.b;
    }
}
