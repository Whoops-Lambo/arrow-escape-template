package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zznv {
    public static final List zza(Object obj, long j) {
        int i;
        zznk zznkVar = (zznk) zzps.zzf(obj, j);
        if (!zznkVar.zzc()) {
            int size = zznkVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zznk zznkVarZzd = zznkVar.zzd(i);
            zzps.zzs(obj, j, zznkVarZzd);
            return zznkVarZzd;
        }
        return zznkVar;
    }
}
