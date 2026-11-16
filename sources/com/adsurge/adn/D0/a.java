package com.adsurge.adn.D0;

import android.content.Context;
import com.adsurge.adn.E0.b;
import com.adsurge.adn.E0.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final a e = new a();
    public volatile Context a;
    public volatile d b;
    public volatile com.adsurge.adn.E0.a c;
    public volatile b d;

    public static a c() {
        return e;
    }

    public void a(Context context, com.adsurge.adn.E0.a aVar, d dVar, b bVar) {
        this.a = context;
        this.c = aVar;
        this.b = dVar;
        this.d = bVar;
    }

    public com.adsurge.adn.E0.a b() {
        return this.c;
    }

    public b d() {
        return this.d;
    }

    public d e() {
        return this.b;
    }

    public Context a() {
        return this.a;
    }
}
