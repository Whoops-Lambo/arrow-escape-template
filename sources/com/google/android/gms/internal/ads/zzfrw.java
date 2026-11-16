package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import defpackage.ar4;
import defpackage.os0;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfrw implements Runnable {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static Boolean m;
    public final Context a;
    public final VersionInfoParcel b;
    public int e;
    public final zzdyk f;
    public final List g;
    public final zzcol h;
    public final zzfsa c = zzfsd.F();
    public String d = "";
    public boolean i = false;

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (j) {
            try {
                if (m == null) {
                    if (((Boolean) zzbll.b.c()).booleanValue()) {
                        m = Boolean.valueOf(Math.random() < ((Double) zzbll.a.c()).doubleValue());
                    } else {
                        m = Boolean.FALSE;
                    }
                }
                zBooleanValue = m.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void c(zzfrm zzfrmVar) {
        zzcgv.a.submit(new os0(28, this, zzfrmVar));
    }

    public zzfrw(Context context, VersionInfoParcel versionInfoParcel, zzdyk zzdykVar, zzccp zzccpVar, zzcol zzcolVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.f = zzdykVar;
        this.h = zzcolVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ra)).booleanValue()) {
            this.g = com.google.android.gms.ads.internal.util.zzs.zzj();
        } else {
            ar4 ar4Var = zzgzb.b;
            this.g = w.e;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrH;
        if (a()) {
            Object obj = k;
            synchronized (obj) {
                try {
                    if (((zzfsd) this.c.b).E() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfsa zzfsaVar = this.c;
                            bArrH = ((zzfsd) zzfsaVar.m()).h();
                            zzfsaVar.l();
                            ((zzfsd) zzfsaVar.b).H();
                        }
                        zzejv zzejvVar = new zzejv((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.la), 60000, new HashMap(), bArrH, CommonGatewayClient.HEADER_PROTOBUF);
                        Context context = this.a;
                        String str = this.b.afmaVersion;
                        Binder.getCallingUid();
                        new zzejx(context, str, null).zza(zzejvVar);
                    } catch (Exception e) {
                        if ((e instanceof zzefo) && ((zzefo) e).d() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().e("CuiMonitor.sendCuiPing", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
