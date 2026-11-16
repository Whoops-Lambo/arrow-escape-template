package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.te4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzcx extends zzbm implements zzcy {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(((te4) this).a);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        zzbn.d(parcel);
        ((te4) this).L0(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    public zzcx() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
}
