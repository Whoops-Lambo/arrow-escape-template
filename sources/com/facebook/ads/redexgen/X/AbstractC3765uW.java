package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.uW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3765uW {
    public static final int A00 = AbstractC3523qc.A00();

    public static void A00(C2055Hi c2055Hi, ViewGroup viewGroup, String str) {
        new AsyncTaskC1989Et(viewGroup, c2055Hi).A07(str);
        View view = new View(c2055Hi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC3523qc.A0V(view, c2055Hi);
        viewGroup.addView(view, 0);
    }

    public static void A01(C2055Hi c2055Hi, ViewGroup viewGroup, String str, int i) {
        new AsyncTaskC1989Et(viewGroup, c2055Hi).A07(str);
        View view = new View(c2055Hi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setBackgroundColor(i);
        viewGroup.addView(view, 0);
    }
}
