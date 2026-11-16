package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import defpackage.n30;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Mj extends Ej {
    public final byte l1;
    public final Z9 m1;
    public final String n1;
    public final Ej o1;
    public final Lj p1;

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.Ej
    public final void E() {
    }

    @Override // com.inmobi.media.Ej, com.inmobi.media.V2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.inmobi.media.Ej
    public final void v() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Mj(Context context, byte b, Z9 z9, C4285p0 c4285p0, yq yqVar, C4026fk c4026fk, AdConfig adConfig) {
        context.getClass();
        c4285p0.getClass();
        yqVar.getClass();
        c4026fk.getClass();
        adConfig.getClass();
        LinkedHashSet linkedHashSet = null;
        String str = null;
        super(context, b, linkedHashSet, str, c4285p0.r, 0L, c4285p0.s, z9, c4026fk, yqVar, c4285p0, adConfig, 92);
        this.l1 = b;
        this.m1 = z9;
        this.n1 = n30.y("RenderViewSibling - ", c4026fk.b);
        this.o1 = (Ej) yqVar.b.get(BuildConfig.FLAVOR);
        this.p1 = new Lj(this, yqVar, c4026fk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ej getAdRenderView() {
        Z9 z9;
        if (this.o1 == null && (z9 = this.m1) != null) {
            n30.v("Ad RenderView not found for id: ", getRoute().b, z9, this.n1);
        }
        return this.o1;
    }

    public final void b0() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        Z9 z9 = this.m1;
        if (z9 != null) {
            z9.a(this.n1, "initialize RenderViewSibling");
        }
        a(this.p1);
        Ej adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        Ej adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        Ej adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof Mj)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Z9 z10 = this.m1;
        if (z10 != null) {
            z10.a(this.n1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(new LinkedHashMap(linkedHashMap));
    }

    @Nullable
    public final Y9 getLogger() {
        return this.m1;
    }

    public final byte getMPlacementType() {
        return this.l1;
    }

    @Override // com.inmobi.media.Ej
    public final void o() {
        Z9 z9 = this.m1;
        if (z9 != null) {
            z9.a(this.n1, "dismissCurrentViewContainer " + this);
        }
        C4491wd mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C4075hd c4075hd = mediaProcessor.c;
            if (c4075hd != null) {
                c4075hd.b();
            }
            mediaProcessor.c = null;
        }
        if ("Default".equals(getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.Ej
    public final void a(Jg jg) {
        jg.getClass();
        Z9 z9 = this.m1;
        if (z9 != null) {
            z9.a(this.n1, "setOrientationProperties " + this);
        }
        setOrientationProperties(jg);
    }

    @Override // com.inmobi.media.Ej, com.inmobi.media.D
    public final void b() {
        l();
        removeAllViews();
        destroy();
    }

    @Override // com.inmobi.media.Ej, com.inmobi.media.D
    @NotNull
    public Tp getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new C4295pa(this, this, new T7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.m1), this.m1));
        }
        Tp mViewableAd = getMViewableAd();
        mViewableAd.getClass();
        return mViewableAd;
    }

    @Override // com.inmobi.media.Ej, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        yq webViewFactory = getWebViewFactory();
        String str = getRoute().a;
        webViewFactory.getClass();
        str.getClass();
        Ej ej = (Ej) webViewFactory.b.get(str);
        if (ej == null) {
            Z9 z9 = this.m1;
            if (z9 != null) {
                z9.b(this.n1, "Not able to give show success as the source view is not present");
                return;
            }
            return;
        }
        c(ej, getRoute().b);
    }
}
