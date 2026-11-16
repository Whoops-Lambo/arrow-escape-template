package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.zzc;
import defpackage.s42;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "DefaultMultiFactorResolverCreator")
public final class zzaj extends MultiFactorResolver {
    public static final Parcelable.Creator<zzaj> CREATOR = new s42(25);
    public final List a;
    public final zzao b;
    public final String c;
    public final zzc d;
    public final zzad e;
    public final List f;

    public zzaj(ArrayList arrayList, zzao zzaoVar, String str, zzc zzcVar, zzad zzadVar, ArrayList arrayList2) {
        this.a = (List) Preconditions.checkNotNull(arrayList);
        this.b = (zzao) Preconditions.checkNotNull(zzaoVar);
        this.c = Preconditions.checkNotEmpty(str);
        this.d = zzcVar;
        this.e = zzadVar;
        this.f = (List) Preconditions.checkNotNull(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
