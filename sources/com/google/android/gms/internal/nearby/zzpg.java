package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import defpackage.d75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzpg extends zzb implements zzph {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzqv zzqvVar = (zzqv) zzc.a(parcel, zzqv.CREATOR);
        zzc.b(parcel);
        new UwbComplexChannel.Builder();
        ((d75) this).a.setResult(new UwbComplexChannel(zzqvVar.a, zzqvVar.b));
        return true;
    }

    public zzpg() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener");
    }
}
