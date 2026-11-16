package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaaw;
import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import defpackage.hv3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "TotpMultiFactorInfoCreator")
public class TotpMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new hv3(1);
    public final String a;
    public final String b;
    public final long c;
    public final zzaje d;

    public static TotpMultiFactorInfo t0(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            defpackage.d.r("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
            return null;
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") != null) {
            return new TotpMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzaje());
        }
        defpackage.d.r("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        return null;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String r0() {
        return "totp";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.a);
            jSONObject.putOpt("displayName", this.b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            jSONObject.putOpt("totpInfo", this.d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaaw(e);
        }
    }

    public TotpMultiFactorInfo(String str, String str2, long j, zzaje zzajeVar) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = str2;
        this.c = j;
        this.d = (zzaje) Preconditions.checkNotNull(zzajeVar, "totpInfo cannot be null.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
