package io.p071bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.a;
import com.facebook.internal.v;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.c91;
import defpackage.dn;
import defpackage.h00;
import defpackage.kc2;
import defpackage.li2;
import defpackage.nf;
import defpackage.tb5;
import defpackage.uy;
import defpackage.wr0;
import io.p071bidmachine.iab.b;
import io.p071bidmachine.iab.utils.j;
import io.p071bidmachine.iab.utils.k;
import io.p071bidmachine.rendering.internal.detector.engagedclick.f;
import io.p071bidmachine.rendering.measurer.d;
import io.p071bidmachine.rendering.measurer.e;
import io.p071bidmachine.rendering.model.engagedclick.c;
import io.p071bidmachine.rendering.model.p;
import io.p071bidmachine.t1;
import io.p071bidmachine.util.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0006$%&'((J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001d\u0010\n\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u001cR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lio/bidmachine/iab/mraid/MraidAdView;", "Landroid/widget/FrameLayout;", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Lio/bidmachine/iab/mraid/MraidOrientationProperties;", "getLastOrientationProperties", "()Lio/bidmachine/iab/mraid/MraidOrientationProperties;", "Laz2;", "closeExpanded", "()V", "Lio/bidmachine/iab/mraid/c0;", "mraidViewState", "setViewState", "(Lio/bidmachine/iab/mraid/c0;)V", "Lio/bidmachine/iab/mraid/j0;", "getCurrentMraidWebViewController", "()Lio/bidmachine/iab/mraid/j0;", "", "b", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "v", "Lio/bidmachine/iab/mraid/j0;", "getSecondaryMraidWebViewController", "setSecondaryMraidWebViewController", "(Lio/bidmachine/iab/mraid/j0;)V", "getSecondaryMraidWebViewController$annotations", "secondaryMraidWebViewController", "<set-?>", "w", "Lio/bidmachine/iab/mraid/c0;", "getMraidViewState", "()Lio/bidmachine/iab/mraid/c0;", "com/facebook/internal/j0", "io/bidmachine/iab/mraid/h", "io/bidmachine/iab/mraid/i", "io/bidmachine/iab/mraid/m", "io/bidmachine/iab/mraid/n", "bidmachine-android-sdk_bb_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MraidAdView extends FrameLayout {
    public static final /* synthetic */ int z = 0;
    public final int a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String baseUrl;
    public final String c;
    public final List d;
    public final c e;
    public final i f;
    public final e g;
    public final io.p071bidmachine.rendering.internal.adform.html.c h;
    public final long i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final GestureDetector p;
    public final v q;
    public final a r;
    public final io.p071bidmachine.displays.mapper.a s;
    public final j0 t;
    public final nf u;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public j0 secondaryMraidWebViewController;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public c0 mraidViewState;
    public boolean x;
    public final f y;

    @VisibleForTesting
    public static /* synthetic */ void getSecondaryMraidWebViewController$annotations() {
    }

    public final void closeExpanded() {
        Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidAdView;->closeExpanded()V");
        BrandSafetyUtils.onBidMachineOnClose();
        safedk_MraidAdView_closeExpanded_3aac30666c72f2a31b3391b931e42444();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidAdView(Context context, int i, String str, String str2, List list, Long l, List list2, c cVar, i iVar, io.p071bidmachine.media3.extractor.metadata.scte35.f fVar, io.p071bidmachine.rendering.internal.adform.html.c cVar2) {
        super(context);
        context.getClass();
        this.a = i;
        this.baseUrl = str;
        this.c = str2;
        this.d = list2;
        this.e = cVar;
        this.f = iVar;
        this.g = fVar;
        this.h = cVar2;
        long jLongValue = l != null ? l.longValue() : 0L;
        this.i = jLongValue;
        int i2 = 0;
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.p = new GestureDetector(context, new h());
        v vVar = new v(context, list);
        this.q = vVar;
        this.r = new a(vVar, 29);
        this.s = new io.p071bidmachine.displays.mapper.a(4);
        j0 j0Var = new j0(context, new n(this, i2), jLongValue, fVar != null ? fVar.a(context) : null);
        this.t = j0Var;
        this.mraidViewState = c0.a;
        g gVar = new g(this, i2);
        g gVar2 = new g(this, 1);
        v vVar2 = new v(this, 15);
        l lVar = l.c;
        uy uyVarB = lVar.b();
        uy uyVarA = lVar.a();
        uyVarB.getClass();
        uyVarA.getClass();
        nf nfVar = new nf();
        nfVar.a = gVar;
        nfVar.b = gVar2;
        nfVar.c = vVar2;
        nfVar.d = uyVarB;
        nfVar.e = uyVarA;
        nfVar.f = kc2.a(h00.o(tb5.a(), uyVarB));
        nfVar.g = new io.p071bidmachine.iab.utils.l();
        nfVar.h = new AtomicReference(b.a);
        this.u = nfVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        h0 h0Var = j0Var.d;
        addView(h0Var, layoutParams);
        if (cVar != null) {
            t1.l("MraidAdView", "EngagedClick reporting enabled", false, new Object[0]);
            f fVar2 = new f(cVar);
            fVar2.i = new WeakReference(h0Var);
            this.y = fVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 getCurrentMraidWebViewController() {
        j0 j0Var = this.secondaryMraidWebViewController;
        return j0Var == null ? this.t : j0Var;
    }

    public final void a(b bVar) {
        boolean z2 = this.j.get();
        i iVar = this.f;
        if (!z2) {
            iVar.D(this, bVar);
        } else if (this.l.get()) {
            iVar.z(this, bVar);
        } else {
            iVar.s(this, bVar);
        }
    }

    public final void b(String str, wr0 wr0Var) {
        boolean z2 = true;
        this.n.set(true);
        nf nfVar = this.u;
        li2 li2Var = (li2) nfVar.i;
        if (li2Var != null) {
            li2Var.cancel(null);
        }
        nfVar.i = null;
        v vVar = (v) this.r.b;
        if (str != null) {
            if (str.startsWith("sms")) {
                z2 = vVar.a;
            } else if (str.startsWith("tel")) {
                z2 = vVar.b;
            } else if (str.startsWith("calendar")) {
                z2 = vVar.d;
            } else if (str.startsWith("storePicture")) {
                z2 = vVar.e;
            }
        }
        if (z2) {
            f fVar = this.y;
            if (fVar != null) {
                str.getClass();
                int i = 0;
                t1.l("EngagedClick", "External navigation detected: ".concat(str), false, new Object[0]);
                li2 li2Var2 = fVar.m;
                if (li2Var2 != null) {
                    li2Var2.cancel(null);
                }
                fVar.m = null;
                ArrayList arrayList = fVar.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((c91) obj).cancel(null);
                }
                arrayList.clear();
            }
            wr0Var.invoke(str);
        }
    }

    public final void d() {
        nf nfVar = this.u;
        li2 li2Var = (li2) nfVar.i;
        if (li2Var != null) {
            li2Var.cancel(null);
        }
        nfVar.i = null;
        f fVar = this.y;
        if (fVar != null) {
            kc2.g(fVar.e, null);
            fVar.l = null;
            fVar.m = null;
            fVar.d.clear();
            WeakReference weakReference = fVar.i;
            if (weakReference != null) {
                weakReference.clear();
            }
            fVar.i = null;
        }
        this.t.g();
        j0 j0Var = this.secondaryMraidWebViewController;
        if (j0Var != null) {
            j0Var.g();
        }
    }

    public final void e() {
        boolean z2 = this.x;
        j0 j0Var = this.t;
        h0 h0Var = j0Var.d;
        if (z2) {
            h0Var.b();
        } else {
            h0Var.a();
        }
        if (j0Var.f.get()) {
            j0Var.e(z2);
        }
        if (this.j.get() && this.x) {
            if (this.k.compareAndSet(false, true)) {
                j0Var.h("mraid.fireReadyEvent();");
            }
            if (this.m.compareAndSet(false, true)) {
                f fVar = this.y;
                if (fVar != null && f.o.contains(fVar.h.a)) {
                    t1.l("EngagedClick", "visualDetect start() PROFILE IS: " + fVar.h.a, false, new Object[0]);
                    if (fVar.a.b != null) {
                        WeakReference weakReference = fVar.i;
                        WebView webView = weakReference != null ? (WebView) weakReference.get() : null;
                        if (webView != null && fVar.f.compareAndSet(false, true)) {
                            t1.l("EngagedClick", "startVisualDetect profile: " + fVar.h.a, false, new Object[0]);
                            fVar.j = 0.0d;
                            fVar.k = 0.0d;
                            fVar.l = tb5.t(fVar.e, null, null, new io.p071bidmachine.rendering.internal.detector.engagedclick.b(300L, fVar, webView, null), 3);
                        }
                    }
                }
                this.f.l(this);
            }
        }
    }

    public final void f(j jVar) {
        p pVar;
        Object obj;
        b bVar;
        nf nfVar = this.u;
        nfVar.getClass();
        j0 currentMraidWebViewController = ((g) nfVar.a).j.getCurrentMraidWebViewController();
        int measuredWidth = currentMraidWebViewController.d.getMeasuredWidth();
        int measuredHeight = currentMraidWebViewController.d.getMeasuredHeight();
        String str = jVar.a;
        if (str != null) {
            try {
                LinkedHashMap linkedHashMapE0 = io.p071bidmachine.util.p.e0(new JSONObject(str));
                Object obj2 = linkedHashMapE0.get("spread");
                Map map = obj2 instanceof Map ? (Map) obj2 : null;
                Object obj3 = linkedHashMapE0.get("center");
                PointF pointFB = k.b(obj3 instanceof Map ? (Map) obj3 : null);
                if (pointFB == null) {
                    pointFB = p.d;
                }
                PointF pointFB2 = k.b(map);
                if (pointFB2 == null) {
                    pointFB2 = p.e;
                }
                pVar = new p(pointFB, pointFB2, (map == null || (obj = map.get("seed")) == null) ? null : io.p071bidmachine.util.p.d0(obj));
            } catch (Exception unused) {
                pVar = new p();
            }
        } else {
            Integer num = jVar.b;
            if (num != null) {
                int iIntValue = num.intValue();
                Integer num2 = jVar.c;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                float f = 0.5f;
                float f2 = (iIntValue == 1 || (iIntValue != 5 && iIntValue == 17)) ? 0.5f : 1.0f;
                if (iIntValue2 != 16 && iIntValue2 != 17) {
                    f = iIntValue2 != 80 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
                }
                pVar = new p(new PointF(f2, f), p.e, null);
            } else {
                pVar = new p();
            }
        }
        p pVar2 = pVar;
        AtomicReference atomicReference = (AtomicReference) nfVar.h;
        do {
            bVar = b.a;
            if (atomicReference.compareAndSet(bVar, b.b)) {
                nfVar.i = tb5.t((dn) nfVar.f, (uy) nfVar.e, null, new c(nfVar, pVar2, measuredWidth, measuredHeight, currentMraidWebViewController, null), 2);
                return;
            }
        } while (atomicReference.get() == bVar);
    }

    public final boolean g() {
        return this.a == 2;
    }

    @Nullable
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @Nullable
    public final MraidOrientationProperties getLastOrientationProperties() {
        return this.t.m;
    }

    @NotNull
    public final c0 getMraidViewState() {
        return this.mraidViewState;
    }

    @Nullable
    public final j0 getSecondaryMraidWebViewController() {
        return this.secondaryMraidWebViewController;
    }

    @NotNull
    public final WebView getWebView() {
        return this.t.d;
    }

    public final void h(String str) {
        if (str == null) {
            a(new b(2, "Html data are null"));
            return;
        }
        c cVar = this.e;
        if (cVar != null && cVar.e) {
            io.p071bidmachine.rendering.model.engagedclick.b bVarA = io.p071bidmachine.rendering.utils.a.a(str);
            t1.l("MraidAdView", "EngagedClick: reclassified - " + bVarA.a + ", source - " + io.p071bidmachine.media3.common.util.b.i(bVarA.b), false, new Object[0]);
            f fVar = this.y;
            if (fVar != null) {
                fVar.h = bVarA;
            }
        }
        this.t.i(this.baseUrl, str, this.d);
    }

    public final void j(boolean z2) {
        az2 az2Var;
        this.x = z2;
        j0 j0Var = this.secondaryMraidWebViewController;
        if (j0Var != null) {
            h0 h0Var = j0Var.d;
            if (z2) {
                h0Var.b();
            } else {
                h0Var.a();
            }
            if (j0Var.f.get()) {
                j0Var.e(z2);
            }
            az2Var = az2.a;
        } else {
            az2Var = null;
        }
        if (az2Var == null) {
            e();
        }
    }

    public void safedk_MraidAdView_closeExpanded_3aac30666c72f2a31b3391b931e42444() {
        f fVar;
        boolean z2 = this.mraidViewState == c0.d;
        this.o.set(false);
        j0 j0Var = this.secondaryMraidWebViewController;
        if (j0Var != null) {
            j0Var.g();
            this.secondaryMraidWebViewController = null;
        }
        h0 h0Var = this.t.d;
        h0Var.getClass();
        if (h0Var.getParent() != this) {
            try {
                removeAllViews();
            } catch (Throwable unused) {
            }
            io.p071bidmachine.util.p.b(2, h0Var, null, this);
        }
        setViewState(c0.b);
        e();
        if (!z2 || (fVar = this.y) == null) {
            return;
        }
        li2 li2Var = fVar.m;
        if (li2Var != null) {
            li2Var.cancel(null);
        }
        fVar.m = null;
        fVar.b(2);
    }

    public final void setSecondaryMraidWebViewController(@Nullable j0 j0Var) {
        this.secondaryMraidWebViewController = j0Var;
    }

    public final void i() {
        d dVar = getCurrentMraidWebViewController().c;
        if (dVar != null) {
            dVar.onClicked();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.p.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @VisibleForTesting
    public final void setViewState(@NotNull c0 mraidViewState) {
        mraidViewState.getClass();
        this.mraidViewState = mraidViewState;
        this.t.c(mraidViewState);
        j0 j0Var = this.secondaryMraidWebViewController;
        if (j0Var != null) {
            j0Var.c(mraidViewState);
        }
    }
}
