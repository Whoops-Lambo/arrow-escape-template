package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "ProvideDiagnosisKeysParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzef extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzef> CREATOR = new zzeg();
    public ArrayList a;
    public IStatusCallback b;
    public ArrayList c;
    public ExposureConfiguration d;
    public String e;
    public zzcv f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzef)) {
            return false;
        }
        zzef zzefVar = (zzef) obj;
        return Objects.equal(this.a, zzefVar.a) && Objects.equal(this.b, zzefVar.b) && Objects.equal(this.c, zzefVar.c) && Objects.equal(this.d, zzefVar.d) && Objects.equal(this.e, zzefVar.e) && Objects.equal(this.f, zzefVar.f);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    private zzef() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.a, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.b.asBinder(), false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        zzcv zzcvVar = this.f;
        if (zzcvVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzcvVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinderAsBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
