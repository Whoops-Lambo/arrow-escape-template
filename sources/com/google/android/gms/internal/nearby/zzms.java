package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "StartAdvertisingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzms extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzms> CREATOR = new zzmt();
    public zzkm a;
    public zzjp b;
    public String c;
    public String d;
    public long e;
    public AdvertisingOptions f;
    public zzjv g;
    public byte[] h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzms) {
            zzms zzmsVar = (zzms) obj;
            if (Objects.equal(this.a, zzmsVar.a) && Objects.equal(this.b, zzmsVar.b) && Objects.equal(this.c, zzmsVar.c) && Objects.equal(this.d, zzmsVar.d) && Objects.equal(Long.valueOf(this.e), Long.valueOf(zzmsVar.e)) && Objects.equal(this.f, zzmsVar.f) && Objects.equal(this.g, zzmsVar.g) && Arrays.equals(this.h, zzmsVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)));
    }

    private zzms() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkm zzkmVar = this.a;
        IBinder iBinderAsBinder3 = null;
        if (zzkmVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzkmVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinderAsBinder, false);
        zzjp zzjpVar = this.b;
        if (zzjpVar == null) {
            iBinderAsBinder2 = null;
        } else {
            iBinderAsBinder2 = zzjpVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinderAsBinder2, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeLong(parcel, 5, this.e);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        zzjv zzjvVar = this.g;
        if (zzjvVar != null) {
            iBinderAsBinder3 = zzjvVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 7, iBinderAsBinder3, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
