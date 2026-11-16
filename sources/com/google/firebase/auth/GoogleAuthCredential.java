package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.s42;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GoogleAuthCredentialCreator")
public class GoogleAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new s42(24);
    public final String a;
    public final String b;

    @Override // com.google.firebase.auth.AuthCredential
    public final String getProvider() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String getSignInMethod() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new GoogleAuthCredential(this.a, this.b);
    }

    public GoogleAuthCredential(String str, String str2) {
        if (str == null && str2 == null) {
            defpackage.d.r("Must specify an idToken or an accessToken.");
            throw null;
        }
        if (str != null && str.length() == 0) {
            defpackage.d.r("idToken cannot be empty");
            throw null;
        }
        if (str2 != null && str2.length() == 0) {
            defpackage.d.r("accessToken cannot be empty");
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
