package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "GetTokenResponseCreator")
@SafeParcelable.Reserved({1})
public class zzaia extends AbstractSafeParcelable implements zzafi<zzaia> {
    public static final Parcelable.Creator<zzaia> CREATOR = new zzaid();
    public String a;
    public String b;
    public Long c;
    public String d;
    public Long e;

    public static zzaia d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzaia zzaiaVar = new zzaia();
            zzaiaVar.a = jSONObject.optString("refresh_token", null);
            zzaiaVar.b = jSONObject.optString("access_token", null);
            zzaiaVar.c = Long.valueOf(jSONObject.optLong("expires_in"));
            zzaiaVar.d = jSONObject.optString("token_type", null);
            zzaiaVar.e = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzaiaVar;
        } catch (JSONException e) {
            Log.d("zzaia", "Failed to read GetTokenResponse from JSONObject");
            throw new zzaaw(e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = Strings.emptyToNull(jSONObject.optString("refresh_token"));
            this.b = Strings.emptyToNull(jSONObject.optString("access_token"));
            this.c = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.d = Strings.emptyToNull(jSONObject.optString("token_type"));
            this.e = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzaia", str, e);
        }
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.a);
            jSONObject.put("access_token", this.b);
            jSONObject.put("expires_in", this.c);
            jSONObject.put("token_type", this.d);
            jSONObject.put("issued_at", this.e);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("zzaia", "Failed to convert GetTokenResponse to JSON");
            throw new zzaaw(e);
        }
    }

    public final boolean zzg() {
        return DefaultClock.getInstance().currentTimeMillis() + 300000 < (this.c.longValue() * 1000) + this.e.longValue();
    }

    public zzaia(String str, String str2, String str3, Long l) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long jLongValue;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        Long l = this.c;
        if (l == null) {
            jLongValue = 0;
        } else {
            jLongValue = l.longValue();
        }
        SafeParcelWriter.writeLongObject(parcel, 4, Long.valueOf(jLongValue), false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        Long l2 = this.e;
        l2.getClass();
        SafeParcelWriter.writeLongObject(parcel, 6, l2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzaia() {
        this.e = Long.valueOf(System.currentTimeMillis());
    }

    public zzaia(String str, String str2, Long l, String str3, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = l2;
    }
}
