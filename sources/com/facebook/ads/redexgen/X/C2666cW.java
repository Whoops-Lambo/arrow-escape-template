package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2666cW implements Comparable<C2666cW> {
    public final int A00;
    public final C2657cN A01;

    public C2666cW(int i, C2657cN c2657cN) {
        this.A00 = i;
        this.A01 = c2657cN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2666cW c2666cW) {
        return Integer.compare(this.A00, c2666cW.A00);
    }
}
