package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.p32;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3923c0 {
    public final WeakReference a;
    public final String b;
    public final boolean c;
    public final AtomicBoolean d;
    public final String e;
    public Z9 f;

    public final void a(C4390sm c4390sm) {
        C3997ej c3997ej;
        C4418tm c4418tm;
        AtomicBoolean atomicBoolean;
        if (!this.d.getAndSet(true)) {
            C4552yk c4552yk = C4552yk.a;
            String str = this.b;
            Boolean boolValueOf = Boolean.valueOf(this.c);
            c4552yk.getClass();
            C4552yk.a(str, boolValueOf);
            AbstractC4091i1 abstractC4091i1 = (AbstractC4091i1) this.a.get();
            if (abstractC4091i1 != null) {
                abstractC4091i1.a(c4390sm);
            } else if (c4390sm != null) {
                c4390sm.b();
            }
            Z9 z9 = this.f;
            if (z9 != null) {
                z9.a(this.e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            Z9 z10 = this.f;
            if (z10 == null || (c3997ej = z10.a) == null) {
                return;
            }
            c3997ej.a();
            return;
        }
        Z9 z11 = this.f;
        if (z11 != null) {
            z11.c(this.e, "skipping as Impression is already Called");
        }
        if (c4390sm != null) {
            C4397t1 c4397t1 = c4390sm.a;
            if (c4397t1 == null || (c4418tm = c4397t1.b) == null || (atomicBoolean = c4418tm.a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap linkedHashMapA = c4390sm.a();
                linkedHashMapA.put("networkType", Y5.g());
                linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2179);
                String str2 = c4390sm.d;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapA.put("impressionId", str2);
                C4111im c4111im = C4111im.a;
                C4111im.b("AdImpressionSuccessful", linkedHashMapA, EnumC4223mm.SDK);
            }
        }
    }

    public C3923c0(WeakReference weakReference, String str, boolean z) {
        weakReference.getClass();
        str.getClass();
        this.a = weakReference;
        this.b = str;
        this.c = z;
        this.d = new AtomicBoolean(false);
        this.e = String.valueOf(p32.a(C3923c0.class).getSimpleName());
    }
}
