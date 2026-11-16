package com.adsurge.adn.J;

import android.content.Context;
import com.adsurge.adn.E0.d;
import com.adsurge.adn.X.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    public volatile Context a;
    public volatile com.adsurge.adn.O.a b;
    public volatile com.adsurge.adn.O.b c;
    public volatile com.adsurge.adn.E0.a d;

    /* JADX INFO: renamed from: com.adsurge.adn.J.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0080a {
        public static a a = new a();
    }

    public synchronized boolean b(Context context, String str, boolean z) {
        a(context, str, z);
        return true;
    }

    public static a d() {
        return C0080a.a;
    }

    public com.adsurge.adn.O.b c() {
        return this.c;
    }

    public final void e() {
        com.adsurge.adn.D0.a.c().a(this.a, this.d, new d("2.0.1", 0, false), new com.adsurge.adn.O.c());
        com.adsurge.adn.F0.b.b().a(new com.adsurge.adn.N.c());
        com.adsurge.adn.G0.a.a(com.adsurge.adn.R.c.a());
    }

    public void f() {
        this.c.h();
    }

    public final void a(Context context, String str, boolean z) {
        this.a = context.getApplicationContext();
        this.b = new com.adsurge.adn.O.a(str, context, z.a(context), z);
        this.c = new com.adsurge.adn.O.b(this.a);
        this.d = new com.adsurge.adn.E0.a(str, context, z.a(context));
        e();
    }

    public com.adsurge.adn.O.a b() {
        return this.b;
    }

    public Context a() {
        return this.a;
    }
}
