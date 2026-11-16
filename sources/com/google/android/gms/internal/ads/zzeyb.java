package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyb implements zzfdt {
    public final double a;
    public final boolean b;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = zzfmy.a(bundle, C4664b4.i.G);
        bundle.putBundle(C4664b4.i.G, bundleA);
        Bundle bundleA2 = zzfmy.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.b);
        bundleA2.putDouble("battery_level", this.a);
    }

    public zzeyb(double d, boolean z) {
        this.a = d;
        this.b = z;
    }
}
