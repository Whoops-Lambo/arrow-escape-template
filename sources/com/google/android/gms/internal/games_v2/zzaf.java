package com.google.android.gms.internal.games_v2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PopupLocationInfoParcelableCreator")
@SafeParcelable.Reserved({1000})
public final class zzaf extends com.google.android.gms.games.internal.zzg {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
    public final Bundle a;
    public final IBinder b;

    public zzaf(zzae zzaeVar) {
        this.a = zzaeVar.a();
        this.b = zzaeVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.a, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzaf(IBinder iBinder, Bundle bundle) {
        this.a = bundle;
        this.b = iBinder;
    }
}
