package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzgbt {
    public final byte[] a;
    public int b;
    public int c;
    public final /* synthetic */ zzgbu d;

    public final synchronized void a() {
        try {
            zzgbu zzgbuVar = this.d;
            if (zzgbuVar.b) {
                zzgbx zzgbxVar = zzgbuVar.a;
                zzgbxVar.m2(this.a);
                zzgbxVar.zzh(this.b);
                zzgbxVar.zzi(this.c);
                zzgbxVar.L2();
                zzgbxVar.zze();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public /* synthetic */ zzgbt(zzgbu zzgbuVar, byte[] bArr) {
        this.d = zzgbuVar;
        this.a = bArr;
    }
}
