package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import com.google.android.gms.internal.fido.zzib;
import com.ironsource.Ue;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.ap4;
import defpackage.pv1;
import defpackage.q63;
import defpackage.vq2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialCreator")
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzao();
    public final String a;
    public final String b;
    public final ap4 c;
    public final AuthenticatorAttestationResponse d;
    public final AuthenticatorAssertionResponse e;
    public final AuthenticatorErrorResponse f;
    public final AuthenticationExtensionsClientOutputs g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
    }

    public final JSONObject r0() {
        JSONObject jSONObjectR0;
        try {
            JSONObject jSONObject = new JSONObject();
            ap4 ap4Var = this.c;
            if (ap4Var != null && ap4Var.t().length > 0) {
                jSONObject.put("rawId", Base64Utils.encodeUrlSafeNoPadding(ap4Var.t()));
            }
            String str = this.h;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.b;
            AuthenticatorErrorResponse authenticatorErrorResponse = this.f;
            if (str2 != null && authenticatorErrorResponse == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.a;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = Ue.n;
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.e;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectR0 = authenticatorAssertionResponse.r0();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.d;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectR0 = authenticatorAttestationResponse.r0();
                } else {
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, authenticatorErrorResponse.a.a);
                            String str5 = authenticatorErrorResponse.b;
                            if (str5 != null) {
                                jSONObject2.put("message", str5);
                            }
                            jSONObjectR0 = jSONObject2;
                            str4 = "error";
                        } catch (JSONException e) {
                            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                        }
                    } else {
                        jSONObjectR0 = null;
                    }
                }
            }
            if (jSONObjectR0 != null) {
                jSONObject.put(str4, jSONObjectR0);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.g;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.r0());
                return jSONObject;
            }
            if (z) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e2) {
            vq2.n("Error encoding PublicKeyCredential to JSON object", e2);
            return null;
        }
    }

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        ap4 ap4VarR = bArr == null ? null : zzgx.r(bArr.length, bArr);
        boolean z = false;
        Preconditions.checkArgument((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && ap4VarR != null)) {
            z = true;
        }
        Preconditions.checkArgument(z, "Must provide id and rawId if not an error response.");
        this.a = str;
        this.b = str2;
        this.c = ap4VarR;
        this.d = authenticatorAttestationResponse;
        this.e = authenticatorAssertionResponse;
        this.f = authenticatorErrorResponse;
        this.g = authenticationExtensionsClientOutputs;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return Objects.equal(this.a, publicKeyCredential.a) && Objects.equal(this.b, publicKeyCredential.b) && Objects.equal(this.c, publicKeyCredential.c) && Objects.equal(this.d, publicKeyCredential.d) && Objects.equal(this.e, publicKeyCredential.e) && Objects.equal(this.f, publicKeyCredential.f) && Objects.equal(this.g, publicKeyCredential.g) && Objects.equal(this.h, publicKeyCredential.h);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.h);
    }

    public final String toString() {
        ap4 ap4Var = this.c;
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(ap4Var == null ? null : ap4Var.t());
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        String strValueOf3 = String.valueOf(this.f);
        String strValueOf4 = String.valueOf(this.g);
        StringBuilder sbR = pv1.r("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        q63.y(sbR, strEncodeUrlSafeNoPadding, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        q63.y(sbR, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return pv1.p(sbR, strValueOf4, ", \n authenticatorAttachment='", this.h, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ((zzib) zzia.b.a.a).zza();
        throw null;
    }
}
