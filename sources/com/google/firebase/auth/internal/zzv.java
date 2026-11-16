package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import defpackage.hv3;
import defpackage.ty3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "DefaultAdditionalUserInfoCreator")
public final class zzv implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzv> CREATOR = new hv3(14);
    public final String a;
    public final String b;
    public final ArrayMap c;
    public final boolean d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final Map getProfile() {
        return this.c;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getProviderId() {
        return this.a;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getUsername() {
        String str = this.a;
        boolean zEquals = "github.com".equals(str);
        ArrayMap arrayMap = this.c;
        if (zEquals) {
            return (String) arrayMap.get(AppLovinEventTypes.USER_LOGGED_IN);
        }
        if ("twitter.com".equals(str)) {
            return (String) arrayMap.get("screen_name");
        }
        return null;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final boolean isNewUser() {
        return this.d;
    }

    public zzv(String str, String str2, boolean z) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.a = str;
        this.b = str2;
        this.c = ty3.d(str2);
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzv(boolean z) {
        this.d = z;
        this.b = null;
        this.a = null;
        this.c = null;
    }
}
