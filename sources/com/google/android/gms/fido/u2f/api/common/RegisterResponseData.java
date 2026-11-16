package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import defpackage.ak4;
import defpackage.d;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "RegisterResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class RegisterResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new zzi();
    public final byte[] a;
    public final ProtocolVersion b;
    public final String c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return Objects.equal(this.b, registerResponseData.b) && Arrays.equals(this.a, registerResponseData.a) && Objects.equal(this.c, registerResponseData.c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, Integer.valueOf(Arrays.hashCode(this.a)), this.c);
    }

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.a = bArr;
        try {
            this.b = ProtocolVersion.a(str);
            this.c = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            d.n(e);
            throw null;
        }
    }

    public final String toString() {
        zzbi zzbiVarA = zzbj.a(this);
        zzbiVarA.a(this.b, "protocolVersion");
        ak4 ak4Var = zzgf.a;
        byte[] bArr = this.a;
        zzbiVarA.a(ak4Var.c(bArr.length, bArr), "registerData");
        String str = this.c;
        if (str != null) {
            zzbiVarA.a(str, "clientDataString");
        }
        return zzbiVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b.a, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
