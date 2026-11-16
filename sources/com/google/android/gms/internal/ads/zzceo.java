package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "SafeBrowsingConfigParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzceo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzceo> CREATOR = new zzcep();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public zzceo(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = z3;
        this.g = z4;
        this.h = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.d);
        SafeParcelWriter.writeStringList(parcel, 6, this.e, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f);
        SafeParcelWriter.writeBoolean(parcel, 8, this.g);
        SafeParcelWriter.writeStringList(parcel, 9, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
