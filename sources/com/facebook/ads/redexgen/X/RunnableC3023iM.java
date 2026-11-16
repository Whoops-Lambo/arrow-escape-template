package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC3023iM implements Runnable {
    public final /* synthetic */ C7S A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC3023iM(C7S c7s, ArrayList arrayList) {
        this.A00 = c7s;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C3030iT change : this.A01) {
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
