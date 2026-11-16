package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "NearbyDeviceFilterCreator")
public final class zznj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznj> CREATOR = new zznk();
    public final int a;
    public final int b;
    public final byte[] c;
    public final boolean d;

    public zznj(byte[] bArr, int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.b);
        SafeParcelWriter.writeByteArray(parcel, 2, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.d);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
