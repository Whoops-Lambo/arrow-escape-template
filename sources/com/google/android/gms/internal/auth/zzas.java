package com.google.android.gms.internal.auth;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzas extends zzb implements zzat {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                zzc.b(parcel);
                defpackage.d.c();
                break;
            case 2:
                zzc.b(parcel);
                defpackage.d.c();
                break;
            case 3:
                zzc.b(parcel);
                defpackage.d.c();
                break;
            case 4:
                defpackage.d.c();
                break;
            case 5:
                zzc.b(parcel);
                defpackage.d.c();
                break;
            case 6:
                parcel.createByteArray();
                zzc.b(parcel);
                defpackage.d.c();
                break;
            case 7:
                zzc.b(parcel);
                defpackage.d.c();
                break;
        }
        return false;
    }

    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }
}
