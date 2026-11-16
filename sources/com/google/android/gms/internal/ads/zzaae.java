package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaae extends zzaag {
    public static void a(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzgyy zzgyyVar = (zzgyy) arrayList.get(i2);
            if (zzgyyVar != null) {
                zzgyyVar.c(new zzaac(j, jArr[i2]));
            }
        }
    }
}
