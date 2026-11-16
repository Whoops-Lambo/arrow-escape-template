package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.nearby.uwb.UwbAddress;
import defpackage.c75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzpd extends zzb implements zzpe {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzqq zzqqVar = (zzqq) zzc.a(parcel, zzqq.CREATOR);
        zzc.b(parcel);
        ((c75) this).a.setResult(new UwbAddress(zzqqVar.a));
        return true;
    }

    public zzpd() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
    }
}
