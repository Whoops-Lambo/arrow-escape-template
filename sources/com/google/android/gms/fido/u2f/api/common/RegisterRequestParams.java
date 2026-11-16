package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "RegisterRequestParamsCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class RegisterRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new zzh();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.e;
        return Objects.equal(this.a, registerRequestParams.a) && Objects.equal(this.b, registerRequestParams.b) && Objects.equal(this.c, registerRequestParams.c) && Objects.equal(this.d, registerRequestParams.d) && (((list = this.e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && Objects.equal(this.f, registerRequestParams.f) && Objects.equal(this.g, registerRequestParams.g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.c, this.b, this.d, this.e, this.f, this.g);
    }

    public RegisterRequestParams(Integer num, Double d, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = num;
        this.b = d;
        this.c = uri;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "empty list of register requests is provided");
        this.d = arrayList;
        this.e = arrayList2;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RegisterRequest registerRequest = (RegisterRequest) obj;
            if (uri != null || registerRequest.d != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            Preconditions.checkArgument(z3, "register request has null appId and no request appId is provided");
            String str2 = registerRequest.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            RegisteredKey registeredKey = (RegisteredKey) obj2;
            if (uri != null || registeredKey.b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "registered key has null appId and no request appId is provided");
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        Preconditions.checkArgument(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 2, this.a, false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.d, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.e, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
