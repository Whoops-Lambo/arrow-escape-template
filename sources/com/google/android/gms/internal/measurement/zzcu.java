package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import defpackage.r94;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzcu extends zzbm implements zzcv {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ((r94) this).zze();
        return true;
    }

    public zzcu() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }
}
