package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.h50;
import defpackage.rl3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "RtbVersionInfoParcelCreator")
public final class zzbyu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyu> CREATOR = new zzbyv();
    public final int a;
    public final int b;
    public final int c;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbyu)) {
            zzbyu zzbyuVar = (zzbyu) obj;
            if (zzbyuVar.c == this.c && zzbyuVar.b == this.b && zzbyuVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public static zzbyu d(VersionInfo versionInfo) {
        return new zzbyu(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a, this.b, this.c});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(rl3.v(length, 1, length2, 1, String.valueOf(i3).length()));
        h50.s(i, i2, UserDetailsUtils.UserDetailsLiterals.DOT, UserDetailsUtils.UserDetailsLiterals.DOT, sb);
        sb.append(i3);
        return sb.toString();
    }

    public zzbyu(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
