package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "StartDiscoveryParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmw> CREATOR = new zzmx();
    public zzkj a;
    public String b;
    public long c;
    public DiscoveryOptions d;
    public zzkc e;
    public zzjz f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmw) {
            zzmw zzmwVar = (zzmw) obj;
            if (Objects.equal(this.a, zzmwVar.a) && Objects.equal(this.f, zzmwVar.f) && Objects.equal(this.b, zzmwVar.b) && Objects.equal(Long.valueOf(this.c), Long.valueOf(zzmwVar.c)) && Objects.equal(this.d, zzmwVar.d) && Objects.equal(this.e, zzmwVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.f, this.b, Long.valueOf(this.c), this.d, this.e);
    }

    private zzmw() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        IBinder iBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkj zzkjVar = this.a;
        IBinder iBinderAsBinder2 = null;
        if (zzkjVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzkjVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinderAsBinder, false);
        zzjz zzjzVar = this.f;
        if (zzjzVar == null) {
            iBinder = null;
        } else {
            iBinder = zzjzVar.a;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeLong(parcel, 4, this.c);
        SafeParcelWriter.writeParcelable(parcel, 5, this.d, i, false);
        zzkc zzkcVar = this.e;
        if (zzkcVar != null) {
            iBinderAsBinder2 = zzkcVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinderAsBinder2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
