package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfbp implements zzfdt {
    public final Bundle a;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = zzfmy.a(bundle, C4664b4.i.G);
        bundleA.putBundle("android_mem_info", this.a);
        bundle.putBundle(C4664b4.i.G, bundleA);
    }

    public zzfbp(Bundle bundle) {
        this.a = bundle;
    }
}
