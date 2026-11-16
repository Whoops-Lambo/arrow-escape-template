package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.nj;
import defpackage.pv1;
import defpackage.q63;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.Reserved({1})
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();
    public final FidoAppIdExtension a;
    public final zzs b;
    public final UserVerificationMethodExtension c;
    public final zzz d;
    public final zzab e;
    public final zzad f;
    public final zzu g;
    public final zzag h;
    public final GoogleThirdPartyPaymentExtension i;
    public final zzak j;
    public final zzaw k;
    public final zzai l;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public FidoAppIdExtension a;
        public UserVerificationMethodExtension b;
        public zzs c;
        public zzz d;
        public zzab e;
        public zzad f;
        public zzu g;
        public zzag h;
        public GoogleThirdPartyPaymentExtension i;
        public zzak j;
        public zzaw k;

        public final AuthenticationExtensions a() {
            return new AuthenticationExtensions(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
        }
    }

    public static AuthenticationExtensions d(JSONObject jSONObject) throws JSONException {
        Builder builder = new Builder();
        if (jSONObject.has("fidoAppIdExtension")) {
            builder.a = new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid"));
        }
        if (jSONObject.has("appid")) {
            builder.a = new FidoAppIdExtension(jSONObject.getString("appid"));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            builder.j = zzak.d(jSONObject.getJSONObject("prf"), false);
        } else if (jSONObject.has("prfAlreadyHashed")) {
            builder.j = zzak.d(jSONObject.getJSONObject("prfAlreadyHashed"), true);
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            builder.c = new zzs(arrayList);
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            builder.b = new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            builder.d = new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            builder.e = new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            builder.f = new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
            builder.g = new zzu();
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            builder.h = new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            builder.i = new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
        }
        if (jSONObject.has("txAuthSimple")) {
            builder.k = new zzaw(jSONObject.getString("txAuthSimple"));
        }
        return builder.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return Objects.equal(this.a, authenticationExtensions.a) && Objects.equal(this.b, authenticationExtensions.b) && Objects.equal(this.c, authenticationExtensions.c) && Objects.equal(this.d, authenticationExtensions.d) && Objects.equal(this.e, authenticationExtensions.e) && Objects.equal(this.f, authenticationExtensions.f) && Objects.equal(this.g, authenticationExtensions.g) && Objects.equal(this.h, authenticationExtensions.h) && Objects.equal(this.i, authenticationExtensions.i) && Objects.equal(this.j, authenticationExtensions.j) && Objects.equal(this.k, authenticationExtensions.k) && Objects.equal(this.l, authenticationExtensions.l);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        String strValueOf8 = String.valueOf(this.h);
        String strValueOf9 = String.valueOf(this.i);
        String strValueOf10 = String.valueOf(this.j);
        String strValueOf11 = String.valueOf(this.k);
        StringBuilder sbR = pv1.r("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        q63.y(sbR, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        q63.y(sbR, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        q63.y(sbR, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        q63.y(sbR, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return nj.q(sbR, strValueOf11, "}");
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.a = fidoAppIdExtension;
        this.c = userVerificationMethodExtension;
        this.b = zzsVar;
        this.d = zzzVar;
        this.e = zzabVar;
        this.f = zzadVar;
        this.g = zzuVar;
        this.h = zzagVar;
        this.i = googleThirdPartyPaymentExtension;
        this.j = zzakVar;
        this.k = zzawVar;
        this.l = zzaiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.l, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
