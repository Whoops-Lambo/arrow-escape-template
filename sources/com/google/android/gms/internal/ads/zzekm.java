package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ku4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzekm implements zzdfq, zzdef {
    public static final Object c = new Object();
    public static int d;
    public final com.google.android.gms.ads.internal.util.zzg a;
    public final zzekw b;

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void m(com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        a(true);
    }

    public final void a(boolean z) {
        int i;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.u7)).booleanValue() && !this.a.zzx()) {
            Object obj = c;
            synchronized (obj) {
                i = d;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.v7)).intValue();
            }
            if (i < iIntValue) {
                zzekw zzekwVar = this.b;
                zzfqc zzfqcVarA = zzekwVar.d.a(new Bundle());
                zzfqcVarA.addListener(new ku4(0, zzfqcVarA, new r(zzekwVar, z)), zzcgv.h);
                synchronized (obj) {
                    d++;
                }
            }
        }
    }

    public zzekm(zzekw zzekwVar, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.b = zzekwVar;
        this.a = zzjVar;
    }
}
