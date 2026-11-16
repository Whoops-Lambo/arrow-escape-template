package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.C4664b4;
import defpackage.d;
import defpackage.h50;
import defpackage.nj;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "VerifyAssertionRequestCreator")
@SafeParcelable.Reserved({1})
public final class zzajg extends AbstractSafeParcelable implements zzaff {
    public static final Parcelable.Creator<zzajg> CREATOR = new zzajj();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public String p;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        String str = this.m;
        String str2 = this.l;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.j);
        jSONObject.put("returnSecureToken", this.i);
        String str3 = this.b;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        String str4 = this.g;
        if (str4 != null) {
            jSONObject.put("postBody", str4);
        }
        String str5 = this.n;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.p;
        if (str6 != null) {
            jSONObject.put("pendingToken", str6);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("sessionId", str2);
        }
        if (TextUtils.isEmpty(str)) {
            String str7 = this.a;
            if (str7 != null) {
                jSONObject.put("requestUri", str7);
            }
        } else {
            jSONObject.put("requestUri", str);
        }
        jSONObject.put("returnIdpCredential", this.o);
        return jSONObject.toString();
    }

    public zzajg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = "http://localhost";
        this.c = str;
        this.d = str2;
        this.h = str4;
        this.k = str5;
        this.n = str6;
        this.p = str7;
        this.i = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str5)) {
            d.r("idToken, accessToken and authCode cannot all be null");
            throw null;
        }
        String strCheckNotEmpty = Preconditions.checkNotEmpty(str3);
        this.e = strCheckNotEmpty;
        this.f = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            h50.x("id_token=", str, sb, C4664b4.j.c);
        }
        if (!TextUtils.isEmpty(str2)) {
            h50.x("access_token=", str2, sb, C4664b4.j.c);
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append("identifier=null&");
        }
        if (!TextUtils.isEmpty(str4)) {
            h50.x("oauth_token_secret=", str4, sb, C4664b4.j.c);
        }
        if (!TextUtils.isEmpty(str5)) {
            h50.x("code=", str5, sb, C4664b4.j.c);
        }
        if (!TextUtils.isEmpty(str8)) {
            h50.x("nonce=", str8, sb, C4664b4.j.c);
        }
        this.g = nj.q(sb, "providerId=", strCheckNotEmpty);
        this.j = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.writeString(parcel, 6, this.e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f, false);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.writeString(parcel, 9, this.h, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.i);
        SafeParcelWriter.writeBoolean(parcel, 11, this.j);
        SafeParcelWriter.writeString(parcel, 12, this.k, false);
        SafeParcelWriter.writeString(parcel, 13, this.l, false);
        SafeParcelWriter.writeString(parcel, 14, this.m, false);
        SafeParcelWriter.writeString(parcel, 15, this.n, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.o);
        SafeParcelWriter.writeString(parcel, 17, this.p, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzajg() {
        this.i = true;
        this.j = true;
    }
}
