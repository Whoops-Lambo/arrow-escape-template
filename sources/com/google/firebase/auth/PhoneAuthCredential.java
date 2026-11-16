package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.s42;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
public class PhoneAuthCredential extends AuthCredential implements Cloneable {

    @NonNull
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new s42(28);

    @Nullable
    @SafeParcelable.Field(getter = "getSessionInfo", id = 1)
    private String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getSmsCode", id = 2)
    private String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 4)
    private String zzc;

    @SafeParcelable.Field(getter = "getAutoCreate", id = 5)
    private boolean zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getTemporaryProof", id = 6)
    private String zze;

    @NonNull
    public static PhoneAuthCredential zza(@NonNull String str, @NonNull String str2) {
        return new PhoneAuthCredential(str, str2, null, true, null);
    }

    @NonNull
    public static PhoneAuthCredential zzb(@NonNull String str, @NonNull String str2) {
        return new PhoneAuthCredential(null, null, str, true, str2);
    }

    @NonNull
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new PhoneAuthCredential(this.zza, getSmsCode(), this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    public String getProvider() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    public String getSignInMethod() {
        return "phone";
    }

    @Nullable
    public String getSmsCode() {
        return this.zzb;
    }

    @Nullable
    public final String zzc() {
        return this.zza;
    }

    @Nullable
    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzd;
    }

    @SafeParcelable.Constructor
    public PhoneAuthCredential(@Nullable @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) boolean z, @Nullable @SafeParcelable.Param(id = 6) String str4) {
        boolean z2;
        if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z;
        this.zze = str4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, getSmsCode(), false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    public final AuthCredential zza() {
        return (PhoneAuthCredential) clone();
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    @NonNull
    public final PhoneAuthCredential zza(boolean z) {
        this.zzd = false;
        return this;
    }
}
