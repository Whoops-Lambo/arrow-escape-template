package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import com.singular.sdk.internal.Constants;
import defpackage.pv1;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0220kgy {
        static final Random kgy = kgy.rz();
    }

    public static JSONObject kgy(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                String strAhm = ahm(str);
                if (TextUtils.isEmpty(strAhm)) {
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                }
                jSONObject.put("message", strAhm);
                jSONObject.put("cypher", 3);
                return jSONObject;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "esseoBe1ZdQ=", "XuAuhxqsffSUWPVSiAiXIU/mDrcg", 64);
                try {
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                } catch (Throwable th2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "esseoBe1ZdQ=", "XuAuhxqsffSUWPVSiAiXIU/mDrcg", 68);
                    th2.getMessage();
                }
            }
        }
        return jSONObject;
    }

    public static String ahm(String str) {
        String strKgy;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strKgy2 = kgy();
        String strKgy3 = kgy(strKgy2, 32);
        String strAhm = ahm();
        if (strKgy3 != null && strAhm != null) {
            strKgy = com.bytedance.sdk.component.ct.kgy.kgy(str, strAhm, strKgy3);
        } else {
            strKgy = null;
        }
        return pv1.o(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET, strKgy2, strAhm, strKgy);
    }

    public static String rz(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 49) {
            String strKgy = kgy(str.substring(1, 33), 32);
            String strSubstring = str.substring(33, 49);
            if (strKgy != null) {
                return com.bytedance.sdk.component.ct.kgy.ahm(str.substring(49), strSubstring, strKgy);
            }
            return str;
        }
        return str;
    }

    public static String ahm() {
        String strKgy = kgy(8);
        if (strKgy == null || strKgy.length() != 16) {
            return null;
        }
        return strKgy;
    }

    public static Random rz() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "esseoBe1ZdQ=", "XOs5pwKybciNY9lOmBCuK14=", 180);
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static JSONObject kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return kgy(jSONObject.toString());
    }

    public static String kgy() {
        String strKgy = kgy(16);
        if (strKgy == null || strKgy.length() != 32) {
            return null;
        }
        return strKgy;
    }

    public static String kgy(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i).concat(str.substring(0, i2));
    }

    public static String kgy(int i) {
        try {
            byte[] bArr = new byte[i];
            C0220kgy.kgy.nextBytes(bArr);
            return ct.kgy(bArr);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "esseoBe1ZdQ=", "S/wikRa/bPWBRNNSgSK0Og==", 170);
            return null;
        }
    }
}
