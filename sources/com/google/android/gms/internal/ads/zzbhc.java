package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbhc implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzbgs zzbgsVar = (zzbgs) obj;
        zzbgs zzbgsVar2 = (zzbgs) obj2;
        float f = zzbgsVar.b;
        float f2 = zzbgsVar2.b;
        if (f < f2) {
            return -1;
        }
        if (f > f2) {
            return 1;
        }
        float f3 = zzbgsVar.a;
        float f4 = zzbgsVar2.a;
        if (f3 < f4) {
            return -1;
        }
        if (f3 > f4) {
            return 1;
        }
        float f5 = (zzbgsVar.d - f) * (zzbgsVar.c - f3);
        float f6 = (zzbgsVar2.d - f2) * (zzbgsVar2.c - f4);
        if (f5 > f6) {
            return -1;
        }
        return f5 < f6 ? 1 : 0;
    }
}
