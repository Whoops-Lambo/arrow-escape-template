package com.adsurge.adn.p008b0;

import com.adsurge.adn.D0.a;
import defpackage.nj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class g {
    public int a;
    public long b;
    public String e;
    public String f;
    public String g;
    public List d = new ArrayList();
    public boolean h = false;
    public final String c = a.c().e().a();

    public void a(int i) {
        this.a = i;
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append("(");
        return nj.q(sb, this.f, ")");
    }

    public void c(String str) {
        this.e = str;
    }

    public long d() {
        return this.b;
    }

    public List e() {
        return this.d;
    }

    public int f() {
        return this.a;
    }

    public void a(long j) {
        this.b = j;
    }

    public String c() {
        return this.g;
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public void b(String str) {
        this.f = str;
    }
}
