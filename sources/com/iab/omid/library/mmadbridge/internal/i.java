package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class i implements d.a, com.iab.omid.library.mmadbridge.devicevolume.c {
    private static i f;
    private float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private final com.iab.omid.library.mmadbridge.devicevolume.e b;
    private final com.iab.omid.library.mmadbridge.devicevolume.b c;
    private com.iab.omid.library.mmadbridge.devicevolume.d d;
    private c e;

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.mmadbridge.devicevolume.e(), new com.iab.omid.library.mmadbridge.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.c
    public void a(float f2) {
        this.a = f2;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public float b() {
        return this.a;
    }

    public i(com.iab.omid.library.mmadbridge.devicevolume.e eVar, com.iab.omid.library.mmadbridge.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.d();
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

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z) {
        TreeWalker treeWalker = TreeWalker.getInstance();
        if (z) {
            treeWalker.h();
        } else {
            treeWalker.g();
        }
    }
}
