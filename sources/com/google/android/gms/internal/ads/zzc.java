package com.google.android.gms.internal.ads;

import defpackage.n30;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzc {
    public static final zzc b = new zzc(new zza[0]);
    public static final zza c;
    public final zza[] a;

    static {
        zza zzaVar = new zza(-1, new int[0], new zzak[0], new long[0], new String[0], new zzb[0]);
        int[] iArr = zzaVar.d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = zzaVar.e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        zzak[] zzakVarArr = (zzak[]) Arrays.copyOf(zzaVar.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(zzaVar.f, 0);
        zzb[] zzbVarArr = zzaVar.g;
        c = new zza(0, iArrCopyOf, zzakVarArr, jArrCopyOf, strArr, (zzb[]) Arrays.copyOf(zzbVarArr, Math.max(0, zzbVarArr.length)));
        String str = zzfq.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final zza a(int i) {
        return i < 0 ? c : this.a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzc.class == obj.getClass() && Arrays.equals(this.a, ((zzc) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 961;
    }

    public final String toString() {
        return n30.y("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public zzc(zza[] zzaVarArr) {
        this.a = zzaVarArr;
    }
}
