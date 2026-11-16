package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzglj extends zzglw {
    public static volatile Long f;
    public static final Object g = new Object();

    @Override // com.google.android.gms.internal.ads.zzglw
    public final void a(Method method, zzayj zzayjVar) {
        if (f == null) {
            synchronized (g) {
                try {
                    if (f == null) {
                        Long l = (Long) method.invoke("", null);
                        if (l == null) {
                            throw null;
                        }
                        f = l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (zzayjVar) {
            try {
                if (f != null) {
                    long jLongValue = f.longValue();
                    zzayjVar.l();
                    ((zzazk) zzayjVar.b).b1(jLongValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
