package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzajg;
import defpackage.hv3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "DefaultOAuthCredentialCreator")
public final class zzc extends OAuthCredential {
    public static final Parcelable.Creator<zzc> CREATOR = new hv3(8);
    public final String a;
    public final String b;
    public final String c;
    public final zzajg d;
    public final String e;
    public final String f;
    public final String g;

    public static zzc d(zzajg zzajgVar) {
        Preconditions.checkNotNull(zzajgVar, "Must specify a non-null webSignInCredential");
        return new zzc(null, null, null, zzajgVar, null, null, null);
    }

    public static zzc r0(String str, String str2, String str3, String str4, String str5) {
        Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new zzc(str, str2, str3, null, str4, str5, null);
        }
        defpackage.d.r("Must specify an idToken or an accessToken.");
        return null;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String getProvider() {
        return this.a;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String getSignInMethod() {
        return this.a;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new zzc(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public zzc(String str, String str2, String str3, zzajg zzajgVar, String str4, String str5, String str6) {
        this.a = str == null ? "" : str;
        this.b = str2;
        this.c = str3;
        this.d = zzajgVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeString(parcel, 7, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
