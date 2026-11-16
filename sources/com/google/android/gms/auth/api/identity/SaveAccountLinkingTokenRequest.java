package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "SaveAccountLinkingTokenRequestCreator")
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new zbq();
    public final PendingIntent a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final int f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = saveAccountLinkingTokenRequest.d;
        List list2 = this.d;
        return list2.size() == list.size() && list2.containsAll(list) && Objects.equal(this.a, saveAccountLinkingTokenRequest.a) && Objects.equal(this.b, saveAccountLinkingTokenRequest.b) && Objects.equal(this.c, saveAccountLinkingTokenRequest.c) && Objects.equal(this.e, saveAccountLinkingTokenRequest.e) && this.f == saveAccountLinkingTokenRequest.f;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.e);
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = str3;
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.d, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
