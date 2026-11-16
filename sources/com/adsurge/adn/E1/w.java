package com.adsurge.adn.E1;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class w {
    public final Context a;
    public final boolean b;
    public String c;
    public com.adsurge.adn.u1.c d;
    public d e = d.DEFAULT;

    public p a() {
        return new i(this.d, this.a, this.c, this.b, this.e);
    }

    public w(Context context, String str, boolean z) {
        this.a = context;
        this.b = z;
        this.c = str;
    }

    public w a(d dVar) {
        if (dVar != null) {
            this.e = dVar;
        }
        return this;
    }

    public w a(com.adsurge.adn.u1.c cVar) {
        this.d = cVar;
        return this;
    }
}
