package com.google.android.gms.internal.ads;

import defpackage.zm;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzaag implements zzabk {
    public final zzbg a;
    public final int b;
    public final int[] c;
    public final zzv[] d;
    public int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaag zzaagVar = (zzaag) obj;
            if (this.a.equals(zzaagVar.a) && Arrays.equals(this.c, zzaagVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final int zzg(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final zzbg zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final zzv zzb(int i) {
        return this.d[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final zzv zzc() {
        return this.d[0];
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final int zze() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final int zzf(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zzh() {
        return this.c[0];
    }

    public zzaag(zzbg zzbgVar, int[] iArr, zm zmVar) {
        boolean z;
        zzv[] zzvVarArr;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.f(z);
        zzbgVar.getClass();
        zzv[] zzvVarArr2 = zzbgVar.d;
        this.a = zzbgVar;
        this.b = length;
        this.d = new zzv[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            zzvVarArr = this.d;
            if (i >= length2) {
                break;
            }
            zzvVarArr[i] = zzvVarArr2[iArr[i]];
            i++;
        }
        zmVar.getClass();
        Arrays.sort(zzvVarArr, zmVar);
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr2 = this.c;
            zzv zzvVar = this.d[i2];
            int i3 = 0;
            while (true) {
                if (i3 < zzvVarArr2.length) {
                    if (zzvVar == zzvVarArr2[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            iArr2[i2] = i3;
        }
    }
}
