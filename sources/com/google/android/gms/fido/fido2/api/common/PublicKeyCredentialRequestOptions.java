package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzia;
import com.google.android.gms.internal.fido.zzib;
import defpackage.h50;
import defpackage.q63;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new zzar();
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final TokenBinding f;
    public final UserVerificationRequirement g;
    public final AuthenticationExtensions h;
    public final Long i;
    public final ResultReceiver j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        List list2 = publicKeyCredentialRequestOptions.d;
        return Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) && Objects.equal(this.b, publicKeyCredentialRequestOptions.b) && Objects.equal(this.c, publicKeyCredentialRequestOptions.c) && (((list = this.d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && Objects.equal(this.e, publicKeyCredentialRequestOptions.e) && Objects.equal(this.f, publicKeyCredentialRequestOptions.f) && Objects.equal(this.g, publicKeyCredentialRequestOptions.g) && Objects.equal(this.h, publicKeyCredentialRequestOptions.h) && Objects.equal(this.i, publicKeyCredentialRequestOptions.i);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final String toString() {
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(this.a);
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.f);
        String strValueOf3 = String.valueOf(this.g);
        String strValueOf4 = String.valueOf(this.h);
        StringBuilder sbR = h50.r("PublicKeyCredentialRequestOptions{\n challenge=", strEncodeUrlSafeNoPadding, ", \n timeoutSeconds=");
        sbR.append(this.b);
        sbR.append(", \n rpId='");
        q63.y(sbR, this.c, "', \n allowList=", strValueOf, ", \n requestId=");
        sbR.append(this.e);
        sbR.append(", \n tokenBinding=");
        sbR.append(strValueOf2);
        sbR.append(", \n userVerification=");
        q63.y(sbR, strValueOf3, ", \n authenticationExtensions=", strValueOf4, ", \n longRequestId=");
        sbR.append(this.i);
        sbR.append("}");
        return sbR.toString();
    }

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l, String str3, ResultReceiver resultReceiver) {
        this.j = resultReceiver;
        if (str3 == null) {
            this.a = (byte[]) Preconditions.checkNotNull(bArr);
            this.b = d;
            this.c = (String) Preconditions.checkNotNull(str);
            this.d = arrayList;
            this.e = num;
            this.f = tokenBinding;
            this.i = l;
            if (str2 != null) {
                try {
                    this.g = UserVerificationRequirement.a(str2);
                } catch (zzbc e) {
                    defpackage.d.n(e);
                    throw null;
                }
            } else {
                this.g = null;
            }
            this.h = authenticationExtensions;
            return;
        }
        ((zzib) zzia.b.a.a).zza();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.a, false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.d, false);
        SafeParcelWriter.writeIntegerObject(parcel, 6, this.e, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f, i, false);
        UserVerificationRequirement userVerificationRequirement = this.g;
        if (userVerificationRequirement == null) {
            str = null;
        } else {
            str = userVerificationRequirement.a;
        }
        SafeParcelWriter.writeString(parcel, 8, str, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.h, i, false);
        SafeParcelWriter.writeLongObject(parcel, 10, this.i, false);
        SafeParcelWriter.writeString(parcel, 11, null, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.j, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
