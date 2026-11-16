package io.p071bidmachine.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.singular.sdk.internal.UserDetailsUtils;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new i(1);
    public final int a;
    public final int b;
    public final int c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.a == streamKey.a && this.b == streamKey.b && this.c == streamKey.c) {
                return true;
            }
        }
        return false;
    }

    static {
        x.G(0);
        x.G(1);
        x.G(2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.a - streamKey2.a;
        return (i == 0 && (i = this.b - streamKey2.b) == 0) ? this.c - streamKey2.c : i;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + UserDetailsUtils.UserDetailsLiterals.DOT + this.b + UserDetailsUtils.UserDetailsLiterals.DOT + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public StreamKey(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    public StreamKey() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }
}
