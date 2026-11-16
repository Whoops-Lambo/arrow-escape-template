package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2532aM {
    public final int A00;
    public final long A01;

    public C2532aM(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C2532aM(int i, long j, C2531aL c2531aL) {
        this(i, j);
    }

    public static C2532aM A00(Parcel parcel) {
        return new C2532aM(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
