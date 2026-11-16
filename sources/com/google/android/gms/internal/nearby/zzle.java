package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
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
@SafeParcelable.Class(creator = "OnEndpointFoundParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzle> CREATOR = new zzlf();
    public final String a;
    public final String b;
    public final String c;
    public final BluetoothDevice d;
    public final byte[] e;
    public final int f;
    public final zzk g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzle) {
            zzle zzleVar = (zzle) obj;
            if (Objects.equal(this.a, zzleVar.a) && Objects.equal(this.b, zzleVar.b) && Objects.equal(this.c, zzleVar.c) && Objects.equal(this.d, zzleVar.d) && Arrays.equals(this.e, zzleVar.e) && Objects.equal(Integer.valueOf(this.f), Integer.valueOf(zzleVar.f)) && Objects.equal(this.g, zzleVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f), this.g);
    }

    public zzle(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr, int i, zzk zzkVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bluetoothDevice;
        this.e = bArr;
        this.f = i;
        this.g = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.e, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzle() {
        this.f = 0;
    }
}
