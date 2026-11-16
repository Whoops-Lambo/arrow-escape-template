package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
            case 8:
                zak zakVar = (zak) com.google.android.gms.internal.base.zac.a(parcel, zak.CREATOR);
                com.google.android.gms.internal.base.zac.d(parcel);
                zab(zakVar);
                break;
            case 9:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
