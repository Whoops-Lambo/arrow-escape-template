package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import defpackage.h50;
import defpackage.jc1;
import defpackage.nj;
import defpackage.q63;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class We {
    private static final String A = "mcc";
    private static final String B = "mnc";
    private static final String C = "icc";
    private static final String D = "mCar";
    private static final String E = "tz";
    private static final String F = "tzOff";
    private static final String G = "rvManual";
    private static final String H = "ts";
    private static final String I = "android";
    private static final String J = "impression";
    private static final String K = "placementId";
    private static final String L = "=";
    private static final String M = "&";
    static String N = "";
    static String O = "";
    private static String a = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final String b = "?request=";
    private static final String c = "platform";
    private static final String d = "applicationKey";
    private static final String e = "applicationUserId";
    private static final String f = "sdkVersion";
    private static final String g = "pluginType";
    private static final String h = "pluginVersion";
    private static final String i = "plugin_fw_v";
    private static final String j = "advId";
    private static final String k = "auid";
    private static final String l = "isDemandOnly";
    private static final String m = "serr";
    private static final String n = "appVer";
    private static final String o = "osVer";
    private static final String p = "devModel";
    private static final String q = "devMake";
    private static final String r = "connType";
    private static final String s = "rawConnType";
    private static final String t = "mt";
    private static final String u = "fs";
    private static final String v = "coppa";
    private static final String w = "dff";
    private static final String x = "browserUserAgent";
    private static final String y = "deviceLang";
    private static final String z = "bundleId";

    public static String b() {
        return O;
    }

    public static void c(String str) {
        O = str;
    }

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z2, List<Pair<String, String>> list, boolean z3) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        B7 b7A = Pb.k0().a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            q63.A(arrayList, "applicationUserId", str2);
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z2) {
            q63.A(arrayList, G, "1");
        }
        if (!IronSourceUtils.g()) {
            q63.A(arrayList, m, "0");
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            q63.A(arrayList, j, str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            q63.A(arrayList, "mt", str4);
        }
        String strB = M1.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            q63.A(arrayList, n, strB);
        }
        arrayList.add(new Pair(o, nj.j(Build.VERSION.SDK_INT, "")));
        q63.A(arrayList, q, Build.MANUFACTURER);
        arrayList.add(new Pair(p, Build.MODEL));
        arrayList.add(new Pair("fs", nj.j(IronSourceUtils.c(context) ? 1 : 0, "")));
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C4992ta.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.b)) {
            arrayList.add(new Pair(v, concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.b).get(0)));
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            String str6 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.k)) {
                q63.A(arrayList, "ts", "1");
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.d)) {
            String str7 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase("true")) {
                q63.A(arrayList, w, "1");
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.e) && (list2 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.e)) != null) {
            arrayList.add(new Pair(com.ironsource.mediationsdk.metadata.a.e, list2.get(0)));
        }
        String strA = IronSourceUtils.a(context);
        if (!TextUtils.isEmpty(strA)) {
            q63.A(arrayList, r, strA);
        }
        String strD = Y3.d(context);
        if (!TextUtils.isEmpty(strD)) {
            q63.A(arrayList, s, strD);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strS = b7A.s();
        if (strS.length() != 0) {
            q63.A(arrayList, x, strS);
        }
        try {
            str5 = b7A.d(context) + "-" + b7A.B(context);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            q63.A(arrayList, y, str5);
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + X3.b(context)));
        arrayList.add(new Pair("mnc", "" + X3.c(context)));
        String strH = b7A.H(context);
        if (!TextUtils.isEmpty(strH)) {
            q63.A(arrayList, "icc", strH);
        }
        String strV = b7A.v(context);
        if (!TextUtils.isEmpty(strV)) {
            q63.A(arrayList, D, strV);
        }
        String strD2 = b7A.d();
        if (!TextUtils.isEmpty(strD2)) {
            q63.A(arrayList, "tz", strD2);
        }
        arrayList.add(new Pair(F, "" + b7A.m()));
        String strE = b7A.e(context);
        if (!TextUtils.isEmpty(strE)) {
            q63.A(arrayList, "auid", strE);
        }
        if (z3) {
            q63.A(arrayList, "isDemandOnly", "1");
        }
        q63.A(arrayList, R6.j0, String.valueOf(C4839l0.a()));
        String strA2 = a(arrayList);
        N = strA2;
        return nj.q(new StringBuilder(), a(LevelPlay.getSdkVersion()), URLEncoder.encode(Q9.e(C4916p5.b().c(), strA2), "UTF-8"));
    }

    private static void b(String str) {
        a = str;
    }

    public static String a() {
        return N;
    }

    public static String a(String str, boolean z2, int i2) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z2)));
        arrayList.add(new Pair("placementId", Integer.toString(i2)));
        return h50.i(str, "&", a(arrayList));
    }

    private static String a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String string = "";
        for (Pair<String, String> pair : list) {
            if (string.length() > 0) {
                string = string.concat("&");
            }
            StringBuilder sbP = h50.p(string);
            sbP.append((String) pair.first);
            sbP.append("=");
            sbP.append(URLEncoder.encode((String) pair.second, "UTF-8"));
            string = sbP.toString();
        }
        return string;
    }

    private static String a(String str) {
        return jc1.o(a, str, new StringBuilder(), b);
    }
}
