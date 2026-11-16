package com.google.android.gms.auth.account;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            com.google.android.gms.internal.auth.zzc.b(parcel);
            zzb();
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i2 = com.google.android.gms.internal.auth.zzc.a;
        parcel.readInt();
        com.google.android.gms.internal.auth.zzc.b(parcel);
        zzc();
        return true;
    }

    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }
}
