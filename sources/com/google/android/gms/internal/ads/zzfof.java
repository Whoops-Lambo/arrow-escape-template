package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzfof extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfof> CREATOR = new zzfog();
    public final Context a;
    public final int b;
    public final zzfoc c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;

    public zzfof(Context context, zzfoc zzfocVar, int i, int i2, int i3, String str, String str2) {
        int i4;
        zzfoc.values();
        this.a = context;
        this.b = zzfocVar.ordinal();
        this.c = zzfocVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if ("lru".equals(str2) || !"lfu".equals(str2)) {
            i4 = 2;
        } else {
            i4 = 3;
        }
        this.j = i4;
        this.h = i4 - 1;
        this.i = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.b);
        SafeParcelWriter.writeInt(parcel, 2, this.d);
        SafeParcelWriter.writeInt(parcel, 3, this.e);
        SafeParcelWriter.writeInt(parcel, 4, this.f);
        SafeParcelWriter.writeString(parcel, 5, this.g, false);
        SafeParcelWriter.writeInt(parcel, 6, this.h);
        SafeParcelWriter.writeInt(parcel, 7, this.i);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzfof(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        zzfoc[] zzfocVarArrValues = zzfoc.values();
        this.a = null;
        this.b = i;
        this.c = zzfocVarArrValues[i];
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
        this.h = i5;
        this.j = new int[]{1, 2, 3}[i5];
        this.i = i6;
        int i7 = new int[]{1}[i6];
    }
}
