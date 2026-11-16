package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zbg();
    public final PasswordRequestOptions a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final PasskeysRequestOptions f;
    public final PasskeyJsonRequestOptions g;
    public final boolean h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbm();
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final ArrayList f;
        public final boolean g;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder {
            public boolean a = false;
            public String b = null;
            public String c = null;
            public boolean d = true;
            public final String e = null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.a == googleIdTokenRequestOptions.a && Objects.equal(this.b, googleIdTokenRequestOptions.b) && Objects.equal(this.c, googleIdTokenRequestOptions.c) && this.d == googleIdTokenRequestOptions.d && Objects.equal(this.e, googleIdTokenRequestOptions.e) && Objects.equal(this.f, googleIdTokenRequestOptions.f) && this.g == googleIdTokenRequestOptions.g;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g));
        }

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            Preconditions.checkArgument(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.a = z;
            if (z) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.f = arrayList2;
            this.e = str3;
            this.g = z3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, this.a);
            SafeParcelWriter.writeString(parcel, 2, this.b, false);
            SafeParcelWriter.writeString(parcel, 3, this.c, false);
            SafeParcelWriter.writeBoolean(parcel, 4, this.d);
            SafeParcelWriter.writeString(parcel, 5, this.e, false);
            SafeParcelWriter.writeStringList(parcel, 6, this.f, false);
            SafeParcelWriter.writeBoolean(parcel, 7, this.g);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Class(creator = "PasskeyJsonRequestOptionsCreator")
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new zbn();
        public final boolean a;
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder {
            public boolean a = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.a == passkeyJsonRequestOptions.a && Objects.equal(this.b, passkeyJsonRequestOptions.b);
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.a), this.b);
        }

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                Preconditions.checkNotNull(str);
            }
            this.a = z;
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, this.a);
            SafeParcelWriter.writeString(parcel, 2, this.b, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Class(creator = "PasskeysRequestOptionsCreator")
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zbo();
        public final boolean a;
        public final byte[] b;
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder {
            public boolean a = false;
            public byte[] b;
            public String c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.a == passkeysRequestOptions.a && Arrays.equals(this.b, passkeysRequestOptions.b) && java.util.Objects.equals(this.c, passkeysRequestOptions.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (java.util.Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
        }

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                Preconditions.checkNotNull(bArr);
                Preconditions.checkNotNull(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, this.a);
            SafeParcelWriter.writeByteArray(parcel, 2, this.b, false);
            SafeParcelWriter.writeString(parcel, 3, this.c, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbp();
        public final boolean a;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder {
            public boolean a = false;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.a == ((PasswordRequestOptions) obj).a;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.a));
        }

        public PasswordRequestOptions(boolean z) {
            this.a = z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, this.a);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public static final class Builder {
        public PasswordRequestOptions a;
        public GoogleIdTokenRequestOptions b;
        public PasskeysRequestOptions c;
        public PasskeyJsonRequestOptions d;
        public String e;
        public boolean f;
        public int g;
        public boolean h;

        public Builder() {
            Parcelable.Creator<PasswordRequestOptions> creator = PasswordRequestOptions.CREATOR;
            PasswordRequestOptions.Builder builder = new PasswordRequestOptions.Builder();
            builder.a = false;
            this.a = new PasswordRequestOptions(builder.a);
            Parcelable.Creator<GoogleIdTokenRequestOptions> creator2 = GoogleIdTokenRequestOptions.CREATOR;
            GoogleIdTokenRequestOptions.Builder builder2 = new GoogleIdTokenRequestOptions.Builder();
            builder2.a = false;
            this.b = new GoogleIdTokenRequestOptions(builder2.a, builder2.b, builder2.c, builder2.d, builder2.e, null, false);
            Parcelable.Creator<PasskeysRequestOptions> creator3 = PasskeysRequestOptions.CREATOR;
            PasskeysRequestOptions.Builder builder3 = new PasskeysRequestOptions.Builder();
            builder3.a = false;
            boolean z = builder3.a;
            this.c = new PasskeysRequestOptions(builder3.c, builder3.b, z);
            Parcelable.Creator<PasskeyJsonRequestOptions> creator4 = PasskeyJsonRequestOptions.CREATOR;
            PasskeyJsonRequestOptions.Builder builder4 = new PasskeyJsonRequestOptions.Builder();
            builder4.a = false;
            this.d = new PasskeyJsonRequestOptions(builder4.a, null);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return Objects.equal(this.a, beginSignInRequest.a) && Objects.equal(this.b, beginSignInRequest.b) && Objects.equal(this.f, beginSignInRequest.f) && Objects.equal(this.g, beginSignInRequest.g) && Objects.equal(this.c, beginSignInRequest.c) && this.d == beginSignInRequest.d && this.e == beginSignInRequest.e && this.h == beginSignInRequest.h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h));
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        this.a = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.b = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.c = str;
        this.d = z;
        this.e = i;
        if (passkeysRequestOptions == null) {
            Parcelable.Creator<PasskeysRequestOptions> creator = PasskeysRequestOptions.CREATOR;
            PasskeysRequestOptions.Builder builder = new PasskeysRequestOptions.Builder();
            builder.a = false;
            boolean z3 = builder.a;
            passkeysRequestOptions = new PasskeysRequestOptions(builder.c, builder.b, z3);
        }
        this.f = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            Parcelable.Creator<PasskeyJsonRequestOptions> creator2 = PasskeyJsonRequestOptions.CREATOR;
            PasskeyJsonRequestOptions.Builder builder2 = new PasskeyJsonRequestOptions.Builder();
            builder2.a = false;
            passkeyJsonRequestOptions = new PasskeyJsonRequestOptions(builder2.a, null);
        }
        this.g = passkeyJsonRequestOptions;
        this.h = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.h);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
