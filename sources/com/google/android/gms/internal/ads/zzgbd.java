package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
public final class zzgbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgbd> CREATOR = new zzgbe();
    public final int a;
    public zzazk b = null;
    public byte[] c;

    public final void r0() {
        zzazk zzazkVar = this.b;
        if (zzazkVar != null || this.c == null) {
            if (zzazkVar == null || this.c != null) {
                if (zzazkVar != null && this.c != null) {
                    e32.i("Invalid internal representation - full");
                } else if (zzazkVar == null && this.c == null) {
                    e32.i("Invalid internal representation - empty");
                } else {
                    e32.i("Impossible");
                }
            }
        }
    }

    public zzgbd(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        r0();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        byte[] bArrH = this.c;
        if (bArrH == null) {
            bArrH = this.b.h();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrH, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
