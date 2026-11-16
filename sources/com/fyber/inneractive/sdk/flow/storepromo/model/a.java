package com.fyber.inneractive.sdk.flow.storepromo.model;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements Comparable {
    public final b a;
    public final String b;
    public final int c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c - ((a) obj).c;
    }

    public a(String str, b bVar) {
        this.b = str;
        this.a = bVar;
        this.c = -1;
    }

    public a(String str, b bVar, int i) {
        this.b = str;
        this.a = bVar;
        this.c = i;
    }
}
