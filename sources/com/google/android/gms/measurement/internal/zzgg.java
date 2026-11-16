package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import defpackage.r25;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzgg extends zzbm implements zzgh {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) zzbn.a(parcel, zzoq.CREATOR);
        zzbn.d(parcel);
        ((r25) this).A3(zzoqVar);
        return true;
    }

    public zzgg() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }
}
