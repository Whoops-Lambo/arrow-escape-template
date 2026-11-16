package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.cy3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AuthenticatorErrorResponseCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorErrorResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new zzl();
    public final ErrorCode a;
    public final String b;
    public final int c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return Objects.equal(this.a, authenticatorErrorResponse.a) && Objects.equal(this.b, authenticatorErrorResponse.b) && Objects.equal(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, Integer.valueOf(this.c));
    }

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (i == errorCode.a) {
                    this.a = errorCode;
                    this.b = str;
                    this.c = i2;
                    return;
                }
            }
            throw new ErrorCode.UnsupportedErrorCodeException(i);
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            defpackage.d.n(e);
            throw null;
        }
    }

    public final String toString() {
        zzbi zzbiVarA = zzbj.a(this);
        String strValueOf = String.valueOf(this.a.a);
        cy3 cy3Var = new cy3(15);
        zzbiVarA.c.d = cy3Var;
        zzbiVarA.c = cy3Var;
        cy3Var.c = strValueOf;
        cy3Var.b = IronSourceConstants.EVENTS_ERROR_CODE;
        String str = this.b;
        if (str != null) {
            zzbiVarA.a(str, "errorMessage");
        }
        return zzbiVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.a.a);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeInt(parcel, 4, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
