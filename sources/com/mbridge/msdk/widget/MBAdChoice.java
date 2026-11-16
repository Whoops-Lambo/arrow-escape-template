package com.mbridge.msdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.widget.adchoice.LegacyAdChoiceView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class MBAdChoice extends FrameLayout {
    private com.mbridge.msdk.widget.adchoice.a a;
    private com.mbridge.msdk.foundation.feedback.a b;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void destroy() {
        com.mbridge.msdk.widget.adchoice.a aVar = this.a;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    public void setCampaign(Campaign campaign) {
        if (this.a == null) {
            this.a = b();
        }
        this.a.setCampaign(campaign);
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.b = aVar;
        com.mbridge.msdk.widget.adchoice.a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.setFeedbackDialogEventListener(aVar);
        }
    }

    public void setLegacyCampaign(Campaign campaign) {
        if (this.a == null) {
            LegacyAdChoiceView legacyAdChoiceView = new LegacyAdChoiceView(getContext());
            com.mbridge.msdk.foundation.feedback.a aVar = this.b;
            if (aVar != null) {
                legacyAdChoiceView.setFeedbackDialogEventListener(aVar);
            }
            addView(legacyAdChoiceView, new FrameLayout.LayoutParams(-1, -1));
            this.a = legacyAdChoiceView;
        }
        this.a.setCampaign(campaign);
    }

    public MBAdChoice(Context context) {
        super(context);
    }

    private boolean a() {
        if (com.mbridge.msdk.config.manager.a.c().d() && com.mbridge.msdk.config.manager.a.c().a(42)) {
            return true;
        }
        return false;
    }

    private com.mbridge.msdk.widget.adchoice.a b() {
        try {
            if (a()) {
                com.mbridge.msdk.nativex.view.a aVar = new com.mbridge.msdk.nativex.view.a();
                aVar.a(this);
                return aVar;
            }
        } catch (Throwable th) {
            q0.b("MBAdChoice", "resolveImpl component error: " + th.getMessage(), th);
        }
        LegacyAdChoiceView legacyAdChoiceView = new LegacyAdChoiceView(getContext());
        com.mbridge.msdk.foundation.feedback.a aVar2 = this.b;
        if (aVar2 != null) {
            legacyAdChoiceView.setFeedbackDialogEventListener(aVar2);
        }
        addView(legacyAdChoiceView, new FrameLayout.LayoutParams(-1, -1));
        return legacyAdChoiceView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.mbridge.msdk.widget.adchoice.a aVar = this.a;
        if (aVar instanceof com.mbridge.msdk.nativex.view.a) {
            ((com.mbridge.msdk.nativex.view.a) aVar).onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.mbridge.msdk.widget.adchoice.a aVar = this.a;
        if (aVar instanceof com.mbridge.msdk.nativex.view.a) {
            ((com.mbridge.msdk.nativex.view.a) aVar).onDetachedFromWindow();
        }
        this.b = null;
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
