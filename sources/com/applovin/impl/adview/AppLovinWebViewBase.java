package com.applovin.impl.adview;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.p0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class AppLovinWebViewBase extends WebView {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean boolM;
        AppLovinNetworkBridge.webviewLoadUrl(this, AndroidWebViewClient.BLANK_PAGE);
        int iO0 = bVar.o0();
        if (iO0 >= 0) {
            setLayerType(iO0, null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(bVar.E());
        if (bVar.E0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        l lVarP0 = bVar.p0();
        if (lVarP0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateB = lVarP0.b();
            if (pluginStateB != null) {
                settings.setPluginState(pluginStateB);
            }
            Boolean boolE = lVarP0.e();
            if (boolE != null) {
                settings.setAllowFileAccess(boolE.booleanValue());
            }
            Boolean boolI = lVarP0.i();
            if (boolI != null) {
                settings.setLoadWithOverviewMode(boolI.booleanValue());
            }
            Boolean boolQ = lVarP0.q();
            if (boolQ != null) {
                settings.setUseWideViewPort(boolQ.booleanValue());
            }
            Boolean boolD = lVarP0.d();
            if (boolD != null) {
                settings.setAllowContentAccess(boolD.booleanValue());
            }
            Boolean boolP = lVarP0.p();
            if (boolP != null) {
                settings.setBuiltInZoomControls(boolP.booleanValue());
            }
            Boolean boolH = lVarP0.h();
            if (boolH != null) {
                settings.setDisplayZoomControls(boolH.booleanValue());
            }
            Boolean boolL = lVarP0.l();
            if (boolL != null) {
                settings.setSaveFormData(boolL.booleanValue());
            }
            Boolean boolC = lVarP0.c();
            if (boolC != null) {
                settings.setGeolocationEnabled(boolC.booleanValue());
            }
            Boolean boolJ = lVarP0.j();
            if (boolJ != null) {
                settings.setNeedInitialFocus(boolJ.booleanValue());
            }
            Boolean boolF = lVarP0.f();
            if (boolF != null) {
                settings.setAllowFileAccessFromFileURLs(boolF.booleanValue());
            }
            Boolean boolG = lVarP0.g();
            if (boolG != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolG.booleanValue());
            }
            Boolean boolO = lVarP0.o();
            if (boolO != null) {
                settings.setLoadsImagesAutomatically(boolO.booleanValue());
            }
            Boolean boolN = lVarP0.n();
            if (boolN != null) {
                settings.setBlockNetworkImage(boolN.booleanValue());
            }
            Integer numA = lVarP0.a();
            if (numA != null) {
                settings.setMixedContentMode(numA.intValue());
            }
            Boolean boolK = lVarP0.k();
            if (boolK != null) {
                settings.setOffscreenPreRaster(boolK.booleanValue());
            }
            if (!p0.g() || (boolM = lVarP0.m()) == null) {
                return;
            }
            settings.setAlgorithmicDarkeningAllowed(boolM.booleanValue());
        }
    }

    public AppLovinWebViewBase(Context context) {
        super(context);
    }
}
