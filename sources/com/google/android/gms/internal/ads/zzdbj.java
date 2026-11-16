package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.b04;
import defpackage.l71;
import defpackage.nu4;
import defpackage.o24;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdbj implements zzdhi, zzdmv {
    public zzccd a;
    public final Context c;
    public final zzfrw d;
    public final VersionInfoParcel e;
    public final Executor f;
    public boolean g = false;
    public boolean h = false;
    public final AtomicBoolean b = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    public final void a() {
        zzccd zzccdVar;
        ListenableFuture listenableFutureA;
        int i;
        zzbvm zzbvmVarB;
        boolean andSet = this.b.getAndSet(true);
        Executor executor = this.f;
        int i2 = 3;
        if (!andSet) {
            if (((Boolean) zzbls.o.c()).booleanValue()) {
                i = 2;
            } else if (((Boolean) zzbls.p.c()).booleanValue()) {
                i = 3;
            } else {
                if (((Boolean) zzbls.n.c()).booleanValue()) {
                    try {
                        String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().g().zzi().e).optString("local_flag_write");
                        if (TextUtils.equals(strOptString, "client")) {
                            i = 2;
                        } else if (TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                            i = 3;
                        }
                    } catch (JSONException unused) {
                    }
                }
                i = 1;
            }
            int i3 = i - 1;
            zzfrw zzfrwVar = this.d;
            Context context = this.c;
            if (i3 == 1) {
                zzbvmVarB = com.google.android.gms.ads.internal.zzt.zzr().b(context, VersionInfoParcel.forPackage(), zzfrwVar);
            } else if (i3 == 2) {
                zzbvmVarB = com.google.android.gms.ads.internal.zzt.zzr().a(context, VersionInfoParcel.forPackage(), zzfrwVar);
            }
            l71 l71Var = zzbvj.a;
            this.a = new zzccd(context, zzbvmVarB.a("google.afma.sdkConstants.getSdkConstants", l71Var, l71Var), this.e, executor);
            this.g = true;
        }
        if (this.g && (zzccdVar = this.a) != null) {
            if (!((Boolean) zzbls.a.c()).booleanValue()) {
                listenableFutureA = zzccdVar.a();
            } else if (zzccdVar.f.compareAndSet(false, true)) {
                ListenableFuture listenableFutureA2 = zzccdVar.a();
                listenableFutureA2.addListener(new b04(zzccdVar, i2), zzcgv.h);
                listenableFutureA = listenableFutureA2;
            } else {
                listenableFutureA = nu4.b;
            }
            if (!this.h && ((Boolean) zzblk.i.c()).booleanValue()) {
                listenableFutureA.addListener(new b04(this, 19), executor);
            }
            zzcgy.a(listenableFutureA, "persistFlagsClient", zzcgv.h);
        }
    }

    public zzdbj(Context context, zzfrw zzfrwVar, VersionInfoParcel versionInfoParcel, o24 o24Var) {
        this.c = context;
        this.d = zzfrwVar;
        this.e = versionInfoParcel;
        this.f = o24Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zzd(zzbc zzbcVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zze(String str) {
        a();
    }
}
