package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfdc implements zzfdt {
    public final String a;
    public final Bundle b;
    public final String c;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.a);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.s5)).booleanValue()) {
            String str = this.c;
            if (!str.isEmpty()) {
                bundle.putString("cld_status", str);
            }
        }
        Bundle bundle2 = this.b;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", bundle2);
    }

    public zzfdc(String str, Bundle bundle, String str2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }
}
