package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.hv3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "UserProfileChangeRequestCreator")
@SafeParcelable.Reserved({1})
public class UserProfileChangeRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new hv3(3);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Uri e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {

        @Nullable
        private String zza;

        @Nullable
        private Uri zzb;
        private boolean zzc;
        private boolean zzd;

        @NonNull
        public UserProfileChangeRequest build() {
            String str = this.zza;
            Uri uri = this.zzb;
            return new UserProfileChangeRequest(str, uri == null ? null : uri.toString(), this.zzc, this.zzd);
        }

        @Nullable
        @KeepForSdk
        public String getDisplayName() {
            return this.zza;
        }

        @Nullable
        @KeepForSdk
        public Uri getPhotoUri() {
            return this.zzb;
        }

        @NonNull
        public Builder setDisplayName(@Nullable String str) {
            if (str == null) {
                this.zzc = true;
                return this;
            }
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setPhotoUri(@Nullable Uri uri) {
            if (uri == null) {
                this.zzd = true;
                return this;
            }
            this.zzb = uri;
            return this;
        }
    }

    public UserProfileChangeRequest(String str, String str2, boolean z, boolean z2) {
        Uri uri;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else {
            uri = Uri.parse(str2);
        }
        this.e = uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
