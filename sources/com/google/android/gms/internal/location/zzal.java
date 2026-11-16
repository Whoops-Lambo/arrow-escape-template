package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import defpackage.bc5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzal extends zza implements zzam {
    @Override // com.google.android.gms.internal.location.zzam
    public final Location zzm() {
        Parcel parcelZ1 = z1(7, r());
        Location location = (Location) zzc.a(parcelZ1, Location.CREATOR);
        parcelZ1.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void E(zzbc zzbcVar) {
        Parcel parcelR = r();
        int i = zzc.a;
        parcelR.writeInt(1);
        zzbcVar.writeToParcel(parcelR, 0);
        A1(59, parcelR);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void E1(boolean z) {
        Parcel parcelR = r();
        int i = zzc.a;
        parcelR.writeInt(z ? 1 : 0);
        A1(12, parcelR);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final LocationAvailability W2(String str) {
        Parcel parcelR = r();
        parcelR.writeString(str);
        Parcel parcelZ1 = z1(34, parcelR);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.a(parcelZ1, LocationAvailability.CREATOR);
        parcelZ1.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void o2(bc5 bc5Var) {
        Parcel parcelR = r();
        int i = zzc.a;
        parcelR.writeStrongBinder(bc5Var);
        A1(67, parcelR);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void p2(Location location) {
        Parcel parcelR = r();
        int i = zzc.a;
        if (location == null) {
            parcelR.writeInt(0);
        } else {
            parcelR.writeInt(1);
            location.writeToParcel(parcelR, 0);
        }
        A1(13, parcelR);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final Location zzn(String str) {
        Parcel parcelR = r();
        parcelR.writeString(str);
        Parcel parcelZ1 = z1(80, parcelR);
        Location location = (Location) zzc.a(parcelZ1, Location.CREATOR);
        parcelZ1.recycle();
        return location;
    }
}
