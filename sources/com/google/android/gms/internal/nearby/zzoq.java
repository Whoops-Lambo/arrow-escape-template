package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import defpackage.a75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzoq extends zzb implements zzor {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ClassLoader classLoader = zzc.a;
        boolean z = parcel.readInt() != 0;
        zzc.b(parcel);
        ((a75) this).a.setResult(Boolean.valueOf(z));
        return true;
    }

    public zzoq() {
        super("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
    }
}
