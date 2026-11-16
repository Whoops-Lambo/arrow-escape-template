package com.adsurge.adn.p011c0;

import android.content.Context;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.p032j0.g;
import com.adsurge.adn.p044n0.i;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public final WeakReference a;
    public e b;
    public f c;
    public i d;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public final Map h = new ConcurrentHashMap();
    public c i;

    public h h() {
        return null;
    }

    public i j() {
        return null;
    }

    public void a() {
        i iVar = this.d;
        if (iVar != null) {
            iVar.b(0);
        }
    }

    public void b(String str) {
        this.g = str;
    }

    public Context c() {
        return (Context) this.a.get();
    }

    public String d() {
        return this.e;
    }

    public e e() {
        return this.b;
    }

    public f f() {
        return this.c;
    }

    public String g() {
        return this.g;
    }

    public i i() {
        return this.d;
    }

    public boolean k() {
        return this.f;
    }

    public boolean l() {
        i iVar = this.d;
        return iVar != null && i.a(iVar.a());
    }

    public a(Context context) {
        this.a = new WeakReference(context);
        g.a(context);
    }

    public c b() {
        return this.i;
    }

    public void a(f fVar) {
        this.c = fVar;
    }

    public void a(e eVar) {
        this.b = eVar;
    }

    public void a(i iVar) {
        this.d = iVar;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public void a(c cVar) {
        this.i = cVar;
    }
}
