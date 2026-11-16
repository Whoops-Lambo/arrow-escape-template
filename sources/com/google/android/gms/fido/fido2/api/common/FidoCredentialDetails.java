package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.ap4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "FidoCredentialDetailsCreator")
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new zzy();
    public final String a;
    public final String b;
    public final ap4 c;
    public final ap4 d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final Account h;
    public final boolean i;

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2, long j, Account account, boolean z3) {
        ap4 ap4VarR = bArr == null ? null : zzgx.r(bArr.length, bArr);
        ap4 ap4Var = zzgx.b;
        ap4 ap4VarR2 = zzgx.r(bArr2.length, bArr2);
        this.a = str;
        this.b = str2;
        this.c = ap4VarR;
        this.d = ap4VarR2;
        this.e = z;
        this.f = z2;
        this.g = j;
        this.h = account;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return Objects.equal(this.a, fidoCredentialDetails.a) && Objects.equal(this.b, fidoCredentialDetails.b) && Objects.equal(this.c, fidoCredentialDetails.c) && Objects.equal(this.d, fidoCredentialDetails.d) && this.e == fidoCredentialDetails.e && this.f == fidoCredentialDetails.f && this.i == fidoCredentialDetails.i && this.g == fidoCredentialDetails.g && Objects.equal(this.h, fidoCredentialDetails.h);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.i), Long.valueOf(this.g), this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArrT;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        ap4 ap4Var = this.c;
        if (ap4Var == null) {
            bArrT = null;
        } else {
            bArrT = ap4Var.t();
        }
        SafeParcelWriter.writeByteArray(parcel, 3, bArrT, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.d.t(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.e);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f);
        SafeParcelWriter.writeLong(parcel, 7, this.g);
        SafeParcelWriter.writeParcelable(parcel, 8, this.h, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.i);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
