package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 13, 17, 19, 20, 24, 33})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final long F;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final long q;
    public final List r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    public zzr(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
        this.F = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.writeLong(parcel, 6, this.e);
        SafeParcelWriter.writeLong(parcel, 7, this.f);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.i);
        SafeParcelWriter.writeLong(parcel, 11, this.j);
        SafeParcelWriter.writeString(parcel, 12, this.k, false);
        SafeParcelWriter.writeLong(parcel, 14, this.l);
        SafeParcelWriter.writeInt(parcel, 15, this.m);
        SafeParcelWriter.writeBoolean(parcel, 16, this.n);
        SafeParcelWriter.writeBoolean(parcel, 18, this.o);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.p, false);
        SafeParcelWriter.writeLong(parcel, 22, this.q);
        SafeParcelWriter.writeStringList(parcel, 23, this.r, false);
        SafeParcelWriter.writeString(parcel, 25, this.s, false);
        SafeParcelWriter.writeString(parcel, 26, this.t, false);
        SafeParcelWriter.writeString(parcel, 27, this.u, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.v);
        SafeParcelWriter.writeLong(parcel, 29, this.w);
        SafeParcelWriter.writeInt(parcel, 30, this.x);
        SafeParcelWriter.writeString(parcel, 31, this.y, false);
        SafeParcelWriter.writeInt(parcel, 32, this.z);
        SafeParcelWriter.writeLong(parcel, 34, this.A);
        SafeParcelWriter.writeString(parcel, 35, this.B, false);
        SafeParcelWriter.writeString(parcel, 36, this.C, false);
        SafeParcelWriter.writeLong(parcel, 37, this.D);
        SafeParcelWriter.writeInt(parcel, 38, this.E);
        SafeParcelWriter.writeLong(parcel, 39, this.F);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzr(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = arrayList;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
        this.F = j9;
    }
}
