package com.google.android.gms.internal.fido;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcy {
    public static int a(zzcf zzcfVar) {
        int iHashCode;
        int i = 0;
        for (Object obj : zzcfVar) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i += iHashCode;
        }
        return i;
    }
}
