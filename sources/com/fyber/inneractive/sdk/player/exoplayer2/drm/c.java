package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import defpackage.n30;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();
    public int a;
    public final UUID b;
    public final String c;
    public final byte[] d;
    public final boolean e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return this.c.equals(cVar.c) && z.a(this.b, cVar.b) && Arrays.equals(this.d, cVar.d);
    }

    public final int hashCode() {
        if (this.a == 0) {
            this.a = Arrays.hashCode(this.d) + n30.c(this.b.hashCode() * 31, 31, this.c);
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b.getMostSignificantBits());
        parcel.writeLong(this.b.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public c(Parcel parcel) {
        boolean z;
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        this.d = parcel.createByteArray();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
    }

    public c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        bArr.getClass();
        this.d = bArr;
        this.e = false;
    }
}
