package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.uq {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private ct dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.noq.kgy mDynamicClickListener;
    boolean mIsMute;
    private com.bytedance.sdk.component.adexpress.ahm.nu mRenderListener;
    private com.bytedance.sdk.component.adexpress.ahm.twf mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.ahm muteListener;
    protected final com.bytedance.sdk.component.adexpress.ahm.kus renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.rz> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.ct videoListener;
    public View videoView;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public ct renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, ViewGroup viewGroup, int i) {
        if (fiVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> listNu = fiVar.nu();
        ct ctVarKgy = com.bytedance.sdk.component.adexpress.dynamic.kgy.ahm.kgy(this.mContext, this, fiVar);
        if (ctVarKgy instanceof vg) {
            callBackRenderFail(i == 3 ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(fiVar);
        ctVarKgy.rz();
        if (viewGroup != null) {
            viewGroup.addView(ctVarKgy);
            setClipChildren(viewGroup, fiVar);
        }
        if (listNu == null || listNu.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.fi> it = listNu.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), ctVarKgy, i);
        }
        return ctVarKgy;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uq
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.timeOutListener.size(); i3++) {
            if (this.timeOutListener.get(i3) != null) {
                this.timeOutListener.get(i3).kgy(charSequence, i == 1, i2, z);
            }
        }
    }

    private boolean checkSizeValid() {
        ct ctVar = this.dynamicBaseWidget;
        return ctVar.ct > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ctVar.noq > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !fiVar.lqi()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible(ct ctVar, int i) {
        if (ctVar == null) {
            return;
        }
        if (ctVar.getBeginInvisibleAndShow()) {
            ctVar.setVisibility(i);
            View view = ctVar.vs;
            if (view != null) {
                view.setVisibility(i);
            }
        }
        int childCount = ctVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            if (ctVar.getChildAt(i2) instanceof ct) {
                beginShowFromInvisible((ct) ctVar.getChildAt(i2), i);
            }
        }
    }

    public void callBackRenderFail(int i, String str) {
        this.renderResult.rz(false);
        this.renderResult.ahm(i);
        this.renderResult.kgy(str);
        this.mRenderListener.kgy(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.noq.kgy getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.ahm.nu getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.ahm.twf getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.rz> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uq
    public void onvideoComplate() {
        try {
            this.videoListener.kgy();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61avWPRcNrhRS3", "VOA7nAe5ZuSPR8dRjQWl", 246);
        }
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i) {
        this.logoUnionHeight = i;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.ahm ahmVar) {
        this.muteListener = ahmVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.ahm.nu nuVar) {
        this.mRenderListener = nuVar;
        this.mDynamicClickListener.kgy(nuVar);
    }

    public void setScoreCountWithIcon(int i) {
        this.scoreCountWithIcon = i;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uq
    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.ahm ahmVar = this.muteListener;
        if (ahmVar != null) {
            ahmVar.setSoundMute(z);
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.rz rzVar) {
        this.timeOutListener.add(rzVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.uq
    public void setTimeUpdate(int i) {
        this.videoListener.setTimeUpdate(i);
    }

    public void setTimedown(int i) {
        this.timedown = i;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.ct ctVar) {
        this.videoListener = ctVar;
    }

    public void updateRenderInfoForVideo(double d, double d2, double d3, double d4, float f) {
        this.renderResult.rz(d);
        this.renderResult.uq(d2);
        this.renderResult.ct(d3);
        this.renderResult.noq(d4);
        this.renderResult.kgy(f);
        this.renderResult.ahm(f);
        this.renderResult.rz(f);
        this.renderResult.uq(f);
    }

    public DynamicRootView(Context context, boolean z, com.bytedance.sdk.component.adexpress.ahm.twf twfVar, com.bytedance.sdk.component.adexpress.dynamic.noq.kgy kgyVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.ahm.kus kusVar = new com.bytedance.sdk.component.adexpress.ahm.kus();
        this.renderResult = kusVar;
        kusVar.kgy(2);
        this.mDynamicClickListener = kgyVar;
        kgyVar.kgy(this);
        this.mIsMute = z;
        this.mRenderRequest = twfVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        com.bytedance.sdk.component.adexpress.dynamic.uq.noq noqVarCt;
        com.bytedance.sdk.component.adexpress.dynamic.uq.ct ctVarRa = fiVar.ra();
        if (ctVarRa == null || (noqVarCt = ctVarRa.ct()) == null) {
            return;
        }
        this.renderResult.uq(noqVarCt.wn());
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar, int i) {
        this.dynamicBaseWidget = renderDynamicView(fiVar, this, i);
        this.renderResult.rz(true);
        this.renderResult.kgy(this.dynamicBaseWidget.ct);
        this.renderResult.ahm(this.dynamicBaseWidget.noq);
        this.renderResult.kgy(this.videoView);
        this.mRenderListener.kgy(this.renderResult);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }
}
