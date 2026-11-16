package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.uf0;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdfw extends zzdka implements zzbpi {
    public final Bundle b;

    @Override // com.google.android.gms.internal.ads.zzbpi
    public final synchronized void n(Bundle bundle, String str) {
        this.b.putAll(bundle);
        k0(uf0.q);
    }

    public zzdfw(Set set) {
        super(set);
        this.b = new Bundle();
    }
}
