package com.google.android.gms.internal.location;

import android.os.Parcel;
import defpackage.bc5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzah extends zzb implements zzai {
    @Override // com.google.android.gms.internal.location.zzb
    public final boolean r(int i, Parcel parcel) {
        if (i != 1) {
            return i == 2;
        }
        ((bc5) this).a.setResult(((zzaa) zzc.a(parcel, zzaa.CREATOR)).a);
        return true;
    }

    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }
}
