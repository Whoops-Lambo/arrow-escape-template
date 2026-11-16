package com.fyber.inneractive.sdk.network;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class k1 extends Exception {
    public final int a;

    @Override // java.lang.Throwable
    public final String toString() {
        return String.valueOf(this.a);
    }

    public k1(String str, int i) {
        super(str);
        this.a = i;
    }
}
