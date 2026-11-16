package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q extends o {
    public static final Parcelable.Creator<q> CREATOR = new p();
    public final String b;
    public final byte[] c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (z.a(this.b, qVar.b) && Arrays.equals(this.c, qVar.c)) {
                return true;
            }
        }
        return false;
    }

    public q(Parcel parcel) {
        super("PRIV");
        this.b = parcel.readString();
        this.c = parcel.createByteArray();
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public q(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }
}
