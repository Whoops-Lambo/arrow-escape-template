package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfdg implements zzfdt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfmy.e("gmp_app_id", bundle, this.a);
        zzfmy.e("fbs_aiid", bundle, this.b);
        zzfmy.e("fbs_aeid", bundle, this.c);
        zzfmy.e("apm_id_origin", bundle, this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }

    public zzfdg(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }
}
