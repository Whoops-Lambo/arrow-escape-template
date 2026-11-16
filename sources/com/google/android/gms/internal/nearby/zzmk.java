package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.zzk;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "SendConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmk> CREATOR = new zzml();
    public zzkj a;
    public final zzjs b;
    public final zzjy c;
    public String d;
    public String e;
    public final byte[] f;
    public zzjv g;
    public byte[] h;
    public ConnectionOptions i;
    public final int j;
    public final zznv k;
    public final zzk l;
    public final byte[] m;
    public final String n;

    public zzmk(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, String str, String str2, byte[] bArr, IBinder iBinder4, byte[] bArr2, ConnectionOptions connectionOptions, int i, zznv zznvVar, zzk zzkVar, byte[] bArr3, String str3) {
        zzkj zzkhVar;
        zzjs zzjqVar;
        zzjy zzjwVar;
        zzjv zzjtVar = null;
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
        if (iBinder3 == null) {
            zzjwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            zzjwVar = iInterfaceQueryLocalInterface3 instanceof zzjy ? (zzjy) iInterfaceQueryLocalInterface3 : new zzjw(iBinder3, "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
        }
        if (iBinder4 != null) {
            IInterface iInterfaceQueryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zzjtVar = iInterfaceQueryLocalInterface4 instanceof zzjv ? (zzjv) iInterfaceQueryLocalInterface4 : new zzjt(iBinder4);
        }
        this.a = zzkhVar;
        this.b = zzjqVar;
        this.c = zzjwVar;
        this.d = str;
        this.e = str2;
        this.f = bArr;
        this.g = zzjtVar;
        this.h = bArr2;
        this.i = connectionOptions;
        this.j = i;
        this.k = zznvVar;
        this.l = zzkVar;
        this.m = bArr3;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmk) {
            zzmk zzmkVar = (zzmk) obj;
            if (Objects.equal(this.a, zzmkVar.a) && Objects.equal(this.b, zzmkVar.b) && Objects.equal(this.c, zzmkVar.c) && Objects.equal(this.d, zzmkVar.d) && Objects.equal(this.e, zzmkVar.e) && Arrays.equals(this.f, zzmkVar.f) && Objects.equal(this.g, zzmkVar.g) && Arrays.equals(this.h, zzmkVar.h) && Objects.equal(this.i, zzmkVar.i) && Objects.equal(Integer.valueOf(this.j), Integer.valueOf(zzmkVar.j)) && Objects.equal(this.k, zzmkVar.k) && Objects.equal(this.l, zzmkVar.l) && Arrays.equals(this.m, zzmkVar.m) && Objects.equal(this.n, zzmkVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), this.g, Integer.valueOf(Arrays.hashCode(this.h)), this.i, Integer.valueOf(this.j), this.k, this.l, Integer.valueOf(Arrays.hashCode(this.m)), this.n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        IBinder iBinderAsBinder3;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkj zzkjVar = this.a;
        IBinder iBinderAsBinder4 = null;
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
        zzjy zzjyVar = this.c;
        if (zzjyVar == null) {
            iBinderAsBinder3 = null;
        } else {
            iBinderAsBinder3 = zzjyVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinderAsBinder3, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f, false);
        zzjv zzjvVar = this.g;
        if (zzjvVar != null) {
            iBinderAsBinder4 = zzjvVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 7, iBinderAsBinder4, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.h, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.i, i, false);
        SafeParcelWriter.writeInt(parcel, 10, this.j);
        SafeParcelWriter.writeParcelable(parcel, 11, this.k, i, false);
        SafeParcelWriter.writeByteArray(parcel, 12, this.m, false);
        SafeParcelWriter.writeString(parcel, 13, this.n, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.l, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzmk() {
        this.j = 0;
    }
}
