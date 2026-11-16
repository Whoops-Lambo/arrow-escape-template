package com.google.android.gms.fido.u2f.api.common;

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
/* JADX INFO: loaded from: classes10.dex */
@SafeParcelable.Class(creator = "ErrorResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class ErrorResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new zzd();
    public final ErrorCode a;
    public final String b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return Objects.equal(this.a, errorResponseData.a) && Objects.equal(this.b, errorResponseData.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    public ErrorResponseData(int i, String str) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (i == errorCode.a) {
                this.a = errorCode;
                this.b = str;
            }
        }
        errorCode = ErrorCode.OTHER_ERROR;
        this.a = errorCode;
        this.b = str;
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
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
