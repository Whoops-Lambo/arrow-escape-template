package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "GetExposureInformationParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzbm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbm> CREATOR = new zzbn();
    public zzdb a;
    public String b;
    public zzdc c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbm) {
            zzbm zzbmVar = (zzbm) obj;
            if (Objects.equal(this.c, zzbmVar.c) && Objects.equal(this.a, zzbmVar.a) && Objects.equal(this.b, zzbmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c, this.a, this.b);
    }

    private zzbm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzdc zzdcVar = this.c;
        if (zzdcVar == null) {
            iBinder = null;
        } else {
            iBinder = zzdcVar.a;
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.a.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
