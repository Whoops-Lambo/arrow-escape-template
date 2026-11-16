package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C5008u8 {
    public static final int c = 1001;
    private String a;
    private int b;

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "error - code:" + this.b + ", message:" + this.a;
    }

    public C5008u8(int i, String str) {
        this.b = i;
        this.a = str == null ? "" : str;
    }
}
