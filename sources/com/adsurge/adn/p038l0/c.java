package com.adsurge.adn.p038l0;

import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p035k0.j;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class c {
    public j a;
    public j b;
    public j c;
    public j d;
    public boolean e;
    public b f = new b(0, 0, 0, 0);
    public boolean g;

    public int b() {
        j jVar = this.d;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.f);
    }

    public int c() {
        j jVar = this.a;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.f);
    }

    public int d() {
        j jVar = this.b;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.f);
    }

    public int e() {
        j jVar = this.c;
        if (jVar == null) {
            return 0;
        }
        return jVar.a(this.f);
    }

    public boolean f() {
        return this.e;
    }

    public boolean a(String str, h hVar) {
        str.getClass();
        boolean z = false;
        switch (str) {
            case "9":
                j jVarB = hVar.b(new JSONObject[0]);
                this.a = jVarB;
                if (this.g || jVarB.c() || this.a.d()) {
                    z = true;
                }
                this.g = z;
                break;
            case "10":
                j jVarB2 = hVar.b(new JSONObject[0]);
                this.b = jVarB2;
                if (this.g || jVarB2.c() || this.b.d()) {
                    z = true;
                }
                this.g = z;
                break;
            case "11":
                j jVarB3 = hVar.b(new JSONObject[0]);
                this.c = jVarB3;
                if (this.g || jVarB3.c() || this.c.d()) {
                    z = true;
                }
                this.g = z;
                break;
            case "12":
                j jVarB4 = hVar.b(new JSONObject[0]);
                this.d = jVarB4;
                if (this.g || jVarB4.c() || this.d.d()) {
                    z = true;
                }
                this.g = z;
                break;
            default:
                return false;
        }
        this.e = true;
        return true;
    }

    public final boolean a(b bVar) {
        this.f = bVar;
        return this.g;
    }

    public void a() {
        this.e = false;
    }
}
