package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.c1;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.internal.special.SpecialsBridge;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ja3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b0 implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, com.fyber.inneractive.sdk.click.f, com.fyber.inneractive.sdk.web.t0 {
    public InneractiveAdSpot a;
    public x b;
    public InneractiveUnitController.EventsListener c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public Runnable g;
    public com.fyber.inneractive.sdk.click.r h;
    public z i;
    public View j;

    public boolean B() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    public void d(View view) {
    }

    public void e(View view) {
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.d) {
            this.d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.c.onAdWillCloseInternalBrowser(this.a);
        }
    }

    public abstract View x();

    public int y() {
        return -1;
    }

    public int z() {
        return -1;
    }

    public final boolean A() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar = this.b;
        if (xVar == null || (rVar = xVar.c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.global.features.c cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.b.c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
        cVar.getClass();
        return new ArrayList(cVar.c.values()).size() > 0;
    }

    public boolean C() {
        x xVar = this.b;
        if (xVar != null) {
            return xVar.b();
        }
        return true;
    }

    public boolean D() {
        return this instanceof com.fyber.inneractive.sdk.renderers.c0;
    }

    public final void F() {
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.c.onAdWillOpenExternalApp(this.a);
        }
    }

    public final void H() {
        com.fyber.inneractive.sdk.response.e eVar;
        x xVar = this.b;
        if (xVar == null || (eVar = xVar.b) == null) {
            return;
        }
        String str = eVar.o;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.e("%sfiring rewarded completion!", IAlog.a(this));
        IAlog.d("AD_REWARDED_COMPLETION", new Object[0]);
        z0.b(str);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0128 A[LOOP:0: B:71:0x0126->B:72:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x014b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194  */
    /* JADX WARN: Code duplicated, block: B:83:0x019a  */
    /* JADX WARN: Code duplicated, block: B:85:0x019d  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bd  */
    public final com.fyber.inneractive.sdk.util.d0 a(Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z, com.fyber.inneractive.sdk.click.o oVar) {
        String queryParameter;
        String strReplace;
        boolean z2;
        String str2;
        com.fyber.inneractive.sdk.click.r rVar;
        x xVar;
        com.fyber.inneractive.sdk.web.v0 v0VarA;
        x xVar2;
        boolean z3;
        x xVar3;
        com.fyber.inneractive.sdk.click.r rVar2;
        x xVar4;
        com.fyber.inneractive.sdk.ignite.m mVar;
        InneractiveAdSpot inneractiveAdSpot;
        String localUniqueId;
        com.fyber.inneractive.sdk.response.e eVar;
        ArrayList arrayList;
        int size;
        int i;
        h1 h1Var;
        com.fyber.inneractive.sdk.util.z0 z0Var;
        com.fyber.inneractive.sdk.config.e eVar2;
        boolean z4;
        com.fyber.inneractive.sdk.response.e eVar3;
        if (!z && (!this.f || this.d)) {
            String str3 = this.d ? "external/browser is already open" : "click is in grace period";
            IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - %s", str3);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception(str3));
        }
        if (context != null) {
            IAlog.a("%sBlocking clicks until grace has ended", IAlog.a(this));
            this.f = false;
            Runnable runnable = this.g;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            }
            a0 a0Var = new a0(this);
            this.g = a0Var;
            com.fyber.inneractive.sdk.util.r.b.postDelayed(a0Var, 1000L);
        }
        float f = g1Var.a;
        c(z);
        if (TextUtils.isEmpty(str)) {
            IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - is empty", new Object[0]);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("empty url"));
        }
        x xVar5 = this.b;
        if (xVar5 != null && (eVar3 = xVar5.b) != null && eVar3.a()) {
            com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.Q.F;
            if (hVar.f) {
                hVar.a((ja3) null);
            }
        }
        this.i = new z(this, g1Var, gVar, oVar);
        if (TextUtils.isEmpty(str)) {
            queryParameter = null;
        } else {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (scheme == null || !scheme.equals("fybernativebrowser") || host == null || !host.equals("navigate")) {
                queryParameter = null;
            } else {
                queryParameter = uri.getQueryParameter("url");
            }
        }
        String scheme2 = !TextUtils.isEmpty(str) ? Uri.parse(str).getScheme() : null;
        if (TextUtils.isEmpty(queryParameter)) {
            strReplace = str;
            if (!strReplace.contains("FYBER_OPEN_BROWSER")) {
                z2 = true;
            }
            if (strReplace.contains("[IS_CTA_CLICK]")) {
                if (B() || gVar != com.fyber.inneractive.sdk.util.g.VIDEO_CTA) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                strReplace = strReplace.replace("[IS_CTA_CLICK]", String.valueOf(z4));
            }
            str2 = strReplace;
            if (x() != null) {
                v();
            }
            rVar = this.h;
            if (rVar != null) {
                rVar.f = true;
                arrayList = rVar.j;
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((com.fyber.inneractive.sdk.click.a) obj).a();
                }
                rVar.j.clear();
                h1Var = rVar.i;
                if (h1Var != null) {
                    h1Var.a = true;
                }
                z0Var = rVar.a;
                z0Var.c = false;
                eVar2 = IAConfigManager.Q.x.b;
                if (eVar2 != null) {
                    eVar2.a.remove(z0Var);
                }
                rVar.e = null;
                this.h = null;
            }
            com.fyber.inneractive.sdk.click.r rVar3 = new com.fyber.inneractive.sdk.click.r(z2, this.b);
            rVar3.j.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z2, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
            this.h = rVar3;
            xVar = this.b;
            if (xVar != null) {
                v0VarA = xVar.a();
            } else {
                v0VarA = null;
            }
            if (v0VarA != null) {
                v0VarA.i = this;
            }
            xVar2 = this.b;
            if (xVar2 == null && xVar2.a(g1Var.c, gVar)) {
                z3 = true;
            } else {
                z3 = false;
            }
            xVar3 = this.b;
            if (xVar3 != null && xVar3.b != null) {
                xVar3.e();
            }
            rVar2 = this.h;
            if (rVar2 != null) {
                z zVar = this.i;
                xVar4 = this.b;
                if (xVar4 != null || (eVar = xVar4.b) == null) {
                    mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
                } else {
                    mVar = eVar.E;
                }
                com.fyber.inneractive.sdk.ignite.m mVar2 = mVar;
                inneractiveAdSpot = this.a;
                if (inneractiveAdSpot != null) {
                    localUniqueId = inneractiveAdSpot.getLocalUniqueId();
                } else {
                    localUniqueId = null;
                }
                rVar2.a(context, str2, zVar, v0VarA, z3, mVar2, localUniqueId);
            }
            com.fyber.inneractive.sdk.util.g0 g0Var = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
            context.getClass();
            return new com.fyber.inneractive.sdk.util.d0(g0Var, null);
        }
        strReplace = queryParameter;
        z2 = false;
        if (strReplace.contains("[IS_CTA_CLICK]")) {
            if (B()) {
                z4 = false;
            } else {
                z4 = false;
            }
            strReplace = strReplace.replace("[IS_CTA_CLICK]", String.valueOf(z4));
        }
        str2 = strReplace;
        if (x() != null) {
            v();
        }
        rVar = this.h;
        if (rVar != null) {
            rVar.f = true;
            arrayList = rVar.j;
            size = arrayList.size();
            i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                ((com.fyber.inneractive.sdk.click.a) obj2).a();
            }
            rVar.j.clear();
            h1Var = rVar.i;
            if (h1Var != null) {
                h1Var.a = true;
            }
            z0Var = rVar.a;
            z0Var.c = false;
            eVar2 = IAConfigManager.Q.x.b;
            if (eVar2 != null) {
                eVar2.a.remove(z0Var);
            }
            rVar.e = null;
            this.h = null;
        }
        com.fyber.inneractive.sdk.click.r rVar4 = new com.fyber.inneractive.sdk.click.r(z2, this.b);
        rVar4.j.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z2, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
        this.h = rVar4;
        xVar = this.b;
        if (xVar != null) {
            v0VarA = xVar.a();
        } else {
            v0VarA = null;
        }
        if (v0VarA != null) {
            v0VarA.i = this;
        }
        xVar2 = this.b;
        if (xVar2 == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        xVar3 = this.b;
        if (xVar3 != null) {
            xVar3.e();
        }
        rVar2 = this.h;
        if (rVar2 != null) {
            z zVar2 = this.i;
            xVar4 = this.b;
            if (xVar4 != null) {
                mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
            } else {
                mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
            }
            com.fyber.inneractive.sdk.ignite.m mVar3 = mVar;
            inneractiveAdSpot = this.a;
            if (inneractiveAdSpot != null) {
                localUniqueId = inneractiveAdSpot.getLocalUniqueId();
            } else {
                localUniqueId = null;
            }
            rVar2.a(context, str2, zVar2, v0VarA, z3, mVar3, localUniqueId);
        }
        com.fyber.inneractive.sdk.util.g0 g0Var2 = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
        context.getClass();
        return new com.fyber.inneractive.sdk.util.d0(g0Var2, null);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b8  */
    public final void b(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.config.global.r rVar2;
        com.fyber.inneractive.sdk.config.global.r rVar3;
        x xVar = this.b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.a : null;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.b : null;
        JSONArray jSONArrayB = (xVar == null || (rVar3 = xVar.c) == null) ? null : rVar3.b();
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FYBER_SUCCESS_CLICK;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArrayB;
        com.fyber.inneractive.sdk.network.x xVar2 = new com.fyber.inneractive.sdk.network.x();
        int iZ = z();
        int iY = y();
        long j = bVar.e;
        if (j != 0) {
            xVar2.a(Long.valueOf(j), "time_passed");
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = bVar.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            com.fyber.inneractive.sdk.click.j jVar = (com.fyber.inneractive.sdk.click.j) obj;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", jVar.a);
                jSONObject.put("success", jVar.b);
                jSONObject.put("opened_by", jVar.c);
                jSONObject.put("reason", jVar.d);
            } catch (Exception unused) {
            }
            jSONArray.put(jSONObject);
        }
        xVar2.a(jSONArray, "urls");
        xVar2.a(gVar, "origin");
        if (gVar == com.fyber.inneractive.sdk.util.g.FMP_ENDCARD) {
            xVar2.a(gVar.a(), "version");
        }
        if (g1Var != null && g1Var.c) {
            xVar2.a(Boolean.TRUE, "is_auto_click");
        }
        if (g1Var != null) {
            float f = g1Var.a;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && g1Var.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int iB = C() ? iZ : com.fyber.inneractive.sdk.util.o.b(iZ);
                float f3 = iB == 0 ? 0.0f : g1Var.a / iB;
                int iB2 = C() ? iY : com.fyber.inneractive.sdk.util.o.b(iY);
                if (iB2 != 0) {
                    f2 = g1Var.b / iB2;
                }
                IAlog.a("Point location -  x - %.2f , y- %.2f", Float.valueOf(f3), Float.valueOf(f2));
                C();
                Locale locale = Locale.ENGLISH;
                com.fyber.inneractive.sdk.network.x xVarA = xVar2.a(String.format(locale, "%.2f", Float.valueOf(f3)), "td_x");
                C();
                xVarA.a(String.format(locale, "%.2f", Float.valueOf(f2)), "td_y");
            }
        }
        if (C() || D()) {
            xVar2.a(com.fyber.inneractive.sdk.util.o.b() == 1 ? "p" : CmcdData.STREAM_TYPE_LIVE, "o");
        } else if (iZ > 0 || iY > 0) {
            xVar2.a(Integer.valueOf(iZ), "b_w");
            xVar2.a(Integer.valueOf(iY), "b_h");
        }
        x xVar3 = this.b;
        com.fyber.inneractive.sdk.config.global.features.d dVar = (xVar3 == null || (rVar2 = xVar3.c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.d) rVar2.a(com.fyber.inneractive.sdk.config.global.features.d.class);
        if (dVar == null) {
            z = false;
        } else {
            com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
            if (aVar != null ? aVar.d : false) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            if (!com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD.equals(gVar) && !com.fyber.inneractive.sdk.util.g.VIDEO_CTA.equals(gVar)) {
                if (com.fyber.inneractive.sdk.util.g.VIDEO_CLICK.equals(gVar)) {
                    x xVar4 = this.b;
                    com.fyber.inneractive.sdk.config.global.features.v vVar = (xVar4 == null || (rVar = xVar4.c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
                    if (vVar == null) {
                        z3 = false;
                    } else {
                        Boolean boolC = vVar.c("show_cta");
                        if (boolC != null ? boolC.booleanValue() : true) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                    }
                }
                z2 = false;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            xVar2.a(IAConfigManager.Q.p, "cta_lng");
        }
        wVar.f.put(xVar2.a);
        wVar.a((String) null);
    }

    public final void c(boolean z) {
        com.fyber.inneractive.sdk.response.e eVar;
        if (z) {
            IAlog.a("%s : will not notify click on fallback", IAlog.a(this));
            return;
        }
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.c.onAdClicked(this.a);
        }
        x xVar = this.b;
        if (xVar == null || (eVar = xVar.b) == null) {
            return;
        }
        IAConfigManager.Q.x.a(eVar.n, "LAST_CLICKED", "1");
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.d = false;
        }
        Runnable runnable = this.g;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
            this.g = null;
        }
        this.b = null;
        this.c = null;
        this.a = null;
        if (this.h != null) {
            G();
            com.fyber.inneractive.sdk.click.r rVar = this.h;
            rVar.f = true;
            ArrayList arrayList = rVar.j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((com.fyber.inneractive.sdk.click.a) obj).a();
            }
            rVar.j.clear();
            h1 h1Var = rVar.i;
            if (h1Var != null) {
                h1Var.a = true;
            }
            com.fyber.inneractive.sdk.util.z0 z0Var = rVar.a;
            z0Var.c = false;
            com.fyber.inneractive.sdk.config.e eVar = IAConfigManager.Q.x.b;
            if (eVar != null) {
                eVar.a.remove(z0Var);
            }
            rVar.e = null;
            this.h = null;
            this.i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.a = inneractiveAdSpot;
        this.b = inneractiveAdSpot.getAdContent();
        this.c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    public final com.fyber.inneractive.sdk.ignite.m o() {
        com.fyber.inneractive.sdk.response.e eVar;
        x xVar = this.b;
        return (xVar == null || !xVar.c() || (eVar = this.b.b) == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : eVar.E;
    }

    public final void E() {
        com.fyber.inneractive.sdk.response.e eVar;
        String advertiserDomain;
        w();
        if (!this.e && this.c != null) {
            IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
            this.c.onAdImpression(this.a);
            x xVar = this.b;
            if (xVar != null && (eVar = xVar.b) != null) {
                IAConfigManager iAConfigManager = IAConfigManager.Q;
                c1 c1Var = iAConfigManager.x;
                if (c1Var != null) {
                    UnitDisplayType unitDisplayType = eVar.n;
                    ImpressionData impressionData = eVar.r;
                    if (impressionData != null) {
                        advertiserDomain = impressionData.getAdvertiserDomain();
                    } else {
                        advertiserDomain = null;
                    }
                    c1Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", advertiserDomain);
                    c1Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", eVar.x);
                    if (this.b.isVideoAd()) {
                        c1Var.a(unitDisplayType, new String[]{"LAST_VAST_SKIPED"}[0], "0");
                        c1Var.a(unitDisplayType, new String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                    }
                    c1Var.a(unitDisplayType, new String[]{"LAST_CLICKED"}[0], "0");
                }
                com.fyber.inneractive.sdk.util.y0 y0Var = iAConfigManager.A;
                com.fyber.inneractive.sdk.config.x0 x0Var = this.b.d;
                ImpressionData impressionData2 = eVar.r;
                if (x0Var != null) {
                    OnGlobalImpressionDataListener onGlobalImpressionDataListener = y0Var.a;
                    if (onGlobalImpressionDataListener != null) {
                        com.fyber.inneractive.sdk.config.w0 w0Var = (com.fyber.inneractive.sdk.config.w0) x0Var;
                        SpecialsBridge.fyberOnImpression(onGlobalImpressionDataListener, w0Var.b, w0Var.a, impressionData2);
                    }
                } else {
                    y0Var.getClass();
                }
                InneractiveUnitController.EventsListener eventsListener = this.c;
                if (eventsListener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                    ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.a, eVar.r);
                } else if (eventsListener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                    ((InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.a, eVar.r);
                }
            }
            this.e = true;
        }
    }

    public void G() {
        View viewX = x();
        if (viewX != null && this.j != null && viewX.getParent() != null && (viewX.getParent() instanceof ViewGroup)) {
            viewX.getLayoutParams();
            ((ViewGroup) viewX.getParent()).removeView(this.j);
            e(this.j);
            this.j = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        F();
    }

    public void t() {
        E();
    }

    public void v() {
        View viewX = x();
        if (viewX != null && viewX.getParent() != null && (viewX.getParent() instanceof ViewGroup) && this.j == null) {
            View viewInflate = View.inflate(viewX.getContext(), R.layout.ia_layout_click_overlay, null);
            this.j = viewInflate;
            if (viewInflate != null) {
                ((ViewGroup) viewX.getParent()).addView(this.j, viewX.getLayoutParams());
                d(this.j);
            }
        }
    }

    public Context w() {
        return com.fyber.inneractive.sdk.util.o.a(x());
    }

    public final Context c(View view) {
        View view2;
        View[] viewArr = {view, x()};
        for (int i = 0; i < 2; i++) {
            view2 = viewArr[i];
            if (view2 != null) {
                return com.fyber.inneractive.sdk.util.o.a(view2);
            }
        }
        view2 = null;
        return com.fyber.inneractive.sdk.util.o.a(view2);
    }

    @Override // com.fyber.inneractive.sdk.click.f
    public final void a(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        b(bVar, g1Var, gVar);
    }

    public final void a(String str, com.fyber.inneractive.sdk.click.q qVar) {
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.response.e eVar;
        InneractiveAdRequest inneractiveAdRequest;
        x xVar = this.b;
        if (xVar != null) {
            eVar = xVar.b;
            inneractiveAdRequest = xVar.a;
            com.fyber.inneractive.sdk.config.global.r rVar = xVar.c;
            jSONArrayB = rVar != null ? rVar.b() : null;
        } else {
            jSONArrayB = null;
            eVar = null;
            inneractiveAdRequest = null;
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EXTERNAL_BROWSER_OPENED;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArrayB;
        wVar.a("url", str).a("fallback", (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").a((String) null);
    }

    public final void a(WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        String message = webViewRendererProcessHasGoneError.getMessage();
        x xVar = this.b;
        com.fyber.inneractive.sdk.network.z.a(simpleName, message, xVar != null ? xVar.a : null, xVar != null ? xVar.b : null);
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), webViewRendererProcessHasGoneError.getMessage());
            this.c.onAdEnteredErrorState(this.a, webViewRendererProcessHasGoneError);
        }
    }
}
