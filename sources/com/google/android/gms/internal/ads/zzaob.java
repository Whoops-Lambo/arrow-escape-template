package com.google.android.gms.internal.ads;

import defpackage.ip;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaob {
    public static void a(zzaoc zzaocVar, ip ipVar) {
        for (int i = 0; i < zzaocVar.zza(); i++) {
            long jZzb = zzaocVar.zzb(i);
            ArrayList arrayListA = zzaocVar.a(jZzb);
            if (!arrayListA.isEmpty()) {
                if (i == zzaocVar.zza() - 1) {
                    io.p071bidmachine.media3.extractor.ts.y.b();
                    return;
                } else {
                    long jZzb2 = zzaocVar.zzb(i + 1) - zzaocVar.zzb(i);
                    if (jZzb2 > 0) {
                        ipVar.mo82zza(new zzanz(arrayListA, jZzb, jZzb2));
                    }
                }
            }
        }
    }
}
