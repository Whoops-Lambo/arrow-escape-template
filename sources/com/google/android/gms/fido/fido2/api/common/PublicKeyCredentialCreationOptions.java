package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbl;
import defpackage.ez3;
import defpackage.pv1;
import defpackage.q63;
import defpackage.zw3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialCreationOptionsCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new zzan();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final AuthenticatorSelectionCriteria g;
    public final Integer h;
    public final TokenBinding i;
    public final AttestationConveyancePreference j;
    public final AuthenticationExtensions k;
    public final String l;
    public final ResultReceiver m;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public PublicKeyCredentialRpEntity a;
        public PublicKeyCredentialUserEntity b;
        public byte[] c;
        public List d;
        public Double e;
        public ArrayList f;
        public AuthenticatorSelectionCriteria g;
        public AttestationConveyancePreference h;
        public AuthenticationExtensions i;

        public final PublicKeyCredentialCreationOptions a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
            byte[] bArr = this.c;
            List list = this.d;
            Double d = this.e;
            ArrayList arrayList = this.f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.g;
            AttestationConveyancePreference attestationConveyancePreference = this.h;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d, arrayList, authenticatorSelectionCriteria, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.a, this.i, null, null);
        }
    }

    public static PublicKeyCredentialCreationOptions d(JSONObject jSONObject) throws JSONException {
        zzbl ez3Var;
        Builder builder = new Builder();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        builder.a = (PublicKeyCredentialRpEntity) Preconditions.checkNotNull(new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        builder.b = (PublicKeyCredentialUserEntity) Preconditions.checkNotNull(new PublicKeyCredentialUserEntity(Base64Utils.decodeUrlSafeNoPadding(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        builder.c = (byte[]) Preconditions.checkNotNull(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            try {
                ez3Var = new ez3(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                ez3Var = zw3.a;
            }
            if (ez3Var.f()) {
                arrayList.add(ez3Var.d());
            }
        }
        builder.d = (List) Preconditions.checkNotNull(arrayList);
        if (jSONObject.has("timeout")) {
            builder.e = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(PublicKeyCredentialDescriptor.d(jSONArray2.getJSONObject(i2)));
            }
            builder.f = arrayList2;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator3 = AuthenticatorSelectionCriteria.CREATOR;
            builder.g = new AuthenticatorSelectionCriteria(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null);
        }
        if (jSONObject.has("extensions")) {
            builder.i = AuthenticationExtensions.d(jSONObject.getJSONObject("extensions"));
        }
        if (jSONObject.has("attestation")) {
            try {
                builder.h = AttestationConveyancePreference.a(jSONObject.getString("attestation"));
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                builder.h = AttestationConveyancePreference.NONE;
            }
        }
        return builder.a();
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        List list2 = publicKeyCredentialCreationOptions.d;
        List list3 = publicKeyCredentialCreationOptions.f;
        if (Objects.equal(this.a, publicKeyCredentialCreationOptions.a) && Objects.equal(this.b, publicKeyCredentialCreationOptions.b) && Arrays.equals(this.c, publicKeyCredentialCreationOptions.c) && Objects.equal(this.e, publicKeyCredentialCreationOptions.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && Objects.equal(this.g, publicKeyCredentialCreationOptions.g) && Objects.equal(this.h, publicKeyCredentialCreationOptions.h) && Objects.equal(this.i, publicKeyCredentialCreationOptions.i) && Objects.equal(this.j, publicKeyCredentialCreationOptions.j) && Objects.equal(this.k, publicKeyCredentialCreationOptions.k) && Objects.equal(this.l, publicKeyCredentialCreationOptions.l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(this.c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.f);
        String strValueOf5 = String.valueOf(this.g);
        String strValueOf6 = String.valueOf(this.i);
        String strValueOf7 = String.valueOf(this.j);
        String strValueOf8 = String.valueOf(this.k);
        StringBuilder sbR = pv1.r("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        q63.y(sbR, strEncodeUrlSafeNoPadding, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbR.append(this.e);
        sbR.append(", \n excludeList=");
        sbR.append(strValueOf4);
        sbR.append(", \n authenticatorSelection=");
        sbR.append(strValueOf5);
        sbR.append(", \n requestId=");
        sbR.append(this.h);
        sbR.append(", \n tokenBinding=");
        sbR.append(strValueOf6);
        sbR.append(", \n attestationConveyancePreference=");
        return pv1.p(sbR, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, ArrayList arrayList, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.m = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsD = d(new JSONObject(str2));
                this.a = publicKeyCredentialCreationOptionsD.a;
                this.b = publicKeyCredentialCreationOptionsD.b;
                this.c = publicKeyCredentialCreationOptionsD.c;
                this.d = publicKeyCredentialCreationOptionsD.d;
                this.e = publicKeyCredentialCreationOptionsD.e;
                this.f = publicKeyCredentialCreationOptionsD.f;
                this.g = publicKeyCredentialCreationOptionsD.g;
                this.h = publicKeyCredentialCreationOptionsD.h;
                this.i = publicKeyCredentialCreationOptionsD.i;
                this.j = publicKeyCredentialCreationOptionsD.j;
                this.k = publicKeyCredentialCreationOptionsD.k;
                this.l = str2;
                return;
            } catch (JSONException e) {
                defpackage.d.n(e);
                throw null;
            }
        }
        this.a = (PublicKeyCredentialRpEntity) Preconditions.checkNotNull(publicKeyCredentialRpEntity);
        this.b = (PublicKeyCredentialUserEntity) Preconditions.checkNotNull(publicKeyCredentialUserEntity);
        this.c = (byte[]) Preconditions.checkNotNull(bArr);
        this.d = (List) Preconditions.checkNotNull(list);
        this.e = d;
        this.f = arrayList;
        this.g = authenticatorSelectionCriteria;
        this.h = num;
        this.i = tokenBinding;
        if (str != null) {
            try {
                this.j = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e2) {
                defpackage.d.n(e2);
                throw null;
            }
        } else {
            this.j = null;
        }
        this.k = authenticationExtensions;
        this.l = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.b, i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.c, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.d, false);
        SafeParcelWriter.writeDoubleObject(parcel, 6, this.e, false);
        SafeParcelWriter.writeTypedList(parcel, 7, this.f, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.g, i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 9, this.h, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.i, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.j;
        if (attestationConveyancePreference == null) {
            str = null;
        } else {
            str = attestationConveyancePreference.a;
        }
        SafeParcelWriter.writeString(parcel, 11, str, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.k, i, false);
        SafeParcelWriter.writeString(parcel, 13, this.l, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.m, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public PublicKeyCredentialCreationOptions() {
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsD = d(new JSONObject((String) null));
            this.a = publicKeyCredentialCreationOptionsD.a;
            this.b = publicKeyCredentialCreationOptionsD.b;
            this.c = publicKeyCredentialCreationOptionsD.c;
            this.d = publicKeyCredentialCreationOptionsD.d;
            this.e = publicKeyCredentialCreationOptionsD.e;
            this.f = publicKeyCredentialCreationOptionsD.f;
            this.g = publicKeyCredentialCreationOptionsD.g;
            this.h = publicKeyCredentialCreationOptionsD.h;
            this.i = publicKeyCredentialCreationOptionsD.i;
            this.j = publicKeyCredentialCreationOptionsD.j;
            this.k = publicKeyCredentialCreationOptionsD.k;
            this.l = null;
        } catch (JSONException e) {
            defpackage.d.n(e);
            throw null;
        }
    }
}
