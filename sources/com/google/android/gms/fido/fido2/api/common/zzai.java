package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhk;
import defpackage.ap4;
import defpackage.nj;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "HmacSecretExtensionCreator")
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();
    public final zzgx a;
    public final zzgx b;
    public final zzgx c;
    public final int d;

    public final String toString() {
        zzgx zzgxVar = this.a;
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(zzgxVar == null ? null : zzgxVar.t());
        zzgx zzgxVar2 = this.b;
        String strEncodeUrlSafeNoPadding2 = Base64Utils.encodeUrlSafeNoPadding(zzgxVar2 == null ? null : zzgxVar2.t());
        zzgx zzgxVar3 = this.c;
        String strEncodeUrlSafeNoPadding3 = Base64Utils.encodeUrlSafeNoPadding(zzgxVar3 != null ? zzgxVar3.t() : null);
        StringBuilder sbR = pv1.r("HmacSecretExtension{coseKeyAgreement=", strEncodeUrlSafeNoPadding, ", saltEnc=", strEncodeUrlSafeNoPadding2, ", saltAuth=");
        sbR.append(strEncodeUrlSafeNoPadding3);
        sbR.append(", getPinUvAuthProtocol=");
        return nj.l(this.d, "}", sbR);
    }

    static {
        new zzhk(1L);
        new zzhk(2L);
        new zzhk(3L);
        new zzhk(4L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return Objects.equal(this.a, zzaiVar.a) && Objects.equal(this.b, zzaiVar.b) && Objects.equal(this.c, zzaiVar.c) && this.d == zzaiVar.d;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Integer.valueOf(this.d));
    }

    public zzai(ap4 ap4Var, ap4 ap4Var2, ap4 ap4Var3, int i) {
        this.a = ap4Var;
        this.b = ap4Var2;
        this.c = ap4Var3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArrT;
        byte[] bArrT2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] bArrT3 = null;
        zzgx zzgxVar = this.a;
        if (zzgxVar == null) {
            bArrT = null;
        } else {
            bArrT = zzgxVar.t();
        }
        SafeParcelWriter.writeByteArray(parcel, 1, bArrT, false);
        zzgx zzgxVar2 = this.b;
        if (zzgxVar2 == null) {
            bArrT2 = null;
        } else {
            bArrT2 = zzgxVar2.t();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrT2, false);
        zzgx zzgxVar3 = this.c;
        if (zzgxVar3 != null) {
            bArrT3 = zzgxVar3.t();
        }
        SafeParcelWriter.writeByteArray(parcel, 3, bArrT3, false);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
