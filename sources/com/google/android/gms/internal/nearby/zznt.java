package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@SafeParcelable.Class(creator = "PresenceActionCreator")
public final class zznt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznt> CREATOR = new zznu();
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof zznt) && this.a == ((zznt) obj).a;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a));
    }

    public final String toString() {
        return h50.l(new StringBuilder("PresenceAction[action="), this.a, ']');
    }

    public zznt(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
