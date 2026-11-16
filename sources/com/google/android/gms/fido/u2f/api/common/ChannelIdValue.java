package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.d;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ChannelIdValueCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class ChannelIdValue extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new zzb();
    public final ChannelIdValueType a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new a();
        public final int a;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }

        ChannelIdValueType(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class UnsupportedChannelIdValueTypeException extends Exception {
        public UnsupportedChannelIdValueTypeException(int i) {
            super(jc1.k(i, "ChannelIdValueType ", " not supported"));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.a;
        ChannelIdValueType channelIdValueType2 = this.a;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int iOrdinal = channelIdValueType2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.b.equals(channelIdValue.b);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.c.equals(channelIdValue.c);
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public final int hashCode() {
        int i;
        int iHashCode;
        ChannelIdValueType channelIdValueType = this.a;
        int iHashCode2 = channelIdValueType.hashCode() + 31;
        int iOrdinal = channelIdValueType.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.b.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.c.hashCode();
        }
        return iHashCode + i;
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
                if (i == channelIdValueType.a) {
                    this.a = channelIdValueType;
                    this.b = str;
                    this.c = str2;
                    return;
                }
            }
            throw new UnsupportedChannelIdValueTypeException(i);
        } catch (UnsupportedChannelIdValueTypeException e) {
            d.n(e);
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.a.a);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private ChannelIdValue() {
        this.a = ChannelIdValueType.ABSENT;
        this.c = null;
        this.b = null;
    }

    public ChannelIdValue(String str) {
        this.b = (String) Preconditions.checkNotNull(str);
        this.a = ChannelIdValueType.STRING;
        this.c = null;
    }
}
