package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C2181Mk;
import com.facebook.ads.redexgen.X.C2189Ms;
import com.facebook.ads.redexgen.X.C2534aO;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C2534aO();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C2534aO c2534aO) {
        this(j, j2);
    }

    public static long A00(C2181Mk c2181Mk, long j) {
        long jA0I = c2181Mk.A0I();
        if ((128 & jA0I) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & jA0I;
        long firstByte = c2181Mk.A0Q();
        return (((ptsTime << 32) | firstByte) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(C2181Mk c2181Mk, long j, C2189Ms c2189Ms) {
        long jA00 = A00(c2181Mk, j);
        return new TimeSignalCommand(jA00, c2189Ms.A06(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
