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
@SafeParcelable.Class(creator = "GetExposureSummaryParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    public zzdf a;
    public String b;
    public zzdg c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbq) {
            zzbq zzbqVar = (zzbq) obj;
            if (Objects.equal(this.c, zzbqVar.c) && Objects.equal(this.a, zzbqVar.a) && Objects.equal(this.b, zzbqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c, this.a, this.b);
    }

    private zzbq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzdg zzdgVar = this.c;
        if (zzdgVar == null) {
            iBinder = null;
        } else {
            iBinder = zzdgVar.a;
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.a.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
