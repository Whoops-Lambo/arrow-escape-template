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
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "SendPayloadParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmo> CREATOR = new zzmp();
    public final zzkj a;
    public final String[] b;
    public final zzmb c;
    public final boolean d;
    public final int e;
    public final zznv f;
    public final zzk g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmo) {
            zzmo zzmoVar = (zzmo) obj;
            if (Objects.equal(this.a, zzmoVar.a) && Arrays.equals(this.b, zzmoVar.b) && Objects.equal(this.c, zzmoVar.c) && Objects.equal(Boolean.valueOf(this.d), Boolean.valueOf(zzmoVar.d)) && Objects.equal(Integer.valueOf(this.e), Integer.valueOf(zzmoVar.e)) && Objects.equal(this.f, zzmoVar.f) && Objects.equal(this.g, zzmoVar.g)) {
                return true;
            }
        }
        return false;
    }

    public zzmo(IBinder iBinder, String[] strArr, zzmb zzmbVar, boolean z, int i, zznv zznvVar, zzk zzkVar) {
        zzkj zzkhVar;
        if (iBinder == null) {
            zzkhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkhVar = iInterfaceQueryLocalInterface instanceof zzkj ? (zzkj) iInterfaceQueryLocalInterface : new zzkh(iBinder);
        }
        this.a = zzkhVar;
        this.b = strArr;
        this.c = zzmbVar;
        this.d = z;
        this.e = i;
        this.f = zznvVar;
        this.g = zzkVar;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), this.f, this.g);
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
        SafeParcelWriter.writeStringArray(parcel, 2, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzmo() {
        this.e = 0;
    }
}
