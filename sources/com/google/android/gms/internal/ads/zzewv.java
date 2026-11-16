package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewv implements zzfdt {
    public final String a;
    public final boolean b;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (str != null) {
            Bundle bundleA = zzfmy.a(bundle, "pii");
            bundleA.putString("afai", str);
            bundleA.putBoolean("is_afai_lat", this.b);
        }
    }

    public zzewv(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
