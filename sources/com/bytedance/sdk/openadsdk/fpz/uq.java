package com.bytedance.sdk.openadsdk.fpz;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.dg;
import com.bytedance.sdk.openadsdk.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class uq {
    private static volatile Pattern ahm;
    private static volatile Pattern ct;
    private static volatile String[] kgy;
    private static volatile Pattern noq;
    private static volatile Pattern rz;
    private static volatile Pattern uq;
    private static final String[] yo = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.bytedance.overseas.sdk", "com.bykv.vk", "com.pgl.ssdk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
    private static final String[] fi = {"java.", "javax.", "android.", "androidx.", "com.android.", "dalvik.", "kotlin.", "kotlinx.", "sun.", "libcore.", "org."};

    private static int kgy(List<Integer> list, boolean[] zArr, int i) {
        int i2;
        if (list != null) {
            try {
                if (!list.isEmpty() && zArr != null && i > 0) {
                    boolean[] zArr2 = new boolean[zArr.length];
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : list) {
                        int iIntValue = num.intValue();
                        if (iIntValue >= 0 && iIntValue < zArr.length && !zArr2[iIntValue]) {
                            zArr2[iIntValue] = true;
                            arrayList.add(num);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return 0;
                    }
                    if (zArr[0]) {
                        i2 = 0;
                    } else {
                        zArr[0] = true;
                        i2 = 1;
                    }
                    if (arrayList.size() > i) {
                        for (int iMax = Math.max(1, arrayList.size() - (i - 1)); iMax < arrayList.size(); iMax++) {
                            int iIntValue2 = ((Integer) arrayList.get(iMax)).intValue();
                            if (!zArr[iIntValue2]) {
                                zArr[iIntValue2] = true;
                                i2++;
                            }
                        }
                        return i2;
                    }
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        int iIntValue3 = ((Integer) obj).intValue();
                        if (!zArr[iIntValue3]) {
                            zArr[iIntValue3] = true;
                            i2++;
                        }
                    }
                    return i2;
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    private static Pattern noq() {
        try {
            Pattern pattern = noq;
            if (pattern != null) {
                return pattern;
            }
            Pattern patternCompile = Pattern.compile("@[0-9a-fA-F]+");
            noq = patternCompile;
            return patternCompile;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Pattern uq() {
        try {
            Pattern pattern = uq;
            if (pattern != null) {
                return pattern;
            }
            Pattern patternCompile = Pattern.compile("\\b(?=[A-Za-z0-9_-]{8,}\\b)(?=[A-Za-z0-9_-]*\\d)(?=[A-Za-z0-9_-]*[A-Za-z])[A-Za-z0-9_-]+\\b");
            uq = patternCompile;
            return patternCompile;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String ahm(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strTrim = str.trim();
            Pattern patternAhm = ahm();
            if (patternAhm != null) {
                strTrim = patternAhm.matcher(strTrim).replaceAll("{id}");
            }
            Pattern patternRz = rz();
            if (patternRz != null) {
                strTrim = patternRz.matcher(strTrim).replaceAll("{id}");
            }
            Pattern patternUq = uq();
            if (patternUq != null) {
                strTrim = patternUq.matcher(strTrim).replaceAll("{id}");
            }
            Pattern patternNoq = noq();
            if (patternNoq != null) {
                strTrim = patternNoq.matcher(strTrim).replaceAll("@{id}");
            }
            Pattern patternCt = ct();
            if (patternCt != null) {
                return patternCt.matcher(strTrim).replaceAll("{num}");
            }
            return strTrim;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String ct(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            int iIndexOf = str.indexOf(40);
            if (iIndexOf > 0) {
                str = str.substring(0, iIndexOf);
            }
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf <= 0) {
                return "";
            }
            return str.substring(0, iLastIndexOf);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String rz(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strTrim = str.trim();
            if (!strTrim.startsWith("at ")) {
                return "";
            }
            String strSubstring = strTrim.substring(3);
            int iIndexOf = strSubstring.indexOf(40);
            int iLastIndexOf = strSubstring.lastIndexOf(41);
            if (iIndexOf > 0 && iLastIndexOf > iIndexOf) {
                String strSubstring2 = strSubstring.substring(0, iIndexOf);
                String strSubstring3 = strSubstring.substring(iIndexOf + 1, iLastIndexOf);
                int iIndexOf2 = strSubstring3.indexOf(58);
                if (iIndexOf2 >= 0) {
                    strSubstring3 = strSubstring3.substring(0, iIndexOf2);
                }
                return strSubstring2 + "(" + strSubstring3 + ")";
            }
            return strSubstring;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean noq(String str) {
        return ahm(str, fi);
    }

    private static String uq(String str) {
        return ct(rz(str));
    }

    private static Pattern ct() {
        try {
            Pattern pattern = ct;
            if (pattern != null) {
                return pattern;
            }
            Pattern patternCompile = Pattern.compile("\\b\\d+\\b");
            ct = patternCompile;
            return patternCompile;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void ahm(boolean[] zArr, int i, int i2) {
        if (zArr != null) {
            try {
                if (zArr.length != 0 && i < i2) {
                    while (i < i2) {
                        int iKgy = kgy(zArr);
                        if (iKgy < 0) {
                            return;
                        }
                        zArr[iKgy] = true;
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String ahm(String[] strArr, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            int iMin = Math.min(i, strArr.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(strArr[i2]);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static Pattern rz() {
        try {
            Pattern pattern = rz;
            if (pattern != null) {
                return pattern;
            }
            Pattern patternCompile = Pattern.compile("\\b[0-9a-fA-F]{8,}\\b");
            rz = patternCompile;
            return patternCompile;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String ahm(String str, int i) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "full stack empty";
            }
            return kgy(str, i);
        } catch (Throwable unused) {
            return "getStackTrace error";
        }
    }

    private static boolean ahm(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length != 0) {
            try {
                for (String str2 : strArr) {
                    if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static Pattern ahm() {
        try {
            Pattern pattern = ahm;
            if (pattern != null) {
                return pattern;
            }
            Pattern patternCompile = Pattern.compile("\\b[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\\b");
            ahm = patternCompile;
            return patternCompile;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String kgy(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String stackTraceString = Log.getStackTraceString(th);
            return !TextUtils.isEmpty(stackTraceString) ? stackTraceString : th.toString();
        } catch (Throwable unused) {
            return "get full stack error";
        }
    }

    public static String kgy(Throwable th, String str) {
        if (th != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    String strKgy = dg.kgy(th.getClass().getSimpleName() + '\n' + ahm(th.getMessage()) + '\n' + kgy(str.split("\\r?\\n")));
                    return strKgy == null ? "" : strKgy;
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    private static String kgy(String[] strArr, int i) {
        if (strArr != null) {
            try {
                if (strArr.length != 0 && i > 0) {
                    String[] strArrKgy = kgy();
                    boolean[] zArr = new boolean[strArr.length];
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    arrayList.add(0);
                    for (int i2 = 1; i2 < strArr.length; i2++) {
                        String str = strArr[i2];
                        if (kgy(str)) {
                            arrayList.add(Integer.valueOf(i2));
                            int i3 = i2 + 1;
                            kgy(zArr, i3, i3);
                        }
                        if (kgy(str, strArrKgy)) {
                            arrayList.add(Integer.valueOf(i2));
                            kgy(zArr, i2 - 1, i2 + 2);
                            z = true;
                        }
                    }
                    if (!z) {
                        return "";
                    }
                    boolean[] zArr2 = new boolean[strArr.length];
                    int iKgy = kgy(arrayList, zArr2, i);
                    if (iKgy >= i) {
                        return kgy(strArr, zArr2);
                    }
                    for (int i4 = 1; i4 < strArr.length && iKgy < i; i4++) {
                        if (zArr[i4] && !zArr2[i4]) {
                            zArr2[i4] = true;
                            iKgy++;
                        }
                    }
                    ahm(zArr2, iKgy, i);
                    return kgy(strArr, zArr2);
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return "";
    }

    public static String kgy(String str, int i) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "fullStack is empty";
            }
            String[] strArrSplit = str.split("\\r?\\n");
            if (i <= 0) {
                i = 20;
            }
            if (strArrSplit.length <= i) {
                return str.trim();
            }
            String strKgy = kgy(strArrSplit, i);
            return !TextUtils.isEmpty(strKgy) ? strKgy : ahm(strArrSplit, i);
        } catch (Throwable unused) {
            return "extractStackTrace error";
        }
    }

    private static void kgy(boolean[] zArr, int i, int i2) {
        if (zArr != null) {
            try {
                if (zArr.length == 0) {
                    return;
                }
                int iMin = Math.min(zArr.length - 1, i2);
                for (int iMax = Math.max(1, i); iMax <= iMin; iMax++) {
                    zArr[iMax] = true;
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static int kgy(boolean[] zArr) {
        int iKgy;
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            try {
                if (!zArr[i3] && ((iKgy = kgy(zArr, i3)) < i || (iKgy == i && i3 > i2))) {
                    i2 = i3;
                    i = iKgy;
                }
            } catch (Throwable unused) {
                return -1;
            }
        }
        return i2;
    }

    private static int kgy(boolean[] zArr, int i) {
        int iMin = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            try {
                if (zArr[i2]) {
                    iMin = Math.min(iMin, Math.abs(i2 - i));
                }
            } catch (Throwable unused) {
                return Integer.MAX_VALUE;
            }
        }
        return iMin;
    }

    private static boolean kgy(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("Caused by:");
    }

    private static boolean kgy(String str, String[] strArr) {
        try {
            if (!TextUtils.isEmpty(str) && strArr != null && strArr.length != 0) {
                return ahm(uq(str), strArr);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static String[] kgy() {
        try {
            String[] strArr = kgy;
            if (strArr != null) {
                return strArr;
            }
            JSONObject jSONObjectKgy = rz.kgy();
            if (jSONObjectKgy == null) {
                return yo;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectKgy.optJSONArray("pkg_prefix_list");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i, "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        arrayList.add(strOptString);
                    }
                }
                if (!arrayList.isEmpty()) {
                    String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                    kgy = strArr2;
                    return strArr2;
                }
            }
            return yo;
        } catch (Throwable unused) {
        }
    }

    private static String kgy(String[] strArr, boolean[] zArr) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                if (zArr[i]) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(strArr[i]);
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0004, B:7:0x0009, B:8:0x0014, B:10:0x0017, B:12:0x0023, B:15:0x002f, B:18:0x0036, B:20:0x003c, B:22:0x0042, B:23:0x0047, B:24:0x004a, B:25:0x004d), top: B:29:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0004, B:7:0x0009, B:8:0x0014, B:10:0x0017, B:12:0x0023, B:15:0x002f, B:18:0x0036, B:20:0x003c, B:22:0x0042, B:23:0x0047, B:24:0x004a, B:25:0x004d), top: B:29:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x004d A[EDGE_INSN: B:32:0x004d->B:25:0x004d BREAK  A[LOOP:0: B:8:0x0014->B:24:0x004a], SYNTHETIC] */
    private static String kgy(String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length > 1) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArrKgy = kgy();
                    boolean z = false;
                    for (int i = 1; i < strArr.length; i++) {
                        String strRz = rz(strArr[i]);
                        if (!TextUtils.isEmpty(strRz)) {
                            String strCt = ct(strRz);
                            if (TextUtils.isEmpty(strCt)) {
                                continue;
                            } else if (!z) {
                                if (ahm(strCt, strArrKgy)) {
                                    z = true;
                                    if (!noq(strCt)) {
                                        break;
                                        break;
                                    }
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(strRz);
                                } else {
                                    continue;
                                }
                            } else {
                                if (!noq(strCt)) {
                                    break;
                                }
                                if (sb.length() > 0) {
                                    sb.append('\n');
                                }
                                sb.append(strRz);
                            }
                        }
                    }
                    return sb.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }
}
