package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "MessageWrapperCreator")
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    public final int a;
    public final Message b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzae) {
            return Objects.equal(this.b, ((zzae) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }

    public final String toString() {
        return pv1.n("MessageWrapper{message=", this.b.toString(), "}");
    }

    public zzae(int i, Message message) {
        this.a = i;
        this.b = (Message) Preconditions.checkNotNull(message);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.b, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
