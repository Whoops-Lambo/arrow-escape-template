package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import defpackage.d;
import defpackage.nj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "KeyHandleCreator")
@Deprecated
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new zze();
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        List list = keyHandle.d;
        if (!Arrays.equals(this.b, keyHandle.b) || !this.c.equals(keyHandle.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d);
    }

    public final String toString() {
        List list = this.d;
        String string = list == null ? "null" : list.toString();
        String strEncode = Base64Utils.encode(this.b);
        StringBuilder sb = new StringBuilder("{keyHandle: ");
        sb.append(strEncode);
        sb.append(", version: ");
        sb.append(this.c);
        sb.append(", transports: ");
        return nj.q(sb, string, "}");
    }

    public KeyHandle(int i, String str, ArrayList arrayList, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.d = arrayList;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            d.n(e);
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c.a, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
