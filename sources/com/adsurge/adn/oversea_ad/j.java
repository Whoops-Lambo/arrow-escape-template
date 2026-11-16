package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    public Object a;
    public long b;
    public long c;

    public final synchronized Object a() {
        Object obj = this.a;
        if (obj == null) {
            return null;
        }
        long j = this.c;
        if (j < 0) {
            return obj;
        }
        if (j != 0 && Math.abs(System.currentTimeMillis() - this.b) <= this.c) {
            return this.a;
        }
        this.a = null;
        return null;
    }

    public final synchronized void a(Object obj, long j) {
        if (obj == null) {
            return;
        }
        this.a = obj;
        this.b = System.currentTimeMillis();
        this.c = j;
    }
}
