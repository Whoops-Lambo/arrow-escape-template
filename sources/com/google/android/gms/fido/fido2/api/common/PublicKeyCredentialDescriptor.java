package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.ap4;
import defpackage.nj;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialDescriptorCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final PublicKeyCredentialType a;
    public final zzgx b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    static {
        zzcf.n(2, com.google.android.gms.internal.fido.zzh.a, com.google.android.gms.internal.fido.zzh.b);
        CREATOR = new zzap();
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        ap4 ap4Var = zzgx.b;
        ap4 ap4VarR = zzgx.r(bArr.length, bArr);
        Preconditions.checkNotNull(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            this.b = (zzgx) Preconditions.checkNotNull(ap4VarR);
            this.c = arrayList;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            defpackage.d.n(e);
            throw null;
        }
    }

    public static PublicKeyCredentialDescriptor d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        String string = jSONObject.getString("type");
        byte[] bArrDecode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports") && (jSONArray = jSONObject.getJSONArray("transports")) != null) {
            HashSet hashSet = new HashSet(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                String string2 = jSONArray.getString(i);
                if (string2 != null && !string2.isEmpty()) {
                    try {
                        hashSet.add(Transport.a(string2));
                    } catch (Transport.UnsupportedTransportException unused) {
                        Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                    }
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        return new PublicKeyCredentialDescriptor(string, bArrDecode, arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        List list = publicKeyCredentialDescriptor.c;
        if (!this.a.equals(publicKeyCredentialDescriptor.a) || !Objects.equal(this.b, publicKeyCredentialDescriptor.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(this.b.t());
        return nj.q(pv1.r("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strEncodeUrlSafeNoPadding, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        this.a.getClass();
        SafeParcelWriter.writeString(parcel, 2, "public-key", false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.b.t(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
