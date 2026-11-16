package com.adsurge.adn.E1;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class j {
    public final Context a;
    public com.adsurge.adn.u1.c b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public d j;

    public p a() {
        p pVarA = new w(this.a, this.i, this.h).a(this.b).a(this.j).a();
        com.adsurge.adn.F1.h hVar = new com.adsurge.adn.F1.h(pVarA);
        pVarA.e(true);
        pVarA.a(hVar);
        pVarA.d(this.d);
        pVarA.setFocusable(this.e);
        pVarA.setFocusableInTouchMode(this.f);
        pVarA.a(this.g);
        return pVarA;
    }

    public j(Context context, com.adsurge.adn.u1.c cVar) {
        String strL;
        this.e = true;
        this.f = true;
        this.g = true;
        this.j = d.DEFAULT;
        this.a = context;
        this.b = cVar;
        if (cVar == null) {
            strL = null;
        } else {
            strL = cVar.l();
        }
        this.c = strL;
    }

    public j(Context context, com.adsurge.adn.u1.c cVar, boolean z) {
        this(context, cVar);
        this.d = z;
    }

    public j a(d dVar) {
        if (dVar != null) {
            this.j = dVar;
        }
        return this;
    }
}
