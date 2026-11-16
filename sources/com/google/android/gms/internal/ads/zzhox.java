package com.google.android.gms.internal.ads;

import defpackage.e32;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhox implements zzhfx {
    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }

    static {
        zzhow zzhowVar = new zzhow();
        HashMap map = zzhowVar.a;
        if (map == null) {
            e32.i("cannot call build() twice");
        } else {
            Collections.unmodifiableMap(map);
            zzhowVar.a = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhox) {
            throw null;
        }
        return false;
    }
}
