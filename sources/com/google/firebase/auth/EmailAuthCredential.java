package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import defpackage.f3;
import defpackage.hv3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "EmailAuthCredentialCreator")
public class EmailAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new hv3(9);
    public final String a;
    public final String b;
    public final String c;
    public String d;
    public boolean e;

    @Override // com.google.firebase.auth.AuthCredential
    public final String getProvider() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String getSignInMethod() {
        return !TextUtils.isEmpty(this.b) ? "password" : EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new EmailAuthCredential(this.a, this.b, this.c, this.d, this.e);
    }

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z) {
        this.a = Preconditions.checkNotEmpty(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            defpackage.d.r("Cannot create an EmailAuthCredential without a password or emailLink.");
            throw null;
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public static boolean d(String str) {
        f3 f3Var;
        int iIntValue;
        if (!TextUtils.isEmpty(str)) {
            zzal zzalVar = f3.d;
            Preconditions.checkNotEmpty(str);
            try {
                f3Var = new f3(str);
            } catch (IllegalArgumentException unused) {
                f3Var = null;
            }
            if (f3Var != null) {
                zzal zzalVar2 = f3.d;
                String str2 = f3Var.b;
                if (zzalVar2.containsKey(str2)) {
                    iIntValue = ((Integer) zzalVar2.get(str2)).intValue();
                } else {
                    iIntValue = 3;
                }
                if (iIntValue == 4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
