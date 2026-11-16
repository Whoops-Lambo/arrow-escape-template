package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.graphics.Insets;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.services.UnityAdsConstants;
import defpackage.wm4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewg implements zzfdv {
    public final zzeyj a;
    public final zzfmj b;
    public final Context c;
    public final zzcgh d;

    public static final int a(float f, int i) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    public static final Insets b(Insets insets, float f) {
        return f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Insets.NONE : Insets.of((int) Math.ceil(insets.left / f), (int) Math.ceil(insets.top / f), (int) Math.ceil(insets.right / f), (int) Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return zzheh.i(this.a.zza(), new wm4(this, 4), zzcgv.h);
    }

    public zzewg(zzeyj zzeyjVar, zzfmj zzfmjVar, Context context, zzcgh zzcghVar) {
        this.a = zzeyjVar;
        this.b = zzfmjVar;
        this.c = context;
        this.d = zzcghVar;
    }
}
