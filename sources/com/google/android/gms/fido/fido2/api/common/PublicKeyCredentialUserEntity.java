package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.ap4;
import defpackage.h50;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialUserEntityCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzau();
    public final zzgx a;
    public final String b;
    public final String c;
    public final String d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Objects.equal(this.a, publicKeyCredentialUserEntity.a) && Objects.equal(this.b, publicKeyCredentialUserEntity.b) && Objects.equal(this.c, publicKeyCredentialUserEntity.c) && Objects.equal(this.d, publicKeyCredentialUserEntity.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        StringBuilder sbR = h50.r("PublicKeyCredentialUserEntity{\n id=", Base64Utils.encodeUrlSafeNoPadding(this.a.t()), ", \n name='");
        sbR.append(this.b);
        sbR.append("', \n icon='");
        sbR.append(this.c);
        sbR.append("', \n displayName='");
        return nj.q(sbR, this.d, "'}");
    }

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        byte[] bArr2 = (byte[]) Preconditions.checkNotNull(bArr);
        ap4 ap4Var = zzgx.b;
        this.a = (zzgx) Preconditions.checkNotNull(zzgx.r(bArr2.length, bArr2));
        this.b = (String) Preconditions.checkNotNull(str);
        this.c = str2;
        this.d = (String) Preconditions.checkNotNull(str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.a.t(), false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
