package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "PayloadTransferUpdateCreator")
@SafeParcelable.Reserved({1000})
public final class PayloadTransferUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new zzs();
    public long a;
    public int b;
    public long c;
    public long d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            if (Objects.equal(Long.valueOf(this.a), Long.valueOf(payloadTransferUpdate.a)) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(payloadTransferUpdate.b)) && Objects.equal(Long.valueOf(this.c), Long.valueOf(payloadTransferUpdate.c)) && Objects.equal(Long.valueOf(this.d), Long.valueOf(payloadTransferUpdate.d))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        public final PayloadTransferUpdate a;

        public Builder(PayloadTransferUpdate payloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate();
            this.a = payloadTransferUpdate2;
            payloadTransferUpdate2.a = payloadTransferUpdate.a;
            payloadTransferUpdate2.b = payloadTransferUpdate.b;
            payloadTransferUpdate2.c = payloadTransferUpdate.c;
            payloadTransferUpdate2.d = payloadTransferUpdate.d;
        }

        public Builder() {
            this.a = new PayloadTransferUpdate();
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d));
    }

    private PayloadTransferUpdate() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeLong(parcel, 4, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
