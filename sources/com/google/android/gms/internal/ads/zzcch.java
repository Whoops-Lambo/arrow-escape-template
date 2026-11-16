package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
@SafeParcelable.Reserved({15, 16})
public final class zzcch extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcch> CREATOR = new zzcci();
    public final Bundle a;
    public final VersionInfoParcel b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public zzfof i;
    public String j;
    public final boolean k;
    public final boolean l;
    public final Bundle m;

    public zzcch(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, zzfof zzfofVar, String str4, boolean z, boolean z2, Bundle bundle2) {
        this.a = bundle;
        this.b = versionInfoParcel;
        this.d = str;
        this.c = applicationInfo;
        this.e = arrayList;
        this.f = packageInfo;
        this.g = str2;
        this.h = str3;
        this.i = zzfofVar;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.g, false);
        SafeParcelWriter.writeString(parcel, 9, this.h, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.i, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.j, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.k);
        SafeParcelWriter.writeBoolean(parcel, 13, this.l);
        SafeParcelWriter.writeBundle(parcel, 14, this.m, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
