package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import defpackage.wr0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class yq {
    public final Y9 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final Ej a(C4026fk c4026fk, Context context, short s, C4285p0 c4285p0, AdConfig adConfig) {
        Ej mj;
        c4026fk.getClass();
        context.getClass();
        c4285p0.getClass();
        adConfig.getClass();
        if (s == 0) {
            Y9 y9 = this.a;
            if (y9 != null) {
                ((Z9) y9).a("SiblingWebViewManager", n30.y("Creating standard WebView with ID: ", c4026fk.b));
            }
            mj = new Ej(context, c4285p0.o, c4285p0.p, c4285p0.q, c4285p0.r, 0L, c4285p0.s, c4285p0.t, c4026fk, this, c4285p0, adConfig, 80);
        } else {
            Y9 y10 = this.a;
            if (s != 1) {
                if (y10 != null) {
                    ((Z9) y10).b("SiblingWebViewManager", pv1.k(s, "Unsupported WebView type: "));
                }
                defpackage.d.r(pv1.k(s, "Unsupported WebView type: "));
                return null;
            }
            if (y10 != null) {
                ((Z9) y10).a("SiblingWebViewManager", n30.y("Creating Sibling WebView with ID: ", c4026fk.b));
            }
            mj = new Mj(context, c4285p0.o, c4285p0.t, C4285p0.a(c4285p0, null, 4194047), this, c4026fk, adConfig);
        }
        a(mj, c4026fk.b);
        return mj;
    }

    public yq(Y9 y9) {
        this.a = y9;
    }

    public final void b(wr0 wr0Var) {
        wr0Var.getClass();
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((Ej) entry.getValue()) instanceof Mj) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Ej ej = (Ej) ((Map.Entry) it.next()).getValue();
            ej.getClass();
            wr0Var.invoke((Mj) ej);
        }
    }

    public final void a(String str) {
        str.getClass();
        this.b.remove(str);
        Y9 y9 = this.a;
        if (y9 != null) {
            ((Z9) y9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: ".concat(str));
        }
    }

    public final void a(wr0 wr0Var) {
        wr0Var.getClass();
        Ej ej = (Ej) this.b.get(BuildConfig.FLAVOR);
        if (ej != null) {
            wr0Var.invoke(ej);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!s71.b(entry.getKey(), BuildConfig.FLAVOR)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            wr0Var.invoke((Ej) ((Map.Entry) it.next()).getValue());
        }
    }

    public final void a(Ej ej, String str) {
        this.b.put(str, ej);
        Y9 y9 = this.a;
        if (y9 != null) {
            ((Z9) y9).a("SiblingWebViewManager", n30.y("Registered bridge for WebView ID: ", str));
        }
    }
}
