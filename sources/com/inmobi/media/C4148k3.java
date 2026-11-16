package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4148k3 {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public String e;

    public final String a() {
        int i = this.a;
        if (i == -1 && this.b == -1) {
            return null;
        }
        return i + "_" + this.b;
    }

    public final String b() {
        int i = this.c;
        if (i == -1 && this.d == -1) {
            return null;
        }
        return i + "_" + this.d;
    }
}
