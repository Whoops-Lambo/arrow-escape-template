package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbxi extends zzbwo {
    public final MediationInterscrollerAd a;

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final IObjectWrapper zze() {
        return new ObjectWrapper(this.a.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzf() {
        return this.a.shouldDelegateInterscrollerEffect();
    }

    public zzbxi(MediationInterscrollerAd mediationInterscrollerAd) {
        this.a = mediationInterscrollerAd;
    }
}
