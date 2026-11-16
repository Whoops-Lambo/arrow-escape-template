package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s71;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.inmobi.media.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4505x0 implements Parcelable {
    public final long a;
    public final String b;
    public Map c;
    public String d;
    public final String e;
    public final String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public boolean l;
    public String m;
    public static final Set n = defpackage.n8.q0(new String[]{"c_applovin", "c_applovincustom"});

    @NotNull
    public static final Parcelable.Creator<C4505x0> CREATOR = new C4478w0();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4505x0)) {
            return false;
        }
        C4505x0 c4505x0 = (C4505x0) obj;
        return this.a == c4505x0.a && s71.b(this.k, c4505x0.k) && s71.b(this.b, c4505x0.b) && s71.b(this.e, c4505x0.e);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.e;
        return this.k.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    public C4505x0(Parcel parcel) {
        this.h = "";
        this.i = "";
        String str = "activity";
        this.k = "activity";
        this.a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !string.equals("activity") && string.equals("others")) {
            str = "others";
        }
        this.k = str;
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.k);
        parcel.writeString(this.e);
    }

    public C4505x0(long j, String str, String str2, String str3) {
        this.h = "";
        this.i = "";
        this.k = "activity";
        this.a = j;
        this.e = str2;
        this.b = str;
        this.f = str3;
    }
}
