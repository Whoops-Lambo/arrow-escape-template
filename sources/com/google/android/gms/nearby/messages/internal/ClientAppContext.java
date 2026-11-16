package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.nj;
import defpackage.pv1;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "ClientAppContextCreator")
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new zzd();
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final String f;

    public static final ClientAppContext d(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(1, str, str2, null, z, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        String str = clientAppContext.b;
        String str2 = this.b;
        if (!(TextUtils.isEmpty(str2) ? TextUtils.isEmpty(str) : str2.equals(str))) {
            return false;
        }
        String str3 = clientAppContext.c;
        String str4 = this.c;
        if (!(TextUtils.isEmpty(str4) ? TextUtils.isEmpty(str3) : str4.equals(str3)) || this.d != clientAppContext.d) {
            return false;
        }
        String str5 = clientAppContext.f;
        String str6 = this.f;
        return (TextUtils.isEmpty(str6) ? TextUtils.isEmpty(str5) : str6.equals(str5)) && this.e == clientAppContext.e;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e));
    }

    public final String toString() {
        Locale locale = Locale.US;
        StringBuilder sbR = pv1.r("{realClientPackageName: ", this.b, ", zeroPartyIdentifier: ", this.c, ", useRealClientApiKey: ");
        sbR.append(this.d);
        sbR.append(", apiKey: ");
        sbR.append(this.f);
        sbR.append(", callingContext: ");
        return nj.l(this.e, "}", sbR);
    }

    public ClientAppContext(int i, String str, String str2, String str3, boolean z, int i2) {
        this.a = i;
        this.b = (String) Preconditions.checkNotNull(str);
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Locale locale = Locale.US;
            Log.w("NearbyMessages", "ClientAppContext: 0P identifier(" + str2 + ") without 0P prefix(0p:)");
            str2 = "0p:".concat(str2);
        }
        this.c = str2;
        this.d = z;
        this.e = i2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
