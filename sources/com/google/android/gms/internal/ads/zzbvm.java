package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.h42;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbvm {
    public static final h42 b = new h42(20);
    public final zzbuy a;

    public final zzbvq a(String str, zzbvf zzbvfVar, zzbve zzbveVar) {
        return new zzbvq(this.a, str, zzbvfVar, zzbveVar);
    }

    public zzbvm(Context context, VersionInfoParcel versionInfoParcel, String str, zzfrw zzfrwVar) {
        this.a = new zzbuy(context, versionInfoParcel, str, zzfrwVar);
    }
}
