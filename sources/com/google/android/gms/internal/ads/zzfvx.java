package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfvx {
    public final Context a;
    public final VersionInfoParcel b;
    public final ScheduledExecutorService c;
    public final zzfpz d;
    public final ClientApi e = new ClientApi();
    public final zzfnf f;
    public final Clock g;
    public final zzfui h;
    public final zzfuy i;

    public final zzfvw a(zzfp zzfpVar, zzcb zzcbVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        Context context = this.a;
        VersionInfoParcel versionInfoParcel = this.b;
        if (iOrdinal == 1) {
            return new zzfuv(this.e, context, versionInfoParcel.clientJarVersion, this.f, zzfpVar, zzcbVar, this.c, this.d, b(), this.g);
        }
        if (iOrdinal == 2) {
            return new zzfwb(this.e, context, versionInfoParcel.clientJarVersion, this.f, zzfpVar, zzcbVar, this.c, this.d, b(), this.g);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzfuq(this.e, context, versionInfoParcel.clientJarVersion, this.f, zzfpVar, zzcbVar, this.c, this.d, b(), this.g);
    }

    public final zzfur b() {
        return new zzfur(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.J)).longValue(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.K)).longValue(), this.g, this.i);
    }

    public zzfvx(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfpz zzfpzVar, zzfnf zzfnfVar, Clock clock, zzfui zzfuiVar, zzfuy zzfuyVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = scheduledExecutorService;
        this.d = zzfpzVar;
        this.g = clock;
        this.f = zzfnfVar;
        this.h = zzfuiVar;
        this.i = zzfuyVar;
    }
}
