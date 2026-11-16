package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hv3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzq implements Comparator<zzp>, Parcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new hv3(12);
    public final zzp[] a;
    public int b;
    public final String c;
    public final int d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzq.class == obj.getClass()) {
            zzq zzqVar = (zzq) obj;
            if (Objects.equals(this.c, zzqVar.c) && Arrays.equals(this.a, zzqVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final zzq a(String str) {
        return Objects.equals(this.c, str) ? this : new zzq(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzp zzpVar, zzp zzpVar2) {
        zzp zzpVar3 = zzpVar2;
        UUID uuid = zzg.a;
        UUID uuid2 = zzpVar.b;
        if (uuid.equals(uuid2)) {
            return !uuid.equals(zzpVar3.b) ? 1 : 0;
        }
        return uuid2.compareTo(zzpVar3.b);
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        String str = this.c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public zzq(Parcel parcel) {
        this.c = parcel.readString();
        zzp[] zzpVarArr = (zzp[]) parcel.createTypedArray(zzp.CREATOR);
        String str = zzfq.a;
        this.a = zzpVarArr;
        this.d = zzpVarArr.length;
    }

    public zzq(String str, boolean z, zzp... zzpVarArr) {
        this.c = str;
        zzpVarArr = z ? (zzp[]) zzpVarArr.clone() : zzpVarArr;
        this.a = zzpVarArr;
        this.d = zzpVarArr.length;
        Arrays.sort(zzpVarArr, this);
    }
}
