package com.safedk.android.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class e {
    private static final String a = "MemoryUtils";
    private static final int b = 5000;
    private static final double c = 1.5d;
    private static final double d = 2.0d;
    private static final long e = 1024;
    private static final long f = 1048576;
    private static final long g = 1073741824;
    private static final long h = 1099511627776L;
    private static final long i = 1125899906842624L;
    private static final long j = 1152921504606846976L;
    private static long k = 0;
    private static final a l = new a();
    private static final Object m = new Object();
    private static final long n = 33554432;
    private static final long o = 67108864;

    public static long a(Context context) {
        return Runtime.getRuntime().freeMemory();
    }

    public static String a() {
        try {
            return a(a(Environment.getDataDirectory()));
        } catch (Throwable th) {
            Logger.e(a, "error in getHumanReadableFreeInternalMemory()");
            return "";
        }
    }

    public static long b() {
        return a(Environment.getDataDirectory());
    }

    private static long a(File file) {
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            return Build.VERSION.SDK_INT >= 18 ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            Logger.e(a, "error in getAvailableMemoryInPath");
            return 0L;
        }
    }

    public static String a(long j2) {
        if (j2 < 1024) {
            return a(j2) + " byte";
        }
        if (j2 >= 1024 && j2 < f) {
            return a(j2 / 1024.0d) + " Kb";
        }
        if (j2 >= f && j2 < g) {
            return a(j2 / 1048576.0d) + " Mb";
        }
        if (j2 >= g && j2 < h) {
            return a(j2 / 1.073741824E9d) + " Gb";
        }
        if (j2 >= h && j2 < i) {
            return a(j2 / 1.099511627776E12d) + " Tb";
        }
        if (j2 >= i && j2 < j) {
            return a(j2 / 1.125899906842624E15d) + " Pb";
        }
        if (j2 < j) {
            return "???";
        }
        return a(j2 / 1.152921504606847E18d) + " Eb";
    }

    private static String a(double d2) {
        return new DecimalFormat("#.##").format(d2);
    }

    public static long c() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }

    public static void a(String str) {
        String strA = a(str.getBytes().length);
        String strA2 = a(c());
        Logger.d(a, "loaded from prefs: ", strA);
        Logger.d(a, "available heap size: ", strA2);
        if (b(SafeDK.getInstance().m())) {
            Logger.e(a, "android low memory!");
        }
    }

    public static void b(String str) {
        String strA = a(str.getBytes().length);
        String strA2 = a(c());
        Logger.d(a, "saved in prefs: ", strA);
        boolean zB = b(SafeDK.getInstance().m());
        Logger.d(a, "available heap size: ", strA2);
        if (zB) {
            Logger.e(a, "android low memory!");
        }
    }

    public static void a(Map<?, ?> map, String str) {
        char c2;
        char c3;
        Throwable th;
        if (map == null || map.isEmpty()) {
            return;
        }
        String string = UUID.randomUUID().toString();
        try {
            String strA = a(map);
            if (!CreativeInfoManager.a(strA, AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true)) {
                try {
                    Logger.d(a, "clear CIs from memory, don't clean on CI expiration, sdk: ", strA);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    c2 = 2;
                    c3 = 1;
                }
            } else {
                long jA = CreativeInfoManager.a(strA, AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_THRESHOLD, SafeDK.getInstance().U());
                long jA2 = CreativeInfoManager.a(strA, AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, 1200000L);
                long jA3 = CreativeInfoManager.a(strA, AdNetworkConfiguration.BANNER_CI_MAX_AGE, 600000L);
                Logger.d(a, "clear CIs from memory for ", str, ", map size:", Integer.valueOf(map.size()), ", sdk: ", strA, ", threshold: ", Long.valueOf(jA), ", fullscreen max age: ", Long.valueOf(jA2), ", banner max age: ", Long.valueOf(jA3));
                c3 = 1;
                c2 = 2;
                try {
                    Map<BrandSafetyUtils.AdType, Integer> mapA = a(map, str, jA, jA2, jA3, string);
                    for (BrandSafetyUtils.AdType adType : mapA.keySet()) {
                        Integer num = mapA.get(adType);
                        if (num != null && num.intValue() > jA) {
                            a(adType, map, str, jA, string);
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            c2 = 2;
            c3 = 1;
        }
        th = th;
        Object[] objArr = new Object[5];
        objArr[0] = "Exception in clear CIs from memory ";
        objArr[c3] = string;
        objArr[c2] = " for ";
        objArr[3] = str;
        objArr[4] = th;
        Logger.d(a, objArr);
    }

    private static String a(Map<?, ?> map) {
        CreativeInfo creativeInfoA;
        if (map != null && !map.isEmpty() && map.values().iterator().hasNext() && (creativeInfoA = a(map.values().iterator().next())) != null) {
            return creativeInfoA.Q();
        }
        return null;
    }

    private static Map<BrandSafetyUtils.AdType, Integer> a(Map<?, ?> map, String str, long j2, long j3, long j4, String str2) {
        char c2;
        int i2;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (map) {
            Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
            while (true) {
                c2 = 0;
                i2 = 1;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<?, ?> next = it.next();
                CreativeInfo creativeInfoA = a(next.getValue());
                if (creativeInfoA != null) {
                    BrandSafetyUtils.AdType adTypeK = creativeInfoA.K();
                    Integer num = (Integer) map2.get(adTypeK);
                    if (num == null) {
                        num = 0;
                    }
                    map2.put(adTypeK, Integer.valueOf(num.intValue() + 1));
                    if (creativeInfoA.ac() + (adTypeK == BrandSafetyUtils.AdType.INTERSTITIAL ? j3 : j4) < jElapsedRealtime) {
                        List arrayList = (List) map3.get(adTypeK);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map3.put(adTypeK, arrayList);
                        }
                        arrayList.add(next.getKey());
                    }
                }
            }
        }
        char c3 = 2;
        char c4 = 3;
        Logger.d(a, "clear CIs from memory (expired) ", str2, ", total CI counts: ", map2);
        for (BrandSafetyUtils.AdType adType : map3.keySet()) {
            Integer num2 = (Integer) map2.get(adType);
            if (num2 != null && num2.intValue() > j2) {
                Object[] objArr = new Object[8];
                objArr[c2] = "clear CIs from memory (expired) ";
                objArr[i2] = str2;
                objArr[c3] = " for ";
                objArr[c4] = str;
                objArr[4] = ", type:";
                objArr[5] = adType;
                objArr[6] = ", total count: ";
                objArr[7] = num2;
                Logger.d(a, objArr);
                long jIntValue = ((long) num2.intValue()) - j2;
                List list = (List) map3.get(adType);
                if (list != null) {
                    Integer num3 = num2;
                    int i3 = 0;
                    while (i3 < jIntValue && i3 < list.size()) {
                        Object obj = list.get(i3);
                        synchronized (map) {
                            if (map.remove(obj) != null) {
                                Integer numValueOf = Integer.valueOf(num3.intValue() - i2);
                                map2.put(adType, numValueOf);
                                Logger.d(a, "clear CIs from memory (expired) ", str2, ", removing item with key: ", obj, ", remaining items: ", numValueOf);
                                num3 = numValueOf;
                            }
                        }
                        i3++;
                        i2 = 1;
                    }
                } else {
                    continue;
                }
            }
            c4 = 3;
            c2 = 0;
            i2 = 1;
            c3 = 2;
        }
        return map2;
    }

    private static void a(BrandSafetyUtils.AdType adType, Map<?, ?> map, String str, long j2, String str2) {
        Map<Long, List<Object>> mapA = a(map, adType, str2);
        int iB = b(mapA, str2);
        long j3 = iB;
        if (j3 > j2) {
            long j4 = j3 - j2;
            if (j4 > 0) {
                ArrayList arrayList = new ArrayList(mapA.keySet());
                Collections.sort(arrayList);
                Logger.d(a, "clear CIs from memory (oldest) ", str2, " for ", str, ", type:", adType, ", total count: ", Integer.valueOf(iB));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List<Object> list = mapA.get((Long) it.next());
                    if (list != null) {
                        for (Object obj : list) {
                            if (map.containsKey(obj)) {
                                synchronized (map) {
                                    map.remove(obj);
                                }
                                iB--;
                                Logger.d(a, "clear CIs from memory (oldest) ", str2, ", removing item with key: ", obj, ", remaining items: ", Integer.valueOf(iB));
                                long j5 = j4 - 1;
                                if (j5 <= 0) {
                                    return;
                                } else {
                                    j4 = j5;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static CreativeInfo a(Object obj) {
        if (obj instanceof CreativeInfo) {
            return (CreativeInfo) obj;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                return (CreativeInfo) list.get(0);
            }
        }
        return null;
    }

    private static int b(Map<Long, List<Object>> map, String str) {
        int size;
        if (map != null) {
            Iterator<List<Object>> it = map.values().iterator();
            size = 0;
            while (it.hasNext()) {
                size += it.next().size();
            }
        } else {
            size = 0;
        }
        if (size > 0) {
            Logger.d(a, "clear CIs from memory (oldest) ", str, ", total values in TS map: ", Integer.valueOf(size));
        }
        return size;
    }

    private static Map<Long, List<Object>> a(Map<?, ?> map, BrandSafetyUtils.AdType adType, String str) {
        HashMap map2 = new HashMap();
        synchronized (map) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                CreativeInfo creativeInfoA = a(entry.getValue());
                if (creativeInfoA != null && ((creativeInfoA.K() == null && adType == null) || (creativeInfoA.K() != null && creativeInfoA.K().equals(adType)))) {
                    List arrayList = (List) map2.get(Long.valueOf(creativeInfoA.ag()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map2.put(Long.valueOf(creativeInfoA.ag()), arrayList);
                    }
                    arrayList.add(entry.getKey());
                }
            }
        }
        if (!map2.isEmpty()) {
            Object[] objArr = new Object[6];
            objArr[0] = "clear CIs from memory (oldest) ";
            objArr[1] = str;
            objArr[2] = ", total keys in TS map: ";
            objArr[3] = Integer.valueOf(map2.size());
            objArr[4] = ", adType: ";
            objArr[5] = adType != null ? adType.name() : "null";
            Logger.d(a, objArr);
        }
        return map2;
    }

    public static boolean a(com.safedk.android.analytics.brandsafety.c cVar) {
        if (b(SafeDK.getInstance().m())) {
            cVar.b(com.safedk.android.analytics.brandsafety.m.H, new com.safedk.android.analytics.brandsafety.m.a("lvl", com.safedk.android.analytics.brandsafety.m.ab));
            return true;
        }
        if (d()) {
            cVar.b(com.safedk.android.analytics.brandsafety.m.H, new com.safedk.android.analytics.brandsafety.m.a("lvl", "low"));
        } else if (e()) {
            cVar.b(com.safedk.android.analytics.brandsafety.m.H, new com.safedk.android.analytics.brandsafety.m.a("lvl", com.safedk.android.analytics.brandsafety.m.Z));
        }
        return false;
    }

    public static boolean d() {
        a.b(SafeDK.getInstance().m());
        return (l.a != null && ((double) l.a.availMem) < ((double) l.a.threshold) * c) || l();
    }

    public static boolean e() {
        a.b(SafeDK.getInstance().m());
        return (l.a != null && ((double) l.a.availMem) < ((double) l.a.threshold) * d) || l();
    }

    @SuppressLint({"NewApi"})
    public static String f() {
        if (l.a != null) {
            return "{ available=" + a(l.a.availMem) + ", total=" + a(l.a.totalMem) + ", threshold=" + a(l.a.threshold) + ", app heap free mem =" + a(l.b) + " }";
        }
        return "{ }";
    }

    private static String a(Timestamp timestamp) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(timestamp.getTime()));
    }

    public static String b(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) new Date(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long j() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (jMaxMemory < 0) {
            return 0L;
        }
        return jMaxMemory;
    }

    private static boolean k() {
        long j2 = j();
        if (j2 >= n) {
            return false;
        }
        Logger.d(a, "app heap free mem critical : ", a(j2));
        return true;
    }

    private static boolean l() {
        long j2 = j();
        if (j2 >= o || j2 < n) {
            return false;
        }
        Logger.d(a, "app heap free mem low : ", a(j2));
        return true;
    }

    public static boolean b(Context context) {
        a.b(context);
        return (l.a != null && l.a.lowMemory) || k();
    }

    public static class a {
        public ActivityManager.MemoryInfo a = null;
        public long b;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - e.k > 5000 && SafeDK.getInstance() != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                e.l.a = memoryInfo;
                long unused = e.k = jElapsedRealtime;
                e.l.b = e.j();
                if (memoryInfo.lowMemory) {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "critical RAM memory level reached: ", e.f());
                    return;
                }
                if (memoryInfo.availMem < memoryInfo.threshold * e.c) {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "low RAM memory level reached: ", e.f());
                    return;
                }
                if (memoryInfo.availMem < memoryInfo.threshold * e.d) {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "medium RAM memory level reached: ", e.f());
                } else if (e.l.b < e.n) {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "critical app-heap: avail app heap=", e.f());
                } else {
                    Logger.d(e.a, Logger.FeatureTag.MEMORY_LOAD, "update memory info: ", e.f());
                }
            }
        }
    }
}
