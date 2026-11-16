package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.s71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Profile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Profile> CREATOR = new b(6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final Uri g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.a;
        return ((str5 == null && ((Profile) obj).a == null) || s71.b(str5, ((Profile) obj).a)) && (((str = this.b) == null && ((Profile) obj).b == null) || s71.b(str, ((Profile) obj).b)) && ((((str2 = this.c) == null && ((Profile) obj).c == null) || s71.b(str2, ((Profile) obj).c)) && ((((str3 = this.d) == null && ((Profile) obj).d == null) || s71.b(str3, ((Profile) obj).d)) && ((((str4 = this.e) == null && ((Profile) obj).e == null) || s71.b(str4, ((Profile) obj).e)) && ((((uri = this.f) == null && ((Profile) obj).f == null) || s71.b(uri, ((Profile) obj).f)) && (((uri2 = this.g) == null && ((Profile) obj).g == null) || s71.b(uri2, ((Profile) obj).g))))));
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.g;
        if (uri2 != null) {
            return uri2.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    public Profile(JSONObject jSONObject) {
        Uri uri;
        this.a = jSONObject.optString("id", null);
        this.b = jSONObject.optString("first_name", null);
        this.c = jSONObject.optString("middle_name", null);
        this.d = jSONObject.optString("last_name", null);
        this.e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        if (strOptString == null) {
            uri = null;
        } else {
            uri = Uri.parse(strOptString);
        }
        this.f = uri;
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String string;
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        String string2 = null;
        Uri uri = this.f;
        if (uri != null) {
            string = uri.toString();
        } else {
            string = null;
        }
        parcel.writeString(string);
        Uri uri2 = this.g;
        if (uri2 != null) {
            string2 = uri2.toString();
        }
        parcel.writeString(string2);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        com.facebook.internal.v0.O(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = uri;
        this.g = uri2;
    }

    public Profile(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        String string = parcel.readString();
        this.f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.g = string2 != null ? Uri.parse(string2) : null;
    }
}
