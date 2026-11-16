package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.nj;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@SafeParcelable.Class(creator = "StrategyCreator")
@SafeParcelable.Reserved({1000})
public final class Strategy extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Strategy> CREATOR = new zzt();
    public static final Strategy c = new Strategy(1, 3);
    public static final Strategy d = new Strategy(1, 2);
    public static final Strategy e = new Strategy(1, 1);
    public final int a;
    public final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.a == strategy.a && this.b == strategy.b;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        if (c.equals(this)) {
            str = "P2P_CLUSTER";
        } else if (d.equals(this)) {
            str = "P2P_STAR";
        } else {
            str = e.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN";
        }
        return nj.l(this.b, "}", nj.s("Strategy(", this.a, str, "){connectionType=", ", topology="));
    }

    public Strategy(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 3, this.a);
        SafeParcelWriter.writeInt(parcel, 4, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
