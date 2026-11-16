package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.nearby.uwb.RangingCapabilities;
import defpackage.b75;
import defpackage.e95;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzou extends zzb implements zzov {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        zzps zzpsVar = (zzps) zzc.a(parcel, zzps.CREATOR);
        zzc.b(parcel);
        b75 b75Var = (b75) this;
        boolean z = zzpsVar.a;
        int[] iArr = zzpsVar.f;
        int length = iArr.length;
        List e95Var = length == 0 ? Collections.EMPTY_LIST : new e95(0, length, iArr);
        Object[] objArr = {1, 2, 3};
        zzsu.a(3, objArr);
        b75Var.a.setResult(new RangingCapabilities(e95Var, zzsq.t(3, objArr)));
        return true;
    }

    public zzou() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
    }
}
