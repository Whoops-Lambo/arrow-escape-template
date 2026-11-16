package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.nj;
import defpackage.pv1;
import defpackage.q63;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "StrategyCreator")
public class Strategy extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Strategy> CREATOR = new zzf();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public int a = 300;
        public int b = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.a == strategy.a && this.g == strategy.g && this.c == strategy.c && this.d == strategy.d && this.f == strategy.f && this.h == strategy.h;
    }

    static {
        Builder builder = new Builder();
        new Strategy(2, 0, builder.a, 0, builder.b, 3, 0, false);
        Builder builder2 = new Builder();
        builder2.b = 2;
        Preconditions.checkArgument(true, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.MAX_VALUE, 86400);
        builder2.a = Integer.MAX_VALUE;
        new Strategy(2, 0, Integer.MAX_VALUE, 0, builder2.b, 3, 0, false);
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.g) * 31) + this.c) * 31) + this.d) * 31) + this.f) * 31) + this.h;
    }

    public final String toString() {
        String strK;
        String strK2;
        String strK3;
        String strK4 = "DEFAULT";
        int i = this.d;
        if (i != 0) {
            strK = i != 1 ? pv1.k(i, "UNKNOWN:") : "EARSHOT";
        } else {
            strK = "DEFAULT";
        }
        int i2 = this.f;
        if (i2 == -1) {
            strK2 = "DEFAULT";
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i2 & 2) > 0) {
                arrayList.add("BLE");
            }
            strK2 = arrayList.isEmpty() ? pv1.k(i2, "UNKNOWN:") : arrayList.toString();
        }
        int i3 = this.g;
        if (i3 == 3) {
            strK3 = "DEFAULT";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i3 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i3 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            strK3 = arrayList2.isEmpty() ? pv1.k(i3, "UNKNOWN:") : arrayList2.toString();
        }
        int i4 = this.h;
        if (i4 != 0) {
            strK4 = i4 != 1 ? pv1.k(i4, "UNKNOWN: ") : "ALWAYS_ON";
        }
        StringBuilder sb = new StringBuilder("Strategy{ttlSeconds=");
        sb.append(this.c);
        sb.append(", distanceType=");
        sb.append(strK);
        sb.append(", discoveryMedium=");
        q63.y(sb, strK2, ", discoveryMode=", strK3, ", backgroundScanMode=");
        return nj.q(sb, strK4, "}");
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b A[PHI: r7
  0x000b: PHI (r7v2 int) = (r7v0 int), (r7v1 int) binds: [B:3:0x0009, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    public Strategy(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        if (i2 == 0) {
            this.g = i6;
        } else if (i2 != 2) {
            i6 = 3;
            if (i2 != 3) {
                this.g = i6;
            } else {
                this.g = 2;
            }
        } else {
            this.g = 1;
        }
        this.d = i4;
        this.e = z;
        if (z) {
            this.f = 2;
            this.c = Integer.MAX_VALUE;
        } else {
            this.c = i3;
            if (i5 != -1 && i5 != 0 && i5 != 1 && i5 != 6) {
                this.f = i5;
            } else {
                this.f = -1;
            }
        }
        this.h = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.b);
        SafeParcelWriter.writeInt(parcel, 2, this.c);
        SafeParcelWriter.writeInt(parcel, 3, this.d);
        SafeParcelWriter.writeBoolean(parcel, 4, this.e);
        SafeParcelWriter.writeInt(parcel, 5, this.f);
        SafeParcelWriter.writeInt(parcel, 6, this.g);
        SafeParcelWriter.writeInt(parcel, 7, this.h);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
