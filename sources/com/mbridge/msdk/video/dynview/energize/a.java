package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.listener.e;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static volatile a b;
    public com.mbridge.msdk.video.dynview.inter.a a;

    private void b(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().b(cVar, view, map, eVar);
    }

    private void c(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().c(cVar, view, map, eVar);
    }

    public void d() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.a;
        if (aVar != null) {
            aVar.c();
        }
    }

    private a() {
    }

    public void a(View view, c cVar, Map map, e eVar) {
        int iG = cVar.g();
        if (iG != 1) {
            if (iG != 2) {
                if (iG != 4) {
                    if (iG != 5) {
                        eVar.a(view, new ArrayList());
                        return;
                    } else {
                        c(cVar, view, map, eVar);
                        return;
                    }
                }
                a(cVar, view, eVar);
                return;
            }
            b(cVar, view, map, eVar);
            return;
        }
        a(cVar, view, map, eVar);
    }

    public void b() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static a a() {
        a aVar;
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                    aVar = b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return b;
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.mbridge.msdk.video.dynview.wrapper.a aVar = new com.mbridge.msdk.video.dynview.wrapper.a();
        aVar.a(cVar, view, map, eVar);
        this.a = aVar.l;
    }

    private void a(c cVar, View view, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().a(cVar, view, eVar);
    }
}
