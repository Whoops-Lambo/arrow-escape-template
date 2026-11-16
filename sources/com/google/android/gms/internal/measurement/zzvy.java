package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.Trace;
import defpackage.e42;
import defpackage.e75;
import defpackage.ep0;
import defpackage.gl0;
import defpackage.ia5;
import defpackage.q31;
import defpackage.sa5;
import defpackage.za5;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzvy {
    public static final AtomicReference a;
    public static final zzrg b;
    public static final WeakHashMap c;
    public static final gl0 d;

    static {
        q31.x(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        a = new AtomicReference(e42.j);
        b = new zzrg();
        c = new WeakHashMap();
        d = new gl0(16);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static zzwq c() {
        return (zzwq) d.get();
    }

    public static zzws a() {
        zzwq zzwqVarC = c();
        zzws zzwsVar = zzwqVarC.b;
        if (zzwsVar != null && zzwsVar != zzwg.g) {
            return zzwsVar;
        }
        zzvr zzvrVar = zzwd.g;
        UUID uuidB = sa5.c.b();
        String strB = ia5.b(uuidB);
        q31 q31Var = (q31) a.get();
        if (!q31Var.isEmpty()) {
            q31Var.forEach(new za5(0));
        }
        return new zzwd(uuidB, strB, zzwd.g, zzwqVarC);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    public static zzws b(zzwq zzwqVar, zzws zzwsVar) {
        boolean zA;
        zzwqVar.getClass();
        zzws zzwsVar2 = zzwqVar.b;
        if (zzwsVar2 != zzwsVar) {
            if (zzwsVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zA = Trace.isEnabled();
                } else {
                    zA = e75.a.a(b);
                }
                zzwqVar.a = zA;
            }
            if (zzwqVar.a) {
                if (zzwsVar2 != null) {
                    if (zzwsVar != null) {
                        if (zzwsVar2.zzb() == zzwsVar && zzwsVar2.zza() == Thread.currentThread()) {
                            Trace.endSection();
                        } else if (zzwsVar2 == zzwsVar.zzb() && zzwsVar.zza() == Thread.currentThread()) {
                            ep0.T(zzwsVar);
                        }
                    }
                    ep0.S(zzwsVar2);
                    if (zzwsVar != null) {
                        ep0.R(zzwsVar);
                    }
                } else if (zzwsVar != null) {
                    ep0.R(zzwsVar);
                }
            }
            if (zzwsVar2 != zzwsVar) {
                zzwqVar.b = zzwsVar;
                return zzwsVar2;
            }
        }
        return zzwsVar;
    }
}
