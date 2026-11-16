package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hv3;
import defpackage.n30;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzp implements Parcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new hv3(13);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzp zzpVar = (zzp) obj;
        return Objects.equals(this.c, zzpVar.c) && Objects.equals(this.d, zzpVar.d) && Objects.equals(this.b, zzpVar.b) && Arrays.equals(this.e, zzpVar.e);
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = Arrays.hashCode(this.e) + n30.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        this.a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public zzp(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String string = parcel.readString();
        String str = zzfq.a;
        this.d = string;
        this.e = parcel.createByteArray();
    }

    public zzp(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = null;
        this.d = zzas.h(str);
        this.e = bArr;
    }
}
