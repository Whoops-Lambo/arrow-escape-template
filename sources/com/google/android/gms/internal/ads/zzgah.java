package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.vj4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@ShowFirstParty
public final class zzgah {
    public final Context a;
    public final Looper b;

    public zzgah(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(String str) {
        zzgas zzgasVarE = zzgau.E();
        Context context = this.a;
        String packageName = context.getPackageName();
        zzgasVarE.l();
        ((zzgau) zzgasVarE.b).F(packageName);
        zzgasVarE.l();
        ((zzgau) zzgasVarE.b).H(2);
        zzgaq zzgaqVarE = zzgar.E();
        zzgaqVarE.l();
        ((zzgar) zzgaqVarE.b).G(str);
        zzgaqVarE.l();
        ((zzgar) zzgaqVarE.b).F();
        zzgasVarE.l();
        ((zzgau) zzgasVarE.b).G((zzgar) zzgaqVarE.m());
        vj4 vj4Var = new vj4(context, this.b, (zzgau) zzgasVarE.m());
        synchronized (vj4Var.c) {
            try {
                if (!vj4Var.d) {
                    vj4Var.d = true;
                    vj4Var.a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
