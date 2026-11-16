package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    public static final Clock m = DefaultClock.getInstance();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long g;
    public final String h;
    public final List i;
    public final String j;
    public final String k;
    public final HashSet l = new HashSet();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.h.equals(this.h) && googleSignInAccount.r0().equals(r0());
    }

    public final int hashCode() {
        return ((this.h.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + r0().hashCode();
    }

    public final HashSet r0() {
        HashSet hashSet = new HashSet(this.i);
        hashSet.addAll(this.l);
        return hashSet;
    }

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = arrayList;
        this.j = str7;
        this.k = str8;
    }

    public static GoogleSignInAccount t0(String str) throws JSONException {
        Uri uri;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString7 = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(strOptString7)) {
            uri = Uri.parse(strOptString7);
        } else {
            uri = null;
        }
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString8 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            strOptString = jSONObject.optString("tokenId");
        } else {
            strOptString = null;
        }
        if (jSONObject.has("email")) {
            strOptString2 = jSONObject.optString("email");
        } else {
            strOptString2 = null;
        }
        if (jSONObject.has("displayName")) {
            strOptString3 = jSONObject.optString("displayName");
        } else {
            strOptString3 = null;
        }
        if (jSONObject.has("givenName")) {
            strOptString4 = jSONObject.optString("givenName");
        } else {
            strOptString4 = null;
        }
        if (jSONObject.has("familyName")) {
            strOptString5 = jSONObject.optString("familyName");
        } else {
            strOptString5 = null;
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString8, strOptString, strOptString2, strOptString3, uri, null, j, Preconditions.checkNotEmpty(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) Preconditions.checkNotNull(hashSet)), strOptString4, strOptString5);
        if (jSONObject.has("serverAuthCode")) {
            strOptString6 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.f = strOptString6;
        return googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.e, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.f, false);
        SafeParcelWriter.writeLong(parcel, 8, this.g);
        SafeParcelWriter.writeString(parcel, 9, this.h, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.i, false);
        SafeParcelWriter.writeString(parcel, 11, this.j, false);
        SafeParcelWriter.writeString(parcel, 12, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
