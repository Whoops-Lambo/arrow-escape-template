package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.ap4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "AuthenticationExtensionsDevicePublicKeyOutputsCreator")
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final zzgx a;
    public final zzgx b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Objects.equal(this.a, zzfVar.a) && Objects.equal(this.b, zzfVar.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    public zzf(ap4 ap4Var, ap4 ap4Var2) {
        this.a = ap4Var;
        this.b = ap4Var2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArrT;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] bArrT2 = null;
        zzgx zzgxVar = this.a;
        if (zzgxVar == null) {
            bArrT = null;
        } else {
            bArrT = zzgxVar.t();
        }
        SafeParcelWriter.writeByteArray(parcel, 1, bArrT, false);
        zzgx zzgxVar2 = this.b;
        if (zzgxVar2 != null) {
            bArrT2 = zzgxVar2.t();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrT2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
