package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zznh;
import defpackage.nj;
import defpackage.pv1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "MessageCreator")
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Message> CREATOR = new zza();
    public static final zznh[] g = {zznh.d};
    public final int a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final zznh[] e;
    public final long f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.d, message.d) && TextUtils.equals(this.c, message.c) && Arrays.equals(this.b, message.b) && this.f == message.f;
    }

    public final int hashCode() {
        return Objects.hashCode(this.d, this.c, Integer.valueOf(Arrays.hashCode(this.b)), Long.valueOf(this.f));
    }

    public final String toString() {
        byte[] bArr = this.b;
        return nj.l(bArr == null ? 0 : bArr.length, " bytes]}", pv1.r("Message{namespace='", this.d, "', type='", this.c, "', content=["));
    }

    public Message(int i, byte[] bArr, String str, String str2, zznh[] zznhVarArr, long j) {
        boolean z;
        this.a = i;
        this.c = (String) Preconditions.checkNotNull(str2);
        this.d = str == null ? "" : str;
        this.f = j;
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        Object[] objArr = {Integer.valueOf(length), 102400};
        if (length <= 102400) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", objArr);
        this.b = bArr;
        this.e = (zznhVarArr == null || zznhVarArr.length == 0) ? g : zznhVarArr;
        Preconditions.checkArgument(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeString(parcel, 3, this.d, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.e, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
