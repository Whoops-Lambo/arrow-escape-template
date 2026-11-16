package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaaw;
import defpackage.s42;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "PhoneMultiFactorInfoCreator")
public class PhoneMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new s42(29);
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public static PhoneMultiFactorInfo t0(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            defpackage.d.r("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
            return null;
        }
        return new PhoneMultiFactorInfo(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String r0() {
        return "phone";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.a);
            jSONObject.putOpt("displayName", this.b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            jSONObject.putOpt("phoneNumber", this.d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaaw(e);
        }
    }

    public PhoneMultiFactorInfo(long j, String str, String str2, String str3) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = str2;
        this.c = j;
        this.d = Preconditions.checkNotEmpty(str3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
