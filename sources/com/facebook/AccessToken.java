package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import defpackage.s71;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "com/facebook/a", "com/facebook/appevents/h", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AccessToken implements Parcelable {
    public final Date a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final String e;
    public final j f;
    public final Date g;
    public final String h;
    public final String i;
    public final Date j;
    public final String k;
    public static final Date l = new Date(Long.MAX_VALUE);
    public static final Date m = new Date();
    public static final j n = j.FACEBOOK_APPLICATION_WEB;

    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR = new b(0);

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, j jVar, Date date, Date date2, Date date3, String str4) {
        com.explorestack.protobuf.z.r(str, str2, str3);
        com.facebook.internal.v0.L(str, "accessToken");
        com.facebook.internal.v0.L(str2, "applicationId");
        com.facebook.internal.v0.L(str3, "userId");
        Date date4 = l;
        this.a = date == null ? date4 : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        setUnmodifiableSet.getClass();
        this.b = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        setUnmodifiableSet2.getClass();
        this.c = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        setUnmodifiableSet3.getClass();
        this.d = setUnmodifiableSet3;
        this.e = str;
        jVar = jVar == null ? n : jVar;
        if (str4 != null && str4.equals("instagram")) {
            int iOrdinal = jVar.ordinal();
            if (iOrdinal == 1) {
                jVar = j.INSTAGRAM_APPLICATION_WEB;
            } else if (iOrdinal == 4) {
                jVar = j.INSTAGRAM_WEB_VIEW;
            } else if (iOrdinal == 5) {
                jVar = j.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f = jVar;
        this.g = date2 == null ? m : date2;
        this.h = str2;
        this.i = str3;
        this.j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.k = str4 == null ? "facebook" : str4;
    }

    public static String a() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (s71.b(this.a, accessToken.a) && s71.b(this.b, accessToken.b) && s71.b(this.c, accessToken.c) && s71.b(this.d, accessToken.d) && s71.b(this.e, accessToken.e) && this.f == accessToken.f && s71.b(this.g, accessToken.g) && s71.b(this.h, accessToken.h) && s71.b(this.i, accessToken.i) && s71.b(this.j, accessToken.j)) {
            String str = accessToken.k;
            String str2 = this.k;
            if (str2 == null) {
                zB = str == null;
            } else {
                zB = s71.b(str2, str);
            }
            if (zB) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        return new Date().after(this.a);
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.e);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.d));
        jSONObject.put("last_refresh", this.g.getTime());
        jSONObject.put("source", this.f.name());
        jSONObject.put("application_id", this.h);
        jSONObject.put("user_id", this.i);
        jSONObject.put("data_access_expiration_time", this.j.getTime());
        String str = this.k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + n30.c(n30.c((this.g.hashCode() + ((this.f.hashCode() + n30.c((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i)) * 31;
        String str = this.k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        synchronized (a0.b) {
        }
        sb.append(TextUtils.join(", ", this.b));
        sb.append("]}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a.getTime());
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeStringList(new ArrayList(this.c));
        parcel.writeStringList(new ArrayList(this.d));
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeLong(this.g.getTime());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeLong(this.j.getTime());
        parcel.writeString(this.k);
    }

    public AccessToken(Parcel parcel) {
        j jVarValueOf;
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet.getClass();
        this.b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet2.getClass();
        this.c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet3.getClass();
        this.d = setUnmodifiableSet3;
        String string = parcel.readString();
        com.facebook.internal.v0.O(string, "token");
        this.e = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            jVarValueOf = j.valueOf(string2);
        } else {
            jVarValueOf = n;
        }
        this.f = jVarValueOf;
        this.g = new Date(parcel.readLong());
        String string3 = parcel.readString();
        com.facebook.internal.v0.O(string3, "applicationId");
        this.h = string3;
        String string4 = parcel.readString();
        com.facebook.internal.v0.O(string4, "userId");
        this.i = string4;
        this.j = new Date(parcel.readLong());
        this.k = parcel.readString();
    }
}
