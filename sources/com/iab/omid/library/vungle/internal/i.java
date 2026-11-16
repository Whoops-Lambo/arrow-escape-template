package com.iab.omid.library.vungle.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class i implements d.a, com.iab.omid.library.vungle.devicevolume.c {
    private static i f;
    private float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private final com.iab.omid.library.vungle.devicevolume.e b;
    private final com.iab.omid.library.vungle.devicevolume.b c;
    private com.iab.omid.library.vungle.devicevolume.d d;
    private c e;

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.vungle.devicevolume.e(), new com.iab.omid.library.vungle.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.vungle.devicevolume.c
    public void a(float f2) {
        this.a = f2;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f2);
        }
    }

    public float b() {
        return this.a;
    }

    public i(com.iab.omid.library.vungle.devicevolume.e eVar, com.iab.omid.library.vungle.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    public void d() {
        b.h().e();
    }

    public void e() {
        b.h().a(this);
        b.h().f();
        TreeWalker.getInstance().h();
        this.d.b();
    }

    public void f() {
        TreeWalker.getInstance().j();
        b.h().g();
        this.d.c();
    }

    private c a() {
        if (this.e == null) {
            this.e = c.c();
        }
        return this.e;
    }

    public void a(Context context) {
        this.d = this.b.a(new Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z) {
        TreeWalker treeWalker = TreeWalker.getInstance();
        if (z) {
            treeWalker.h();
        } else {
            treeWalker.g();
        }
    }
}
