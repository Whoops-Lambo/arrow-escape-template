package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private String a;
    private String b;
    private String c = "";
    private int d;
    private int e;

    public void a(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.b = str;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public b(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.d = i;
        this.e = i2;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    public void a(String str) {
        this.c = str;
    }
}
