package com.bytedance.sdk.openadsdk.gm.kgy.kgy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.model.noq;
import com.bytedance.sdk.openadsdk.core.model.twf;
import com.bytedance.sdk.openadsdk.core.model.wy;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.vrj;
import com.bytedance.sdk.openadsdk.core.vs;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ct;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.lqi;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ahm implements rz {
    protected int ahm;
    protected String kgy;
    private final WeakReference<Context> rz;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.u);
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.u);
        p0.startActivity(p1);
    }

    @Override // com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz
    public boolean rz(ioy ioyVar) {
        noq noqVarYv;
        if (ioyVar == null || (noqVarYv = ioyVar.yv()) == null) {
            return false;
        }
        return kgy(kgy(), ioyVar, noqVarYv.kgy(), noqVarYv.rz());
    }

    public static boolean ahm(ioy ioyVar, Context context, boolean z) {
        String strRz;
        IPBroadcastReceiver iPBroadcastReceiverKgy;
        if (ioyVar != null && context != null) {
            try {
                wy wyVarOp = ioyVar.op();
                if (wyVarOp != null && !TextUtils.isEmpty(wyVarOp.ra())) {
                    if (wyVarOp.gf() && kgy(ioyVar, context, z)) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("from_web", z ? 1 : 0);
                            com.bytedance.sdk.openadsdk.uq.rz.ahm(ioyVar, ioyVar.ct(), "gp_mini_card_success", jSONObject);
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "VP4omyGlRsKN", 374);
                        }
                        return true;
                    }
                    if (wyVarOp.yo() || wyVarOp.fi()) {
                        if (ioyVar.fpp() == 1) {
                            strRz = wyVarOp.kgy();
                        } else {
                            strRz = (ioyVar.yv() == null || TextUtils.isEmpty(ioyVar.yv().rz())) ? null : ioyVar.yv().rz();
                        }
                        if (!TextUtils.isEmpty(strRz) && (iPBroadcastReceiverKgy = IPBroadcastReceiver.kgy(context, ioyVar)) != null) {
                            iPBroadcastReceiverKgy.kgy(strRz, ioyVar);
                        }
                    }
                    final boolean zKgy = kgy.kgy(context, wyVarOp.ra(), ioyVar, ftg.ahm(ioyVar), kgy(ioyVar, z, wyVarOp), true);
                    mw.rz((Runnable) new com.bytedance.sdk.component.gf.ahm.rz("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.gm.kgy.kgy.ahm.5
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zKgy) {
                                ra.kgy("oem_store", "1");
                            } else {
                                ra.kgy("oem_store", "-2");
                            }
                        }
                    });
                    return zKgy;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "VP4omyGlRsKN", TTAdConstant.VIDEO_INFO_CODE);
                sx.rz("GPDownLoader", th2.getMessage());
            }
        }
        return false;
    }

    public static boolean kgy(Context context, String str, String str2, String str3, ioy ioyVar, int i) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from_web", i);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "XOE5miSzZsCMT+dRjQiCMWvvLp4Cu2zpgUfSfIIVlTpX", 80);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                kgy(ioyVar, str3, jSONObject);
                ct.kgy(ioyVar);
                return true;
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "XOE5miSzZsCMT+dRjQiCMWvvLp4Cu2zpgUfSfIIVlTpX", 95);
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent3);
                        kgy(ioyVar, str3, jSONObject);
                        ct.kgy(ioyVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "XOE5miSzZsCMT+dRjQiCMWvvLp4Cu2zpgUfSfIIVlTpX", 130);
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th3);
            }
        }
        return false;
    }

    public ahm(Context context, String str) {
        this.rz = new WeakReference<>(context);
        this.kgy = str;
        "====tag===".concat(String.valueOf(str));
        if (xh.kgy() == null) {
            xh.ahm(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq(ioy ioyVar) {
        if (ahm(ioyVar)) {
            ioyVar.noq(true);
            ct.kgy(ioyVar);
            return;
        }
        if (kgy(ioyVar, false)) {
            ct.kgy(ioyVar);
            return;
        }
        if (rz(ioyVar)) {
            ioyVar.noq(true);
            ct.kgy(ioyVar);
        } else if (ioyVar.yv() == null && ioyVar.wn() != null) {
            vrj.kgy(kgy(), ioyVar, ftg.kgy(this.kgy), null, null, this.kgy, true, ioyVar.wn());
            ioyVar.noq(true);
            ct.kgy(ioyVar);
        }
    }

    public boolean ahm(ioy ioyVar) {
        twf twfVarPaj = ioyVar.paj();
        if (twfVarPaj == null) {
            return false;
        }
        HashMap map = new HashMap();
        kgy(ioyVar, map);
        if (kgy.kgy(kgy(), twfVarPaj.kgy(), ioyVar, ftg.ahm(ioyVar), map, true)) {
            return true;
        }
        if (!vrj.kgy(kgy(), ioyVar, ftg.kgy(this.kgy), null, null, this.kgy, true, twfVarPaj.ahm())) {
            return false;
        }
        com.bytedance.sdk.openadsdk.uq.rz.kgy(ioyVar, this.kgy, "open_fallback_url", map, (JSONObject) null);
        return true;
    }

    private static void kgy(ioy ioyVar, String str, final JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.uq.rz.kgy(System.currentTimeMillis(), ioyVar, str, "store_open", new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.gm.kgy.kgy.ahm.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject kgy() {
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz
    public void kgy(int i) {
        this.ahm = i;
    }

    public boolean kgy(Context context, ioy ioyVar, String str, String str2) {
        return kgy(context, str, str2, this.kgy, ioyVar, 0);
    }

    public Context kgy() {
        WeakReference<Context> weakReference = this.rz;
        return (weakReference == null || weakReference.get() == null) ? xh.kgy() : this.rz.get();
    }

    @Override // com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz
    public void kgy(final ioy ioyVar) {
        if (kgy() == null || ioyVar == null) {
            return;
        }
        mw.gf().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gm.kgy.kgy.ahm.2
            @Override // java.lang.Runnable
            public void run() {
                ahm.this.uq(ioyVar);
            }
        });
    }

    private void kgy(ioy ioyVar, Map<String, Object> map) {
        if (ioyVar != null && ioyVar.prk() == 0) {
            map.put("auto_click", Boolean.valueOf(!ioyVar.sx()));
        }
        if (ioyVar == null || ioyVar.prk() != 0) {
            return;
        }
        map.put("dpl_probability_jump", Boolean.valueOf(this.ahm >= 11));
    }

    private boolean kgy(ioy ioyVar, boolean z) {
        return ahm(ioyVar, kgy(), z);
    }

    private static void kgy(final JSONObject jSONObject, ioy ioyVar, String str, final int i) {
        try {
            com.bytedance.sdk.openadsdk.uq.rz.kgy(System.currentTimeMillis(), ioyVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.gm.kgy.kgy.ahm.3
                @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
                public JSONObject kgy() {
                    try {
                        jSONObject.put("status", i);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3bAg=", "XOs5pQK7Q9SPRPNcmBA=", 260);
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "Tv4plBe5SMmEedJTiDS2LVX6", 266);
            th.getMessage();
        }
    }

    public static boolean kgy(ioy ioyVar, Context context, boolean z) {
        if (ioyVar != null && ioyVar.op() != null && ioyVar.op().gf() && !TextUtils.isEmpty(ioyVar.op().ra()) && context != null) {
            try {
                wy wyVarOp = ioyVar.op();
                String strKgy = ftg.kgy(ioyVar);
                final JSONObject jSONObjectNu = wyVarOp.nu();
                jSONObjectNu.put("from_web", z ? 1 : 0);
                jSONObjectNu.put("is_w2a", ioyVar.fpp());
                com.bytedance.sdk.openadsdk.uq.rz.kgy(System.currentTimeMillis(), ioyVar, strKgy, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.gm.kgy.kgy.ahm.4
                    @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
                    public JSONObject kgy() {
                        try {
                            jSONObjectNu.put("status", 0);
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3bA8=", "XOs5pQK7Q9SPRPNcmBA=", 287);
                        }
                        return jSONObjectNu;
                    }
                });
                Intent intentKgy = kgy(context, wyVarOp);
                if (intentKgy == null) {
                    kgy(jSONObjectNu, ioyVar, strKgy, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!lqi.kgy((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityAhm = vs.kgy().ct().ahm();
                    if (activityAhm != null && lqi.kgy(activityAhm)) {
                        context = activityAhm;
                    }
                }
                if (!(context instanceof Activity)) {
                    kgy(jSONObjectNu, ioyVar, strKgy, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentKgy.resolveActivity(packageManager) != null) {
                    try {
                        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221((Activity) context, intentKgy, 0);
                        kgy(jSONObjectNu, ioyVar, strKgy, 1);
                        return true;
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "WO8juhO5Z+WZbedwhR+pC1r8KQ==", 329);
                        kgy(jSONObjectNu, ioyVar, strKgy, -3);
                        return false;
                    }
                }
                kgy(jSONObjectNu, ioyVar, strKgy, -4);
                return false;
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "WO8juhO5Z+WZbedwhR+pC1r8KQ==", 333);
                th2.getMessage();
            }
        }
        return false;
    }

    private static Intent kgy(Context context, wy wyVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strUq = wyVar.uq();
            if (!TextUtils.isEmpty(strUq)) {
                intent.setPackage(strUq);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(wyVar.ra()));
            boolean z = true;
            if (wyVar.ahm() != 1) {
                z = false;
            }
            intent.putExtra("overlay", z);
            if (TextUtils.isEmpty(wyVar.rz())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", wyVar.rz());
            }
            wyVar.kgy(intent);
            return intent;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "XOs5sjOVZ9OFRMM=", 357);
            th.getMessage();
            return null;
        }
    }

    @NonNull
    private static Map<String, Object> kgy(ioy ioyVar, boolean z, wy wyVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", wyVar.noq());
            jSONObject.put("from_web", z ? 1 : 0);
            jSONObject.put("is_w2a", ioyVar.fpp());
            map.put("pag_json_data", jSONObject.toString());
            return map;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "XOs5sBuoRMaQ", 428);
            return map;
        }
    }

    public static boolean kgy(String str) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!g.e.equals(scheme) && !HttpRequest.DEFAULT_SCHEME.equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter("uri")) != null) {
                        return kgy(queryParameter);
                    }
                }
                return true;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MHpTpI6yyGTa9tzM5O2EqCHa8pXw==", "fN4JmhSyRciBTtJPohS3", "Uv0Kmgy7ZcKwRtZEowONKUnlKIE2rmU=", 469);
                th.getMessage();
            }
        }
        return false;
    }

    public static boolean kgy(ioy ioyVar, String str) {
        if (ioyVar == null || ioyVar.op() == null) {
            return false;
        }
        String strCt = ioyVar.op().ct();
        if (TextUtils.isEmpty(strCt)) {
            return false;
        }
        return Pattern.compile(strCt).matcher(str).matches();
    }
}
