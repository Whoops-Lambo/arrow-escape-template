package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.ap4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public final long a;
    public final zzgx b;
    public final zzgx c;
    public final zzgx d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.a == zzqVar.a && Objects.equal(this.b, zzqVar.b) && Objects.equal(this.c, zzqVar.c) && Objects.equal(this.d, zzqVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), this.b, this.c, this.d);
    }

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        ap4 ap4Var = zzgx.b;
        ap4 ap4VarR = zzgx.r(bArr4.length, bArr4);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        ap4 ap4VarR2 = zzgx.r(bArr5.length, bArr5);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        ap4 ap4VarR3 = zzgx.r(bArr6.length, bArr6);
        this.a = j;
        this.b = (zzgx) Preconditions.checkNotNull(ap4VarR);
        this.c = (zzgx) Preconditions.checkNotNull(ap4VarR2);
        this.d = (zzgx) Preconditions.checkNotNull(ap4VarR3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.b.t(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.c.t(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.d.t(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
