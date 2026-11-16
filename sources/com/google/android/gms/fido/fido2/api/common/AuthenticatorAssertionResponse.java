package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.ak4;
import defpackage.ap4;
import defpackage.vq2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "AuthenticatorAssertionResponseCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();
    public final zzgx a;
    public final zzgx b;
    public final zzgx c;
    public final zzgx d;
    public final ap4 e;

    public final JSONObject r0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(this.b.t()));
            jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(this.c.t()));
            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, Base64Utils.encodeUrlSafeNoPadding(this.d.t()));
            ap4 ap4Var = this.e;
            if (ap4Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", Base64Utils.encodeUrlSafeNoPadding(ap4Var == null ? null : ap4Var.t()));
            return jSONObject;
        } catch (JSONException e) {
            vq2.n("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Objects.equal(this.a, authenticatorAssertionResponse.a) && Objects.equal(this.b, authenticatorAssertionResponse.b) && Objects.equal(this.c, authenticatorAssertionResponse.c) && Objects.equal(this.d, authenticatorAssertionResponse.d) && Objects.equal(this.e, authenticatorAssertionResponse.e);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.a)), Integer.valueOf(Objects.hashCode(this.b)), Integer.valueOf(Objects.hashCode(this.c)), Integer.valueOf(Objects.hashCode(this.d)), Integer.valueOf(Objects.hashCode(this.e)));
    }

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ap4 ap4VarR;
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr);
        ap4 ap4Var = zzgx.b;
        ap4 ap4VarR2 = zzgx.r(bArr6.length, bArr6);
        byte[] bArr7 = (byte[]) Preconditions.checkNotNull(bArr2);
        ap4 ap4VarR3 = zzgx.r(bArr7.length, bArr7);
        byte[] bArr8 = (byte[]) Preconditions.checkNotNull(bArr3);
        ap4 ap4VarR4 = zzgx.r(bArr8.length, bArr8);
        byte[] bArr9 = (byte[]) Preconditions.checkNotNull(bArr4);
        ap4 ap4VarR5 = zzgx.r(bArr9.length, bArr9);
        if (bArr5 == null) {
            ap4VarR = null;
        } else {
            ap4VarR = zzgx.r(bArr5.length, bArr5);
        }
        this.a = (zzgx) Preconditions.checkNotNull(ap4VarR2);
        this.b = (zzgx) Preconditions.checkNotNull(ap4VarR3);
        this.c = (zzgx) Preconditions.checkNotNull(ap4VarR4);
        this.d = (zzgx) Preconditions.checkNotNull(ap4VarR5);
        this.e = ap4VarR;
    }

    public final String toString() {
        byte[] bArrT;
        zzbi zzbiVarA = zzbj.a(this);
        ak4 ak4Var = zzgf.a;
        byte[] bArrT2 = this.a.t();
        zzbiVarA.a(ak4Var.c(bArrT2.length, bArrT2), "keyHandle");
        byte[] bArrT3 = this.b.t();
        zzbiVarA.a(ak4Var.c(bArrT3.length, bArrT3), "clientDataJSON");
        byte[] bArrT4 = this.c.t();
        zzbiVarA.a(ak4Var.c(bArrT4.length, bArrT4), "authenticatorData");
        byte[] bArrT5 = this.d.t();
        zzbiVarA.a(ak4Var.c(bArrT5.length, bArrT5), InAppPurchaseMetaData.KEY_SIGNATURE);
        ap4 ap4Var = this.e;
        if (ap4Var == null) {
            bArrT = null;
        } else {
            bArrT = ap4Var.t();
        }
        if (bArrT != null) {
            zzbiVarA.a(ak4Var.c(bArrT.length, bArrT), "userHandle");
        }
        return zzbiVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArrT;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.a.t(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.b.t(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.c.t(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.d.t(), false);
        ap4 ap4Var = this.e;
        if (ap4Var == null) {
            bArrT = null;
        } else {
            bArrT = ap4Var.t();
        }
        SafeParcelWriter.writeByteArray(parcel, 6, bArrT, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
