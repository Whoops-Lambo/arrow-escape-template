package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzoq implements zzbl {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public HashMap a = new HashMap();
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }

    static {
        zza zzaVar = new zza();
        HashMap map = zzaVar.a;
        if (map == null) {
            e32.i("cannot call build() twice");
        } else {
            Collections.unmodifiableMap(map);
            zzaVar.a = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzoq) {
            throw null;
        }
        return false;
    }
}
