package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C17484v extends G2<C2636c2> implements InterfaceC3188l6 {
    public static String[] A02 = {"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    public C2055Hi A00;
    public boolean A01;

    public C17484v(C2636c2 c2636c2, C2055Hi c2055Hi) {
        super(c2636c2);
        this.A00 = c2055Hi;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0F().A4L(i);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        C2636c2 c2636c2A08 = A08();
        int iIntValue = 0;
        if (c2636c2A08 == null) {
            A00(0);
            return;
        }
        View view = c2636c2A08.A0C;
        AbstractC2637c3 abstractC2637c3 = (AbstractC2637c3) c2636c2A08.A0E.get();
        int i = 1;
        boolean z = view == null;
        if (!z && abstractC2637c3 != null) {
            C2634c0 c2634c0A0E = C2636c2.A0E(view, c2636c2A08.A0A, this.A00);
            if (c2634c0A0E.A04()) {
                C2636c2.A05(c2636c2A08);
            } else {
                c2636c2A08.A00 = 0;
            }
            boolean z2 = c2636c2A08.A00 > c2636c2A08.A09;
            boolean wasViewable = c2636c2A08.A05 != null && c2636c2A08.A05.A04();
            if (z2 || !c2634c0A0E.A04()) {
                c2636c2A08.A05 = c2634c0A0E;
            }
            String strValueOf = String.valueOf(c2634c0A0E.A01());
            synchronized (c2636c2A08) {
                if (c2636c2A08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c2636c2A08.A06.get(strValueOf)).intValue();
                }
                c2636c2A08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z2 && !wasViewable) {
                this.A01 = true;
                c2636c2A08.A03 = System.currentTimeMillis();
                if (c2636c2A08.A07) {
                    this.A00.A0F().A4M();
                }
                abstractC2637c3.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c2636c2A08.A0F) {
                    return;
                }
            } else if (!z2 && wasViewable) {
                this.A01 = true;
                if (c2636c2A08.A07) {
                    this.A00.A0F().A3o(c2634c0A0E.A02());
                }
                abstractC2637c3.A00();
            } else {
                abstractC2637c3.A02();
                if (!this.A01 && c2636c2A08.A07) {
                    this.A00.A0F().A4K(c2634c0A0E.A02());
                }
                this.A01 = true;
            }
            if (!c2636c2A08.A08 && c2636c2A08.A04 != null) {
                c2636c2A08.A0B.postDelayed(c2636c2A08.A04, c2636c2A08.A02);
                return;
            }
            return;
        }
        if (c2636c2A08.A07) {
            if (!z) {
                i = 2;
            }
            A00(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3188l6
    public final C2055Hi A7M() {
        return this.A00;
    }
}
