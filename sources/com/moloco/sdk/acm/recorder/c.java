package com.moloco.sdk.acm.recorder;

import com.facebook.appevents.n;
import com.moloco.sdk.acm.e;
import com.moloco.sdk.acm.i;
import com.moloco.sdk.acm.l;
import com.moloco.sdk.acm.services.d;
import defpackage.cm2;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements b {
    public final String a;

    public final void a(e eVar) {
        String str = this.a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.c cVar = com.moloco.sdk.acm.c.a;
            com.moloco.sdk.acm.c.a(eVar);
        } else {
            eVar.a("mediator", str);
            com.moloco.sdk.acm.c cVar2 = com.moloco.sdk.acm.c.a;
            com.moloco.sdk.acm.c.a(eVar);
        }
    }

    public final i c(String str) {
        if (com.moloco.sdk.acm.c.h.get() != l.a) {
            cm2 cm2Var = d.a;
            d.b("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        }
        i.Companion.getClass();
        com.facebook.ads.a aVar = new com.facebook.ads.a(new n(9));
        i iVar = new i(str, aVar);
        ((AtomicLong) aVar.b).set(System.currentTimeMillis());
        return iVar;
    }

    public c(String str) {
        this.a = str;
    }

    public final void b(i iVar) {
        iVar.getClass();
        String str = this.a;
        if (str != null && str.length() != 0) {
            iVar.a("mediator", str);
            com.moloco.sdk.acm.c cVar = com.moloco.sdk.acm.c.a;
            com.moloco.sdk.acm.c.b(iVar);
        } else {
            com.moloco.sdk.acm.c cVar2 = com.moloco.sdk.acm.c.a;
            com.moloco.sdk.acm.c.b(iVar);
        }
    }
}
