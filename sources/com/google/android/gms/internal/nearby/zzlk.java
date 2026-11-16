package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.zzk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "OnPayloadTransferUpdateParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlk> CREATOR = new zzll();
    public final String a;
    public final PayloadTransferUpdate b;
    public final int c;
    public final zznv d;
    public final zzk e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlk) {
            zzlk zzlkVar = (zzlk) obj;
            if (Objects.equal(this.a, zzlkVar.a) && Objects.equal(this.b, zzlkVar.b) && Objects.equal(Integer.valueOf(this.c), Integer.valueOf(zzlkVar.c)) && Objects.equal(this.d, zzlkVar.d) && Objects.equal(this.e, zzlkVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, Integer.valueOf(this.c), this.d, this.e);
    }

    public zzlk(String str, PayloadTransferUpdate payloadTransferUpdate, int i, zznv zznvVar, zzk zzkVar) {
        this.a = str;
        this.b = payloadTransferUpdate;
        this.c = i;
        this.d = zznvVar;
        this.e = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzlk() {
        this.c = 0;
    }
}
