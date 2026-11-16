package com.bytedance.sdk.openadsdk.dg;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.lqi.ct;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    private static volatile boolean ct;
    private static volatile boolean rz;
    private static final HashMap<String, Integer> kgy = new HashMap<>();
    private static volatile int ahm = 10000;
    private static volatile boolean uq = true;

    public static int ahm(String str, int i) {
        if (rz) {
            return 0;
        }
        if (!ct) {
            return i;
        }
        Integer numValueOf = kgy.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i);
        }
        return numValueOf.intValue();
    }

    public static void kgy() {
        String strKgy = ct.kgy("stats_control", "");
        if (!TextUtils.isEmpty(strKgy)) {
            try {
                JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(strKgy);
                ahm = jSONObjectJsonObjectInit.optInt("sampling_def", 10000);
                String strOptString = jSONObjectJsonObjectInit.optString("sampling");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObjectJsonObjectInit2 = PangleNetworkBridge.jsonObjectInit(strOptString);
                    Iterator<String> itKeys = jSONObjectJsonObjectInit2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        kgy.put(next, Integer.valueOf(jSONObjectJsonObjectInit2.optInt(next, ahm)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        uq = false;
        rz = false;
        if (ahm == 10000 && kgy.isEmpty()) {
            uq = true;
        } else if (ahm == 0 && kgy.isEmpty()) {
            rz = true;
        }
        ct = true;
    }

    public static boolean ahm() {
        return rz;
    }

    public static boolean kgy(String str, int i) {
        if (uq || !ct) {
            return true;
        }
        if (rz) {
            return false;
        }
        if (i < 0) {
            i = ahm;
        }
        Integer numValueOf = kgy.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf.intValue() <= 0) {
            return false;
        }
        return numValueOf.intValue() >= 10000 || ((int) ((Math.random() * 10000.0d) + 1.0d)) <= numValueOf.intValue();
    }
}
