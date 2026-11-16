package com.adsurge.adn.p060u0;

import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p035k0.j;
import com.adsurge.adn.p035k0.o;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class b implements d {
    public float a;
    public j b;
    public j c;
    public j d;
    public j e;
    public j f;
    public j g;
    public j i;
    public j j;
    public j k;
    public j l;
    public boolean m;
    public boolean o;
    public int h = -1;
    public com.adsurge.adn.p038l0.b n = new com.adsurge.adn.p038l0.b(0, 0, 0, 0);

    @Override // com.adsurge.adn.p060u0.d
    public final void d() {
        this.m = false;
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int b() {
        j jVar = this.k;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.n);
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int c() {
        j jVar = this.i;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.n);
    }

    @Override // com.adsurge.adn.p060u0.d
    public final boolean e() {
        return this.m;
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int f() {
        return a(this.b);
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int g() {
        return a(this.c);
    }

    @Override // com.adsurge.adn.p060u0.d
    public final float getAspectRatio() {
        return this.a;
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int h() {
        j jVar = this.l;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.n);
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int i() {
        j jVar = this.g;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.n);
    }

    @Override // com.adsurge.adn.p060u0.d
    public int j() {
        return this.n.a();
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int k() {
        j jVar = this.d;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.n);
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int l() {
        return this.h;
    }

    @Override // com.adsurge.adn.p060u0.d
    public int m() {
        return this.n.b();
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int n() {
        j jVar = this.j;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.n);
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int o() {
        j jVar = this.f;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.n);
    }

    @Override // com.adsurge.adn.p060u0.d
    public boolean a(String str, h hVar) {
        str.getClass();
        boolean z = false;
        switch (str) {
            case "3":
                j jVarB = hVar.b(new JSONObject[0]);
                this.b = jVarB;
                if (this.o || jVarB.c() || this.b.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "4":
                j jVarB2 = hVar.b(new JSONObject[0]);
                this.c = jVarB2;
                if (this.o || jVarB2.c() || this.c.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "5":
                j jVarB3 = hVar.b(new JSONObject[0]);
                this.d = jVarB3;
                if (this.o || jVarB3.c() || this.d.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "6":
                j jVarB4 = hVar.b(new JSONObject[0]);
                this.e = jVarB4;
                if (this.o || jVarB4.c() || this.e.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "7":
                j jVarB5 = hVar.b(new JSONObject[0]);
                this.f = jVarB5;
                if (this.o || jVarB5.c() || this.f.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "8":
                j jVarB6 = hVar.b(new JSONObject[0]);
                this.g = jVarB6;
                if (this.o || jVarB6.c() || this.g.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "13":
                this.h = o.c(hVar);
                break;
            case "46":
                this.a = hVar.a(new JSONObject[0]);
                break;
            case "76":
                j jVarB7 = hVar.b(new JSONObject[0]);
                this.i = jVarB7;
                if (this.o || jVarB7.c() || this.i.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "77":
                j jVarB8 = hVar.b(new JSONObject[0]);
                this.j = jVarB8;
                if (this.o || jVarB8.c() || this.j.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "78":
                j jVarB9 = hVar.b(new JSONObject[0]);
                this.k = jVarB9;
                if (this.o || jVarB9.c() || this.k.d()) {
                    z = true;
                }
                this.o = z;
                break;
            case "79":
                j jVarB10 = hVar.b(new JSONObject[0]);
                this.l = jVarB10;
                if (this.o || jVarB10.c() || this.l.d()) {
                    z = true;
                }
                this.o = z;
                break;
            default:
                return false;
        }
        this.m = true;
        return true;
    }

    @Override // com.adsurge.adn.p060u0.d
    public final boolean a(com.adsurge.adn.p038l0.b bVar) {
        this.n = bVar;
        return this.o;
    }

    public final int a(j jVar) {
        if (jVar == null) {
            return 0;
        }
        int iB = (int) jVar.b();
        if (iB >= 0) {
            return Math.max(jVar.a(this.n), 0);
        }
        if (iB == -1 || iB == -2) {
            return iB;
        }
        return 0;
    }

    @Override // com.adsurge.adn.p060u0.d
    public final int a() {
        j jVar = this.e;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.n);
    }
}
