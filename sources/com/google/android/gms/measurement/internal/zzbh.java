package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.nj;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();
    public final String a;
    public final zzbf b;
    public final String c;
    public final long d;
    public final long e;

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        q63.y(sb, "origin=", str, ",name=", str2);
        return nj.q(sb, ",params=", strValueOf);
    }

    public zzbh(zzbh zzbhVar, long j, long j2) {
        Preconditions.checkNotNull(zzbhVar);
        this.a = zzbhVar.a;
        this.b = zzbhVar.b;
        this.c = zzbhVar.c;
        this.d = j;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzbi.a(this, parcel, i);
    }

    public zzbh(String str, zzbf zzbfVar, String str2, long j, long j2) {
        this.a = str;
        this.b = zzbfVar;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }
}
