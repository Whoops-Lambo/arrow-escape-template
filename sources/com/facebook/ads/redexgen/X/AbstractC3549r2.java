package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3549r2 extends LinearLayout {
    public static int A00 = (int) (AbstractC3482px.A02 * 56.0f);
    public static int A01 = (int) (AbstractC3482px.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f, int i);

    public abstract void A0D(C2841fN c2841fN, boolean z);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC3548r1 getToolbarListener();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC1981El viewOnClickListenerC1981El);

    public abstract void setFullscreen(boolean z);

    public abstract void setPageDetails(C2853fZ c2853fZ, String str, int i, C2862fi c2862fi);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(EnumC3534qn enumC3534qn);

    public abstract void setProgressImmediate(float f);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(InterfaceC3548r1 interfaceC3548r1);

    public AbstractC3549r2(Context context) {
        super(context);
    }

    public void A08() {
    }

    public Rect getRequestedMargins() {
        return null;
    }

    public void setSkipIconSuppressed(boolean z) {
    }
}
