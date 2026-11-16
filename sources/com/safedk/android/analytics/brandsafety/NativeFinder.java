package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class NativeFinder extends b {
    public static final int I = 5;
    protected static final long J = 1000;
    protected static final long K = 500;
    private static final String L = "NativeFinder";
    private static final long M = 10;
    private static final Map<String, WeakReference<ViewGroup>> Q = new HashMap();
    private static final Map<String, WeakReference<ViewGroup>> R = new HashMap();
    private static final Map<String, String> S = new HashMap();
    private final LinkedHashSetWithItemLimit<String> N;
    private final Map<d, t> O;
    private final Map<String, p> P;

    public NativeFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.NATIVE, Collections.singletonList("NATIVE"), L, maxAttemptsToCaptureImage);
        this.N = new LinkedHashSetWithItemLimit<>(10L);
        this.O = new HashMap();
        this.P = new HashMap();
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new t(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        String string2;
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p() || SafeDK.getInstance() == null || !SafeDK.getInstance().r()) {
            return;
        }
        try {
            Bundle messageData = message.getMessageData();
            if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.b.contains(messageData.getString("ad_format"))) {
                Logger.d(L, "Revenue event detected : ", messageData);
                string = "revenue_event";
            } else {
                string = messageData.getString("type");
            }
            String string3 = messageData.getString("ad_format");
            String string4 = messageData.getString(BrandSafetyEvent.k);
            String string5 = messageData.getString(BrandSafetyEvent.l);
            String strO = BrandSafetyUtils.o(messageData.getString("ad_view"));
            String string6 = messageData.getString("id", null);
            if (string6 == null) {
                Logger.d(L, "No eventId in data bundle, cannot match");
            }
            String string7 = messageData.getString(BrandSafetyEvent.ad);
            String strC = CreativeInfoManager.c(string7);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jB = com.safedk.android.utils.n.b(jCurrentTimeMillis);
            if (messageData.containsKey("creative_id")) {
                string2 = messageData.getString("creative_id");
            } else {
                string2 = null;
            }
            if (this.b.contains(string3)) {
                Logger.d(L, "Max message received, package: ", strC, ", ts (seconds): ", Long.valueOf(jB), ", message received: ", message.getMessageData(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                String str = string2;
                d dVar = new d(string5, string4, string6, strC, string7, BrandSafetyUtils.AdType.NATIVE);
                if ("WILL_DISPLAY".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(L, "WILL_DISPLAY event for package=", strC, ", key=", dVar, ", view address=", strO, ", slot count=", Integer.valueOf(this.d));
                        CreativeInfoManager.a(strC, string4, str, string6, string3);
                        a(string6, m.f, new m.a(m.L, BrandSafetyUtils.o(messageData.getString("ad_view"))));
                    }
                    a(string7, strC, str, dVar, strO, messageData, jCurrentTimeMillis);
                    return;
                }
                if ("revenue_event".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(L, "REVENUE_EVENT event for package=", strC, ", key=", dVar, ", view address=", strO, ", slot count=", Integer.valueOf(this.d));
                        a(string6, m.k, new m.a(m.K, messageData.getString("revenue_event")));
                    }
                    a(string7, strC, str, dVar, strO, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    if (f(string7, strC)) {
                        a(string6, m.h, new m.a[0]);
                        if (this.O.get(dVar) != null) {
                            Object[] objArr = new Object[4];
                            objArr[0] = "DID_CLICKED event for package=";
                            if (strC != null) {
                                string7 = strC;
                            }
                            objArr[1] = string7;
                            objArr[2] = ", slot count=";
                            objArr[3] = Integer.valueOf(this.d);
                            Logger.d(L, objArr);
                            c(dVar);
                        }
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(L, "WILL_LOAD event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                        a(string6, m.d, new m.a(m.N, string7));
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(L, "DID_HIDE event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                        a(string6, m.i, new m.a[0]);
                        a(dVar);
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(L, "DID_LOAD event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                        a(string6, m.e, new m.a(m.N, string7));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (strC != null && f(string7, strC)) {
                        Logger.d(L, "DID_DISPLAY event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                        a(string6, m.g, new m.a[0]);
                        a(strC, dVar, str, messageData, jCurrentTimeMillis);
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string) && strC != null && f(string7, strC)) {
                    Logger.d(L, "DID_FAIL_DISPLAY event for package=", strC, ", key=", dVar, ", slot count=", Integer.valueOf(this.d));
                    a(string6, m.j, new m.a[0]);
                    b(dVar);
                }
            }
        } catch (Throwable th) {
            Logger.e(L, "on message received exception", th);
        }
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle, long j) {
        if (this.N.contains(dVar.c)) {
            Logger.d(L, "handle WILL_DISPLAY - impression with id ", dVar.c, " has already been reported, ignoring.");
            return;
        }
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        int iB = BrandSafetyUtils.b(this.c);
        synchronized (this.C) {
            Logger.d(L, "handle WILL_DISPLAY - image count for ", this.c.name(), " is ", Integer.valueOf(iB), ", impressions to report(", Integer.valueOf(this.C.keySet().size()), ") = ", this.C.keySet());
        }
        if (f(str, str2)) {
            t tVarA = this.O.get(dVar);
            if (tVarA == null) {
                tVarA = a(foregroundActivity, str2, dVar.c, bundle);
                synchronized (this.O) {
                    this.O.put(dVar, tVarA);
                }
                Logger.d(L, "New activity native created for ", str2, ", native key is ", dVar, ", current activity native size is ", Integer.valueOf(this.O.size()));
            } else {
                if (tVarA.A == null) {
                    tVarA.A = bundle;
                }
                if (tVarA.B == null || tVarA.C == null) {
                    tVarA.a(a(foregroundActivity));
                }
            }
            tVarA.K = TextUtils.isEmpty(str4) ? null : str4;
            tVarA.W = true;
            tVarA.ad = true;
            tVarA.ae = j;
            a(tVarA, false, "handleWillDisplay");
            a aVar = new a(tVarA, dVar, this.e);
            tVarA.aa = this.E.scheduleWithFixedDelay(aVar, 500L, SafeDK.getInstance().Z() * 1000, TimeUnit.MILLISECONDS);
            tVarA.ac = aVar;
            a(tVarA, dVar);
            a(tVarA, dVar, (WeakReference<ViewGroup>) a(dVar, str4, false).first);
            return;
        }
        this.d++;
    }

    private p a(t tVar, d dVar, WeakReference<ViewGroup> weakReference) {
        p pVarRemove;
        if (weakReference != null && weakReference.get() != null) {
            tVar.ai = true;
            synchronized (this.P) {
                pVarRemove = this.P.remove(tVar.K);
                Logger.d(L, "try setting pending info - view address: ", tVar.K, " matching info: ", pVarRemove);
                if (pVarRemove != null) {
                    a(dVar.a, dVar.e, pVarRemove);
                }
            }
            return pVarRemove;
        }
        Logger.d(L, "try setting pending info - ad view reference not valid: ref=", weakReference);
        return null;
    }

    private Pair<WeakReference<ViewGroup>, String> a(d dVar, String str, boolean z) {
        WeakReference<ViewGroup> weakReferenceRemove;
        synchronized (NativeFinder.class) {
            weakReferenceRemove = Q.get(dVar.c);
            if (TextUtils.isEmpty(str) && weakReferenceRemove != null && weakReferenceRemove.get() != null) {
                str = BrandSafetyUtils.a(weakReferenceRemove.get());
            }
            if (!TextUtils.isEmpty(str) && (weakReferenceRemove == null || weakReferenceRemove.get() == null)) {
                weakReferenceRemove = z ? R.remove(str) : R.get(str);
                if (weakReferenceRemove != null && weakReferenceRemove.get() != null) {
                    Logger.d(L, "get ad view ref - native ad view found: ", weakReferenceRemove.get(), " for event ID: ", dVar.c);
                    a(dVar.c, dVar.d, weakReferenceRemove.get());
                }
            } else if (z) {
                R.remove(str);
            }
        }
        return new Pair<>(weakReferenceRemove, str);
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        CreativeInfo creativeInfoA;
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        if (this.N.contains(dVar.c)) {
            Logger.d(L, "handle REVENUE_EVENT - impression with id ", dVar.c, " has already been reported, ignoring.");
            return;
        }
        Pair<WeakReference<ViewGroup>, String> pairA = a(dVar, str4, true);
        WeakReference<ViewGroup> weakReference = (WeakReference) pairA.first;
        String str5 = (String) pairA.second;
        a(str5, dVar);
        if (f(str, str2)) {
            t tVarA = this.O.get(dVar);
            if (tVarA == null) {
                tVarA = a(foregroundActivity, str2, dVar.c, bundle);
                synchronized (this.O) {
                    this.O.put(dVar, tVarA);
                }
                Logger.d(L, "New activity native created for ", str2, ", native key is ", dVar, ", current activity natives size is ", Integer.valueOf(this.O.size()));
            } else {
                if (tVarA.A == null) {
                    tVarA.A = bundle;
                }
                if (tVarA.B == null || tVarA.C == null) {
                    tVarA.a(a(foregroundActivity));
                }
            }
            if (bundle.getString("revenue_event") != null) {
                tVarA.P = bundle.getString("revenue_event");
            } else {
                tVarA.P = "unknown";
            }
            if (tVarA.K == null) {
                tVarA.K = TextUtils.isEmpty(str5) ? null : str5;
                synchronized (NativeFinder.class) {
                    S.put(str5, str2);
                }
            }
            tVarA.M = str3;
            p pVarA = a(tVarA, dVar, weakReference);
            if (pVarA == null && (adNetworkDiscoveryJ = CreativeInfoManager.j(dVar.d)) != null && (creativeInfoA = adNetworkDiscoveryJ.a((Object) dVar.c)) != null && creativeInfoA.X() == null) {
                pVarA = new p(creativeInfoA, CreativeInfo.y);
                Logger.d(L, Logger.FeatureTag.CI_MATCHING, "set CI details - try to match by event ID: ", dVar.c, " matching info: ", pVarA);
                a(dVar.a, dVar.e, pVarA);
            }
            if (pVarA == null) {
                a(tVarA, false, "handleRevenueEvent");
            }
            Logger.d(L, "Revenue event set to ", bundle.getString("revenue_event"), " for eventId ", dVar.c);
            tVarA.W = true;
            return;
        }
        this.d++;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j) {
        if (this.N.contains(dVar.c)) {
            Logger.d(L, "handle DID_DISPLAY - impression with id ", dVar.c, " has already been reported, ignoring. ");
            return;
        }
        Logger.d(L, "handle DID_DISPLAY package=", str, " key=", dVar);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        t tVarA = this.O.get(dVar);
        if (tVarA != null) {
            Logger.d(L, "Native info already exists, package=", str, " activity native=", tVarA);
            tVarA.z = this.d;
            if (tVarA.B == null || tVarA.C == null) {
                tVarA.a(a(foregroundActivity));
            }
        } else {
            tVarA = a(foregroundActivity, str, dVar.c, bundle);
            synchronized (this.O) {
                this.O.put(dVar, tVarA);
            }
            Logger.d(L, "New activity native created for ", str, ", key=", dVar, ", current activity ads size=", Integer.valueOf(this.O.size()));
        }
        tVarA.M = str2;
        tVarA.af = j;
        a(tVarA, false, "handleDidDisplay");
    }

    private void a(d dVar) {
        synchronized (this.O) {
            t tVarRemove = this.O.remove(dVar);
            if (tVarRemove != null) {
                Logger.d(L, "handle DID_HIDE, placementId=", dVar.b);
                tVarRemove.Y = true;
            }
        }
    }

    private void b(d dVar) {
        t tVar = this.O.get(dVar);
        if (tVar != null) {
            tVar.N = true;
        }
    }

    private void c(d dVar) {
        Logger.d(L, "handle DID_CLICKED started");
        t tVar = this.O.get(dVar);
        if (tVar != null) {
            tVar.a(true);
            a(tVar, false, "handleDidClicked");
        }
    }

    private t a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.d++;
        Logger.d(L, "slot number incremented to ", Integer.valueOf(this.d), ", eventId is ", str2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        t tVar = new t(a(activity), str, this.d, lowerCase, bundle, str2);
        tVar.ab = new WeakReference<>(activity);
        return tVar;
    }

    protected boolean f(String str, String str2) {
        boolean zA = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        String strA = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(L, "sdk ", str2, ": config item SUPPORTS_NATIVE_IMPRESSION_TRACKING is ", Boolean.valueOf(zA), ", config item AD_NETWORK_TO_IGNORE is ", strA, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (zA && !str.equals(strA)) {
            return true;
        }
        Logger.d(L, "Native ads tracking is not supported for this ad network (", str, ")");
        return false;
    }

    public void a(final String str, final String str2, final ViewGroup viewGroup) {
        if (com.safedk.android.utils.n.c()) {
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.b(str, str2, viewGroup);
                }
            });
        } else {
            b(str, str2, viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, ViewGroup viewGroup) {
        if (str != null && str2 != null && viewGroup != null) {
            String strA = BrandSafetyUtils.a(viewGroup);
            synchronized (NativeFinder.class) {
                if (!Q.containsKey(str)) {
                    a(str, m.l, new m.a(m.L, strA));
                }
                Q.put(str, new WeakReference<>(viewGroup));
                S.put(strA, str2);
            }
            Logger.d(L, "add native ad view: ", viewGroup, ", eventId: ", str, ", adViewAddress: ", strA, ", sdk: ", str2, ", list size: ", Integer.valueOf(Q.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        }
    }

    public void b(final ViewGroup viewGroup) {
        if (com.safedk.android.utils.n.c()) {
            this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.2
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.c(viewGroup);
                }
            });
        } else {
            c(viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ViewGroup viewGroup) {
        String strA = BrandSafetyUtils.a(viewGroup);
        synchronized (NativeFinder.class) {
            R.put(strA, new WeakReference<>(viewGroup));
        }
        Logger.d(L, "add native ad view: ", viewGroup, ", list size: ", Integer.valueOf(R.size()));
    }

    private void a(String str, d dVar) {
        ArrayList<d> arrayList;
        t tVar;
        boolean z;
        Logger.d(L, "report completed event started, view address: ", str, ", key: ", dVar);
        synchronized (this.O) {
            arrayList = new ArrayList(this.O.keySet());
        }
        for (d dVar2 : arrayList) {
            if (dVar2.a.equals(dVar.a) && !dVar2.c.equals(dVar.c) && (tVar = this.O.get(dVar2)) != null) {
                if (tVar.K != null && tVar.K.equals(str)) {
                    Logger.d(L, "report completed event, same view address: ", tVar.K, ", event id: ", dVar2.c);
                    z = true;
                } else {
                    synchronized (NativeFinder.class) {
                        WeakReference<ViewGroup> weakReference = Q.get(dVar2.c);
                        if (weakReference == null || weakReference.get() == null || weakReference.get().getParent() == null) {
                            Logger.d(L, "report completed event, closed view address: ", tVar.K, ", event id: ", dVar2.c);
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
                if (z) {
                    tVar.a(m.C, new m.a[0]);
                    a(tVar, true, "reportCompletedEvents");
                    tVar.U = true;
                    a(tVar);
                    synchronized (this.O) {
                        this.O.remove(dVar2);
                    }
                } else {
                    Logger.d(L, "report completed event skipped, view address: ", tVar.K, ", event id: ", dVar2.c);
                }
            }
        }
    }

    private void a(final t tVar, final d dVar) {
        tVar.Z = this.E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (NativeFinder.this.O) {
                    NativeFinder.this.a(tVar, true, "handleWillDisplay:reportTimeout");
                    NativeFinder.this.O.remove(dVar);
                    NativeFinder.this.a(tVar);
                }
            }
        }, 5L, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(t tVar) {
        try {
            Logger.d(L, "clean started, currentActivityAds size is ", Integer.valueOf(this.O.size()), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (tVar != null) {
                Logger.d(L, "clean, adding to reported impressions map. id =  ", tVar.L);
                this.N.add(tVar.L);
                tVar.Y = true;
                if (tVar.Z != null) {
                    tVar.Z.cancel(false);
                }
                if (tVar.aa != null) {
                    tVar.aa.cancel(false);
                }
                for (l lVar : tVar.g()) {
                    if (lVar.c != null && lVar.c.b != null) {
                        lVar.d = lVar.c.b;
                        Logger.d(L, "clean, set last impression screenshot filename to ", lVar.c.b);
                    }
                }
                synchronized (NativeFinder.class) {
                    Q.remove(tVar.L);
                }
                b(tVar);
            }
        } catch (Throwable th) {
            Logger.e(L, "Error in clean ", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:63:0x0203  */
    /* JADX WARN: Code duplicated, block: B:65:0x0208  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public void a(t tVar, boolean z, String str) {
        ArrayList arrayList;
        char c;
        String str2;
        boolean z2;
        int i = 1;
        boolean z3 = !tVar.E;
        char c2 = 0;
        boolean z4 = !tVar.F && tVar.d();
        long j = (tVar.ae <= 0 || tVar.af <= 0) ? 0L : tVar.ae - tVar.af;
        ArrayList arrayList2 = new ArrayList();
        if (tVar.k().isEmpty()) {
            Logger.d(L, "reporting event started, root=", str, ", isMature=", Boolean.valueOf(z), ", adInfo=", tVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            arrayList2.add(a(tVar, tVar.i(), z, z4, j, (String) null));
            arrayList = arrayList2;
        } else {
            Iterator<l> it = tVar.g().iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.j() != null && next.j().X() == null) {
                    Object[] objArr = new Object[i];
                    objArr[c2] = "reporting event - don't report CI as it was matched only by eventId and not by webview resources";
                    Logger.d(L, objArr);
                    next.a((CreativeInfo) null);
                }
                if (!z || next.c == null || next.c.a == null) {
                    c = 2;
                    str2 = null;
                } else {
                    String str3 = next.c.a + "_" + next.a;
                    c = 2;
                    Logger.d(L, "reporting event - imageFileIsValid filename = ", BrandSafetyUtils.a(tVar.p, next.c.a, tVar.c(), next.a, next.c.f));
                    str2 = str3;
                }
                float fA = next.c != null ? next.c.a(500) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Object[] objArr2 = new Object[8];
                objArr2[0] = "reporting event started, root=";
                objArr2[1] = str;
                objArr2[c] = ", isMature=";
                objArr2[3] = Boolean.valueOf(z);
                objArr2[4] = ", info=";
                objArr2[5] = tVar;
                objArr2[6] = ", uniformity=";
                objArr2[7] = Float.valueOf(fA);
                Logger.d(L, objArr2);
                Iterator<l> it2 = it;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a(tVar, next, z, z4, j, str2));
                if (z && next.j() != null && next.c != null) {
                    if (this.C.size() <= SafeDK.getInstance().J()) {
                        Logger.d(L, "reporting event waiting to report file ", next.c.b);
                        a(tVar, next);
                    } else {
                        Logger.d(L, "reporting event no open slot for ", this.c, ", ", next.c.a);
                        BrandSafetyUtils.d(next.c.b);
                    }
                }
                arrayList2 = arrayList3;
                it = it2;
                i = 1;
                c2 = 0;
            }
            arrayList = arrayList2;
        }
        if (!z && tVar.U) {
            Logger.w(L, "reporting event - ad finished, should discard brand safety event: ", arrayList);
        } else {
            if (StatsCollector.c() != null) {
                StatsCollector.c().a(arrayList);
            } else {
                z2 = true;
                Logger.w(L, "reporting event - stats collector instance is null, cannot report brand safety event");
            }
            if (z3) {
                tVar.c(z2);
            }
            if (z4) {
                tVar.d(z2);
            }
        }
        z2 = true;
        if (z3) {
            tVar.c(z2);
        }
        if (z4) {
            tVar.d(z2);
        }
    }

    private static BrandSafetyEvent a(t tVar, l lVar, boolean z, boolean z2, long j, String str) {
        return new BrandSafetyEvent(tVar.c(), tVar.q(), str, z2, tVar.d() ? tVar.e() : null, lVar.j(), tVar.a(), tVar.p(), lVar.a != null ? lVar.a : "", tVar.D, z, tVar.r(), lVar.c != null ? lVar.c.f : null, lVar.c != null ? lVar.c.c : 0L, lVar.c != null ? lVar.c.a(500) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lVar.c != null ? lVar.c.e : 0, tVar.ad, tVar.ai, j, tVar.ag, tVar.ah, SafeDK.getInstance().e(), tVar.w(), tVar.M, tVar.N, tVar.P, tVar.Q, b(tVar, lVar).toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        Iterator<t> it = this.O.values().iterator();
        while (it.hasNext()) {
            it.next().Y = true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(p pVar) {
        try {
            Logger.printFullVerboseLog(L, "set CI details started. matchingInfo = ", pVar.toString());
            CreativeInfo creativeInfo = pVar.a;
            if (creativeInfo != null) {
                Logger.d(L, "set CI details - CI exists in matchingInfo, sdk = ", creativeInfo.Q());
                creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                Logger.d(L, "set CI details - starting to iterate over current activity ads");
                ArrayList<d> arrayList = new ArrayList();
                synchronized (this.O) {
                    arrayList.addAll(this.O.keySet());
                }
                for (d dVar : arrayList) {
                    if (a(creativeInfo, this.O.get(dVar))) {
                        Logger.d(L, Logger.FeatureTag.CI_MATCHING, "set CI details - matched by webView/eventID, CI: ", creativeInfo);
                        if (a(dVar.a, dVar.e, pVar)) {
                            return true;
                        }
                    }
                }
                Logger.d(L, Logger.FeatureTag.CI_MATCHING, "set CI details - adding as pending, view address: ", creativeInfo.ak(), " matching info: ", pVar);
                synchronized (this.P) {
                    this.P.put(creativeInfo.ak(), pVar);
                }
                return true;
            }
        } catch (Throwable th) {
            Logger.e(L, "set CI details exception: ", th.getMessage(), th);
        }
        return false;
    }

    private boolean a(CreativeInfo creativeInfo, t tVar) {
        if (tVar == null || creativeInfo == null) {
            Logger.d(L, "verify matching - object is null, nativeInfo: ", tVar, ", creativeInfo: ", creativeInfo);
            return false;
        }
        String strQ = creativeInfo.Q();
        if (tVar.v == null || !tVar.v.equals(strQ)) {
            Logger.d(L, "verify matching - sdks does not match, ci sdk is: ", strQ, " and native sdk is: ", tVar.v);
            return false;
        }
        Logger.d(L, "verify matching - ci sdk is: ", strQ, ", native info: ", tVar);
        if (tVar.L != null && creativeInfo.n() != null && !tVar.L.equals(creativeInfo.n())) {
            Logger.d(L, "verify matching - incompatible event ID, ci: ", creativeInfo.n(), ", info: ", tVar.L);
            return false;
        }
        String strAk = creativeInfo.ak();
        if (tVar.K != null && tVar.K.equals(strAk)) {
            Logger.d(L, Logger.FeatureTag.CI_MATCHING, "verify matching object done, event ID: ", tVar.L, ", object address: ", strAk, ", view address: ", tVar.K);
            return true;
        }
        Logger.d(L, Logger.FeatureTag.CI_MATCHING, "verify matching object failed, event ID: ", tVar.L, ", matching object address: ", strAk, ", ad info view address: ", tVar.K);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, p pVar) {
        Logger.printFullVerboseLog(L, Logger.FeatureTag.CI_MATCHING, "set CI started, adUnitId=", str, " matchingInfo=", pVar);
        if (pVar == null) {
            Logger.d(L, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = pVar.a;
        if (creativeInfo != null) {
            d dVar = new d(str, creativeInfo.F(), creativeInfo.n(), creativeInfo.Q(), str2, BrandSafetyUtils.AdType.NATIVE);
            Logger.d(L, "set CI - activity key: ", dVar);
            t tVar = this.O.get(dVar);
            synchronized (this.O) {
                Object[] objArr = new Object[4];
                objArr[0] = "set CI - current activity ad: ";
                objArr[1] = tVar == null ? "null" : tVar;
                objArr[2] = ", current activity ad keys: ";
                objArr[3] = this.O.keySet();
                Logger.printFullVerboseLog(L, objArr);
            }
            if (tVar != null) {
                if (!tVar.X && StatsReporter.b().a(creativeInfo, tVar)) {
                    tVar.X = true;
                }
                CreativeInfo creativeInfoJ = tVar.j();
                if (creativeInfoJ != null) {
                    Logger.d(L, "set CI - previous CI id: ", creativeInfoJ.L());
                    if (creativeInfoJ.L().equals(creativeInfo.L())) {
                        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(creativeInfo.Q());
                        if (adNetworkDiscoveryJ != null) {
                            adNetworkDiscoveryJ.d(creativeInfoJ);
                        }
                        Logger.printFullVerboseLog(L, "set CI - already matched, same ad ID. current match: ", creativeInfo.aa(), ", previous match: ", creativeInfoJ.aa());
                    }
                }
                creativeInfo.a(pVar.b, pVar.c, pVar.d);
                tVar.a(creativeInfo);
                Logger.d(L, "set CI - CI is set for activity native ", dVar, ". CI : ", creativeInfo);
                b(tVar, creativeInfo);
                a(tVar, false, "setCreativeInfo");
                return true;
            }
            Logger.printFullVerboseLog(L, "set CI - no activity ad, cannot set CI. current activity ads: ", this.O);
        } else {
            Logger.d(L, "set CI - no CI");
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3, boolean z, String str4) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, String str3) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void e(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public c a(String str, RedirectDetails redirectDetails, n nVar, boolean z, boolean z2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, z zVar) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean b(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z, String str3) {
        return false;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
    }

    private boolean a(int i) {
        boolean zC = BrandSafetyUtils.c(i);
        Logger.d(L, "should stop sampling, max uniformed pixels count=", Integer.valueOf(i), ", return value=", Boolean.valueOf(zC));
        return zC;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        if (this.O != null) {
            for (t tVar : this.O.values()) {
                if (tVar.W) {
                    tVar.a(m.z, new m.a[0]);
                    a(tVar, false, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        if (this.O != null) {
            for (t tVar : this.O.values()) {
                if (tVar.W) {
                    tVar.a(m.A, new m.a[0]);
                    a(tVar, false, "onForeground");
                }
            }
        }
    }

    protected class a implements Runnable {
        t a;
        d b;
        int d;
        int c = 0;
        boolean e = false;

        public a(t tVar, d dVar, int i) {
            this.b = dVar;
            this.a = tVar;
            this.d = i;
        }

        private void a(View view) {
            if (view == null) {
                return;
            }
            Logger.d(NativeFinder.L, "handle native ad reflection - root= ", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(this.b.d);
            if (adNetworkDiscoveryJ != null && (view instanceof ViewGroup)) {
                ArrayList arrayList = new ArrayList();
                adNetworkDiscoveryJ.a((ViewGroup) view, (List<WeakReference<View>>) arrayList);
                for (WeakReference<View> weakReference : arrayList) {
                    if (weakReference.get() != null) {
                        List<CreativeInfo> listA = adNetworkDiscoveryJ.a(weakReference, this.a.M, BrandSafetyUtils.AdType.NATIVE);
                        Logger.d(NativeFinder.L, "handle native ad reflection - native view: ", weakReference.get(), ", state: ", Integer.valueOf(weakReference.get().getVisibility()), ", CIs: ", listA);
                        if (listA != null) {
                            for (CreativeInfo creativeInfo : listA) {
                                creativeInfo.a((Object) view);
                                creativeInfo.a(NativeFinder.this.c);
                                creativeInfo.h(this.b.c);
                                creativeInfo.j(this.b.b);
                                Logger.d(NativeFinder.L, "handle native ad reflection - setting ci: ", creativeInfo.aa());
                                NativeFinder.this.a(this.b.a, this.b.e, new p(creativeInfo, CreativeInfo.y));
                            }
                            return;
                        }
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference weakReference;
            try {
                this.c++;
                if (this.a != null) {
                    synchronized (NativeFinder.class) {
                        weakReference = (WeakReference) NativeFinder.Q.get(this.b.c);
                    }
                    if (weakReference != null && weakReference.get() != null) {
                        ViewGroup viewGroup = (ViewGroup) weakReference.get();
                        if (CreativeInfoManager.a(this.b.d, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false) && !this.e) {
                            a(viewGroup);
                            this.e = true;
                        }
                        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
                            this.a.ag = viewGroup.getWidth() / viewGroup.getHeight();
                            Logger.d(NativeFinder.L, "native impression task - view size: ", Integer.valueOf(viewGroup.getWidth()), "x", Integer.valueOf(viewGroup.getHeight()), ", proportion: ", Float.valueOf(this.a.ag));
                        }
                        if (this.c < this.d && !this.a.Y) {
                            if (this.a.ab != null && this.a.ab.get() != null) {
                                a(this.a, (View) weakReference.get());
                                return;
                            }
                            return;
                        }
                        Logger.d(NativeFinder.L, "Going to report native ad, eventId=", this.a.L, ", stop timer? ", Boolean.valueOf(this.a.Y), ", image counter=", Integer.valueOf(this.c), ", max attempts=", Integer.valueOf(this.d), ", isImpressionReported=", Boolean.valueOf(this.a.E), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        if (!this.a.E) {
                            NativeFinder.this.a(this.a, false, "NativeImpressionTask");
                        }
                        this.a.aa.cancel(false);
                    }
                }
            } catch (Throwable th) {
                Logger.e(NativeFinder.L, "Error in NativeImpressionTask: ", th);
            }
        }

        private void a(final t tVar, final View view) {
            if (tVar != null && view != null) {
                try {
                    if (!com.safedk.android.utils.e.a((c) tVar)) {
                        Logger.d(NativeFinder.L, Logger.FeatureTag.AD_CAPTURE, "Taking screenshot, view=", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        tVar.ab.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Logger.d(NativeFinder.L, "Taking screenshot - using old method");
                                final Bitmap bitmapA = ScreenshotHelper.a(view, SafeDK.getInstance().aa(), tVar);
                                NativeFinder.this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        NativeFinder.this.a(tVar, bitmapA, a.this.c);
                                    }
                                });
                            }
                        });
                        return;
                    }
                } catch (Throwable th) {
                    Logger.e(NativeFinder.L, "Error while taking screenshot", th);
                    return;
                }
            }
            Logger.d(NativeFinder.L, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", tVar, ", low memory");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void a(final Bitmap bitmap, final c cVar) {
        this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    t tVar = (t) cVar;
                    NativeFinder.this.a(tVar, bitmap, tVar.ac.c);
                } catch (Throwable th) {
                    Logger.d(NativeFinder.L, "handleScreenshotCompleted exception : ", th.getMessage(), th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(t tVar, Bitmap bitmap, int i) {
        String str;
        int i2;
        if (bitmap != null) {
            Logger.d(L, "process screenshot - currentActivityAd  = ", tVar);
            String strC = tVar.c();
            BrandSafetyUtils.a aVarB = BrandSafetyUtils.b(strC, bitmap);
            int iA = aVarB.a();
            BrandSafetyUtils.ScreenshotValidity screenshotValidityC = BrandSafetyUtils.c(strC, aVarB);
            if (screenshotValidityC == BrandSafetyUtils.ScreenshotValidity.VALID) {
                Logger.d(L, "process screenshot - VALID ");
                String strA = BrandSafetyUtils.a(bitmap);
                BrandSafetyUtils.ScreenShotOrientation screenShotOrientationB = BrandSafetyUtils.b(bitmap);
                l lVarI = tVar.i();
                String strA2 = BrandSafetyUtils.a(bitmap, this.c, strA, strC, lVarI.a, screenShotOrientationB);
                Logger.d(L, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot file created, filename = ", strA2, ", hash = ", strA);
                long jC = BrandSafetyUtils.c(strA2);
                Logger.d(L, "process screenshot - hash ", strA, ", stored file size is ", Long.valueOf(jC), " bytes, counter is ", Integer.valueOf(i), ", uniform pixel count is ", Integer.valueOf(iA), " (", Float.valueOf((iA / 500.0f) * 100.0f), "%)");
                int size = this.C.size();
                if (!d(strA, lVarI.a)) {
                    if (size <= SafeDK.getInstance().J()) {
                        if (lVarI.c != null && lVarI.c.a != null && !lVarI.c.a.equals(strA)) {
                            Logger.d(L, "process screenshot - removing ad file ", lVarI.c.b);
                            BrandSafetyUtils.d(lVarI.c.b);
                        }
                        lVarI.b(m.t, new m.a(m.K, m.X));
                        Logger.d(L, "process screenshot - setting data hash = ", strA, ", file name = ", strA2, ", file size = ", Long.valueOf(jC));
                        str = strA;
                        lVarI.c = new k(str, strA2, jC, iA, i, screenShotOrientationB, false);
                        a(tVar, false, "processScreenshot");
                        i2 = iA;
                    } else {
                        str = strA;
                        i2 = iA;
                        if (!c(str, lVarI.a)) {
                            Logger.d(L, "process screenshot - No open slot for ", str, "_", lVarI.a, ", # : ", Integer.valueOf(this.C.size()));
                            BrandSafetyUtils.d(strA2);
                        } else {
                            Logger.d(L, "process screenshot - Image ", str, "_", lVarI.a, " is already scheduled for upload");
                        }
                    }
                } else {
                    str = strA;
                    i2 = iA;
                    Logger.d(L, "process screenshot - not saving file for ", str, "_", lVarI.a);
                    BrandSafetyUtils.d(strA2);
                }
                if (a(i2)) {
                    if (!TextUtils.isEmpty(str)) {
                        tVar.e(true);
                        tVar.Y = true;
                    }
                    lVarI.a(m.t, new m.a(m.K, m.Y));
                    a(tVar, false, "processScreenshot");
                    return;
                }
                return;
            }
            Logger.d(L, Logger.FeatureTag.AD_CAPTURE, "process screenshot - screenshot is not valid: ", screenshotValidityC.name(), ", pixel count: ", Integer.valueOf(iA), ", counter = ", Integer.valueOf(i), ", try again...");
        }
    }

    public static String m(String str) {
        String str2;
        synchronized (NativeFinder.class) {
            str2 = S.get(str);
        }
        return str2;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void b() {
        for (t tVar : this.O.values()) {
            if (tVar.W) {
                tVar.a(m.D, new m.a[0]);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void c() {
        for (t tVar : this.O.values()) {
            if (tVar.W) {
                tVar.a(m.E, new m.a[0]);
            }
        }
    }

    public int f() {
        Iterator<t> it = this.O.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().W) {
                i++;
            }
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean f(String str) {
        synchronized (this.O) {
            for (t tVar : this.O.values()) {
                if (tVar != null && tVar.W && tVar.c() != null && tVar.c().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }
}
