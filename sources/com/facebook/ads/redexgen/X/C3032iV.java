package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3032iV implements Comparator<C3033iW> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C3033iW c3033iW, C3033iW c3033iW2) {
        if ((c3033iW.A03 == null) != (c3033iW2.A03 == null)) {
            return c3033iW.A03 == null ? 1 : -1;
        }
        if (c3033iW.A04 != c3033iW2.A04) {
            return c3033iW.A04 ? -1 : 1;
        }
        int i = c3033iW2.A02 - c3033iW.A02;
        if (i != 0) {
            return i;
        }
        int i2 = c3033iW.A00;
        int deltaViewVelocity = c3033iW2.A00;
        int i3 = i2 - deltaViewVelocity;
        if (i3 != 0) {
            return i3;
        }
        return 0;
    }
}
