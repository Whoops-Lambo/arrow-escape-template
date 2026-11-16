package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.uj4;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@ShowFirstParty
public final class zzgag {
    public static zzgbm a(Context context, zzbet zzbetVar, String str, String str2, zzfzx zzfzxVar) {
        zzgbm zzgbmVar;
        uj4 uj4Var = new uj4(context, zzbetVar, str, str2, zzfzxVar);
        try {
            zzgbmVar = (zzgbm) uj4Var.e.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            uj4Var.b(2009, uj4Var.h, e);
            zzgbmVar = null;
        }
        uj4Var.b(3004, uj4Var.h, null);
        if (zzgbmVar != null) {
            if (zzgbmVar.c == 7) {
                zzfzx.e = 3;
            } else {
                zzfzx.e = 2;
            }
        }
        return zzgbmVar == null ? new zzgbm() : zzgbmVar;
    }
}
