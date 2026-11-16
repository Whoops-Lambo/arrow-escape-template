package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaaw;
import com.google.firebase.auth.UserInfo;
import defpackage.s42;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "DefaultAuthUserInfoCreator")
public final class zzz extends AbstractSafeParcelable implements UserInfo {
    public static final Parcelable.Creator<zzz> CREATOR = new s42(20);
    public String a;
    public String b;
    public String c;
    public String d;
    public Uri e;
    public String f;
    public String g;
    public boolean h;
    public String i;

    public static zzz d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzz(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaaw(e);
        }
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getDisplayName() {
        return this.c;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getEmail() {
        return this.f;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getPhoneNumber() {
        return this.g;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final Uri getPhotoUrl() {
        String str = this.d;
        if (!TextUtils.isEmpty(str) && this.e == null) {
            this.e = Uri.parse(str);
        }
        return this.e;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getProviderId() {
        return this.b;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getUid() {
        return this.a;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final boolean isEmailVerified() {
        return this.h;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.a);
            jSONObject.putOpt("providerId", this.b);
            jSONObject.putOpt("displayName", this.c);
            jSONObject.putOpt("photoUrl", this.d);
            jSONObject.putOpt("email", this.f);
            jSONObject.putOpt("phoneNumber", this.g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.h));
            jSONObject.putOpt("rawUserInfo", this.i);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaaw(e);
        }
    }

    public zzz(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.a = str;
        this.b = str2;
        this.f = str3;
        this.g = str4;
        this.c = str5;
        this.d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.e = Uri.parse(str6);
        }
        this.h = z;
        this.i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f, false);
        SafeParcelWriter.writeString(parcel, 6, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.h);
        SafeParcelWriter.writeString(parcel, 8, this.i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
