package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.n30;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Yb implements Parcelable {

    @NotNull
    public static final Xb CREATOR = new Xb();
    public final Zb a;
    public final String b;
    public final int c;
    public final long d;
    public int e;
    public String f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yb)) {
            return false;
        }
        Yb yb = (Yb) obj;
        return s71.b(this.a, yb.a) && s71.b(this.b, yb.b) && this.c == yb.c && this.d == yb.d;
    }

    public static Yb a(Yb yb) {
        Zb zb = yb.a;
        String str = yb.b;
        int i = yb.c;
        long j = yb.d;
        zb.getClass();
        str.getClass();
        return new Yb(zb, str, i, j);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + Hj.a(this.c, n30.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.a + ", urlType=" + this.b + ", counter=" + this.c + ", startTime=" + this.d + ")";
    }

    public Yb(Zb zb, String str, int i, long j) {
        zb.getClass();
        str.getClass();
        this.a = zb;
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a.a);
        parcel.writeString(this.a.b);
        parcel.writeString(this.a.c);
        parcel.writeString(this.a.d);
        parcel.writeString(this.a.e);
        parcel.writeString(this.a.f);
        parcel.writeString(this.a.g);
        parcel.writeByte(this.a.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.a.i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }
}
