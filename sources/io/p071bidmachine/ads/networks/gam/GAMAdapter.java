package io.p071bidmachine.ads.networks.gam;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.moloco.sdk.internal.publisher.k0;
import defpackage.d;
import defpackage.lu0;
import defpackage.xw1;
import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.AdsType;
import io.p071bidmachine.ContextProvider;
import io.p071bidmachine.HeaderBiddingAdRequestParams;
import io.p071bidmachine.HeaderBiddingAdapter;
import io.p071bidmachine.HeaderBiddingCollectParamsCallback;
import io.p071bidmachine.InitializationParams;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.NetworkConfigParams;
import io.p071bidmachine.NetworkInitializationCallback;
import io.p071bidmachine.ads.networks.gam.versions.v21_0_0.b;
import io.p071bidmachine.core.j;
import io.p071bidmachine.unified.e;
import io.p071bidmachine.unified.g;
import io.p071bidmachine.utils.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class GAMAdapter extends HeaderBiddingAdapter {
    public xw1 a;

    @Override // io.p071bidmachine.NetworkAdapter
    public final boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    public GAMAdapter() {
        super("gam", "", "3.8.0.3", 16, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final void clearAuction(NetworkAdUnit networkAdUnit) {
        xw1 xw1Var = this.a;
        if (xw1Var != null) {
            ((j) xw1Var.b).e(networkAdUnit);
        }
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final e createBanner() {
        xw1 xw1Var = this.a;
        if (xw1Var != null) {
            return new b(xw1Var, 0);
        }
        d.r("GAMNetwork is null");
        return null;
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final g createInterstitial() {
        xw1 xw1Var = this.a;
        if (xw1Var != null) {
            return new e(xw1Var, 0);
        }
        d.r("GAMNetwork is null");
        return null;
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final g createRewarded() {
        xw1 xw1Var = this.a;
        if (xw1Var != null) {
            return new e(xw1Var, 1);
        }
        d.r("GAMNetwork is null");
        return null;
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final String getNetworkSdkVersion() {
        xw1 xw1Var = this.a;
        if (xw1Var == null) {
            return null;
        }
        try {
            return ((b) xw1Var.e).b().toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final boolean isNetworkInitialized(ContextProvider contextProvider) {
        xw1 xw1Var = this.a;
        return xw1Var != null && ((AtomicBoolean) xw1Var.d).get();
    }

    @Override // io.p071bidmachine.HeaderBiddingAdapter
    public final void onCollectHeaderBiddingParams(ContextProvider contextProvider, io.p071bidmachine.unified.d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
        l lVar;
        AdsFormat parent;
        String mediationParameter = networkAdUnit.getMediationParameter("ad_unit_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(a.a("ad_unit_id not found"));
            return;
        }
        xw1 xw1Var = this.a;
        if (xw1Var == null) {
            headerBiddingCollectParamsCallback.onCollectFail(a.a("GAM network is null"));
            return;
        }
        j jVar = (j) xw1Var.b;
        synchronized (jVar.k) {
            m mVarA = jVar.a(mediationParameter);
            if (mVarA != null) {
                synchronized (jVar.l) {
                    io.p071bidmachine.core.a.b(jVar.a, new lu0(27, networkAdUnit, mVarA));
                    jVar.j.put(networkAdUnit, mVarA);
                }
                lVar = mVarA.d;
            } else {
                lVar = null;
            }
        }
        xw1 xw1Var2 = this.a;
        AdsFormat adsFormat = dVar.getAdRequestParameters().getAdsFormat();
        j jVar2 = (j) xw1Var2.b;
        if (!jVar2.c(adsFormat) && (parent = adsFormat.getParent()) != null) {
            jVar2.c(parent);
        }
        if (lVar == null) {
            headerBiddingCollectParamsCallback.onCollectFail(a.a("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", lVar.a);
        map.put("score", String.valueOf(lVar.b));
        map.put("price", String.valueOf(lVar.c));
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final void onLossAuction(NetworkAdUnit networkAdUnit) {
        xw1 xw1Var = this.a;
        if (xw1Var != null) {
            ((j) xw1Var.b).e(networkAdUnit);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022 A[EDGE_INSN: B:8:0x0022->B:30:0x0070 BREAK  A[LOOP:3: B:26:0x0057->B:150:?]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0083. Please report as an issue. */
    @Override // io.p071bidmachine.NetworkAdapter
    public final void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) {
        io.p071bidmachine.utils.version.a aVarB;
        b bVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        HashMap map;
        k kVarM;
        boolean z6;
        boolean z7;
        String strRemoveFromNetworkParams = networkConfigParams.removeFromNetworkParams("supported_versions_range");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams)) {
            networkInitializationCallback.onFail("supported_versions_range not provided");
            return;
        }
        ArrayList arrayList = p.a;
        io.p071bidmachine.utils.version.b bVarB = io.p071bidmachine.utils.version.b.b(strRemoveFromNetworkParams);
        if (bVarB == null) {
            bVar = null;
            break;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVarB = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            b bVar2 = (b) ((Pair) obj).second;
            if (Build.VERSION.SDK_INT >= bVar2.a) {
                try {
                    aVarB = bVar2.b();
                } catch (Throwable unused) {
                    aVarB = null;
                }
                if (aVarB != null) {
                    break;
                }
            }
        }
        if (aVarB == null || !bVarB.a(aVarB)) {
            bVar = null;
            break;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                bVar = null;
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            Pair pair = (Pair) obj2;
            if (((io.p071bidmachine.utils.version.b) pair.first).a(aVarB)) {
                bVar = (b) pair.second;
                break;
            }
        }
        if (bVar == null) {
            networkInitializationCallback.onFail("Unsupported GAM version (VersionWrapper not found)");
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        switch (bVar.c) {
            case 0:
                try {
                    Bundle bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
                    z = bundle == null ? false : !TextUtils.isEmpty(bundle.getString("com.google.android.gms.ads.APPLICATION_ID"));
                } catch (Exception unused2) {
                }
                if (z) {
                    try {
                        int i3 = AdManagerAdView.a;
                        z2 = true;
                    } catch (Exception unused3) {
                        z2 = false;
                    }
                    z5 = z2;
                }
                break;
            case 1:
                try {
                    Bundle bundle2 = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
                    z6 = bundle2 == null ? false : !TextUtils.isEmpty(bundle2.getString("com.google.android.gms.ads.APPLICATION_ID"));
                } catch (Exception unused4) {
                }
                if (z6) {
                    try {
                        int i4 = AdManagerAdView.a;
                        z7 = true;
                    } catch (Exception unused5) {
                        z7 = false;
                    }
                    if (z7) {
                    }
                }
                break;
            default:
                try {
                    Bundle bundle3 = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
                    z3 = bundle3 == null ? false : !TextUtils.isEmpty(bundle3.getString("com.google.android.gms.ads.APPLICATION_ID"));
                } catch (Exception unused6) {
                }
                if (z3) {
                    try {
                        int i5 = AdManagerAdView.a;
                        z4 = true;
                    } catch (Exception unused7) {
                        z4 = false;
                    }
                    if (z4) {
                    }
                }
                break;
        }
        if (!z5) {
            networkInitializationCallback.onFail("GAM is absent or used unsupported version");
            return;
        }
        String strRemoveFromNetworkParams2 = networkConfigParams.removeFromNetworkParams("waterfall_configurations");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams2)) {
            networkInitializationCallback.onFail("waterfall_configurations not provided");
            return;
        }
        HashMap map2 = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(strRemoveFromNetworkParams2);
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
                if (jSONObjectOptJSONObject != null && (kVarM = k0.m(jSONObjectOptJSONObject)) != null) {
                    map2.put(kVarM.a, kVarM);
                }
            }
            map = map2;
        } catch (Throwable unused8) {
            map = null;
        }
        if (map == null || map.isEmpty()) {
            networkInitializationCallback.onFail("waterfall_configurations is empty");
            return;
        }
        String strRemoveFromNetworkParams3 = networkConfigParams.removeFromNetworkParams("request_agent");
        String strRemoveFromNetworkParams4 = networkConfigParams.removeFromNetworkParams("expiration_time");
        Handler handler = j.a;
        int i7 = 3600;
        if (!TextUtils.isEmpty(strRemoveFromNetworkParams4)) {
            try {
                i7 = Integer.parseInt(strRemoveFromNetworkParams4);
            } catch (Throwable unused9) {
            }
        }
        xw1 xw1Var = new xw1(applicationContext, bVar, map, strRemoveFromNetworkParams3, TimeUnit.SECONDS.toMillis(i7), Boolean.parseBoolean(networkConfigParams.removeFromNetworkParams("override_callbacks")));
        this.a = xw1Var;
        if (!((AtomicBoolean) xw1Var.d).getAndSet(true)) {
            try {
                switch (((b) xw1Var.e).c) {
                    case 0:
                        MobileAds.initialize(applicationContext);
                        break;
                    case 1:
                        MobileAds.initialize(applicationContext);
                        break;
                    default:
                        MobileAds.initialize(applicationContext);
                        break;
                }
            } catch (Throwable unused10) {
            }
        }
        j jVar = (j) this.a.b;
        jVar.getClass();
        for (AdsFormat adsFormat : AdsFormat.values()) {
            jVar.c(adsFormat);
        }
        networkInitializationCallback.onSuccess();
    }
}
