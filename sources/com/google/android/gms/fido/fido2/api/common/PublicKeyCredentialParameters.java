package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialParametersCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new zzaq();
    public final PublicKeyCredentialType a;
    public final COSEAlgorithmIdentifier b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.a.equals(publicKeyCredentialParameters.a) && this.b.equals(publicKeyCredentialParameters.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    public final String toString() {
        return n30.n("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    public PublicKeyCredentialParameters(String str, int i) {
        Preconditions.checkNotNull(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            Preconditions.checkNotNull(Integer.valueOf(i));
            try {
                this.b = COSEAlgorithmIdentifier.a(i);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                defpackage.d.n(e);
                throw null;
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            defpackage.d.n(e2);
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        this.a.getClass();
        SafeParcelWriter.writeString(parcel, 2, "public-key", false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, Integer.valueOf(this.b.a.d()), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
