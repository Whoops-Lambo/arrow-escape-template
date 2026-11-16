package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "ProgramResponseCreator")
public final class zzgbm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgbm> CREATOR = new zzgbn();
    public final int a;
    public final byte[] b;
    public final int c;

    public zzgbm(int i, int i2, byte[] bArr) {
        byte[] bArrCopyOf;
        this.a = i;
        if (bArr == null) {
            bArrCopyOf = null;
        } else {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        this.b = bArrCopyOf;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzgbm() {
        this(1, 1, null);
    }
}
