package com.adsurge.adn.p021f1;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.u1.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class f {
    public final long b;
    public final com.adsurge.adn.p006a1.a c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final Integer k;
    public final boolean l;
    public final String m;
    public final String n;
    public final Context o;
    public final int p;
    public final c q;
    public String r;
    public final d s;
    public final com.adsurge.adn.u1.c t;
    public final int u;
    public final boolean v;
    public final long a = SystemClock.elapsedRealtime();
    public boolean w = false;
    public int x = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public com.adsurge.adn.u1.c a;
        public String b;
        public String e;
        public String f;
        public String g;
        public int i;
        public boolean c = false;
        public Integer d = 0;
        public boolean h = true;
        public boolean j = false;

        public a a(d dVar) {
            return a(dVar.c).a(dVar.b).a(dVar.b()).d(dVar.i).b(dVar.j).c(dVar.k);
        }

        public final a b(String str) {
            this.f = str;
            return this;
        }

        public final a c(String str) {
            this.g = str;
            return this;
        }

        public final a d(String str) {
            this.e = str;
            return this;
        }

        public a(com.adsurge.adn.u1.c cVar) {
            this.a = cVar;
        }

        public final a a(boolean z) {
            this.c = z;
            return this;
        }

        public final a a(int i) {
            this.i = i;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }

        public f a() {
            return new f(this);
        }
    }

    public String a() {
        return this.t.h() + "_" + this.b;
    }

    public f(a aVar) {
        String strO0;
        String strR;
        String strU;
        com.adsurge.adn.u1.c cVar = aVar.a;
        this.t = cVar;
        this.c = cVar.i();
        this.d = cVar.F();
        this.e = cVar.X0();
        if (TextUtils.isEmpty(aVar.f)) {
            strO0 = cVar.o0();
        } else {
            strO0 = aVar.f;
        }
        boolean zIsEmpty = TextUtils.isEmpty(strO0);
        this.f = !zIsEmpty;
        this.g = zIsEmpty ? null : strO0;
        this.h = !TextUtils.isEmpty(aVar.g) || cVar.V0();
        if (TextUtils.isEmpty(aVar.e)) {
            strR = cVar.r();
        } else {
            strR = aVar.e;
        }
        this.m = strR;
        this.i = aVar.b;
        this.j = aVar.c;
        this.k = aVar.d;
        if (TextUtils.isEmpty(aVar.g)) {
            strU = cVar.U();
        } else {
            strU = aVar.g;
        }
        this.n = strU;
        this.l = aVar.h;
        this.o = com.adsurge.adn.s1.a.b().a();
        this.q = c.a(cVar);
        this.p = -1;
        this.s = new d(200, cVar.h(), null, "", cVar.U(), "", null);
        this.u = aVar.i;
        this.v = aVar.j;
        this.b = com.adsurge.adn.N.d.b().a();
    }

    public String a(String str) {
        return TextUtils.isEmpty(str) ? str : str.replace("{sdk_click_id}", a());
    }
}
