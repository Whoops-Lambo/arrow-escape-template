package com.bytedance.sdk.openadsdk.fpp.uq;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.ahm;
import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.h50;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> ahm;
    public static HashSet<String> kgy = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.fpp.uq.kgy.1
        {
            add(MBridgeConstans.APP_ID);
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static void rz(String str) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ahm;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(ahm(str))) == null) {
            return;
        }
        map.clear();
    }

    private static void ahm(Context context, String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        try {
            String strKgy = kgy(context, str, str2);
            if (ra.yo(strKgy)) {
                ahm.kgy(context, strKgy).ahm().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesKgy = kgy(context, strKgy);
            if (sharedPreferencesKgy != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesKgy.edit();
                editorEdit.remove(str2);
                editorEdit.apply();
                SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ahm;
                if (softReference != null && (concurrentHashMap = softReference.get()) != null && (map = concurrentHashMap.get(ahm(strKgy))) != null && map.size() != 0) {
                    map.remove(str2);
                }
            }
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTa95", "b9oelBW5QcKMWtJP", "SesgmhW5", 264);
        }
    }

    private static <T> void kgy(String str, String str2, T t) {
        String strKgy = kgy(xh.kgy(), str, str2);
        if (ra.yo(strKgy)) {
            if (!t.equals(ahm(strKgy, str2))) {
                ahm.rz rzVarAhm = ahm.kgy(xh.kgy(), ahm(strKgy)).ahm();
                kgy(rzVarAhm, str2, (Object) t);
                rzVarAhm.apply();
                ahm(strKgy, str2, t);
                return;
            }
            return;
        }
        SharedPreferences sharedPreferencesKgy = kgy(xh.kgy(), ahm(strKgy));
        if (sharedPreferencesKgy == null || t.equals(ahm(strKgy, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesKgy.edit();
        kgy(editorEdit, str2, t);
        editorEdit.apply();
        ahm(strKgy, str2, t);
    }

    private static boolean kgy() {
        return xh.kgy() == null;
    }

    public static String ahm(String str, String str2, String str3) {
        return kgy() ? str3 : kgy(xh.kgy(), ahm(str), str2, str3);
    }

    public static void kgy(String str, String str2, Boolean bool) {
        if (kgy()) {
            return;
        }
        kgy(ahm(str), str2, bool);
    }

    private static String ahm(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void kgy(String str, String str2, Long l) {
        if (kgy()) {
            return;
        }
        kgy(ahm(str), str2, l);
    }

    private static void ahm(Context context, String str) {
        String strKgy = kgy(xh.kgy(), str, "");
        if (ra.yo(strKgy)) {
            ahm.kgy(context, strKgy).ahm().clear().apply();
            rz(strKgy);
            return;
        }
        SharedPreferences sharedPreferencesKgy = kgy(context, strKgy);
        if (sharedPreferencesKgy == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesKgy.edit();
        editorEdit.clear();
        editorEdit.apply();
        rz(strKgy);
    }

    public static void kgy(String str, String str2, String str3) {
        if (kgy()) {
            return;
        }
        kgy(ahm(str), str2, str3);
    }

    public static void kgy(String str, String str2, Integer num) {
        if (kgy()) {
            return;
        }
        kgy(ahm(str), str2, num);
    }

    public static int kgy(String str, String str2, int i) {
        return kgy() ? i : kgy(xh.kgy(), ahm(str), str2, i);
    }

    private static int kgy(Context context, String str, String str2, int i) {
        String strKgy = kgy(context, str, str2);
        if (ra.yo(strKgy)) {
            return ahm.kgy(context, strKgy).kgy(str2, i);
        }
        SharedPreferences sharedPreferencesKgy = kgy(context, strKgy);
        if (sharedPreferencesKgy == null) {
            return i;
        }
        try {
            return sharedPreferencesKgy.getInt(str2, i);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTa95", "b9oelBW5QcKMWtJP", "XOs5vA2o", 146);
            return i;
        }
    }

    private static Object ahm(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ahm;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(ahm(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    public static boolean kgy(String str, String str2, boolean z) {
        return kgy() ? z : kgy(xh.kgy(), ahm(str), str2, z);
    }

    private static void ahm(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ahm;
        if (softReference == null || softReference.get() == null) {
            ahm = new SoftReference<>(new ConcurrentHashMap());
        }
        String strAhm = ahm(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = ahm.get();
        if (concurrentHashMap == null) {
            return;
        }
        Map<String, Object> map = concurrentHashMap.get(strAhm);
        if (map == null) {
            map = new HashMap<>();
            concurrentHashMap.put(strAhm, map);
        }
        map.put(str2, obj);
    }

    private static boolean kgy(Context context, String str, String str2, boolean z) {
        String strKgy = kgy(context, str, str2);
        if (ra.yo(strKgy)) {
            return ahm.kgy(context, strKgy).kgy(str2, z);
        }
        SharedPreferences sharedPreferencesKgy = kgy(context, strKgy);
        if (sharedPreferencesKgy == null) {
            return z;
        }
        try {
            return sharedPreferencesKgy.getBoolean(str2, z);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTa95", "b9oelBW5QcKMWtJP", "XOs5twyzZcKBRA==", 168);
            return z;
        }
    }

    public static long kgy(String str, String str2, long j) {
        return kgy() ? j : kgy(xh.kgy(), ahm(str), str2, j);
    }

    private static long kgy(Context context, String str, String str2, long j) {
        String strKgy = kgy(context, str, str2);
        if (ra.yo(strKgy)) {
            return ahm.kgy(context, strKgy).kgy(str2, j);
        }
        SharedPreferences sharedPreferencesKgy = kgy(context, strKgy);
        if (sharedPreferencesKgy == null) {
            return j;
        }
        try {
            return sharedPreferencesKgy.getLong(str2, j);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTa95", "b9oelBW5QcKMWtJP", "XOs5uQyybg==", 191);
            return j;
        }
    }

    private static String kgy(Context context, String str, String str2, String str3) {
        String strKgy = kgy(context, str, str2);
        if (ra.yo(strKgy)) {
            return ahm.kgy(context, strKgy).kgy(str2, str3);
        }
        SharedPreferences sharedPreferencesKgy = kgy(context, strKgy);
        if (sharedPreferencesKgy == null) {
            return str3;
        }
        try {
            return sharedPreferencesKgy.getString(str2, str3);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTa95", "b9oelBW5QcKMWtJP", "XOs5pheuYMmH", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);
            return str3;
        }
    }

    public static void kgy(String str, String str2) {
        if (kgy()) {
            return;
        }
        try {
            ahm(xh.kgy(), ahm(str), str2);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTa95", "b9oelBW5QcKMWtJP", "SesgmhW5", 231);
        }
    }

    public static void kgy(String str) {
        if (kgy()) {
            return;
        }
        try {
            ahm(xh.kgy(), ahm(str));
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTa95", "b9oelBW5QcKMWtJP", "WOIolBE=", 274);
        }
    }

    private static String kgy(Context context, String str, String str2) {
        if (kgy.contains(str2)) {
            str = "pag_sp_bad_par";
        }
        if (gm.kgy(context)) {
            return str;
        }
        StringBuilder sbQ = h50.q(str, "_");
        sbQ.append(gm.rz(context));
        return sbQ.toString();
    }

    @Nullable
    public static SharedPreferences kgy(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(ahm(str), 0);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTa95", "b9oelBW5QcKMWtJP", "XOs5pjM=", 373);
            sx.rz("TTAD.TTSaveHelper", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void kgy(ahm.rz rzVar, String str, T t) {
        if (t instanceof Integer) {
            rzVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            rzVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            rzVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            rzVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            rzVar.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void kgy(SharedPreferences.Editor editor, String str, T t) {
        if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            editor.putString(str, (String) t);
        }
    }
}
