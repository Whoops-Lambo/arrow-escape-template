package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import defpackage.ak4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "SignResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class SignResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<SignResponseData> CREATOR = new zzl();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.a, signResponseData.a) && Objects.equal(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)));
    }

    public SignResponseData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = (byte[]) Preconditions.checkNotNull(bArr);
        this.b = (String) Preconditions.checkNotNull(str);
        this.c = (byte[]) Preconditions.checkNotNull(bArr2);
        this.d = (byte[]) Preconditions.checkNotNull(bArr3);
    }

    public final String toString() {
        zzbi zzbiVarA = zzbj.a(this);
        ak4 ak4Var = zzgf.a;
        byte[] bArr = this.a;
        zzbiVarA.a(ak4Var.c(bArr.length, bArr), "keyHandle");
        zzbiVarA.a(this.b, "clientDataString");
        byte[] bArr2 = this.c;
        zzbiVarA.a(ak4Var.c(bArr2.length, bArr2), "signatureData");
        byte[] bArr3 = this.d;
        zzbiVarA.a(ak4Var.c(bArr3.length, bArr3), "application");
        return zzbiVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.c, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
