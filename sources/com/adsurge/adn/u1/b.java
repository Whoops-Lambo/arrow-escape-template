package com.adsurge.adn.u1;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public String a;
    public int b;
    public double c;
    public int d;
    public int e;
    public long f;
    public String g;
    public String h;
    public String i;
    public long j;

    public long a() {
        return this.j;
    }

    public void b(String str) {
        this.a = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppInfo{packageName='");
        sb.append(this.a);
        sb.append("', score=");
        sb.append(this.b);
        sb.append(", price=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", progress=");
        sb.append(this.e);
        sb.append(", downloads=");
        sb.append(this.f);
        sb.append(", iconUrl='");
        sb.append(this.g);
        sb.append("', appName='");
        sb.append(this.h);
        sb.append("', versionName='");
        sb.append(this.i);
        sb.append("', pkgSize=");
        return n30.o(sb, this.j, '}');
    }

    public void a(String str) {
        this.h = str;
    }
}
