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
@SafeParcelable.Class(creator = "IsEnabledParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeb> CREATOR = new zzec();
    public zzco a;
    public zzcp b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeb) {
            zzeb zzebVar = (zzeb) obj;
            if (Objects.equal(this.b, zzebVar.b) && Objects.equal(this.a, zzebVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.a);
    }

    private zzeb() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzcp zzcpVar = this.b;
        if (zzcpVar == null) {
            iBinder = null;
        } else {
            iBinder = zzcpVar.a;
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.a.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
