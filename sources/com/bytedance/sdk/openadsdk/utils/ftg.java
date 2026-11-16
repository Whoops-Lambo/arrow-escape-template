package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.ironsource.Ba;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.mediation.LevelPlayAdError;
import defpackage.bb3;
import defpackage.pv1;
import defpackage.qe3;
import io.p071bidmachine.protobuf.EventTypeExtended;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ftg {
    private static final byte[] at;
    public static Integer kgy;
    private static String kus;
    private static final HashSet<String> nu;
    private static final byte[] twf;
    private static String vs;
    private static final ExecutorService ahm = Executors.newSingleThreadExecutor();
    private static volatile boolean rz = false;
    private static final AtomicInteger uq = new AtomicInteger(0);
    private static volatile String ct = "";
    private static final ReentrantLock noq = new ReentrantLock();
    private static String yo = null;
    private static String fi = null;
    private static String gf = null;
    private static final HashSet<String> ra = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ftg$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(ftg.ct)) {
                    com.bytedance.sdk.component.ra.fi fiVar = new com.bytedance.sdk.component.ra.fi(com.bytedance.sdk.openadsdk.core.xh.kgy(), com.bytedance.sdk.component.ra.fi.rz.USER_AGENT);
                    fiVar.setWebViewClient(new com.bytedance.sdk.component.ra.fi.kgy());
                    String unused = ftg.ct = fiVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.wy.kgy(fiVar);
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuTDoU=", "Sfsj", 355);
                com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "", e);
            } catch (NoClassDefFoundError e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuTDoU=", "Sfsj", 357);
                com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "", e2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        private static final int kgy;

        static {
            com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i = 2;
            try {
                int i2 = RecyclerView.ViewHolder.d;
                if (RecyclerView.ViewHolder.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i = 0;
                }
            } catch (ClassNotFoundException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuTDvtclgiIJ1fqKIc=", "B+0hnA21fZk=", 1696);
                i = 1;
            } catch (NoSuchMethodException e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuTDvtclgiIJ1fqKIc=", "B+0hnA21fZk=", 1698);
            }
            kgy = i;
            com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy implements Callable<String> {
        private final int kgy;

        private synchronized String rz() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ftg.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = ftg.muf();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuTDvBYmCSzLUnPKpANqF3Gk0E=", "XOs5oga+X86FXeJc", 454);
                com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strAhm;
            try {
                strAhm = "unKnow";
                int i = this.kgy;
                if (i == 1) {
                    strAhm = rz();
                } else if (i == 2) {
                    strAhm = ahm();
                }
            } catch (Throwable th) {
                throw th;
            }
            return strAhm;
        }

        private String ahm() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("android_system_ua", property);
                            return property;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuTDvBYmCSzLUnPKpANqF3Gk0E=", "XOs5tA24e8iJTuREnwWlJW7v", 435);
                        com.bytedance.sdk.component.utils.sx.rz("getUA", "e:" + th.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
        }

        public kgy(int i) {
            this.kgy = i;
        }
    }

    public static boolean xh() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "Uv0fmgyo", 743);
            return false;
        }
    }

    public static String ahm() {
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy(com.bytedance.sdk.openadsdk.core.xh.kgy());
        try {
            String strAhm = com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("android_system_ua", "unKnow");
            if (strAhm != null && !"unKnow".equals(strAhm)) {
                return strAhm;
            }
            FutureTask futureTask = new FutureTask(new kgy(2));
            ahm.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5tA24e8iJTuREnwWlJW7P", 299);
        }
        com.bytedance.sdk.component.utils.sx.rz("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String ay() {
        return "https://log.byteoversea.com/service/2/app_log_test/";
    }

    public static synchronized String fi() {
        try {
            if (TextUtils.isEmpty(gf) && com.bytedance.sdk.openadsdk.core.xh.kgy() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.xh.kgy().getPackageManager().getPackageInfo(noq(), 0);
                    fi = String.valueOf(packageInfo.versionCode);
                    gf = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5owaues6PRPlcgRQ=", EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE);
                    com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gf;
    }

    public static String ioy() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String muf() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.xh.kgy());
            webView.setWebViewClient(new com.bytedance.sdk.component.ra.fi.kgy());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString == null || "unKnow".equals(userAgentString)) {
                return userAgentString;
            }
            com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("webview_ua", userAgentString);
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oga+X86FXeJc", 395);
            com.bytedance.sdk.component.utils.sx.rz("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    private static int mw() {
        int iKgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("webview_ua_update_time", 1);
        if (iKgy <= 0) {
            return 1;
        }
        return iKgy;
    }

    public static synchronized String noq() {
        Context contextKgy;
        try {
            if (TextUtils.isEmpty(yo) && (contextKgy = com.bytedance.sdk.openadsdk.core.xh.kgy()) != null) {
                try {
                    yo = contextKgy.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5pQK/YsaHT/lcgRQ=", 477);
                    com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return yo;
    }

    public static String rz(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5uAaxQMmGRf5EnBQ=", LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD);
                            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", th.getMessage());
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e) {
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5uAaxQMmGRf5EnBQ=", 637);
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception e2) {
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5uAaxQMmGRf5EnBQ=", 643);
                                }
                            }
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e3) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5uAaxQMmGRf5EnBQ=", 637);
                    }
                    try {
                        fileReader.close();
                    } catch (Exception e4) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5uAaxQMmGRf5EnBQ=", 643);
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception e5) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e5, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5uAaxQMmGRf5EnBQ=", 637);
                }
                try {
                    fileReader.close();
                } catch (Exception e6) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e6, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5uAaxQMmGRf5EnBQ=", 643);
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static List<String> sx() {
        ArrayList arrayList = new ArrayList();
        Set<String> setJvt = com.bytedance.sdk.openadsdk.core.xh.uq().jvt();
        if (setJvt != null && !setJvt.isEmpty()) {
            for (String str : setJvt) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static String uf() {
        String str = kus;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(at);
        kus = str2;
        return str2;
    }

    public static String uq() {
        if (!TextUtils.isEmpty(ct)) {
            return ct;
        }
        com.bytedance.sdk.openadsdk.fpp.kgy.kgy(com.bytedance.sdk.openadsdk.core.xh.kgy());
        String strKgy = com.bytedance.sdk.openadsdk.core.ra.kgy("sdk_local_web_ua", ((long) mw()) * 86400000);
        ct = strKgy;
        if (TextUtils.isEmpty(strKgy)) {
            ReentrantLock reentrantLock = noq;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(ct)) {
                            ct = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.xh.kgy());
                        }
                        com.bytedance.sdk.openadsdk.core.ra.kgy("sdk_local_web_ua", ct);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oga+X86FXeJ8", 369);
                        com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "", e);
                        noq.unlock();
                    } catch (NoClassDefFoundError e2) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oga+X86FXeJ8", 371);
                        com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "", e2);
                        noq.unlock();
                    }
                }
            } catch (Throwable th) {
                noq.unlock();
                throw th;
            }
        }
        return ct;
    }

    public static String vg() {
        String str = vs;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(twf);
        vs = str2;
        return str2;
    }

    private static boolean vrj() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XvY5kBGyaMutT9pSngiBPlrnIZQBsGw=", 724);
            return false;
        }
    }

    public static boolean wy() {
        return uq.get() == 1;
    }

    public static synchronized String yo() {
        try {
            if (TextUtils.isEmpty(fi) && com.bytedance.sdk.openadsdk.core.xh.kgy() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.xh.kgy().getPackageManager().getPackageInfo(noq(), 0);
                    fi = String.valueOf(packageInfo.versionCode);
                    gf = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5owaues6PRPRSiBQ=", 496);
                    com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return fi;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        nu = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        kgy = null;
        at = new byte[]{108, 111, 97, 100, 105, 110, 103};
        twf = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static long at() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oQyoaMupRMNYnh+hJGj6IocCu2z0iVDS", 678);
            return 0L;
        }
    }

    public static int bmz() {
        return ahm.kgy;
    }

    public static String ct(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.xh.uq().wl();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        if (!str.startsWith(g.e)) {
            return "https://".concat(str);
        }
        return str;
    }

    public static int dg() {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("is_root", -1);
    }

    public static String fpp() {
        String strFxy = com.bytedance.sdk.openadsdk.core.xh.uq().fxy();
        if (TextUtils.isEmpty(strFxy)) {
            String strKgy = ioy.kgy();
            if (!TextUtils.isEmpty(strKgy)) {
                return pv1.n("https://", strKgy, "/service/2/dual_events/");
            }
            return strFxy;
        }
        return strFxy;
    }

    public static int fpz() {
        try {
            String id = TimeZone.getDefault().getID();
            if (ra.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id != null && id.startsWith("Europe/")) {
                return 4;
            }
            if (id != null && id.startsWith("America/") && !nu.contains(id)) {
                return 5;
            }
            return 3;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oQqxbP2PRNI=", 997);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static String ft() {
        int i = -jpc();
        if (i >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i));
        }
        return "Etc/GMT".concat(String.valueOf(i));
    }

    public static String gf() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.xh.kgy().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0) {
                return String.valueOf(j / 1024);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oQyoaMutT9pSngiCMXrtOZwVtX3erUvZXIsUsg==", 589);
            return null;
        }
    }

    public static String gm() {
        String strJw = com.bytedance.sdk.openadsdk.core.settings.nu.jw();
        if (!TextUtils.isEmpty(strJw)) {
            return strJw;
        }
        String strFtg = com.bytedance.sdk.openadsdk.core.xh.uq().ftg();
        if (TextUtils.isEmpty(strFtg)) {
            return ioy.kgy();
        }
        return strFtg;
    }

    public static int jpc() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static int kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    private static String kus(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(Ba.b, "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", yo()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "Wuoppgq7Z/eBWNZQnw==", EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    public static String lqi() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oQqxbP2PRNJ+hQW5", 962);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static boolean nu(String str) {
        if (com.bytedance.sdk.openadsdk.core.kus.ct()) {
            return true;
        }
        com.bytedance.sdk.component.utils.sx.rz(pv1.n("You must use method '", str, "' after initialization, please check."), new Object[0]);
        return false;
    }

    public static long ra(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                return 0L;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strArrSplit[0]);
            for (int i = 1; i < strArrSplit.length; i++) {
                String str2 = strArrSplit[i];
                if (!fi(str2)) {
                    return 0L;
                }
                if (str2.length() == 1) {
                    sb.append("0");
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
                if (sb.length() > 18) {
                    return 0L;
                }
            }
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return 0L;
            }
            return Long.parseLong(string);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5sxawZfSEQeFYngKpJ1XNIpEG", 1405);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", e.getMessage());
            return 0L;
        }
    }

    public static long twf() {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("free_internal_storage", 0L).longValue();
    }

    public static String um() {
        String strMca = com.bytedance.sdk.openadsdk.core.xh.uq().mca();
        if (TextUtils.isEmpty(strMca)) {
            return ioy.kgy();
        }
        return strMca;
    }

    public static long vs() {
        try {
            if (vrj()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            return 0L;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5pge/aNWEed5HiQ==", IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    public static String nu() {
        return rz("MemTotal");
    }

    public static void at(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.sx.rz(pv1.n("You should use method '", str, "' on the asynchronous thread,it may cause anr, please check."), new Object[0]);
    }

    public static String ct() {
        return ft.kgy();
    }

    public static boolean ct(int i) {
        return i == 5;
    }

    public static int ct(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oQKubsKUedNWuhSyO1LhIw==", 1332);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static String gf(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static boolean noq(int i) {
        return i == 6;
    }

    public static String noq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return !str.startsWith(g.e) ? "https://".concat(str) : str;
    }

    public static int gf(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = kgy;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        kgy = Integer.valueOf(size);
        return size;
    }

    public static long noq(Context context) {
        int i;
        try {
            i = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5uAqyWsOLfNJPnxivJg==", 1350);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", th.getMessage());
            i = -1;
        }
        return i;
    }

    public static long kus() {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("total_sdcard_storage", 0L).longValue();
    }

    public static boolean fi(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[+-]?([0-9]|([1-9][0-9]*))(\\.[0-9]+)?").matcher(str).matches();
    }

    public static int yo(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i;
        }
        return 5;
    }

    public static boolean yo(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "Uv0Omg2oaM6Oad9UghSzLQ==", 1166);
            return false;
        }
    }

    public static void fi(Context context) {
        try {
            AtomicInteger atomicInteger = uq;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.dg.uq.kgy().rz();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "UuAkgTe9ZcyCS9RWqR+hKlfr", 1477);
            uq.set(2);
        }
    }

    public static int yo(Context context) {
        return yo(com.bytedance.sdk.component.utils.jpc.kgy(context, 0L));
    }

    public static int ahm(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        if (ioyVar == null) {
            return -1;
        }
        int iUju = ioyVar.uju();
        int i = 1;
        if (iUju == 1) {
            return 2;
        }
        if (iUju == 3) {
            return 4;
        }
        if (iUju != 5) {
            i = 7;
            if (iUju != 7) {
                return iUju != 8 ? -1 : 5;
            }
        }
        return i;
    }

    public static String ahm(int i) {
        if (i == 1) {
            return "embeded_ad_landingpage";
        }
        if (i == 2) {
            return "banner_ad_landingpage";
        }
        if (i == 3) {
            return "interaction_landingpage";
        }
        if (i == 4) {
            return "splash_ad_landingpage";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static boolean fi(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static long ahm(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "SO8rkDCoe86OTeNSoB6uLw==", 575);
            return 0L;
        }
    }

    public static long ahm(Context context) {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("total_internal_storage", 0L).longValue();
    }

    public static boolean kgy() {
        return (com.bytedance.sdk.openadsdk.core.vs.kgy() == null || com.bytedance.sdk.openadsdk.core.vs.kgy().uq()) ? false : true;
    }

    public static boolean kgy(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.ahm.kgy(context, intent, null);
                return true;
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "SPoshxeMYciOT+RenhSlJg==", 143);
            }
        }
        return false;
    }

    public static String kgy(int i) {
        if (i == 1) {
            return "embeded_ad";
        }
        if (i == 2) {
            return "banner_ad";
        }
        if (i == 3) {
            return "interaction";
        }
        if (i == 4) {
            return "open_ad";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static String ra() {
        return com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("total_memory", "0");
    }

    public static String kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        if (ioyVar == null) {
            return null;
        }
        try {
            return rz(ioyVar.uju());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5oQK7S96tS8NYnhihJHbrOZQ=", 205);
            return null;
        }
    }

    public static void kgy(@NonNull com.bytedance.sdk.openadsdk.core.model.ioy ioyVar, @NonNull View view) {
    }

    public static String kgy(Context context) {
        String strAhm = com.bytedance.sdk.openadsdk.core.rz.kgy().ahm("total_memory", (String) null);
        if (strAhm != null && ahm(strAhm) > 0) {
            return strAhm;
        }
        String strRz = rz("MemTotal");
        if (ahm(strRz) <= 0) {
            strRz = gf();
        }
        com.bytedance.sdk.openadsdk.core.rz.kgy().kgy("total_memory", strRz);
        return strRz;
    }

    public static String kgy(@NonNull String str, boolean z, boolean z2) {
        String strUm;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z2) {
            strUm = gm();
        } else {
            strUm = um();
        }
        if (TextUtils.isEmpty(strUm)) {
            strUm = "api16-access-ttp.tiktokpangle.us";
        }
        String strN = pv1.n("https://", strUm, str);
        if (!TextUtils.isEmpty(str) && (str.equals("/api/ad/union/sdk/compliance_status/") || str.equals("/api/ad/union/sdk/register_status/"))) {
            return strN;
        }
        if (vrj.kgy() && !z) {
            strN = vrj.kgy(strN);
        }
        return z ? kus(strN) : strN;
    }

    public static boolean uq(int i) {
        return i == 4;
    }

    public static String uq(String str) {
        return kgy(str, false, false);
    }

    public static boolean uq(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "Uv0MhQiVZ+OFSMJa", 1316);
            return false;
        }
    }

    public static boolean uq(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        return ioyVar != null && ioyVar.any() == 3 && ioyVar.fv() && (ioyVar.vw() == 4 || ioyVar.vw() == 5);
    }

    public static List<String> kgy(@NonNull String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        Set<String> setSa = com.bytedance.sdk.openadsdk.core.xh.uq().sa();
        if (setSa != null && !setSa.isEmpty()) {
            for (String str2 : setSa) {
                if (!TextUtils.isEmpty(str2)) {
                    String strN = pv1.n("https://", str2, str);
                    if (vrj.kgy() && !z) {
                        strN = vrj.kgy(strN);
                    }
                    if (z) {
                        strN = kus(strN);
                    }
                    arrayList.add(strN);
                }
            }
        }
        return arrayList;
    }

    public static void rz() {
        com.bytedance.sdk.openadsdk.dg.uq.kgy("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.utils.ftg.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", ftg.bmz());
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("recycle_version_not_valid").ahm(jSONObject.toString());
            }
        });
    }

    public static JSONObject kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar, long j, qe3 qe3Var) {
        if (ioyVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", ioyVar.wzd());
            jSONObject.put("buffers_time", j);
            bb3 bb3VarJw = ioyVar.jw();
            if (bb3VarJw != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, bb3VarJw.c);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, bb3VarJw.e);
            }
            kgy(jSONObject, qe3Var);
            return jSONObject;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5owq4bMihScNUgx8=", 1135);
            com.bytedance.sdk.component.utils.sx.kgy("TTAD.ToolUtils", "getVideoAction json error", e);
            return jSONObject;
        }
    }

    public static String rz(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i == 2) {
            return "interaction";
        }
        if (i == 3 || i == 4) {
            return "open_ad";
        }
        if (i == 7) {
            return "rewarded_video";
        }
        if (i != 8) {
            return "embeded_ad";
        }
        return "fullscreen_interstitial_ad";
    }

    public static String rz(@NonNull Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5thaue8KOXvtcgha1KVzr", 1046);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static boolean rz(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        if (ioyVar == null) {
            return true;
        }
        int iAhm = com.bytedance.sdk.openadsdk.core.xh.uq().ahm(ioyVar.ws());
        int iRz = com.bytedance.sdk.component.utils.um.rz(com.bytedance.sdk.openadsdk.core.xh.kgy());
        if (iAhm == 1) {
            return uq(iRz);
        }
        if (iAhm == 2) {
            return ct(iRz) || uq(iRz) || noq(iRz);
        }
        if (iAhm != 3) {
            return iAhm != 5 || uq(iRz) || noq(iRz);
        }
        return false;
    }

    private static void kgy(JSONObject jSONObject, qe3 qe3Var) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || qe3Var == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(qe3Var.uq()), Integer.valueOf(qe3Var.ct())));
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "WOYolgiKYMOFReVYnx6sPU/nIps=", 1151);
        }
    }

    public static void kgy(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !uq(context)) {
            return;
        }
        int length = str2.length();
        int i2 = 1;
        if (length % 3572 == 0) {
            i = length / 3572;
        } else {
            i = (length / 3572) + 1;
        }
        int i3 = 3572;
        int i4 = 0;
        while (i2 <= i) {
            if (i3 < length) {
                Log.d(str, i + "-" + i2 + ":" + str2.substring(i4, i3));
                i2++;
                i4 = i3;
                i3 += 3572;
            } else {
                Log.d(str, i + "-" + i2 + ":" + str2.substring(i4));
                return;
            }
        }
    }

    public static void kgy(StringBuilder sb, String str, String str2) {
        int iIndexOf;
        if (sb == null || TextUtils.isEmpty(str) || (iIndexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.ct kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar, com.bytedance.sdk.component.ra.fi fiVar, Context context, String str) {
        int iVw = ioyVar.vw();
        if (!ioyVar.fv()) {
            return null;
        }
        if (iVw != 1 && iVw != 3) {
            return null;
        }
        fiVar.kgy(true, (View) new com.bytedance.sdk.openadsdk.common.uq(context));
        return new com.bytedance.sdk.openadsdk.common.ct(ioyVar, fiVar, str, false);
    }

    public static void kgy(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairUq = com.bytedance.sdk.openadsdk.core.ra.uq("oem_store");
            int i = -1;
            if (pairUq != null && ((iIntValue = Integer.valueOf((String) pairUq.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairUq.second).longValue() < com.bytedance.sdk.openadsdk.lqi.ct.kgy("oem_store_state_time", 259200000))) {
                i = iIntValue;
            }
            jSONObject.put("oem_store", i);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "S/s5ugaxWtOPWNI=", 1550);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar, com.bytedance.sdk.component.ra.fi fiVar) {
        kgy(ioyVar, fiVar, false);
    }

    public static void kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar, com.bytedance.sdk.component.ra.fi fiVar, boolean z) {
        com.bytedance.sdk.component.ra.fi fiVar2;
        com.bytedance.sdk.openadsdk.core.model.fi fiVarJpc;
        List<Integer> list;
        if (ioyVar == null || fiVar == null) {
            return;
        }
        int iVw = ioyVar.vw();
        if (!ioyVar.fv() || (!(iVw == 2 || iVw == 3 || iVw == 5) || (fiVarJpc = ioyVar.jpc()) == null)) {
            fiVar2 = fiVar;
        } else {
            List<Integer> listCt = fiVarJpc.ct();
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (int i = 0; i < listCt.size(); i++) {
                    arrayList.add(Integer.valueOf(listCt.get(i).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listCt;
            }
            fiVar2 = fiVar;
            fiVar2.kgy(true, fiVarJpc.rz(), fiVarJpc.uq(), list, fiVarJpc.noq(), fiVarJpc.ahm());
        }
        int iIru = ioyVar.iru();
        long jUd = ioyVar.ud();
        if ((iIru == 1 || iIru == 2) && jUd > 0) {
            fiVar2.kgy(iIru, jUd);
        }
    }

    public static int kgy(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "XOs5thaue8KOXuJPgDiuLF72", 1643);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static JSONObject kgy(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
                return jSONObject;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+EimTaoYMuT", "Uv0ekBGqbNWiQ9NZhR+n", 1658);
            }
        }
        return jSONObject;
    }
}
