package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.video.signal.communication.IRewardCommunication;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class MBMediaView extends LinearLayout implements IRewardCommunication {
    public static final String TAG = "MBMediaView";
    protected boolean a;
    private final c b;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).cai(obj, str);
        }
    }

    public void destory() {
        this.b.destroy();
    }

    public void destroy() {
        this.b.destroy();
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).getEndScreenInfo(obj, str);
        }
    }

    public float getMediaContentAspectRatio() {
        return this.b.getMediaContentAspectRatio();
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).handlerPlayableException(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).install(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).notifyCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).openURL(obj, str);
        }
    }

    public void setAllowLoopPlay(boolean z) {
        this.b.setAllowLoopPlay(z);
    }

    public void setAllowScreenChange(boolean z) {
        this.b.setAllowScreenChange(z);
    }

    public void setAllowVideoRefresh(boolean z) {
        this.b.setAllowVideoRefresh(z);
    }

    public void setFollowActivityOrientation(boolean z) {
        this.b.setFollowActivityOrientation(z);
    }

    public void setFullScreenViewBackgroundColor(int i) {
        this.b.setFullScreenViewBackgroundColor(i);
    }

    public void setIsAllowFullScreen(boolean z) {
        this.b.setIsAllowFullScreen(z);
    }

    public void setNativeAd(Campaign campaign) {
        this.b.setNativeAd(campaign);
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.b.setOnMediaViewListener(onMBMediaViewListener);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).setOrientation(obj, str);
        }
    }

    public void setProgressVisibility(boolean z) {
        this.b.setProgressVisibility(z);
    }

    public void setSoundIndicatorVisibility(boolean z) {
        this.b.setSoundIndicatorVisibility(z);
    }

    public void setVideoSoundOnOff(boolean z) {
        this.b.setVideoSoundOnOff(z);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).toggleCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        c cVar = this.b;
        if (cVar instanceof LegacyBaseMBMediaView) {
            ((LegacyBaseMBMediaView) cVar).triggerCloseBtn(obj, str);
        }
    }

    public MBMediaView(Context context) {
        super(context);
        this.a = true;
        this.b = b();
    }

    private boolean a() {
        if (com.mbridge.msdk.config.manager.a.c().d() && com.mbridge.msdk.config.manager.a.c().a(42)) {
            return true;
        }
        return false;
    }

    private c b() {
        try {
            if (a()) {
                b bVar = new b();
                bVar.a(this);
                return bVar;
            }
        } catch (Throwable th) {
            q0.b("MBMediaView", "resolveImpl component error: " + th.getMessage(), th);
        }
        LegacyBaseMBMediaView legacyBaseMBMediaView = new LegacyBaseMBMediaView(getContext());
        legacyBaseMBMediaView.u = this.a;
        addView(legacyBaseMBMediaView, new LinearLayout.LayoutParams(-1, -1));
        return legacyBaseMBMediaView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.b;
        if (cVar instanceof b) {
            cVar.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.b;
        if (cVar instanceof b) {
            cVar.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        c cVar = this.b;
        if ((cVar instanceof b) && view == this) {
            cVar.onVisibilityChanged(i);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        c cVar = this.b;
        if (cVar instanceof b) {
            cVar.onWindowFocusChanged(z);
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.b.setOnMediaViewListener(onMBMediaViewListenerPlus);
    }

    public MBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.b = b();
    }
}
