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
@SafeParcelable.Class(creator = "AcceptConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzfj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfj> CREATOR = new zzfk();
    public zzkj a;
    public final zzjs b;
    public String c;
    public final byte[] d;
    public zzkg e;
    public final int f;
    public final zznv g;
    public final zzk h;

    public zzfj(IBinder iBinder, IBinder iBinder2, String str, byte[] bArr, IBinder iBinder3, int i, zznv zznvVar, zzk zzkVar) {
        zzkj zzkhVar;
        zzjs zzjqVar;
        zzkg zzkeVar = null;
        if (iBinder == null) {
            zzkhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkhVar = iInterfaceQueryLocalInterface instanceof zzkj ? (zzkj) iInterfaceQueryLocalInterface : new zzkh(iBinder);
        }
        if (iBinder2 == null) {
            zzjqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            zzjqVar = iInterfaceQueryLocalInterface2 instanceof zzjs ? (zzjs) iInterfaceQueryLocalInterface2 : new zzjq(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            zzkeVar = iInterfaceQueryLocalInterface3 instanceof zzkg ? (zzkg) iInterfaceQueryLocalInterface3 : new zzke(iBinder3, "com.google.android.gms.nearby.internal.connection.IPayloadListener");
        }
        this.a = zzkhVar;
        this.b = zzjqVar;
        this.c = str;
        this.d = bArr;
        this.e = zzkeVar;
        this.f = i;
        this.g = zznvVar;
        this.h = zzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfj) {
            zzfj zzfjVar = (zzfj) obj;
            if (Objects.equal(this.a, zzfjVar.a) && Objects.equal(this.b, zzfjVar.b) && Objects.equal(this.c, zzfjVar.c) && Arrays.equals(this.d, zzfjVar.d) && Objects.equal(this.e, zzfjVar.e) && Objects.equal(Integer.valueOf(this.f), Integer.valueOf(zzfjVar.f)) && Objects.equal(this.g, zzfjVar.g) && Objects.equal(this.h, zzfjVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Integer.valueOf(this.f), this.g, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkj zzkjVar = this.a;
        IBinder iBinderAsBinder3 = null;
        if (zzkjVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzkjVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinderAsBinder, false);
        zzjs zzjsVar = this.b;
        if (zzjsVar == null) {
            iBinderAsBinder2 = null;
        } else {
            iBinderAsBinder2 = zzjsVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinderAsBinder2, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.d, false);
        zzkg zzkgVar = this.e;
        if (zzkgVar != null) {
            iBinderAsBinder3 = zzkgVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinderAsBinder3, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfj() {
        this.f = 0;
    }
}
