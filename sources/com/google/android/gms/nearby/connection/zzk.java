package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.nj;
import defpackage.pv1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ConnectionsDeviceCreator")
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public final String toString() {
        byte[] bArr = this.b;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.d;
        return nj.q(pv1.r("ConnectionsDevice:<endpointId: ", this.a, ", endpointInfo: ", string, ", connectivityBytes: "), bArr2 != null ? Arrays.toString(bArr2) : null, ">");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzk) {
            zzk zzkVar = (zzk) obj;
            if (Objects.equal(this.a, zzkVar.a) && Arrays.equals(this.b, zzkVar.b) && Arrays.equals(this.c, zzkVar.c) && Arrays.equals(this.d, zzkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)));
    }

    public zzk(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        byte[] bArr2 = null;
        byte[] bArr3 = this.b;
        if (bArr3 == null) {
            bArr = null;
        } else {
            bArr = (byte[]) bArr3.clone();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        byte[] bArr4 = this.c;
        if (bArr4 != null) {
            bArr2 = (byte[]) bArr4.clone();
        }
        SafeParcelWriter.writeByteArray(parcel, 3, bArr2, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
