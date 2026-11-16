package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes5.dex */
public class o extends c {
    public boolean W;
    Set<String> X;
    boolean Y;
    boolean Z;
    long aa;
    boolean ab;
    public String ac;
    public String ad;
    public long ae;
    public boolean af;
    public long ag;
    public BrandSafetyUtils.ScreenShotOrientation ah;
    public boolean ai;
    public h aj;
    public boolean ak;
    public ScheduledFuture<?> al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public WeakReference<Activity> aq;
    boolean ar;
    String as;
    boolean at;
    public final Object au;
    public final Object av;
    public Map<Integer, Long> aw;

    public boolean H() {
        return this.ar;
    }

    public void g(boolean z) {
        this.ar = z;
    }

    public o(String str, int i, Bundle bundle) {
        super(i, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.W = false;
        this.Y = true;
        this.Z = true;
        this.ab = false;
        this.ac = null;
        this.ad = null;
        this.ae = 0L;
        this.af = false;
        this.ag = 0L;
        this.ah = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.ai = false;
        this.aj = null;
        this.ak = false;
        this.al = null;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = true;
        this.ar = false;
        this.as = null;
        this.at = false;
        this.au = new Object();
        this.av = new Object();
        this.aw = new LinkedHashMap();
        this.X = new HashSet();
        if (str != null) {
            this.ak = CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    protected boolean c(String str) {
        l lVar;
        Logger.d(c.a, "setClickUrl started, url = ", str);
        boolean zC = super.c(str);
        l lVarI = i();
        if (f() && CreativeInfoManager.a(c(), AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false) && !zC && this.x == null && lVarI != null) {
            Logger.d(c.a, "setClickUrl multi, stage : ", Integer.valueOf(this.aw.size()), " , imp list ", Integer.valueOf(g().size()), ", currentClickUrlCandidate.ts : ", Long.valueOf(this.aj.a), ", impression switch ts ", this.aw);
            if (this.aw.size() < g().size()) {
                l lVar2 = g().get(this.aw.size());
                if (lVar2 != null && lVar2.j() != null && lVarI.j().an()) {
                    lVar2.j().a(str, false);
                    lVar2.a(true);
                    Logger.printFullVerboseLog(c.a, "setClickUrl multi , impressionInfo  : ", lVar2, ", click url set to ", str, " , info address : ", BrandSafetyUtils.a(lVar2));
                    return true;
                }
                return zC;
            }
            if (this.aw.size() >= g().size()) {
                Logger.d(c.a, "setClickUrl multi, end-card reached, this.currentClickUrlCandidate : ", this.aj);
                String strA = CreativeInfoManager.a(c(), AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null);
                if (strA != null && this.aj != null && this.aj.d != null && com.safedk.android.utils.n.b(this.aj.d, strA)) {
                    String strC = com.safedk.android.utils.n.c(this.aj.d, strA);
                    Logger.d(c.a, "setClickUrl multi, end-card item = ", strC);
                    if (strC != null) {
                        String strReplace = this.aj.d.replace(strC, "");
                        if (com.safedk.android.utils.n.k(strReplace) && (lVar = g().get(Integer.valueOf(strReplace).intValue())) != null && lVar.j() != null && lVarI.j().an()) {
                            lVar.j().a(str, false);
                            lVar.a(true);
                            Logger.printFullVerboseLog(c.a, "setClickUrl multi, end-card impressionInfo  : ", lVar, ", click url set to ", str, ", clicked : ", Boolean.valueOf(lVar.a()), " , info address : ", BrandSafetyUtils.a(this));
                            return true;
                        }
                    }
                }
            }
        }
        return zC;
    }

    public o(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        super(str, str2, str3, screenShotOrientation, str4, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.W = false;
        this.Y = true;
        this.Z = true;
        this.ab = false;
        this.ac = null;
        this.ad = null;
        this.ae = 0L;
        this.af = false;
        this.ag = 0L;
        this.ah = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.ai = false;
        this.aj = null;
        this.ak = false;
        this.al = null;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = true;
        this.ar = false;
        this.as = null;
        this.at = false;
        this.au = new Object();
        this.av = new Object();
        this.aw = new LinkedHashMap();
        this.q = str5;
    }

    public void I() {
        this.Y = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("maxSdk: ");
        sb.append(this.v != null ? this.v : "");
        sb.append(", activity address: ");
        sb.append(this.B != null ? this.B : "");
        sb.append(", view address: ");
        sb.append(this.K != null ? this.K : "");
        sb.append(", interstitial activity name: ");
        sb.append(this.ad != null ? this.ad : "");
        sb.append(", eventId: ");
        sb.append(this.L != null ? this.L : "");
        sb.append(", isAdFinished: ");
        sb.append(this.U);
        sb.append(", number of CIs: ");
        sb.append(k().size());
        return sb.toString();
    }

    public boolean J() {
        return ((this.aq == null || this.aq.get() == null) && (!this.ak || j() == null || j().f() == null)) ? false : true;
    }

    public View K() {
        if (this.aq != null && this.aq.get() != null) {
            return this.aq.get().getWindow().getDecorView().findViewById(R.id.content);
        }
        if (this.ak && j() != null) {
            return j().f();
        }
        return null;
    }

    public void a(String str, boolean z) {
        if (str != null) {
            if (this.as == null) {
                this.as = str;
                return;
            }
            if (!z || !this.as.contains(str)) {
                this.as += m.ac + str;
            }
        }
    }

    public void L() {
        d(this.as);
    }

    public void e(String str) {
        i().k = true;
        this.at = true;
        b(m.p, new m.a(m.P, str));
    }
}
