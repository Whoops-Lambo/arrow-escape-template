package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzze {
    public static /* synthetic */ boolean a(int i, zzyc zzycVar, StringBuilder sb) {
        if (i - 1 != 0 || zzycVar == zzyc.a) {
            return false;
        }
        sb.append(zzycVar.a());
        sb.append('.');
        sb.append(zzycVar.b());
        sb.append(':');
        sb.append(zzycVar.c());
        return true;
    }
}
