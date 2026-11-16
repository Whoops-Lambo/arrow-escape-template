package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    public String a;
    public String b;
    public zzpl c;
    public long d;
    public boolean e;
    public String f;
    public final zzbh g;
    public long h;
    public zzbh i;
    public final long j;
    public final zzbh k;

    public zzah(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        this.a = zzahVar.a;
        this.b = zzahVar.b;
        this.c = zzahVar.c;
        this.d = zzahVar.d;
        this.e = zzahVar.e;
        this.f = zzahVar.f;
        this.g = zzahVar.g;
        this.h = zzahVar.h;
        this.i = zzahVar.i;
        this.j = zzahVar.j;
        this.k = zzahVar.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.c, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.d);
        SafeParcelWriter.writeBoolean(parcel, 6, this.e);
        SafeParcelWriter.writeString(parcel, 7, this.f, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.g, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.h);
        SafeParcelWriter.writeParcelable(parcel, 10, this.i, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.j);
        SafeParcelWriter.writeParcelable(parcel, 12, this.k, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z, String str3, zzbh zzbhVar, long j2, zzbh zzbhVar2, long j3, zzbh zzbhVar3) {
        this.a = str;
        this.b = str2;
        this.c = zzplVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = zzbhVar;
        this.h = j2;
        this.i = zzbhVar2;
        this.j = j3;
        this.k = zzbhVar3;
    }
}
