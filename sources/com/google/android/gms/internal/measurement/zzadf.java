package com.google.android.gms.internal.measurement;

import defpackage.em3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzadf {
    public static volatile zzadf b;
    public static final zzadf c = new zzadf(0);
    public final Map a;

    public static zzadf a() {
        zzadf zzadfVar = b;
        if (zzadfVar != null) {
            return zzadfVar;
        }
        synchronized (zzadf.class) {
            try {
                zzadf zzadfVar2 = b;
                if (zzadfVar2 != null) {
                    return zzadfVar2;
                }
                int i = em3.a;
                zzadf zzadfVarB = zzadn.b();
                b = zzadfVarB;
                return zzadfVarB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzadf() {
        this.a = new HashMap();
    }

    public zzadf(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
