package com.google.android.gms.internal.ads;

import defpackage.dy4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzigm {
    public static volatile zzigm b;
    public static final zzigm c = new zzigm(0);
    public final Map a;

    public static zzigm a() {
        zzigm zzigmVar = b;
        if (zzigmVar != null) {
            return zzigmVar;
        }
        synchronized (zzigm.class) {
            try {
                zzigm zzigmVar2 = b;
                if (zzigmVar2 != null) {
                    return zzigmVar2;
                }
                int i = dy4.a;
                zzigm zzigmVarB = zzigu.b();
                b = zzigmVarB;
                return zzigmVarB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzigm() {
        this.a = new HashMap();
    }

    public zzigm(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
