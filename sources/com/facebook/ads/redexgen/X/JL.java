package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class JL implements InterfaceC2961hL {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C2990hp A01;

    public JL(C2990hp c2990hp) {
        this.A01 = c2990hp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2961hL
    public final C2993hs ADs(View view, C2993hs c2993hs) {
        C2993hs c2993hsA06 = AbstractC2977hb.A06(view, c2993hs);
        if (c2993hsA06.A07()) {
            return c2993hsA06;
        }
        Rect rect = this.A00;
        rect.left = c2993hsA06.A03();
        rect.top = c2993hsA06.A05();
        rect.right = c2993hsA06.A04();
        rect.bottom = c2993hsA06.A02();
        int i = this.A01.getChildCount();
        for (int count = 0; count < i; count++) {
            C2993hs c2993hsA05 = AbstractC2977hb.A05(this.A01.getChildAt(count), c2993hsA06);
            rect.left = Math.min(c2993hsA05.A03(), rect.left);
            rect.top = Math.min(c2993hsA05.A05(), rect.top);
            rect.right = Math.min(c2993hsA05.A04(), rect.right);
            rect.bottom = Math.min(c2993hsA05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C2993hs applied = c2993hsA06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
