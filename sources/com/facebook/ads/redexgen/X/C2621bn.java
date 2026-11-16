package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2621bn {
    public C2615bh A00;
    public C2617bj A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C2619bl> A08 = new SparseArray<>();
    public final SparseArray<C2614bg> A06 = new SparseArray<>();
    public final SparseArray<C2616bi> A07 = new SparseArray<>();
    public final SparseArray<C2614bg> A04 = new SparseArray<>();
    public final SparseArray<C2616bi> A05 = new SparseArray<>();

    public C2621bn(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
