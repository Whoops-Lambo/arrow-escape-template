package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.ironsource.R6;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfei implements zzfdt {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        zzfmy.b(bundle, R6.R0, str, !TextUtils.isEmpty(str));
        int i = this.b;
        zzfmy.c(bundle, com.safedk.android.analytics.brandsafety.m.R, i, i != -2);
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle bundleA = zzfmy.a(bundle, C4664b4.i.G);
        bundle.putBundle(C4664b4.i.G, bundleA);
        Bundle bundleA2 = zzfmy.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f);
        bundleA2.putBoolean("active_network_metered", this.e);
    }

    public zzfei(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }
}
