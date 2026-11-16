package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.zzk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "RejectConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmg> CREATOR = new zzmh();
    public final zzkj a;
    public final String b;
    public final int c;
    public final zznv d;
    public final zzk e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmg) {
            zzmg zzmgVar = (zzmg) obj;
            if (Objects.equal(this.a, zzmgVar.a) && Objects.equal(this.b, zzmgVar.b) && Objects.equal(Integer.valueOf(this.c), Integer.valueOf(zzmgVar.c)) && Objects.equal(this.d, zzmgVar.d) && Objects.equal(this.e, zzmgVar.e)) {
                return true;
            }
        }
        return false;
    }

    public zzmg(IBinder iBinder, String str, int i, zznv zznvVar, zzk zzkVar) {
        zzkj zzkhVar;
        if (iBinder == null) {
            zzkhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkhVar = iInterfaceQueryLocalInterface instanceof zzkj ? (zzkj) iInterfaceQueryLocalInterface : new zzkh(iBinder);
        }
        this.a = zzkhVar;
        this.b = str;
        this.c = i;
        this.d = zznvVar;
        this.e = zzkVar;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, Integer.valueOf(this.c), this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkj zzkjVar = this.a;
        if (zzkjVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzkjVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinderAsBinder, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzmg() {
        this.c = 0;
    }
}
