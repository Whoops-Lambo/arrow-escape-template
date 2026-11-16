package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhh extends zzhp {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzhh.class == obj.getClass() && this.a == ((zzhh) obj).a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int iZza = zzhpVar.zza();
        int iC = zzhp.c((byte) -32);
        if (iC != iZza) {
            return iC - zzhpVar.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((zzhh) zzhpVar).a ? 20 : 21);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) -32);
    }

    public zzhh(boolean z) {
        this.a = z;
    }
}
