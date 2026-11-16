package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.component.utils.um;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.kus;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.uq.kgy.at;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import defpackage.nj;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class nu implements gf.kgy {
    public static final String ahm;
    public static int ct;
    private static final ConcurrentLinkedQueue<ra.kgy> fpp;
    private static String fpz;
    private static final String gf;
    public static final String kgy;
    public static String noq;
    private static boolean nu;
    public static final String rz;
    public static String uq;
    static final ConcurrentHashMap<String, Integer> yo;
    private final com.bytedance.sdk.openadsdk.core.settings.kgy at;
    private final Set<String> ay;
    private int dg;
    ct.ahm<at> fi;
    private final ct.ahm<Map<String, Integer>> gm;
    private final ct.ahm<Set<String>> ioy;
    private final AtomicBoolean kus;
    private ct.ahm<JSONObject> lqi;
    private Set<String> ra;
    private final Runnable sx;
    private final fi twf;
    private boolean um;
    private volatile boolean vs;
    private int xh;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        static final nu kgy = new nu();
    }

    @WorkerThread
    public synchronized void rz() {
        SystemClock.elapsedRealtime();
        boolean z = this.vs;
        this.at.kgy(this.vs);
        this.twf.kgy(this.vs);
        rz.kgy(!z);
        this.vs = true;
        SystemClock.elapsedRealtime();
        if (!z) {
            kus.ahm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.3
                @Override // java.lang.Runnable
                public void run() {
                    boolean z2;
                    if (!com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().yo() && !com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().ra()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    nu.this.kgy(1, z2);
                    nu.this.yjf();
                }
            }, 1000L);
        }
    }

    public String[] uh() {
        try {
            Set<String> set = this.ra;
            if (set == null || set.size() == 0) {
                JSONArray jSONArray = new JSONArray(this.twf.kgy("gecko_hosts", (String) null));
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.ra.add(jSONArray.getString(i));
                    }
                }
                Set<String> setKgy = fi.kgy(this.ra);
                this.ra = setKgy;
                if (setKgy != null) {
                    if (setKgy.size() == 0) {
                    }
                }
                return null;
            }
            return (String[]) this.ra.toArray(new String[0]);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lanw==", "XOs5sga/YsioRcRJnw==", 1301);
            return null;
        }
    }

    public boolean um(String str) {
        return str == null || DeviceUtils.ra(xh.kgy()) == 0 || ft(str).twf == 1;
    }

    public static boolean af() {
        return nu;
    }

    private String any() {
        return this.twf.kgy("force_language", "");
    }

    public static String jw() {
        if (fpz == null) {
            String strAhm = com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("settings_host_from_meta", "");
            fpz = strAhm;
            if (strAhm == null) {
                fpz = "";
            }
        }
        return fpz;
    }

    private Set<String> mv() {
        return (Set) this.twf.kgy("perf_con_applog_send", this.ay, this.ioy);
    }

    public static void vg(String str) {
        if (str == null) {
            str = "";
        }
        String strJw = jw();
        if (strJw == null || !strJw.equals(str)) {
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("settings_host_from_meta", str);
            fpz = str;
            ahm().kgy(8, true);
        }
    }

    public Set<String> ac() {
        return (Set) this.twf.kgy("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, ct.ahm);
    }

    public int ahm(String str) {
        Integer num;
        Map map = (Map) this.twf.kgy("perf_con_applog_rate", null, this.gm);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public Set<String> ax() {
        return (Set) this.twf.kgy("privacy_fields_allowed", Collections.EMPTY_SET, ct.ahm);
    }

    public boolean ay() {
        return this.twf.kgy("bus_con_url_check", 1) != 0;
    }

    public boolean bgd() {
        return this.twf.kgy("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public int bmz() {
        return this.twf.kgy("max", 50);
    }

    public int cc() {
        int iKgy = this.twf.kgy("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iKgy != Integer.MAX_VALUE) {
            return iKgy;
        }
        int iFpz = ftg.fpz();
        if (iFpz == 1 || iFpz == 2) {
            return 2;
        }
        return iFpz != 3 ? 0 : 1;
    }

    public boolean dg() {
        return this.twf.kgy("support_gzip", false);
    }

    public boolean dpp() {
        return this.twf.kgy("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    public int dr() {
        int iKgy = this.twf.kgy("bus_con_auto_click_delay", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return iKgy <= 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : iKgy;
    }

    public int dta() {
        return this.twf.kgy("ivrv_downward", 0);
    }

    public JSONObject ebs() {
        return (JSONObject) this.twf.kgy("perf_con_thread_pool_config", new JSONObject(), this.lqi);
    }

    public void fi() {
        this.twf.ahm().kgy("ab_test_param").kgy();
    }

    public JSONObject fpp(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(this.twf.kgy("core_settings", ""));
            try {
                jSONObjectJsonObjectInit.put("ad_slot_setting", ft(str).ikw);
                return jSONObjectJsonObjectInit;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObjectJsonObjectInit;
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lanw==", "XOs5tgyubPSFXsNUghaKO1TgApcJ", IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION);
                sx.rz("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public float fpz() {
        return this.twf.kgy(rz, 1.0f);
    }

    public int ft() {
        return this.twf.kgy("loadedCallbackOpportunity", 0);
    }

    public String ftg() {
        return this.twf.kgy("settings_url", "");
    }

    public String fxy() {
        return this.twf.kgy("dual_event_url", (String) null);
    }

    public String gbb() {
        return this.twf.kgy("policy_url", "");
    }

    public long gc() {
        return this.twf.kgy("last_req_time", 0L);
    }

    public String gf() {
        return this.twf.kgy("ab_test_version", "");
    }

    public int gg() {
        return this.twf.kgy("vbtt", 5);
    }

    public String gm() {
        return this.twf.kgy("bus_con_check_clz", "");
    }

    public Set<String> ib() {
        return (Set) this.twf.kgy("token_adx_ids", Collections.EMPTY_SET, ct.ahm);
    }

    public long idg() {
        return this.twf.kgy("perf_con_adlog_expire_time", 0L);
    }

    public noq ikw() {
        return (noq) this.twf.kgy("insert_js_config", noq.kgy, new ct.ahm<noq>() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.ct.ahm
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public noq ahm(String str) {
                return new noq(str);
            }
        });
    }

    public boolean ioy() {
        return this.twf.kgy(kgy, false);
    }

    public String jc() {
        return this.twf.kgy("dc", "");
    }

    public Set<String> jvt() {
        fi fiVar = this.twf;
        Set<String> set = Collections.EMPTY_SET;
        Set<String> set2 = (Set) fiVar.kgy("dual_event_url_backup", set, ct.ahm);
        return (set2 == null || set2.size() == 0) ? set : set2;
    }

    public boolean ko() {
        return this.kus.get();
    }

    public String lb() {
        return this.twf.kgy("dc", "TX");
    }

    public int lqi() {
        return this.twf.kgy(ahm, 10000);
    }

    public String mca() {
        return this.twf.kgy("ads_url", "");
    }

    public void mh() {
        ct.kgy kgyVarAhm = this.twf.ahm();
        kgyVarAhm.kgy("settings_url", "");
        kgyVarAhm.kgy();
        vg("");
    }

    public int muf() {
        int iKgy = this.twf.kgy("fetch_tpl_second", 0);
        if (iKgy <= 0) {
            return 0;
        }
        return iKgy;
    }

    public boolean mw() {
        return this.twf.rz();
    }

    public boolean naw() {
        return this.twf.kgy("read_video_from_cache", 1) == 1;
    }

    @Nullable
    public JSONObject noq() {
        return (JSONObject) this.twf.kgy("digest", null, ct.kgy);
    }

    public int nu() {
        return this.twf.kgy("perf_con_drawable_code", 0);
    }

    public boolean owk() {
        return this.twf.kgy("token_enable", 0) == 1;
    }

    public boolean pft() {
        return this.twf.kgy("privacy_debug_unlock", 1) != 0;
    }

    public boolean pxt() {
        return this.twf.kgy("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    public boolean qdr() {
        return this.vs;
    }

    public boolean qi() {
        return this.twf.kgy("perf_con_is_new_net_thread", 0) == 1;
    }

    public at qjb() {
        return (at) this.twf.kgy("perf_con_track_url_strategy", at.kgy, this.fi);
    }

    public int ra(String str) {
        if (str == null) {
            return 5000;
        }
        return ft(str).dg;
    }

    public Set<String> sa() {
        fi fiVar = this.twf;
        Set<String> set = Collections.EMPTY_SET;
        Set<String> set2 = (Set) fiVar.kgy("ads_url_backup", set, ct.ahm);
        return (set2 == null || set2.size() == 0) ? set : set2;
    }

    public boolean sm() {
        int iKgy = this.twf.kgy("privacy_ad_enable", Integer.MAX_VALUE);
        if (iKgy == 1) {
            return true;
        }
        if (iKgy == 0) {
            return false;
        }
        int iFpz = ftg.fpz();
        return iFpz == 1 || iFpz == 2 || iFpz == 3;
    }

    public int sx() {
        return this.twf.kgy("bus_con_behavior_count", 300);
    }

    public String tp() {
        return this.twf.kgy("dyn_draw_engine_url", gf);
    }

    public String uq() {
        return this.twf.kgy("aes_key", "");
    }

    public int uxe() {
        int iKgy = this.twf.kgy("fetch_tpl_timeout_ctrl", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return iKgy <= 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : iKgy;
    }

    public boolean vf() {
        int iKgy = this.at.kgy("perf_con_apm", 100);
        if (iKgy == 0) {
            return false;
        }
        return iKgy < 0 || iKgy >= 100 || iKgy > ((int) (Math.random() * 100.0d));
    }

    public boolean vs() {
        return this.twf.kgy("allow_blind_mode_request_ad", false);
    }

    public boolean vz() {
        return this.twf.kgy("bus_con_video_keep_screen_on", 1) == 1;
    }

    public int wbb() {
        return this.twf.kgy("perf_con_sync_gaid", 0);
    }

    public String wl() {
        return this.twf.kgy("app_log_url", "");
    }

    public boolean wy(@NonNull String str) {
        Set set = (Set) this.twf.kgy("privacy_fields_allowed", Collections.EMPTY_SET, ct.ahm);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iFpz = ftg.fpz();
        if (iFpz != 1) {
            if (iFpz != 2 && iFpz != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public int xkh() {
        int iKgy = this.twf.kgy("perf_con_webview_cache_count_v3", 0);
        if (iKgy < 0) {
            return 0;
        }
        return iKgy;
    }

    public boolean xlt() {
        return this.twf.kgy("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public String xrn() {
        return this.twf.kgy("privacy_app_reg", "");
    }

    public int xts() {
        return this.twf.kgy("blank_detect_rate", 30);
    }

    public String xxq() {
        return this.twf.kgy("target_region", "");
    }

    public long yo() {
        return this.twf.kgy("data_time", 0L);
    }

    public long yx() {
        long jKgy = this.twf.kgy("req_inter_min", 600000L);
        if (jKgy < 0 || jKgy > 86400000) {
            return 600000L;
        }
        return jKgy;
    }

    public boolean zjw() {
        return this.twf.kgy("global_rate", 1.0f) == 1.0f;
    }

    public int znm() {
        int iKgy = this.twf.kgy("perf_con_webview_cache_count", 0);
        if (iKgy < 0) {
            return 0;
        }
        return iKgy;
    }

    static {
        CharSequence[] charSequenceArr = {"bus_con_collect", ftg.vg()};
        StringBuilder sb = new StringBuilder();
        sb.append(charSequenceArr[0]);
        sb.append((CharSequence) "_");
        sb.append(charSequenceArr[1]);
        kgy = sb.toString();
        CharSequence[] charSequenceArr2 = {"bus_con", ftg.vg(), ftg.uf(), "timeout"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr2[0]);
        for (int i = 1; i < 4; i++) {
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[i]);
        }
        ahm = sb2.toString();
        CharSequence[] charSequenceArr3 = {"bus_con", ftg.vg(), ftg.uf(), "alpha"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr3[0]);
        for (int i2 = 1; i2 < 4; i2++) {
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr3[i2]);
        }
        rz = sb3.toString();
        gf = ftg.ioy();
        uq = "";
        ct = -2;
        noq = AndroidTcfDataSource.TCF_TCSTRING_KEY;
        nu = false;
        fpp = new ConcurrentLinkedQueue<>();
        yo = new ConcurrentHashMap<>();
    }

    private nu() {
        this.ra = Collections.synchronizedSet(new HashSet());
        this.at = new com.bytedance.sdk.openadsdk.core.settings.kgy();
        this.twf = new fi(new ra.kgy() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ra.kgy
            public void kgy() {
                ra.kgy[] kgyVarArr;
                boolean unused = nu.nu = true;
                com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().kus();
                if (nu.fpp == null || nu.fpp.size() == 0 || (kgyVarArr = (ra.kgy[]) nu.fpp.toArray()) == null) {
                    return;
                }
                for (ra.kgy kgyVar : kgyVarArr) {
                    kgyVar.kgy();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ra.kgy
            public void ahm() {
                com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().vs();
                if (nu.fpp != null && !nu.fpp.isEmpty()) {
                    Iterator it = nu.fpp.iterator();
                    while (it.hasNext()) {
                        ((ra.kgy) it.next()).ahm();
                    }
                }
            }
        });
        this.kus = new AtomicBoolean(false);
        this.vs = false;
        this.dg = 5000;
        this.xh = 10;
        this.sx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.7
            @Override // java.lang.Runnable
            public void run() {
                nu.this.kgy(2, false);
                nu.this.yjf();
            }
        };
        this.gm = new ct.ahm<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.ct.ahm
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> ahm(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                    HashMap map = new HashMap(jSONObjectJsonObjectInit.length());
                    Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObjectJsonObjectInit.optInt(next, 100);
                            if (iOptInt >= 0 && iOptInt <= 100) {
                                map.put(next, Integer.valueOf(iOptInt));
                            } else {
                                map.put(next, 100);
                            }
                        }
                    }
                    return map;
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lan1X3", "WPwolBe5", 1536);
                    sx.rz(nj.o(e, new StringBuilder("get applog rate from sp failed:")), new Object[0]);
                    return null;
                }
            }
        };
        this.ay = new HashSet();
        this.ioy = new ct.ahm<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.ct.ahm
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public Set<String> ahm(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                        int iOptInt = jSONObjectJsonObjectInit.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            nu.this.xh = iOptInt;
                        }
                        int iOptInt2 = jSONObjectJsonObjectInit.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            nu.this.dg = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObjectJsonObjectInit.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lan1X4", "WPwolBe5", 1570);
                        Log.i("TTAD.SdkSettings", e.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.lqi = new ct.ahm<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.ct.ahm
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public JSONObject ahm(String str) {
                JSONObject jSONObjectJsonObjectInit;
                try {
                    jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lan1X5", "WPwolBe5", 1636);
                    sx.rz("TTAD.SdkSettings", th.getMessage());
                    jSONObjectJsonObjectInit = null;
                }
                if (jSONObjectJsonObjectInit == null) {
                    return new JSONObject();
                }
                return jSONObjectJsonObjectInit;
            }
        };
        this.fi = new ct.ahm<at>() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.ct.ahm
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public at ahm(String str) {
                at atVar = new at();
                try {
                    JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                    atVar.kgy(jSONObjectJsonObjectInit.optInt("enable_strategy", 0) == 1);
                    atVar.kgy(kgy(jSONObjectJsonObjectInit.optJSONObject(BuildConfig.FLAVOR)));
                    JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            atVar.kgy(next, kgy(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                    return atVar;
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lan1XxeA==", "WPwolBe5", IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED);
                    return atVar;
                }
            }

            private at.kgy kgy(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new at.kgy(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
    }

    public int at(String str) {
        return ft(str).at;
    }

    public boolean ct(String str) {
        int i = ft(str).ct;
        if (i != 1) {
            if (i == 2 && um.rz(xh.kgy()) != 0) {
                return true;
            }
            return false;
        }
        return um.uq(xh.kgy());
    }

    public boolean jpc(String str) {
        if (xh.uq().ft(str).vs == 1) {
            return true;
        }
        return false;
    }

    public void kgy(@TTSdkSettings.FETCH_REQUEST_SOURCE final int i, boolean z) {
        if (!com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().uq()) {
            if (!kus.ct() && i != 1 && i != 2) {
                if (z) {
                    this.um = true;
                    return;
                }
                return;
            }
            try {
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ra.ahm().uq())) {
                    if (this.um) {
                        this.um = false;
                        if (!z) {
                            z = true;
                        }
                    }
                    long jGc = gc();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jYx = yx();
                    long j = jCurrentTimeMillis - jGc;
                    if ((!z && j < jYx) || !this.kus.compareAndSet(false, true)) {
                        return;
                    }
                    mw.rz((Runnable) new com.bytedance.sdk.component.gf.ahm.rz("setting_req") { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.6
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z2;
                            com.bytedance.sdk.openadsdk.core.ra.ahm ahmVarKgy = com.bytedance.sdk.openadsdk.core.ra.ahm.kgy();
                            com.bytedance.sdk.openadsdk.core.ra.uq uqVar = new com.bytedance.sdk.openadsdk.core.ra.uq() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.6.1
                                @Override // com.bytedance.sdk.openadsdk.core.ra.uq
                                public void kgy(boolean z3) {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    if (!z3) {
                                        nu.this.kus.set(false);
                                    } else {
                                        nu nuVar = nu.this;
                                        new gf(nuVar, nuVar.twf, nu.this.at).run();
                                    }
                                }
                            };
                            if (i == 6) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ahmVarKgy.kgy(uqVar, z2);
                        }
                    });
                    kus.ahm().removeCallbacks(this.sx);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lanw==", "Xes5lguObMqPXtJuiBqTLU/6JJsErw==", 1418);
                ApmHelper.reportCustomError("settings request error", "settings", th);
            }
        }
    }

    public int kus(String str) {
        return ft(String.valueOf(str)).fi;
    }

    public boolean oyj() {
        if (!com.bytedance.sdk.component.adexpress.uq.ahm.kgy(xh.kgy())) {
            return false;
        }
        return this.twf.kgy("support_rtl", false);
    }

    public boolean twf(String str) {
        try {
            if (ft(str).ioy != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lanw==", "U+87kDesZe6EWQ==", 888);
            return false;
        }
    }

    public boolean uf(String str) {
        Set<String> setIb;
        if (TextUtils.isEmpty(str) || (setIb = ib()) == null || setIb.size() == 0) {
            return false;
        }
        return setIb.contains(str);
    }

    public void vrj() {
        String strAny = any();
        if (!TextUtils.isEmpty(strAny)) {
            if (strAny.equals("zh-Hant")) {
                com.bytedance.sdk.component.utils.at.kgy(xh.kgy(), "zh", "tw");
            } else {
                com.bytedance.sdk.component.utils.at.kgy(xh.kgy(), strAny, null);
            }
            try {
                TTAdDislikeToast.onResourceUpdated();
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lanw==", "SOs5swyuasKsS9lamRCnLW/hH5AQs3zVg0//WIAB", 777);
                sx.rz("TTAD.SdkSettings", th.getMessage());
            }
        }
    }

    public boolean xh(String str) {
        if (ft(str).ay == 0) {
            return true;
        }
        return false;
    }

    public void yjf() {
        kus.ahm().removeCallbacks(this.sx);
        kus.ahm().postDelayed(this.sx, yx());
    }

    public Set<String> at() {
        return mv();
    }

    public int dg(String str) {
        return ft(str).ra;
    }

    @NonNull
    public ahm ft(String str) {
        return rz.kgy(str);
    }

    public int ioy(String str) {
        return ft(str).jpc;
    }

    public int nu(String str) {
        return ft(str).nu;
    }

    public boolean vs(String str) {
        return kus(str) != 1;
    }

    public boolean fpz(String str) {
        return ft(str).vg;
    }

    public int gf(String str) {
        if (str == null) {
            return 1;
        }
        return ft(str).kus;
    }

    public boolean gm(String str) {
        return ft(str).gm;
    }

    public int kus() {
        mv();
        return this.dg;
    }

    public int lqi(String str) {
        return ft(str).ft;
    }

    public int sx(String str) {
        return ft(str).sx;
    }

    public boolean uq(String str) {
        return ft(str).wy;
    }

    public int yo(String str) {
        return ft(str).um;
    }

    public int ra() {
        return this.twf.kgy("splash_video_load_strategy", 0);
    }

    public boolean xh() {
        return this.twf.kgy("ad_revenue_enable", true);
    }

    public int ay(String str) {
        return ft(str).fpz;
    }

    public boolean noq(String str) {
        return ft(str).yo == 1;
    }

    public boolean fi(String str) {
        return str == null || ft(str).kus == 1;
    }

    public int jpc() {
        return this.twf.kgy("bus_con_slide_num", 2);
    }

    public int twf() {
        mv();
        return this.xh;
    }

    public boolean um() {
        return this.twf.kgy("bus_con_adshow_check_enable", true);
    }

    public boolean uf() {
        return this.twf.kgy("landingpage_new_style", -1) == 1;
    }

    public int ct() {
        return this.twf.kgy("max_tpl_cnts", 100);
    }

    public long vg() {
        return this.twf.kgy("duration", 10000L);
    }

    public static String ahm(Context context) {
        SharedPreferences sharedPreferencesRz;
        return (context == null || (sharedPreferencesRz = rz(context)) == null) ? "" : sharedPreferencesRz.getString(noq, "");
    }

    public static nu ahm() {
        return kgy.kgy;
    }

    public int ahm(int i) {
        return ft(String.valueOf(i)).ahm;
    }

    @Nullable
    private static SharedPreferences rz(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lanw==", "XOs5sQa6aNKMXuRVjQOlLGv8KJMGrmzJg0/Ebo0XpQ==", 504);
            return null;
        }
    }

    public boolean rz(String str) {
        return ft(str).rz == 1;
    }

    public String fpp() {
        return this.twf.kgy("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public int rz(int i) {
        return ft(String.valueOf(i)).gf;
    }

    public String wy() {
        return this.twf.kgy("ab_test_param", "");
    }

    public void kgy() {
        try {
            rz.ahm();
            this.twf.uq();
            this.at.uq();
            Context contextKgy = xh.kgy();
            File file = new File(new File(contextKgy.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                contextKgy.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lanw==", "WOIolBGdZcujS9RViQ==", 453);
        }
    }

    public static int kgy(Context context) {
        if (context != null) {
            try {
                SharedPreferences sharedPreferencesRz = rz(context);
                if (sharedPreferencesRz != null) {
                    int i = sharedPreferencesRz.getInt("IABTCF_gdprApplies", Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        return i;
                    }
                    return (sharedPreferencesRz.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE) == Integer.MIN_VALUE && sharedPreferencesRz.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE) == Integer.MIN_VALUE) ? -2 : -1;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "b9oekQiPbNOUQ9lanw==", "XOs5sieMW+aQWttUiQI=", 483);
            }
        }
        return -2;
    }

    public void kgy(JSONObject jSONObject, ct.kgy kgyVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        fi fiVar = this.twf;
        String str = gf;
        String strKgy = fiVar.kgy("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strKgy) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strKgy)) {
            kus.ahm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.nu.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(nu.this.twf.kgy("dyn_draw_engine_url", nu.gf), strOptString)) {
                        com.bytedance.sdk.component.adexpress.kgy.ahm.ct.ahm().rz();
                    }
                }
            }, 5000L);
        }
        kgyVar.kgy("dyn_draw_engine_url", strOptString);
    }

    public int kgy(String str) {
        if (str == null) {
            return 0;
        }
        return xh.uq().ft(str).fpp;
    }

    public int kgy(int i) {
        return ft(String.valueOf(i)).bmz;
    }

    public void kgy(long j) {
        this.twf.ahm().kgy("last_req_time", j).kgy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.gf.kgy
    public void kgy(boolean z) {
        Set<String> setSa;
        this.kus.set(false);
        yjf();
        if (z) {
            HashMap map = new HashMap();
            Set<String> setAx = ax();
            if (setAx != null && !setAx.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setAx);
            }
            String strUm = ftg.um();
            if (!TextUtils.isEmpty(strUm)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strUm);
            }
            if (com.bytedance.sdk.openadsdk.utils.ahm.ahm() && (setSa = ahm().sa()) != null && !setSa.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, setSa);
            } else {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, xxq());
            com.bytedance.sdk.openadsdk.core.nu.rz.kgy(map);
        }
    }

    public static void kgy(ra.kgy kgyVar) {
        ConcurrentLinkedQueue<ra.kgy> concurrentLinkedQueue = fpp;
        if (concurrentLinkedQueue.contains(kgyVar)) {
            return;
        }
        concurrentLinkedQueue.add(kgyVar);
    }
}
