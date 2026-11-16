package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import com.safedk.android.utils.d;
import com.safedk.android.utils.h;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class BrandSafetyEvent extends StatsEvent {
    public static final String a = "click_url";
    public static final String aI = "revenue_event";
    public static final String aP = "webview_resource_urls";
    public static final String aQ = "webview_resource_urls_expanded";
    public static final String aR = "ci_matching_method";
    public static final String aS = "vast_versions";
    private static final String a_ = "BrandSafetyEvent";
    public static final String ac = "max_network_name";
    public static final String ad = "network_name";
    public static final String ae = "dsp_name";
    public static final String af = "custom_js_network_name";
    public static final String ag = "is_first_session";
    public static final String ah = "event_id";
    public static final String ao = "max_creative_id";
    public static final String ap = "creative_id";
    public static final String aq = "did_fail_display_received";
    public static final String ar = "will_display_received";
    public static final String as = "is_banner_view_detected";
    public static final String at = "image_slot";
    public static final String au = "interval_between_display_messages";
    public static final String av = "detected_view_proportions";
    public static final String aw = "device_orientation";
    public static final String ay = "multi_ad_uuid";
    public static final String b = "foreground_activity";
    private static final String bf = "REWARD";
    public static final String c = "impression_id";
    public static final String d = "viewing_time";
    public static final String g = "app_package_name";
    public static final String h = "dsp_domains";
    public static final String i = "ad_format";
    public static final String j = "ad_format_type";
    public static final String k = "third_party_ad_placement_id";
    public static final String m = "sdk_version";
    public static final String n = "impression";
    public static final String o = "image_file_size";
    public static final String p = "image_uniformity";
    public static final String q = "image_id";
    public static final String r = "image_orientation";
    public static final String s = "is_animated";
    private static final long serialVersionUID = 2;
    public static final String t = "is_clicked";
    public static final String u = "ad_recommendations";
    public static final String v = "is_next_session";
    private int L;
    private String M;
    private String N;
    private transient Bundle O;
    private String P;
    private String Q;
    private long R;
    private String S;
    private String T;
    private String U;
    private boolean V;
    private String W;
    private boolean X;
    private long Y;
    private float Z;
    private String aA;
    private String aB;
    private String aC;
    private String aD;
    private String aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    String aU;
    HashSet<String> aV;
    Boolean aW;
    HashSet<String> aX;
    HashSet<String> aY;
    HashSet<String> aZ;
    private BrandSafetyUtils.ScreenShotOrientation aa;
    private boolean ai;
    private boolean aj;
    private int ak;
    private long al;
    private float am;
    private String an;
    HashSet<String> ba;
    Boolean bb;
    HashSet<String> bc;
    List<String> bd;
    List<String> be;
    private String bh;
    private String bi;
    private String bj;
    private String bk;
    private boolean bl;
    private RedirectData bm;
    private int bn;
    public static final String e = "slot_number";
    public static final String f = "zone_id";
    public static final String l = "max_ad_unit_id";
    private static final Set<String> ab = new HashSet(Arrays.asList("impression_id", StatsEvent.z, "sdk_uuid", e, "ad_format_type", f, l));
    public static final String aJ = "is_cross_origin_iframe_in_webview";
    public static final String aK = "webpage_resource_url_list";
    public static final String aL = "network_resource_url_list";
    public static final String aM = "expanded_webpage_resource_url_list";
    public static final String aN = "expanded_network_resource_url_list";
    public static final String aT = "is_hidden_iframe_in_webview";
    public static final String aO = "webpage_hidden_resource_urls";
    private static final Set<String> bg = new HashSet(Arrays.asList(aJ, aK, aL, aM, aN, aT, aO));

    public enum AdFormatType {
        INTER,
        REWARD,
        BANNER,
        LEADER,
        MREC,
        APPOPEN,
        NATIVE
    }

    public BrandSafetyEvent() {
        this.P = null;
        this.Q = null;
        this.V = false;
        this.W = null;
        this.X = false;
        this.aE = null;
        this.aU = null;
        this.aF = false;
        this.bk = null;
        this.aW = null;
        this.bb = null;
        this.aG = false;
        this.bl = false;
        this.ai = false;
        this.aj = false;
        this.ak = 0;
        this.al = 0L;
        this.am = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.an = null;
        this.aH = false;
        this.bm = null;
        this.bn = 0;
        this.bd = Arrays.asList(BrandSafetyUtils.j, bf, BrandSafetyUtils.l);
        this.be = null;
        this.E = StatsCollector.EventType.BrandSafety;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0354 A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x035e A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0367 A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0371 A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x037e A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0388 A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0279 A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x02da A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02e1 A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x032e A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0338 A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0341 A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x034b A[Catch: all -> 0x03b6, TryCatch #4 {all -> 0x03b6, blocks: (B:67:0x0250, B:69:0x0254, B:71:0x0260, B:74:0x0273, B:76:0x0279, B:77:0x028c, B:79:0x02ca, B:81:0x02d0, B:83:0x02d4, B:85:0x02da, B:86:0x02e1, B:87:0x02ff, B:90:0x0314, B:91:0x0328, B:93:0x032e, B:95:0x033d, B:97:0x0341, B:99:0x0350, B:101:0x0354, B:103:0x0363, B:105:0x0367, B:107:0x0376, B:109:0x037e, B:111:0x038d, B:112:0x038f, B:110:0x0388, B:106:0x0371, B:102:0x035e, B:98:0x034b, B:94:0x0338, B:130:0x03b4), top: B:141:0x0061 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x02e1, please report this as an issue */
    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, long viewingTime, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean isAnimated, long imageFileSize, float imageUniformity, int imageSlot, boolean isScarAdMobAd, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, RedirectData redirectData, int redirectCount, HashSet<String> dspUrlList, Boolean isCrossOriginIframeInWebpage, SimpleConcurrentHashSet<String> webPageResourceUrlList, SimpleConcurrentHashSet<String> networkResourceUrlList, SimpleConcurrentHashSet<String> expandedWebPageResourceUrlList, SimpleConcurrentHashSet<String> expandedNetworkResourceUrlList, Boolean isHiddenIframeInWebpage, SimpleConcurrentHashSet<String> hiddenWebPageResourceUrlList) throws Throwable {
        Throwable th;
        String clickUrl2;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        HashSet<String> hashSet3;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        super(sdk, StatsCollector.EventType.BrandSafety);
        this.P = null;
        this.Q = null;
        this.V = false;
        this.W = null;
        this.X = false;
        this.aE = null;
        this.aU = null;
        this.aF = false;
        this.bk = null;
        this.aW = null;
        this.bb = null;
        this.aG = false;
        this.bl = false;
        this.ai = false;
        this.aj = false;
        this.ak = 0;
        this.al = 0L;
        this.am = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.an = null;
        this.aH = false;
        this.bm = null;
        this.bn = 0;
        this.bd = Arrays.asList(BrandSafetyUtils.j, bf, BrandSafetyUtils.l);
        this.be = null;
        synchronized (this) {
            try {
                try {
                    this.L = slotNumber;
                    if (timestamp > 0) {
                        try {
                            this.G = n.b(timestamp);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            throw th;
                        }
                    }
                    try {
                        Logger.d(a_, "BrandSafetyEvent ctor creative info: ", creativeInfo, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                        this.aV = new HashSet<>();
                        if (creativeInfo != null) {
                            Iterator<String> it = creativeInfo.am().iterator();
                            while (it.hasNext()) {
                                networkResourceUrlList.remove(it.next());
                            }
                            Iterator<String> it2 = creativeInfo.e().iterator();
                            while (it2.hasNext()) {
                                networkResourceUrlList.remove(it2.next());
                            }
                            if (dspUrlList != null) {
                                creativeInfo.a(new ArrayList<>(dspUrlList));
                            }
                            Logger.d(a_, "webview_resource_urls setting dsp urls list = ", dspUrlList);
                            if (creativeInfo.Q().equals(sdk)) {
                                Logger.d(a_, "creative info sdk is equal to event SDK");
                                this.N = creativeInfo.G();
                                this.O = creativeInfo.b();
                                Logger.d(a_, "addedCreativeInfoValues ", this.O);
                                if (clickUrl == null) {
                                    Logger.d(a_, "self click url is null, setting creative info click url");
                                    clickUrl2 = creativeInfo.M();
                                } else {
                                    clickUrl2 = clickUrl;
                                }
                                try {
                                    Logger.d(a_, "webview_resource_urls removing resource urls list and dsp urls list.");
                                    this.D = creativeInfo.t();
                                    Logger.d(a_, "BrandSeftyEvent ctor , sdk : ", sdk, ", sdk_version set : ", this.D);
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            } else {
                                Logger.d(a_, "creative info sdk != sdk. creative info sdk: ", creativeInfo.Q(), ", actual sdk: ", creativeInfo.R(), ", sdk: ", sdk);
                                clickUrl2 = clickUrl;
                            }
                            List<String> listAr = creativeInfo.ar();
                            if (listAr != null && !listAr.isEmpty()) {
                                this.be = listAr;
                            }
                        } else {
                            boolean zA = CreativeInfoManager.a(sdk, AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
                            Logger.d(a_, "the don't report webview resource is: ", Boolean.valueOf(zA));
                            if (!zA && dspUrlList != null) {
                                this.aV.addAll(dspUrlList);
                            }
                            Logger.d(a_, "webview_resource_urls setting dsp urls list = ", dspUrlList);
                            clickUrl2 = clickUrl;
                        }
                        try {
                            this.M = clickUrl2;
                            this.V = clicked;
                            this.P = foregroundActivityName;
                            try {
                                this.Q = impressionMd5;
                                try {
                                    this.bh = multiAdUuid;
                                    try {
                                        this.R = viewingTime;
                                        this.aB = maxCreativeId;
                                        if (applovinData != null) {
                                            try {
                                                this.S = applovinData.getString(l);
                                                this.aA = applovinData.getString(ad);
                                                this.T = b(applovinData.getString("ad_format"));
                                                this.U = applovinData.getString(k);
                                                this.aC = applovinData.getString("dsp_name");
                                                this.aD = applovinData.getString(af);
                                                if (maxCreativeId == null) {
                                                    this.aB = applovinData.getString("creative_id");
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                th = th;
                                                throw th;
                                            }
                                        }
                                        this.I = isMature;
                                        if (creativeInfo != null) {
                                            this.W = hashValue;
                                            this.aa = screenShotOrientation;
                                            this.X = isAnimated;
                                            if (hashValue != null) {
                                                this.Y = imageFileSize;
                                                this.Z = imageUniformity;
                                                this.ak = imageSlot;
                                            }
                                            this.az = isFirstSession;
                                            if (eventId != null) {
                                                Logger.d(a_, "eventId = ", eventId);
                                                this.aE = eventId;
                                            }
                                            this.aF = didFailDisplayReceived;
                                            this.bi = debugInfo;
                                            this.bj = impressionLog;
                                            Logger.d(a_, "impression log value = ", revenueEventValue);
                                            this.bm = redirectData;
                                            this.bn = redirectCount;
                                            this.aU = revenueEventValue;
                                            this.aH = isScarAdMobAd;
                                            Logger.d(a_, "revenue event value = ", revenueEventValue);
                                            if (creativeInfo != null && creativeInfo.X() != null && this.bk == null) {
                                                if (creativeInfo.Y() == null) {
                                                    this.bk = creativeInfo.X();
                                                } else {
                                                    this.bk = creativeInfo.X() + "_" + creativeInfo.Y();
                                                }
                                            }
                                            Logger.d(a_, "matching method value = ", revenueEventValue);
                                            if (creativeInfo != null && isMature) {
                                                Logger.d(a_, "setting matching method for mature ci to null. ci = ", creativeInfo);
                                                creativeInfo.U();
                                            }
                                            this.aW = isCrossOriginIframeInWebpage;
                                            if (webPageResourceUrlList != null) {
                                                hashSet = new HashSet<>(webPageResourceUrlList.keySet());
                                            } else {
                                                hashSet = new HashSet<>();
                                            }
                                            this.aX = hashSet;
                                            if (networkResourceUrlList != null) {
                                                hashSet2 = new HashSet<>(networkResourceUrlList.keySet());
                                            } else {
                                                hashSet2 = new HashSet<>();
                                            }
                                            this.aY = hashSet2;
                                            if (expandedWebPageResourceUrlList != null) {
                                                hashSet3 = new HashSet<>(expandedWebPageResourceUrlList.keySet());
                                            } else {
                                                hashSet3 = new HashSet<>();
                                            }
                                            this.ba = hashSet3;
                                            if (expandedNetworkResourceUrlList != null) {
                                                hashSet4 = new HashSet<>(expandedNetworkResourceUrlList.keySet());
                                            } else {
                                                hashSet4 = new HashSet<>();
                                            }
                                            this.aZ = hashSet4;
                                            this.bb = isHiddenIframeInWebpage;
                                            if (hiddenWebPageResourceUrlList != null) {
                                                hashSet5 = new HashSet<>(hiddenWebPageResourceUrlList.keySet());
                                            } else {
                                                hashSet5 = new HashSet<>();
                                            }
                                            this.bc = hashSet5;
                                        }
                                        this.az = isFirstSession;
                                        if (eventId != null) {
                                            Logger.d(a_, "eventId = ", eventId);
                                            this.aE = eventId;
                                        }
                                        this.aF = didFailDisplayReceived;
                                        this.bi = debugInfo;
                                        this.bj = impressionLog;
                                        Logger.d(a_, "impression log value = ", revenueEventValue);
                                        this.bm = redirectData;
                                        this.bn = redirectCount;
                                        this.aU = revenueEventValue;
                                        this.aH = isScarAdMobAd;
                                        Logger.d(a_, "revenue event value = ", revenueEventValue);
                                        if (creativeInfo != null) {
                                            if (creativeInfo.Y() == null) {
                                                this.bk = creativeInfo.X();
                                            } else {
                                                this.bk = creativeInfo.X() + "_" + creativeInfo.Y();
                                            }
                                        }
                                        Logger.d(a_, "matching method value = ", revenueEventValue);
                                        if (creativeInfo != null) {
                                            Logger.d(a_, "setting matching method for mature ci to null. ci = ", creativeInfo);
                                            creativeInfo.U();
                                        }
                                        this.aW = isCrossOriginIframeInWebpage;
                                        if (webPageResourceUrlList != null) {
                                            hashSet = new HashSet<>(webPageResourceUrlList.keySet());
                                        } else {
                                            hashSet = new HashSet<>();
                                        }
                                        this.aX = hashSet;
                                        if (networkResourceUrlList != null) {
                                            hashSet2 = new HashSet<>(networkResourceUrlList.keySet());
                                        } else {
                                            hashSet2 = new HashSet<>();
                                        }
                                        this.aY = hashSet2;
                                        if (expandedWebPageResourceUrlList != null) {
                                            hashSet3 = new HashSet<>(expandedWebPageResourceUrlList.keySet());
                                        } else {
                                            hashSet3 = new HashSet<>();
                                        }
                                        this.ba = hashSet3;
                                        if (expandedNetworkResourceUrlList != null) {
                                            hashSet4 = new HashSet<>(expandedNetworkResourceUrlList.keySet());
                                        } else {
                                            hashSet4 = new HashSet<>();
                                        }
                                        this.aZ = hashSet4;
                                        this.bb = isHiddenIframeInWebpage;
                                        if (hiddenWebPageResourceUrlList != null) {
                                            hashSet5 = new HashSet<>(hiddenWebPageResourceUrlList.keySet());
                                        } else {
                                            hashSet5 = new HashSet<>();
                                        }
                                        this.bc = hashSet5;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = th;
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            } catch (Throwable th11) {
                th = th11;
            }
        }
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isBannerViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isScarAdMobAd, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, RedirectData redirectData, int redirectCount, HashSet<String> dspUrlList, Boolean isCrossOriginIframeInWebpage, SimpleConcurrentHashSet<String> webPageResourceUrlList, SimpleConcurrentHashSet<String> networkResourceUrlList, SimpleConcurrentHashSet<String> expandedWebPageResourceUrlList, SimpleConcurrentHashSet<String> expandedNetworkResourceUrlList, Boolean isHiddenIframeInWebpage, SimpleConcurrentHashSet<String> hiddenWebPageResourceUrlList) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, isScarAdMobAd, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, redirectData, redirectCount, dspUrlList, isCrossOriginIframeInWebpage, webPageResourceUrlList, networkResourceUrlList, expandedWebPageResourceUrlList, expandedNetworkResourceUrlList, isHiddenIframeInWebpage, hiddenWebPageResourceUrlList);
        this.aG = true;
        this.ai = willDisplayReceived;
        this.aj = isBannerViewDetected;
        this.al = intervalBetweenDisplayMessages;
        this.am = detectedViewProportions;
        this.an = deviceOrientation;
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isAdViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, false, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, null, 0, null, false, null, null, null, null, false, null);
        this.bl = true;
        this.ai = willDisplayReceived;
        this.aj = isAdViewDetected;
        this.al = intervalBetweenDisplayMessages;
        this.am = detectedViewProportions;
        this.an = deviceOrientation;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType a() {
        return StatsCollector.EventType.BrandSafety;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String b() {
        return this.Q;
    }

    public void c() {
        this.W = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0244 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0248 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0257 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x025b A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x026e A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0272 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0279 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0281 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x028c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0298 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x029c A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02a3 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02ab A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c0 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02cc A[Catch: all -> 0x02d2, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0222 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0231 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0235 A[Catch: all -> 0x02d2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0117, B:47:0x0120, B:51:0x0134, B:53:0x0144, B:55:0x0148, B:56:0x015b, B:58:0x015f, B:60:0x0169, B:62:0x016d, B:63:0x01b5, B:65:0x01b9, B:67:0x01bd, B:68:0x01d0, B:70:0x01d4, B:71:0x01e7, B:73:0x020f, B:74:0x0211, B:80:0x021d, B:81:0x021e, B:83:0x0222, B:84:0x0224, B:90:0x0230, B:91:0x0231, B:93:0x0235, B:94:0x0237, B:100:0x0243, B:101:0x0244, B:103:0x0248, B:104:0x024a, B:110:0x0256, B:111:0x0257, B:113:0x025b, B:114:0x025d, B:120:0x0269, B:121:0x026a, B:123:0x026e, B:125:0x0272, B:133:0x028e, B:126:0x0279, B:128:0x0281, B:134:0x0294, B:136:0x0298, B:138:0x029c, B:146:0x02b6, B:139:0x02a3, B:141:0x02ab, B:147:0x02bc, B:149:0x02c0, B:150:0x02c4, B:152:0x02cc, B:48:0x0123, B:50:0x0127, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:95:0x0238, B:96:0x023f, B:105:0x024b, B:106:0x0252, B:115:0x025e, B:116:0x0265, B:75:0x0212, B:76:0x0219, B:85:0x0225, B:86:0x022c), top: B:160:0x0001, inners: #0, #2, #3, #4, #5 }] */
    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized void a(StatsEvent statsEvent) {
        boolean zBooleanValue;
        BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) statsEvent;
        boolean zBooleanValue2 = false;
        Logger.d(a_, "doAggregation removing dsp urls list. local dspUrlList = ", this.aV, ", isOnUiThread = ", Boolean.valueOf(n.c()));
        this.aV = new HashSet<>();
        Bundle bundle = brandSafetyEvent.O;
        if (bundle != null) {
            Logger.d(a_, "Aggregating downstream struct. eventCreativeValues=", bundle);
            this.O = bundle;
            this.N = brandSafetyEvent.N;
        } else {
            Logger.d(a_, "doAggregation setting dsp urls list");
            if (brandSafetyEvent.aV != null) {
                this.aV.addAll(brandSafetyEvent.aV);
            }
        }
        String str = brandSafetyEvent.M;
        if (!TextUtils.isEmpty(str)) {
            this.M = str;
        }
        long jL = statsEvent.l();
        if (jL != 0 && jL < this.G) {
            this.G = jL;
        }
        long j2 = brandSafetyEvent.R;
        if (j2 > 0 && j2 > this.R) {
            this.R = j2;
        }
        if (brandSafetyEvent.W != null) {
            Logger.d(a_, "doAggregation updating screenShotHashValue to '", brandSafetyEvent.W, "' , image_file_size to ", Long.valueOf(brandSafetyEvent.Y), " and image_max_uniform_pixels to ", Float.valueOf(brandSafetyEvent.Z));
            this.W = brandSafetyEvent.W;
            this.Y = brandSafetyEvent.Y;
            this.Z = brandSafetyEvent.Z;
            this.ak = brandSafetyEvent.ak;
            BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = brandSafetyEvent.aa;
            if (screenShotOrientation != null && screenShotOrientation != BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) {
                Logger.d(a_, "doAggregation updating screenShotOrientation to '", screenShotOrientation, "'");
                this.aa = screenShotOrientation;
            }
        } else {
            Logger.d(a_, "doAggregation updating image hash to null");
            this.W = null;
            this.Y = 0L;
            this.ak = 0;
            this.aa = null;
            this.Z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        boolean z = brandSafetyEvent.V;
        if (z) {
            this.V = z && (brandSafetyEvent.bh == null || (this.T != null && this.bd.contains(this.T) && CreativeInfoManager.a(this.C, AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false)));
        } else if (brandSafetyEvent.bh != null) {
            this.V = false;
            Logger.d(a_, "doAggregation reset clicked due to multi ad");
        }
        this.X = brandSafetyEvent.X;
        this.aB = brandSafetyEvent.aB;
        this.bh = brandSafetyEvent.bh;
        if (this.aE == null && brandSafetyEvent.aE != null) {
            this.aE = brandSafetyEvent.aE;
            Logger.d(a_, "doAggregation updating eventId to ", this.aE);
        }
        if (this.C != null && !this.C.equals(brandSafetyEvent.C) && this.O != null) {
            Logger.d(a_, "doAggregation incompatible SDK. current: ", this.C, ", new: ", brandSafetyEvent.C);
            String string = this.O.getString(CreativeInfo.g, "");
            this.O.putString(CreativeInfo.g, string + "|sdk=" + this.C + ";newSdk=" + brandSafetyEvent.C);
        }
        if (this.aU == null && brandSafetyEvent.aU != null) {
            this.aU = brandSafetyEvent.aU;
            Logger.d(a_, "doAggregation updating revenueEventValue to ", this.aU);
        }
        if (this.P == null) {
            this.P = brandSafetyEvent.P;
            Logger.d(a_, "doAggregation updating foregroundActivityName to ", this.P);
        }
        this.ai = brandSafetyEvent.ai;
        this.aj = brandSafetyEvent.aj;
        this.al = brandSafetyEvent.al;
        this.bm = brandSafetyEvent.bm;
        this.bn = brandSafetyEvent.bn;
        this.am = brandSafetyEvent.am;
        this.bi = brandSafetyEvent.bi;
        this.bj = brandSafetyEvent.bj;
        this.aF = brandSafetyEvent.aF;
        if (brandSafetyEvent.aX != null) {
            synchronized (this.aX) {
                this.aX.addAll(brandSafetyEvent.aX);
            }
            if (brandSafetyEvent.aY != null) {
                synchronized (this.aY) {
                    this.aY.addAll(brandSafetyEvent.aY);
                }
                if (brandSafetyEvent.ba != null) {
                    synchronized (this.ba) {
                        this.ba.addAll(brandSafetyEvent.ba);
                    }
                    if (brandSafetyEvent.aZ != null) {
                        synchronized (this.aZ) {
                            this.aZ.addAll(brandSafetyEvent.aZ);
                        }
                        if (brandSafetyEvent.bc != null) {
                            synchronized (this.bc) {
                                this.bc.addAll(brandSafetyEvent.bc);
                            }
                        }
                        if (brandSafetyEvent.aW != null) {
                            if (this.aW == null) {
                                zBooleanValue = brandSafetyEvent.aW.booleanValue();
                            } else if (!this.aW.booleanValue() || brandSafetyEvent.aW.booleanValue()) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            this.aW = Boolean.valueOf(zBooleanValue);
                        }
                        if (brandSafetyEvent.bb != null) {
                            if (this.bb == null) {
                                zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                            } else if (this.bb.booleanValue() || brandSafetyEvent.bb.booleanValue()) {
                                zBooleanValue2 = true;
                            }
                            this.bb = Boolean.valueOf(zBooleanValue2);
                        }
                        if (brandSafetyEvent.bk != null) {
                            this.bk = brandSafetyEvent.bk;
                        }
                        this.aH = brandSafetyEvent.aH;
                        if (brandSafetyEvent.be != null) {
                            this.be = brandSafetyEvent.be;
                        }
                    } else {
                        if (brandSafetyEvent.bc != null) {
                            synchronized (this.bc) {
                                this.bc.addAll(brandSafetyEvent.bc);
                            }
                        }
                        if (brandSafetyEvent.aW != null) {
                            if (this.aW == null) {
                                zBooleanValue = brandSafetyEvent.aW.booleanValue();
                            } else if (!this.aW.booleanValue()) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = true;
                            }
                            this.aW = Boolean.valueOf(zBooleanValue);
                        }
                        if (brandSafetyEvent.bb != null) {
                            if (this.bb == null) {
                                zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                            } else if (this.bb.booleanValue()) {
                                zBooleanValue2 = true;
                            } else {
                                zBooleanValue2 = true;
                            }
                            this.bb = Boolean.valueOf(zBooleanValue2);
                        }
                        if (brandSafetyEvent.bk != null) {
                            this.bk = brandSafetyEvent.bk;
                        }
                        this.aH = brandSafetyEvent.aH;
                        if (brandSafetyEvent.be != null) {
                            this.be = brandSafetyEvent.be;
                        }
                    }
                } else if (brandSafetyEvent.aZ != null) {
                    synchronized (this.aZ) {
                        this.aZ.addAll(brandSafetyEvent.aZ);
                        if (brandSafetyEvent.bc != null) {
                            synchronized (this.bc) {
                                this.bc.addAll(brandSafetyEvent.bc);
                            }
                        }
                        if (brandSafetyEvent.aW != null) {
                            if (this.aW == null) {
                                zBooleanValue = brandSafetyEvent.aW.booleanValue();
                            } else if (!this.aW.booleanValue()) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = true;
                            }
                            this.aW = Boolean.valueOf(zBooleanValue);
                        }
                        if (brandSafetyEvent.bb != null) {
                            if (this.bb == null) {
                                zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                            } else if (this.bb.booleanValue()) {
                                zBooleanValue2 = true;
                            } else {
                                zBooleanValue2 = true;
                            }
                            this.bb = Boolean.valueOf(zBooleanValue2);
                        }
                        if (brandSafetyEvent.bk != null) {
                            this.bk = brandSafetyEvent.bk;
                        }
                        this.aH = brandSafetyEvent.aH;
                        if (brandSafetyEvent.be != null) {
                            this.be = brandSafetyEvent.be;
                        }
                    }
                } else {
                    if (brandSafetyEvent.bc != null) {
                        synchronized (this.bc) {
                            this.bc.addAll(brandSafetyEvent.bc);
                        }
                    }
                    if (brandSafetyEvent.aW != null) {
                        if (this.aW == null) {
                            zBooleanValue = brandSafetyEvent.aW.booleanValue();
                        } else if (!this.aW.booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = true;
                        }
                        this.aW = Boolean.valueOf(zBooleanValue);
                    }
                    if (brandSafetyEvent.bb != null) {
                        if (this.bb == null) {
                            zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                        } else if (this.bb.booleanValue()) {
                            zBooleanValue2 = true;
                        } else {
                            zBooleanValue2 = true;
                        }
                        this.bb = Boolean.valueOf(zBooleanValue2);
                    }
                    if (brandSafetyEvent.bk != null) {
                        this.bk = brandSafetyEvent.bk;
                    }
                    this.aH = brandSafetyEvent.aH;
                    if (brandSafetyEvent.be != null) {
                        this.be = brandSafetyEvent.be;
                    }
                }
            } else if (brandSafetyEvent.ba != null) {
                synchronized (this.ba) {
                    this.ba.addAll(brandSafetyEvent.ba);
                    if (brandSafetyEvent.aZ != null) {
                        synchronized (this.aZ) {
                            this.aZ.addAll(brandSafetyEvent.aZ);
                            if (brandSafetyEvent.bc != null) {
                                synchronized (this.bc) {
                                    this.bc.addAll(brandSafetyEvent.bc);
                                }
                            }
                            if (brandSafetyEvent.aW != null) {
                                if (this.aW == null) {
                                    zBooleanValue = brandSafetyEvent.aW.booleanValue();
                                } else if (!this.aW.booleanValue()) {
                                    zBooleanValue = true;
                                } else {
                                    zBooleanValue = true;
                                }
                                this.aW = Boolean.valueOf(zBooleanValue);
                            }
                            if (brandSafetyEvent.bb != null) {
                                if (this.bb == null) {
                                    zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                                } else if (this.bb.booleanValue()) {
                                    zBooleanValue2 = true;
                                } else {
                                    zBooleanValue2 = true;
                                }
                                this.bb = Boolean.valueOf(zBooleanValue2);
                            }
                            if (brandSafetyEvent.bk != null) {
                                this.bk = brandSafetyEvent.bk;
                            }
                            this.aH = brandSafetyEvent.aH;
                            if (brandSafetyEvent.be != null) {
                                this.be = brandSafetyEvent.be;
                            }
                        }
                    } else {
                        if (brandSafetyEvent.bc != null) {
                            synchronized (this.bc) {
                                this.bc.addAll(brandSafetyEvent.bc);
                            }
                        }
                        if (brandSafetyEvent.aW != null) {
                            if (this.aW == null) {
                                zBooleanValue = brandSafetyEvent.aW.booleanValue();
                            } else if (!this.aW.booleanValue()) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = true;
                            }
                            this.aW = Boolean.valueOf(zBooleanValue);
                        }
                        if (brandSafetyEvent.bb != null) {
                            if (this.bb == null) {
                                zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                            } else if (this.bb.booleanValue()) {
                                zBooleanValue2 = true;
                            } else {
                                zBooleanValue2 = true;
                            }
                            this.bb = Boolean.valueOf(zBooleanValue2);
                        }
                        if (brandSafetyEvent.bk != null) {
                            this.bk = brandSafetyEvent.bk;
                        }
                        this.aH = brandSafetyEvent.aH;
                        if (brandSafetyEvent.be != null) {
                            this.be = brandSafetyEvent.be;
                        }
                    }
                }
            } else if (brandSafetyEvent.aZ != null) {
                synchronized (this.aZ) {
                    this.aZ.addAll(brandSafetyEvent.aZ);
                    if (brandSafetyEvent.bc != null) {
                        synchronized (this.bc) {
                            this.bc.addAll(brandSafetyEvent.bc);
                        }
                    }
                    if (brandSafetyEvent.aW != null) {
                        if (this.aW == null) {
                            zBooleanValue = brandSafetyEvent.aW.booleanValue();
                        } else if (!this.aW.booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = true;
                        }
                        this.aW = Boolean.valueOf(zBooleanValue);
                    }
                    if (brandSafetyEvent.bb != null) {
                        if (this.bb == null) {
                            zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                        } else if (this.bb.booleanValue()) {
                            zBooleanValue2 = true;
                        } else {
                            zBooleanValue2 = true;
                        }
                        this.bb = Boolean.valueOf(zBooleanValue2);
                    }
                    if (brandSafetyEvent.bk != null) {
                        this.bk = brandSafetyEvent.bk;
                    }
                    this.aH = brandSafetyEvent.aH;
                    if (brandSafetyEvent.be != null) {
                        this.be = brandSafetyEvent.be;
                    }
                }
            } else {
                if (brandSafetyEvent.bc != null) {
                    synchronized (this.bc) {
                        this.bc.addAll(brandSafetyEvent.bc);
                    }
                }
                if (brandSafetyEvent.aW != null) {
                    if (this.aW == null) {
                        zBooleanValue = brandSafetyEvent.aW.booleanValue();
                    } else if (!this.aW.booleanValue()) {
                        zBooleanValue = true;
                    } else {
                        zBooleanValue = true;
                    }
                    this.aW = Boolean.valueOf(zBooleanValue);
                }
                if (brandSafetyEvent.bb != null) {
                    if (this.bb == null) {
                        zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                    } else if (this.bb.booleanValue()) {
                        zBooleanValue2 = true;
                    } else {
                        zBooleanValue2 = true;
                    }
                    this.bb = Boolean.valueOf(zBooleanValue2);
                }
                if (brandSafetyEvent.bk != null) {
                    this.bk = brandSafetyEvent.bk;
                }
                this.aH = brandSafetyEvent.aH;
                if (brandSafetyEvent.be != null) {
                    this.be = brandSafetyEvent.be;
                }
            }
        } else if (brandSafetyEvent.aY != null) {
            synchronized (this.aY) {
                this.aY.addAll(brandSafetyEvent.aY);
                if (brandSafetyEvent.ba != null) {
                    synchronized (this.ba) {
                        this.ba.addAll(brandSafetyEvent.ba);
                        if (brandSafetyEvent.aZ != null) {
                            synchronized (this.aZ) {
                                this.aZ.addAll(brandSafetyEvent.aZ);
                                if (brandSafetyEvent.bc != null) {
                                    synchronized (this.bc) {
                                        this.bc.addAll(brandSafetyEvent.bc);
                                    }
                                }
                                if (brandSafetyEvent.aW != null) {
                                    if (this.aW == null) {
                                        zBooleanValue = brandSafetyEvent.aW.booleanValue();
                                    } else if (!this.aW.booleanValue()) {
                                        zBooleanValue = true;
                                    } else {
                                        zBooleanValue = true;
                                    }
                                    this.aW = Boolean.valueOf(zBooleanValue);
                                }
                                if (brandSafetyEvent.bb != null) {
                                    if (this.bb == null) {
                                        zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                                    } else if (this.bb.booleanValue()) {
                                        zBooleanValue2 = true;
                                    } else {
                                        zBooleanValue2 = true;
                                    }
                                    this.bb = Boolean.valueOf(zBooleanValue2);
                                }
                                if (brandSafetyEvent.bk != null) {
                                    this.bk = brandSafetyEvent.bk;
                                }
                                this.aH = brandSafetyEvent.aH;
                                if (brandSafetyEvent.be != null) {
                                    this.be = brandSafetyEvent.be;
                                }
                            }
                        } else {
                            if (brandSafetyEvent.bc != null) {
                                synchronized (this.bc) {
                                    this.bc.addAll(brandSafetyEvent.bc);
                                }
                            }
                            if (brandSafetyEvent.aW != null) {
                                if (this.aW == null) {
                                    zBooleanValue = brandSafetyEvent.aW.booleanValue();
                                } else if (!this.aW.booleanValue()) {
                                    zBooleanValue = true;
                                } else {
                                    zBooleanValue = true;
                                }
                                this.aW = Boolean.valueOf(zBooleanValue);
                            }
                            if (brandSafetyEvent.bb != null) {
                                if (this.bb == null) {
                                    zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                                } else if (this.bb.booleanValue()) {
                                    zBooleanValue2 = true;
                                } else {
                                    zBooleanValue2 = true;
                                }
                                this.bb = Boolean.valueOf(zBooleanValue2);
                            }
                            if (brandSafetyEvent.bk != null) {
                                this.bk = brandSafetyEvent.bk;
                            }
                            this.aH = brandSafetyEvent.aH;
                            if (brandSafetyEvent.be != null) {
                                this.be = brandSafetyEvent.be;
                            }
                        }
                    }
                } else if (brandSafetyEvent.aZ != null) {
                    synchronized (this.aZ) {
                        this.aZ.addAll(brandSafetyEvent.aZ);
                        if (brandSafetyEvent.bc != null) {
                            synchronized (this.bc) {
                                this.bc.addAll(brandSafetyEvent.bc);
                            }
                        }
                        if (brandSafetyEvent.aW != null) {
                            if (this.aW == null) {
                                zBooleanValue = brandSafetyEvent.aW.booleanValue();
                            } else if (!this.aW.booleanValue()) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = true;
                            }
                            this.aW = Boolean.valueOf(zBooleanValue);
                        }
                        if (brandSafetyEvent.bb != null) {
                            if (this.bb == null) {
                                zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                            } else if (this.bb.booleanValue()) {
                                zBooleanValue2 = true;
                            } else {
                                zBooleanValue2 = true;
                            }
                            this.bb = Boolean.valueOf(zBooleanValue2);
                        }
                        if (brandSafetyEvent.bk != null) {
                            this.bk = brandSafetyEvent.bk;
                        }
                        this.aH = brandSafetyEvent.aH;
                        if (brandSafetyEvent.be != null) {
                            this.be = brandSafetyEvent.be;
                        }
                    }
                } else {
                    if (brandSafetyEvent.bc != null) {
                        synchronized (this.bc) {
                            this.bc.addAll(brandSafetyEvent.bc);
                        }
                    }
                    if (brandSafetyEvent.aW != null) {
                        if (this.aW == null) {
                            zBooleanValue = brandSafetyEvent.aW.booleanValue();
                        } else if (!this.aW.booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = true;
                        }
                        this.aW = Boolean.valueOf(zBooleanValue);
                    }
                    if (brandSafetyEvent.bb != null) {
                        if (this.bb == null) {
                            zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                        } else if (this.bb.booleanValue()) {
                            zBooleanValue2 = true;
                        } else {
                            zBooleanValue2 = true;
                        }
                        this.bb = Boolean.valueOf(zBooleanValue2);
                    }
                    if (brandSafetyEvent.bk != null) {
                        this.bk = brandSafetyEvent.bk;
                    }
                    this.aH = brandSafetyEvent.aH;
                    if (brandSafetyEvent.be != null) {
                        this.be = brandSafetyEvent.be;
                    }
                }
            }
        } else if (brandSafetyEvent.ba != null) {
            synchronized (this.ba) {
                this.ba.addAll(brandSafetyEvent.ba);
                if (brandSafetyEvent.aZ != null) {
                    synchronized (this.aZ) {
                        this.aZ.addAll(brandSafetyEvent.aZ);
                        if (brandSafetyEvent.bc != null) {
                            synchronized (this.bc) {
                                this.bc.addAll(brandSafetyEvent.bc);
                            }
                        }
                        if (brandSafetyEvent.aW != null) {
                            if (this.aW == null) {
                                zBooleanValue = brandSafetyEvent.aW.booleanValue();
                            } else if (!this.aW.booleanValue()) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = true;
                            }
                            this.aW = Boolean.valueOf(zBooleanValue);
                        }
                        if (brandSafetyEvent.bb != null) {
                            if (this.bb == null) {
                                zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                            } else if (this.bb.booleanValue()) {
                                zBooleanValue2 = true;
                            } else {
                                zBooleanValue2 = true;
                            }
                            this.bb = Boolean.valueOf(zBooleanValue2);
                        }
                        if (brandSafetyEvent.bk != null) {
                            this.bk = brandSafetyEvent.bk;
                        }
                        this.aH = brandSafetyEvent.aH;
                        if (brandSafetyEvent.be != null) {
                            this.be = brandSafetyEvent.be;
                        }
                    }
                } else {
                    if (brandSafetyEvent.bc != null) {
                        synchronized (this.bc) {
                            this.bc.addAll(brandSafetyEvent.bc);
                        }
                    }
                    if (brandSafetyEvent.aW != null) {
                        if (this.aW == null) {
                            zBooleanValue = brandSafetyEvent.aW.booleanValue();
                        } else if (!this.aW.booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = true;
                        }
                        this.aW = Boolean.valueOf(zBooleanValue);
                    }
                    if (brandSafetyEvent.bb != null) {
                        if (this.bb == null) {
                            zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                        } else if (this.bb.booleanValue()) {
                            zBooleanValue2 = true;
                        } else {
                            zBooleanValue2 = true;
                        }
                        this.bb = Boolean.valueOf(zBooleanValue2);
                    }
                    if (brandSafetyEvent.bk != null) {
                        this.bk = brandSafetyEvent.bk;
                    }
                    this.aH = brandSafetyEvent.aH;
                    if (brandSafetyEvent.be != null) {
                        this.be = brandSafetyEvent.be;
                    }
                }
            }
        } else if (brandSafetyEvent.aZ != null) {
            synchronized (this.aZ) {
                this.aZ.addAll(brandSafetyEvent.aZ);
                if (brandSafetyEvent.bc != null) {
                    synchronized (this.bc) {
                        this.bc.addAll(brandSafetyEvent.bc);
                    }
                }
                if (brandSafetyEvent.aW != null) {
                    if (this.aW == null) {
                        zBooleanValue = brandSafetyEvent.aW.booleanValue();
                    } else if (!this.aW.booleanValue()) {
                        zBooleanValue = true;
                    } else {
                        zBooleanValue = true;
                    }
                    this.aW = Boolean.valueOf(zBooleanValue);
                }
                if (brandSafetyEvent.bb != null) {
                    if (this.bb == null) {
                        zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                    } else if (this.bb.booleanValue()) {
                        zBooleanValue2 = true;
                    } else {
                        zBooleanValue2 = true;
                    }
                    this.bb = Boolean.valueOf(zBooleanValue2);
                }
                if (brandSafetyEvent.bk != null) {
                    this.bk = brandSafetyEvent.bk;
                }
                this.aH = brandSafetyEvent.aH;
                if (brandSafetyEvent.be != null) {
                    this.be = brandSafetyEvent.be;
                }
            }
        } else {
            if (brandSafetyEvent.bc != null) {
                synchronized (this.bc) {
                    this.bc.addAll(brandSafetyEvent.bc);
                }
            }
            if (brandSafetyEvent.aW != null) {
                if (this.aW == null) {
                    zBooleanValue = brandSafetyEvent.aW.booleanValue();
                } else if (!this.aW.booleanValue()) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = true;
                }
                this.aW = Boolean.valueOf(zBooleanValue);
            }
            if (brandSafetyEvent.bb != null) {
                if (this.bb == null) {
                    zBooleanValue2 = brandSafetyEvent.bb.booleanValue();
                } else if (this.bb.booleanValue()) {
                    zBooleanValue2 = true;
                } else {
                    zBooleanValue2 = true;
                }
                this.bb = Boolean.valueOf(zBooleanValue2);
            }
            if (brandSafetyEvent.bk != null) {
                this.bk = brandSafetyEvent.bk;
            }
            this.aH = brandSafetyEvent.aH;
            if (brandSafetyEvent.be != null) {
                this.be = brandSafetyEvent.be;
            }
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0383 A[Catch: all -> 0x03ef, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0010, B:8:0x0018, B:9:0x001f, B:11:0x0023, B:13:0x002b, B:22:0x0055, B:24:0x005d, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:30:0x0082, B:31:0x0089, B:33:0x0091, B:34:0x0098, B:36:0x00a0, B:37:0x00a7, B:39:0x00af, B:40:0x00b6, B:42:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d5, B:48:0x00dc, B:50:0x00e6, B:52:0x00ee, B:54:0x00f8, B:57:0x0109, B:59:0x0111, B:61:0x011b, B:65:0x0138, B:67:0x0140, B:69:0x0144, B:71:0x014a, B:72:0x0157, B:74:0x0166, B:76:0x0171, B:78:0x0175, B:79:0x017c, B:81:0x0180, B:82:0x018f, B:83:0x01a4, B:85:0x01ba, B:87:0x01c2, B:88:0x01de, B:89:0x01e5, B:91:0x01ed, B:92:0x01f4, B:94:0x0208, B:105:0x0245, B:107:0x0249, B:109:0x024d, B:111:0x0278, B:113:0x0280, B:114:0x029e, B:115:0x02a7, B:117:0x02b6, B:118:0x02bd, B:120:0x02cc, B:121:0x02d3, B:123:0x02d7, B:124:0x02e2, B:126:0x02e6, B:127:0x02f1, B:129:0x02f5, B:131:0x02fd, B:133:0x0301, B:135:0x0307, B:137:0x030d, B:138:0x030f, B:141:0x0318, B:142:0x031a, B:148:0x0324, B:151:0x0327, B:152:0x0328, B:153:0x0334, B:155:0x0338, B:157:0x0340, B:158:0x034c, B:160:0x0350, B:162:0x0358, B:164:0x035c, B:166:0x0362, B:168:0x0368, B:169:0x036a, B:172:0x0373, B:173:0x0375, B:179:0x037f, B:182:0x0382, B:183:0x0383, B:184:0x038f, B:186:0x0393, B:188:0x039b, B:189:0x03a7, B:191:0x03ab, B:193:0x03b3, B:194:0x03bf, B:196:0x03c7, B:197:0x03ce, B:199:0x03e1, B:96:0x020c, B:98:0x021e, B:100:0x0229, B:101:0x0230, B:103:0x0237, B:104:0x023e, B:63:0x0125, B:56:0x0102, B:64:0x012d, B:14:0x0031, B:16:0x0035, B:17:0x003d, B:19:0x0041, B:21:0x0049, B:170:0x036b, B:171:0x0372, B:143:0x031b, B:144:0x0320, B:139:0x0310, B:140:0x0317, B:174:0x0376, B:175:0x037b), top: B:213:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x03c7 A[Catch: all -> 0x03ef, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0010, B:8:0x0018, B:9:0x001f, B:11:0x0023, B:13:0x002b, B:22:0x0055, B:24:0x005d, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:30:0x0082, B:31:0x0089, B:33:0x0091, B:34:0x0098, B:36:0x00a0, B:37:0x00a7, B:39:0x00af, B:40:0x00b6, B:42:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d5, B:48:0x00dc, B:50:0x00e6, B:52:0x00ee, B:54:0x00f8, B:57:0x0109, B:59:0x0111, B:61:0x011b, B:65:0x0138, B:67:0x0140, B:69:0x0144, B:71:0x014a, B:72:0x0157, B:74:0x0166, B:76:0x0171, B:78:0x0175, B:79:0x017c, B:81:0x0180, B:82:0x018f, B:83:0x01a4, B:85:0x01ba, B:87:0x01c2, B:88:0x01de, B:89:0x01e5, B:91:0x01ed, B:92:0x01f4, B:94:0x0208, B:105:0x0245, B:107:0x0249, B:109:0x024d, B:111:0x0278, B:113:0x0280, B:114:0x029e, B:115:0x02a7, B:117:0x02b6, B:118:0x02bd, B:120:0x02cc, B:121:0x02d3, B:123:0x02d7, B:124:0x02e2, B:126:0x02e6, B:127:0x02f1, B:129:0x02f5, B:131:0x02fd, B:133:0x0301, B:135:0x0307, B:137:0x030d, B:138:0x030f, B:141:0x0318, B:142:0x031a, B:148:0x0324, B:151:0x0327, B:152:0x0328, B:153:0x0334, B:155:0x0338, B:157:0x0340, B:158:0x034c, B:160:0x0350, B:162:0x0358, B:164:0x035c, B:166:0x0362, B:168:0x0368, B:169:0x036a, B:172:0x0373, B:173:0x0375, B:179:0x037f, B:182:0x0382, B:183:0x0383, B:184:0x038f, B:186:0x0393, B:188:0x039b, B:189:0x03a7, B:191:0x03ab, B:193:0x03b3, B:194:0x03bf, B:196:0x03c7, B:197:0x03ce, B:199:0x03e1, B:96:0x020c, B:98:0x021e, B:100:0x0229, B:101:0x0230, B:103:0x0237, B:104:0x023e, B:63:0x0125, B:56:0x0102, B:64:0x012d, B:14:0x0031, B:16:0x0035, B:17:0x003d, B:19:0x0041, B:21:0x0049, B:170:0x036b, B:171:0x0372, B:143:0x031b, B:144:0x0320, B:139:0x0310, B:140:0x0317, B:174:0x0376, B:175:0x037b), top: B:213:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x03e1 A[Catch: all -> 0x03ef, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0010, B:8:0x0018, B:9:0x001f, B:11:0x0023, B:13:0x002b, B:22:0x0055, B:24:0x005d, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:30:0x0082, B:31:0x0089, B:33:0x0091, B:34:0x0098, B:36:0x00a0, B:37:0x00a7, B:39:0x00af, B:40:0x00b6, B:42:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d5, B:48:0x00dc, B:50:0x00e6, B:52:0x00ee, B:54:0x00f8, B:57:0x0109, B:59:0x0111, B:61:0x011b, B:65:0x0138, B:67:0x0140, B:69:0x0144, B:71:0x014a, B:72:0x0157, B:74:0x0166, B:76:0x0171, B:78:0x0175, B:79:0x017c, B:81:0x0180, B:82:0x018f, B:83:0x01a4, B:85:0x01ba, B:87:0x01c2, B:88:0x01de, B:89:0x01e5, B:91:0x01ed, B:92:0x01f4, B:94:0x0208, B:105:0x0245, B:107:0x0249, B:109:0x024d, B:111:0x0278, B:113:0x0280, B:114:0x029e, B:115:0x02a7, B:117:0x02b6, B:118:0x02bd, B:120:0x02cc, B:121:0x02d3, B:123:0x02d7, B:124:0x02e2, B:126:0x02e6, B:127:0x02f1, B:129:0x02f5, B:131:0x02fd, B:133:0x0301, B:135:0x0307, B:137:0x030d, B:138:0x030f, B:141:0x0318, B:142:0x031a, B:148:0x0324, B:151:0x0327, B:152:0x0328, B:153:0x0334, B:155:0x0338, B:157:0x0340, B:158:0x034c, B:160:0x0350, B:162:0x0358, B:164:0x035c, B:166:0x0362, B:168:0x0368, B:169:0x036a, B:172:0x0373, B:173:0x0375, B:179:0x037f, B:182:0x0382, B:183:0x0383, B:184:0x038f, B:186:0x0393, B:188:0x039b, B:189:0x03a7, B:191:0x03ab, B:193:0x03b3, B:194:0x03bf, B:196:0x03c7, B:197:0x03ce, B:199:0x03e1, B:96:0x020c, B:98:0x021e, B:100:0x0229, B:101:0x0230, B:103:0x0237, B:104:0x023e, B:63:0x0125, B:56:0x0102, B:64:0x012d, B:14:0x0031, B:16:0x0035, B:17:0x003d, B:19:0x0041, B:21:0x0049, B:170:0x036b, B:171:0x0372, B:143:0x031b, B:144:0x0320, B:139:0x0310, B:140:0x0317, B:174:0x0376, B:175:0x037b), top: B:213:0x0001, inners: #0, #1, #2, #3 }] */
    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized Bundle d() {
        Bundle bundleD;
        bundleD = super.d();
        if (this.L > 0) {
            bundleD.putInt(e, this.L);
        }
        if (!TextUtils.isEmpty(this.M)) {
            bundleD.putString("click_url", this.M);
        }
        if (this.O != null && !this.O.isEmpty()) {
            bundleD.putAll(this.O);
        } else if (this.aH) {
            bundleD.putString(CreativeInfo.q, "/scar-admob");
        } else if (this.aV != null && !this.aV.isEmpty()) {
            bundleD.putStringArrayList(h, new ArrayList<>(this.aV));
        }
        if (!TextUtils.isEmpty(this.P)) {
            bundleD.putString("foreground_activity", this.P);
        }
        bundleD.putString("impression_id", this.Q);
        if (!TextUtils.isEmpty(this.bh)) {
            bundleD.putString(ay, this.bh);
        }
        if (this.R > 0) {
            bundleD.putLong(d, this.R);
        }
        if (!TextUtils.isEmpty(this.S)) {
            bundleD.putString(l, this.S);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            bundleD.putString(ac, this.aA);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            bundleD.putString(ao, this.aB);
        }
        if (!TextUtils.isEmpty(this.aD)) {
            bundleD.putString(af, this.aD);
        }
        if (!TextUtils.isEmpty(this.aC) && !bundleD.containsKey(CreativeInfo.L)) {
            bundleD.putString(CreativeInfo.L, this.aC);
        }
        if (!TextUtils.isEmpty(this.C)) {
            if (bundleD.getString("ad_format_type") == null || "com.unity3d.ads".equals(this.C) || h.p.equals(this.C)) {
                bundleD.putString("ad_format_type", this.T);
            }
            if (bundleD.getString(f) == null || "com.unity3d.ads".equals(this.C) || h.p.equals(this.C)) {
                bundleD.putString(f, this.U);
            }
        } else {
            Logger.d(a_, "Sdk field value is null.");
        }
        if (bundleD.getString("ad_format_type") == null && this.bm != null && this.bm.t != null) {
            bundleD.putString("ad_format_type", this.bm.t.name());
        }
        bundleD.putString(StatsEvent.z, "impression");
        if (!TextUtils.isEmpty(this.W)) {
            bundleD.putString("image_id", this.W);
            if (!this.aG && !this.bl) {
                bundleD.putBoolean(s, this.X);
            }
            if (this.aa != null) {
                bundleD.putString("image_orientation", this.aa.name().toLowerCase());
            }
            bundleD.putLong(o, this.Y);
            bundleD.putFloat(p, this.Z);
            bundleD.putInt(at, this.ak);
        }
        bundleD.putBoolean(t, this.V);
        bundleD.putBoolean(v, this.J);
        if (!TextUtils.isEmpty(this.bi)) {
            String string = bundleD.getString(CreativeInfo.g);
            if (string != null) {
                bundleD.putString(CreativeInfo.g, string + m.ac + this.bi);
            } else {
                bundleD.putString(CreativeInfo.g, this.bi);
            }
        }
        if (!TextUtils.isEmpty(this.bj)) {
            bundleD.putString(CreativeInfo.f, this.bj);
        }
        Logger.d(a_, "add impression log to bundle: ", this.bj);
        if (this.aG || this.bl) {
            bundleD.putBoolean(ar, this.ai);
            bundleD.putBoolean(as, this.aj);
            if (this.aG && this.al != Long.MAX_VALUE) {
                bundleD.putLong(au, this.al);
            }
            if (this.am > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                bundleD.putFloat(av, this.am);
            }
            bundleD.putString(aw, this.an);
        }
        if (!this.bl && this.bm != null) {
            bundleD.putAll(this.bm.a());
            this.bm.a("RedirectCount=" + this.bn);
            if (!TextUtils.isEmpty(this.bm.q)) {
                String string2 = bundleD.getString(CreativeInfo.g);
                if (string2 != null) {
                    bundleD.putString(CreativeInfo.g, string2 + m.ac + this.bm.q);
                } else {
                    bundleD.putString(CreativeInfo.g, this.bm.q);
                }
            }
        }
        bundleD.putBoolean(ag, this.az);
        if (!TextUtils.isEmpty(this.aE)) {
            bundleD.putString("event_id", this.aE);
        }
        bundleD.putBoolean(aq, this.aF);
        if (!TextUtils.isEmpty(this.aU)) {
            bundleD.putString("revenue_event", this.aU);
        }
        if (this.aW != null) {
            bundleD.putBoolean(aJ, this.aW.booleanValue());
        }
        if (this.bb != null) {
            bundleD.putBoolean(aT, this.bb.booleanValue());
        }
        if (this.ba != null && !this.ba.isEmpty()) {
            if (this.bm != null && !this.bm.j && !this.bm.k) {
                synchronized (this.aX) {
                    this.aX.addAll(this.ba);
                }
                synchronized (this.ba) {
                    this.ba.clear();
                }
            } else {
                bundleD.putStringArrayList(aM, new ArrayList<>(this.ba));
            }
            if (this.aX != null) {
                bundleD.putStringArrayList(aK, new ArrayList<>(this.aX));
            }
            if (this.aZ != null) {
                if (this.bm == null) {
                    bundleD.putStringArrayList(aN, new ArrayList<>(this.aZ));
                } else {
                    bundleD.putStringArrayList(aN, new ArrayList<>(this.aZ));
                }
            }
            if (this.aY != null) {
                bundleD.putStringArrayList(aL, new ArrayList<>(this.aY));
            }
            if (this.bc != null) {
                bundleD.putStringArrayList(aO, new ArrayList<>(this.bc));
            }
            if (!TextUtils.isEmpty(this.bk)) {
                bundleD.putString(aR, this.bk);
            }
            Logger.d(a_, "add matching method to bundle: ", this.bk);
            if (this.be != null) {
                bundleD.putStringArrayList(aS, new ArrayList<>(this.be));
            }
        } else {
            if (this.aX != null && !this.aX.isEmpty()) {
                bundleD.putStringArrayList(aK, new ArrayList<>(this.aX));
            }
            if (this.aZ != null && !this.aZ.isEmpty()) {
                if (this.bm == null && !this.bm.j && !this.bm.k) {
                    synchronized (this.aY) {
                        this.aY.addAll(this.aZ);
                    }
                    synchronized (this.aZ) {
                        this.aZ.clear();
                    }
                } else {
                    bundleD.putStringArrayList(aN, new ArrayList<>(this.aZ));
                }
            }
            if (this.aY != null && !this.aY.isEmpty()) {
                bundleD.putStringArrayList(aL, new ArrayList<>(this.aY));
            }
            if (this.bc != null && !this.bc.isEmpty()) {
                bundleD.putStringArrayList(aO, new ArrayList<>(this.bc));
            }
            if (!TextUtils.isEmpty(this.bk)) {
                bundleD.putString(aR, this.bk);
            }
            Logger.d(a_, "add matching method to bundle: ", this.bk);
            if (this.be != null) {
                bundleD.putStringArrayList(aS, new ArrayList<>(this.be));
            }
        }
        throw th;
        return bundleD;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Set<String> e() {
        HashSet hashSet = new HashSet(ab);
        if (this.C != null && this.C.equals(h.h)) {
            hashSet.add("click_url");
        }
        return hashSet;
    }

    public static Set<String> f() {
        return bg;
    }

    private static Map<String, Object> b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (bundle.size() == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Bundle) {
                    map.put(str, b((Bundle) obj));
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (!arrayList.isEmpty() && (arrayList.get(0) instanceof Bundle)) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (obj2 instanceof Bundle) {
                                arrayList2.add(b((Bundle) obj2));
                            }
                        }
                        map.put(str, arrayList2);
                    } else {
                        map.put(str, arrayList);
                    }
                } else {
                    map.put(str, obj);
                }
            }
        }
        return map;
    }

    private static Bundle a(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                bundle.putStringArrayList(str, (ArrayList) obj);
            }
        }
        return bundle;
    }

    private String b(String str) {
        String string;
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType called, input=", str);
        if (BrandSafetyUtils.j.equals(str)) {
            string = AdFormatType.INTER.toString();
        } else if ("REWARDED".equals(str)) {
            string = AdFormatType.REWARD.toString();
        } else if ("BANNER".equals(str) || BrandSafetyUtils.n.equals(str)) {
            string = AdFormatType.BANNER.toString();
        } else if (BrandSafetyUtils.l.equals(str)) {
            string = AdFormatType.APPOPEN.toString();
        } else if (BrandSafetyUtils.o.equals(str)) {
            string = AdFormatType.MREC.toString();
        } else if ("NATIVE".equals(str)) {
            string = AdFormatType.NATIVE.toString();
        } else {
            string = null;
        }
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType returned  ", string);
        return string;
    }

    public String g() {
        return this.aU;
    }

    public void a(String str) {
        this.aU = str;
    }

    public String h() {
        return this.W;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Bundle a(Bundle bundle) {
        boolean z;
        boolean zRemoveAll;
        try {
            String string = bundle.getString("ad_format_type");
            String string2 = bundle.getString("impression_id");
            String strC = null;
            String strB = n.b(bundle, ac);
            if (strB != null && !strB.isEmpty()) {
                strC = CreativeInfoManager.c(strB);
            }
            Logger.d(a_, Logger.FeatureTag.RESOURCES, "network name = ", strB, ", sdk package = ", strC, ", ad type = ", string);
            if (strC != null && string != null) {
                HashSet hashSet = new HashSet();
                HashSet<String> hashSet2 = new HashSet<>();
                HashSet hashSet3 = new HashSet();
                HashSet<String> hashSetC = n.c(bundle, aK);
                if (hashSetC != null && !hashSetC.isEmpty()) {
                    hashSet2.addAll(hashSetC);
                }
                HashSet<String> hashSetC2 = n.c(bundle, aM);
                if (hashSetC2 != null && !hashSetC2.isEmpty()) {
                    hashSet3.addAll(hashSetC2);
                }
                HashSet<String> hashSetC3 = n.c(bundle, aO);
                if (hashSetC3 != null) {
                    hashSetC3.remove("");
                    z = !hashSetC3.isEmpty();
                } else {
                    z = false;
                }
                HashSet<String> hashSetC4 = n.c(bundle, aL);
                if (hashSetC4 != null && z) {
                    zRemoveAll = hashSetC4.removeAll(hashSetC3);
                } else {
                    zRemoveAll = false;
                }
                HashSet<String> hashSetC5 = n.c(bundle, aN);
                boolean zP = SafeDK.getInstance().P();
                boolean z2 = zRemoveAll;
                boolean zA = CreativeInfoManager.a(strC, AdNetworkConfiguration.SUPPORTS_DIFFERENT_ADS_IN_CROSS_ORIGIN_IFRAMES, false);
                boolean z3 = z;
                Logger.FeatureTag featureTag = Logger.FeatureTag.JS_RESOURCES;
                Object[] objArr = new Object[6];
                objArr[0] = "prepare bundle for reporting, package: ";
                objArr[1] = strC;
                objArr[2] = ", supportMergingWebviewNetworkResources: ";
                objArr[3] = zP ? "YES" : "NO";
                objArr[4] = ", supportDifferentAdsInCrossOriginIframes: ";
                objArr[5] = zA ? "YES" : "NO";
                Logger.d(a_, featureTag, objArr);
                boolean z4 = Objects.equals(string, BrandSafetyUtils.j) || Objects.equals(string, bf);
                if (zP && (!z4 || !zA)) {
                    if (hashSetC4 != null && !hashSetC4.isEmpty()) {
                        hashSet2.addAll(hashSetC4);
                    }
                    if (hashSetC5 != null && !hashSetC5.isEmpty()) {
                        hashSet3.addAll(hashSetC5);
                    }
                }
                if (z4) {
                    hashSet2 = k.a(hashSet2, "text:");
                }
                if (!CreativeInfoManager.a(strC, AdNetworkConfiguration.SUPPORT_WEBVIEW_COMMENT_EXTRACTION, false)) {
                    hashSet2 = k.a(hashSet2, CreativeInfo.aS);
                }
                if (hashSet2 != null && !hashSet2.isEmpty()) {
                    hashSet.addAll(hashSet2);
                    bundle.putStringArrayList(aP, new ArrayList<>(hashSet));
                }
                if (hashSet3 != null && !hashSet3.isEmpty()) {
                    bundle.putStringArrayList(aQ, new ArrayList<>(hashSet3));
                }
                Logger.d(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, type: ", string, ", package: ", strC, ", impression id: ", string2);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.JS_RESOURCES, "prepare bundle for reporting, webpage resources: ", hashSetC);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.NW_RESOURCES, "prepare bundle for reporting, network resources: ", hashSetC4);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, final resources: ", hashSet);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.JS_RESOURCES, "prepare bundle for reporting, expanded webpage resources: ", hashSetC2);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.NW_RESOURCES, "prepare bundle for reporting, expanded network resources: ", hashSetC5);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, final expanded resources: ", hashSet3);
                String string3 = bundle.getString(CreativeInfo.g) != null ? bundle.getString(CreativeInfo.g) : "";
                if (bundle.getBoolean(aJ)) {
                    string3 = string3 + "|co1";
                }
                if (bundle.getBoolean(aT)) {
                    string3 = string3 + "|hi1";
                }
                if (z3) {
                    String str = string3 + "|hr";
                    string3 = z2 ? str + "2" : str + "1";
                }
                bundle.putString(CreativeInfo.g, string3);
            }
            Set<String> setF = f();
            if (setF != null) {
                for (String str2 : setF) {
                    if (bundle.containsKey(str2)) {
                        bundle.remove(str2);
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d(a_, "caught exception: ", e2.getMessage(), " ", e2);
        }
        return bundle;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        jSONObjectI.put("slotNumber", this.L);
        if (!TextUtils.isEmpty(this.M)) {
            jSONObjectI.put("clickUrl", this.M);
        }
        if (!TextUtils.isEmpty(this.N)) {
            jSONObjectI.put("addedCreativeInfoKey", this.N);
        }
        if (!TextUtils.isEmpty(this.P)) {
            jSONObjectI.put("foregroundActivityName", this.P);
        }
        if (!TextUtils.isEmpty(this.Q)) {
            jSONObjectI.put("impressionId", this.Q);
        }
        if (!TextUtils.isEmpty(this.bh)) {
            jSONObjectI.put("multiAdUuid", this.bh);
        }
        jSONObjectI.put("viewingTime", this.R);
        if (!TextUtils.isEmpty(this.S)) {
            jSONObjectI.put("maxAdUnitId", this.S);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            jSONObjectI.put("maxNetworkName", this.aA);
        }
        if (!TextUtils.isEmpty(this.T)) {
            jSONObjectI.put("applovinDataAdFormatType", this.T);
        }
        if (!TextUtils.isEmpty(this.U)) {
            jSONObjectI.put("applovinData3rdPartyPlacementId", this.U);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            jSONObjectI.put("maxCreativeId", this.aB);
        }
        if (!TextUtils.isEmpty(this.aC)) {
            jSONObjectI.put("dspName", this.aC);
        }
        if (!TextUtils.isEmpty(this.aD)) {
            jSONObjectI.put("customJsNetworkName", this.aD);
        }
        jSONObjectI.put("clicked", this.V);
        if (!TextUtils.isEmpty(this.W)) {
            jSONObjectI.put("screenShotHashValue", this.W);
        }
        jSONObjectI.put("isAnimated", this.X);
        jSONObjectI.put("imageFileSize", this.Y);
        jSONObjectI.put("imageUniformity", this.Z);
        if (!TextUtils.isEmpty(this.aE)) {
            jSONObjectI.put("eventId", this.aE);
        }
        if (!TextUtils.isEmpty(this.aU)) {
            jSONObjectI.put("revenueEventValue", this.aU);
        }
        if (this.aa != null) {
            jSONObjectI.put("screenShotOrientation", this.aa.name());
        }
        jSONObjectI.put("didFailDisplayReceived", this.aF);
        if (!TextUtils.isEmpty(this.bi)) {
            jSONObjectI.put("debugInfo", this.bi);
        }
        if (!TextUtils.isEmpty(this.bj)) {
            jSONObjectI.put("impressionLog", this.bj);
        }
        jSONObjectI.put(C4664b4.w, this.aG);
        jSONObjectI.put("isNative", this.bl);
        jSONObjectI.put("willDisplayReceived", this.ai);
        jSONObjectI.put("isBannerViewDetected", this.aj);
        jSONObjectI.put("imageSlot", this.ak);
        jSONObjectI.put("intervalBetweenDisplayMessages", this.al);
        jSONObjectI.put("detectedViewProportions", this.am);
        if (!TextUtils.isEmpty(this.an)) {
            jSONObjectI.put(C4664b4.j.A, this.an);
        }
        jSONObjectI.put("isScarAdMobAd", this.aH);
        if (this.bm != null) {
            jSONObjectI.put("redirectData", this.bm.i());
        }
        jSONObjectI.put("redirectCount", this.bn);
        if (this.aV != null) {
            jSONObjectI.put("dspUrlList", d.a(this.aV));
        }
        if (this.aW != null) {
            jSONObjectI.put("isCrossOriginIframeInWebpage", this.aW);
        }
        if (this.bb != null) {
            jSONObjectI.put("isHiddenIframeInWebpage", this.bb);
        }
        if (this.aX != null) {
            jSONObjectI.put("webPageResourceUrlList", d.a(this.aX));
        }
        if (this.aY != null) {
            jSONObjectI.put("networkResourceUrlList", d.a(this.aY));
        }
        if (this.aZ != null) {
            jSONObjectI.put("expandedNetworkResourceUrlList", d.a(this.aZ));
        }
        if (this.ba != null) {
            jSONObjectI.put("expandedWebPageResourceUrlList", d.a(this.ba));
        }
        if (this.bc != null) {
            jSONObjectI.put("hiddenWebPageResourceUrlList", d.a(this.bc));
        }
        if (!TextUtils.isEmpty(this.bk)) {
            jSONObjectI.put("matchingMethod", this.bk);
        }
        if (this.O != null) {
            jSONObjectI.put("addedCreativeInfoValues", d.a(this.O));
        }
        if (this.be != null) {
            jSONObjectI.put("vastDocVersionList", d.a(this.be));
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.L = jSONObject.optInt("slotNumber", 0);
            this.M = jSONObject.optString("clickUrl", "");
            this.N = jSONObject.optString("addedCreativeInfoKey", "");
            this.P = jSONObject.optString("foregroundActivityName", "");
            this.Q = jSONObject.optString("impressionId", "");
            this.bh = jSONObject.optString("multiAdUuid", "");
            this.R = jSONObject.optLong("viewingTime", 0L);
            this.S = jSONObject.optString("maxAdUnitId", "");
            this.aA = jSONObject.optString("maxNetworkName", "");
            this.T = jSONObject.optString("applovinDataAdFormatType", "");
            this.U = jSONObject.optString("applovinData3rdPartyPlacementId", "");
            this.aB = jSONObject.optString("maxCreativeId", "");
            this.aC = jSONObject.optString("dspName", "");
            this.aD = jSONObject.optString("customJsNetworkName", "");
            this.V = jSONObject.optBoolean("clicked", false);
            this.W = jSONObject.optString("screenShotHashValue", "");
            this.X = jSONObject.optBoolean("isAnimated", false);
            this.Y = jSONObject.optLong("imageFileSize", 0L);
            this.Z = (float) jSONObject.optDouble("imageUniformity", 0.0d);
            this.aE = jSONObject.optString("eventId", "");
            this.aU = jSONObject.optString("revenueEventValue", "");
            this.aa = BrandSafetyUtils.ScreenShotOrientation.valueOf(jSONObject.optString("screenShotOrientation", BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED.name()));
            this.aF = jSONObject.optBoolean("didFailDisplayReceived", false);
            this.bi = jSONObject.optString("debugInfo", "");
            this.bj = jSONObject.optString("impressionLog", "");
            this.bk = jSONObject.optString("matchingMethod", "");
            this.aG = jSONObject.optBoolean(C4664b4.w, false);
            this.bl = jSONObject.optBoolean("isNative", false);
            this.ai = jSONObject.optBoolean("willDisplayReceived", false);
            this.aj = jSONObject.optBoolean("isBannerViewDetected", false);
            this.ak = jSONObject.optInt("imageSlot", 0);
            this.al = jSONObject.optLong("intervalBetweenDisplayMessages", 0L);
            this.am = (float) jSONObject.optDouble("detectedViewProportions", 0.0d);
            this.an = jSONObject.optString(C4664b4.j.A, "");
            this.aH = jSONObject.optBoolean("isScarAdMobAd", false);
            this.bn = jSONObject.optInt("redirectCount", 0);
            if (jSONObject.has("isCrossOriginIframeInWebpage") && !jSONObject.isNull("isCrossOriginIframeInWebpage")) {
                this.aW = Boolean.valueOf(jSONObject.optBoolean("isCrossOriginIframeInWebpage"));
            }
            if (jSONObject.has("isHiddenIframeInWebpage") && !jSONObject.isNull("isHiddenIframeInWebpage")) {
                this.bb = Boolean.valueOf(jSONObject.optBoolean("isHiddenIframeInWebpage"));
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dspUrlList");
            if (jSONArrayOptJSONArray != null) {
                this.aV = new HashSet<>(d.b(jSONArrayOptJSONArray));
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("webPageResourceUrlList");
            if (jSONArrayOptJSONArray2 != null) {
                this.aX = new HashSet<>(d.b(jSONArrayOptJSONArray2));
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("networkResourceUrlList");
            if (jSONArrayOptJSONArray3 != null) {
                this.aY = new HashSet<>(d.b(jSONArrayOptJSONArray3));
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("expandedNetworkResourceUrlList");
            if (jSONArrayOptJSONArray4 != null) {
                this.aZ = new HashSet<>(d.b(jSONArrayOptJSONArray4));
            }
            JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("expandedWebPageResourceUrlList");
            if (jSONArrayOptJSONArray5 != null) {
                this.ba = new HashSet<>(d.b(jSONArrayOptJSONArray5));
            }
            JSONArray jSONArrayOptJSONArray6 = jSONObject.optJSONArray("hiddenWebageResourceUrlList");
            if (jSONArrayOptJSONArray6 != null) {
                this.bc = new HashSet<>(d.b(jSONArrayOptJSONArray6));
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("redirectData");
            if (jSONObjectOptJSONObject != null) {
                this.bm = new RedirectData();
                this.bm.a(jSONObjectOptJSONObject);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("addedCreativeInfoValues");
            if (jSONObjectOptJSONObject2 != null) {
                this.O = a(d.b(jSONObjectOptJSONObject2));
            }
            JSONArray jSONArrayOptJSONArray7 = jSONObject.optJSONArray("vastDocVersionList");
            if (jSONArrayOptJSONArray7 != null) {
                this.be = d.b(jSONArrayOptJSONArray7);
            }
        }
    }
}
