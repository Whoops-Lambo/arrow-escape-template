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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "SignRequestParamsCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class SignRequestParams extends RequestParams {

    @NonNull
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new zzk();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.e;
        if (Objects.equal(this.a, signRequestParams.a) && Objects.equal(this.b, signRequestParams.b) && Objects.equal(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d)) {
            List list2 = this.e;
            if (list2.containsAll(list) && list.containsAll(list2) && Objects.equal(this.f, signRequestParams.f) && Objects.equal(this.g, signRequestParams.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d)));
    }

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        boolean z;
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        this.e = arrayList;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                RegisteredKey registeredKey = (RegisteredKey) obj;
                if (registeredKey.b != null || uri != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "registered key has null appId and no request appId is provided");
                Preconditions.checkArgument(true, "register request has null challenge and no default challenge isprovided");
                String str2 = registeredKey.b;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
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
        SafeParcelWriter.writeByteArray(parcel, 5, this.d, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.e, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
