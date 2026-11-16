package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.fu4;
import defpackage.h64;
import defpackage.o24;
import defpackage.ut4;
import defpackage.vt4;
import defpackage.xm4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcon implements zzbbj {
    public final Context a;
    public final zzgfs b;

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.b.c(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        Context context = this.a;
        float fZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        long j = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j, 0, fZzE, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgfs zzgfsVar = this.b;
        zzgfsVar.c(motionEventObtain);
        motionEventObtain.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float fZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j, 2, fZzE2, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgfsVar.c(motionEventObtain2);
        motionEventObtain2.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float fZzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j, 1, fZzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgfsVar.c(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.b.b(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzg(Context context, String str, View view) {
        return this.b.b(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzgfs zzgfsVar = this.b;
        List listAsList = Arrays.asList(stackTraceElementArr);
        zzgsi zzgsiVar = zzgfsVar.a.c.b;
        synchronized (zzgsiVar) {
            ArrayList arrayList = zzgsiVar.a;
            arrayList.clear();
            arrayList.addAll(listAsList);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzj(Context context, View view, Activity activity) {
        String string;
        zzgfq zzgfqVar = this.b.a;
        zzghg zzghgVar = zzgfqVar.e;
        zzgsw zzgswVar = zzgfqVar.d;
        zzgsu zzgsuVarA = zzgswVar.a(4);
        boolean z = zzgfqVar.l;
        zzgia zzgiaVar = zzgfqVar.a;
        ut4 ut4VarH = zzheh.h(z ? zzheh.l(zzgiaVar.a()) : zzgiaVar.a(), new h64(zzgfqVar, context, view, activity, 5), fu4.a);
        try {
            try {
                try {
                    try {
                        zzgsuVarA.a();
                        string = (String) ut4VarH.get(zzgfqVar.f, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        zzgsuVarA.b(e);
                        string = "";
                    } catch (ExecutionException e2) {
                        Throwable th = e2;
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            th = cause;
                        }
                        zzgsuVarA.b(th);
                        string = Integer.toString(3);
                    }
                } catch (Throwable th2) {
                    zzgsuVarA.b(th2);
                    throw th2;
                }
            } catch (TimeoutException unused) {
                if (z) {
                    ut4VarH.cancel(false);
                }
                zzgswVar.b(57);
                string = Integer.toString(17);
            }
            zzgsuVarA.c();
            zzghgVar.zzb();
            return string;
        } catch (Throwable th3) {
            zzgsuVarA.c();
            zzghgVar.zzb();
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzk(Context context) {
        return this.b.a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbbj
    public final String zzl(Context context) {
        return this.b.a(context);
    }

    public zzcon(Context context, VersionInfoParcel versionInfoParcel) {
        int i;
        zzgfs zzgfsVar;
        this.a = context;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.L3)).intValue();
        int i2 = 4;
        if (iIntValue != 1) {
            if (iIntValue != 3) {
                i = 3;
            } else {
                i = 4;
            }
        } else {
            i = 2;
        }
        zzggr zzggrVarI = zzggs.I();
        float fFloatValue = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.S3)).floatValue();
        zzggrVarI.l();
        ((zzggs) zzggrVarI.b).K(fFloatValue);
        zzggs zzggsVar = (zzggs) zzggrVarI.m();
        zzggt zzggtVarL = zzggu.L();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.T3)).booleanValue();
        zzggtVarL.l();
        ((zzggu) zzggtVarL.b).N(zBooleanValue);
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.V3)).longValue();
        zzggtVarL.l();
        ((zzggu) zzggtVarL.b).O(jLongValue);
        zzggu zzgguVar = (zzggu) zzggtVarL.m();
        zzgfv zzgfvVarV0 = zzgfx.v0();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).T(i);
        int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.M3)).intValue();
        if (iIntValue2 != 1) {
            if (iIntValue2 != 3) {
                i2 = 3;
            }
        } else {
            i2 = 2;
        }
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).U(i2);
        String str = versionInfoParcel.afmaVersion;
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).H(str);
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).V(3);
        boolean zBooleanValue2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.s3)).booleanValue();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).E(zBooleanValue2);
        boolean zBooleanValue3 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.W3)).booleanValue();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).F(zBooleanValue3);
        boolean zBooleanValue4 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.X3)).booleanValue();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).G(zBooleanValue4);
        boolean zBooleanValue5 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Y3)).booleanValue();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).P(zBooleanValue5);
        boolean z = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.I3)).intValue() == -1;
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).N(z);
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.K3)).intValue();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).M(jIntValue);
        long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.U3)).longValue();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).K(jLongValue2);
        long jIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.J3)).intValue();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).J(jIntValue2);
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).I(zzggsVar);
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).L(zzgguVar);
        boolean zBooleanValue6 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.B4)).booleanValue();
        zzgfvVarV0.l();
        ((zzgfx) zzgfvVarV0.b).O(zBooleanValue6);
        zzgfx zzgfxVar = (zzgfx) zzgfvVarV0.m();
        o24 o24Var = zzcgv.a;
        synchronized (zzgfs.b) {
            try {
                if (zzgfs.c == null) {
                    zzgfs.c = new zzgfs(context, o24Var, zzgfxVar);
                }
                zzgfsVar = zzgfs.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = zzgfsVar;
        zzgia zzgiaVar = zzgfsVar.a.a;
        synchronized (zzgiaVar) {
            try {
                if (zzgiaVar.e != null) {
                    return;
                }
                Set set = (Set) zzgiaVar.b.zzb();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzghy) it.next()).zza());
                }
                zzgsw zzgswVar = (zzgsw) zzgiaVar.d.zzb();
                vt4 vt4VarI = zzheh.i(zzheh.j(arrayList), xm4.y, zzgiaVar.c);
                zzgswVar.e(2, vt4VarI);
                zzgiaVar.e = vt4VarI;
                Iterator it2 = ((Set) zzgiaVar.a.zzb()).iterator();
                while (it2.hasNext()) {
                    ((zzghy) it2.next()).zza();
                }
                if (zzgiaVar.e != null) {
                } else {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
