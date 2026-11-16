package com.facebook.ads.redexgen.X;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2987hm extends DataSetObserver {
    public final /* synthetic */ C2990hp A00;

    public C2987hm(C2990hp c2990hp) {
        this.A00 = c2990hp;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.A00.A0g();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.A00.A0g();
    }
}
