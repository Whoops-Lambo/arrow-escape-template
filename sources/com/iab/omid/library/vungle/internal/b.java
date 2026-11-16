package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class b extends d {

    @SuppressLint({"StaticFieldLeak"})
    private static b d = new b();

    public static b h() {
        return d;
    }

    private b() {
    }

    @Override // com.iab.omid.library.vungle.internal.d
    public void b(boolean z) {
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().a(z);
        }
    }

    @Override // com.iab.omid.library.vungle.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View viewE = it.next().e();
            if (viewE != null && viewE.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
