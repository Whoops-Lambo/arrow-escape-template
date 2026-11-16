package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.x75;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@SafeParcelable.Class(creator = "PresenceDeviceCreator")
public final class zznv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznv> CREATOR = new zznw();
    public final long a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final byte[] g;
    public final byte[] h;
    public final List i;
    public final int j;
    public final byte[] k;

    public final boolean equals(Object obj) {
        if (obj instanceof zznv) {
            zznv zznvVar = (zznv) obj;
            if (Objects.equal(Long.valueOf(this.a), Long.valueOf(zznvVar.a)) && Objects.equal(this.b, zznvVar.b) && Objects.equal(Integer.valueOf(this.c), Integer.valueOf(zznvVar.c)) && Objects.equal(this.d, zznvVar.d) && Objects.equal(this.f, zznvVar.f) && Arrays.equals(this.g, zznvVar.g) && Arrays.equals(this.h, zznvVar.h) && Objects.equal(this.i, zznvVar.i) && Objects.equal(Integer.valueOf(this.j), Integer.valueOf(zznvVar.j)) && Arrays.equals(this.k, zznvVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.f, Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), this.i, Integer.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)));
    }

    public final String toString() {
        Long lValueOf = Long.valueOf(this.a);
        Integer numValueOf = Integer.valueOf(this.c);
        Long lValueOf2 = Long.valueOf(this.e);
        byte[] bArr = this.g;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.h;
        Integer numValueOf2 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        Integer numValueOf3 = Integer.valueOf(this.j);
        byte[] bArr3 = this.k;
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s>", lValueOf, this.b, numValueOf, this.d, lValueOf2, this.f, string, numValueOf2, this.i, numValueOf3, bArr3 != null ? Arrays.toString(bArr3) : null);
    }

    public zznv(long j, String str, int i, String str2, long j2, String str3, byte[] bArr, byte[] bArr2, ArrayList arrayList, int i2, byte[] bArr3) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.g = bArr;
        this.h = bArr2;
        this.i = arrayList;
        this.j = i2;
        this.k = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        List listX;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeLong(parcel, 5, this.e);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        byte[] bArr2 = null;
        byte[] bArr3 = this.g;
        if (bArr3 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr3.clone();
        }
        SafeParcelWriter.writeByteArray(parcel, 7, bArr, false);
        byte[] bArr4 = this.h;
        if (bArr4 != null) {
            bArr2 = (byte[]) bArr4.clone();
        }
        SafeParcelWriter.writeByteArray(parcel, 8, bArr2, false);
        List list = this.i;
        if (list == null) {
            x75 x75Var = zzsq.b;
            listX = a.e;
        } else {
            listX = zzsq.x(list);
        }
        SafeParcelWriter.writeTypedList(parcel, 9, listX, false);
        SafeParcelWriter.writeInt(parcel, 10, this.j);
        SafeParcelWriter.writeByteArray(parcel, 11, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
