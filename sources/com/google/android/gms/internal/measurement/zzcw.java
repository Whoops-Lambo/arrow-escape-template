package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcw extends zzbl implements zzcy {
    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        Parcel parcelR = r(2, z1());
        int i = parcelR.readInt();
        parcelR.recycle();
        return i;
    }

    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void L0(long j, Bundle bundle, String str, String str2) {
        Parcel parcelZ1 = z1();
        parcelZ1.writeString(str);
        parcelZ1.writeString(str2);
        zzbn.b(parcelZ1, bundle);
        parcelZ1.writeLong(j);
        A1(1, parcelZ1);
    }
}
