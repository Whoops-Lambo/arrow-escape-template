package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import defpackage.q05;
import defpackage.v05;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzkn extends zzbm implements zzko {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        zzbn.d(parcel);
        v05 v05Var = (v05) this;
        v05Var.a.notifyListener(new q05(v05Var, bArrCreateByteArray));
        return true;
    }

    public zzkn() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }
}
