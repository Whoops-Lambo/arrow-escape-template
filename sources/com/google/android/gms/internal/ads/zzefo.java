package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzefo extends Exception {
    private final int a;

    public final int d() {
        return this.a;
    }

    public zzefo(int i, String str, Throwable th) {
        super(str, th);
        this.a = 1;
    }

    public zzefo(int i, String str) {
        super(str);
        this.a = i;
    }

    public zzefo(int i) {
        this.a = i;
    }
}
