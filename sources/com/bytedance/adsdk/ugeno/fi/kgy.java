package com.bytedance.adsdk.ugeno.fi;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4664b4;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0192kgy {
        public int[] ahm;
        public GradientDrawable.Orientation kgy;
        public float[] rz;
    }

    public static C0192kgy ahm(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iKgy = kgy(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0192kgy c0192kgy = new C0192kgy();
            c0192kgy.kgy = uq(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iKgy];
            float[] fArr = new float[iKgy];
            for (int i = 0; i < iKgy; i++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i] = kgy(strTrim.substring(0, iIndexOf3).trim());
                fArr[i] = rz.kgy(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 100.0f;
                int i2 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i2) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i2);
            }
            if (iKgy < 2) {
                return null;
            }
            c0192kgy.ahm = iArr;
            c0192kgy.rz = fArr;
            return c0192kgy;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static GradientDrawable.Orientation uq(String str) {
        try {
            int i = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            if (i == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            return i == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int kgy(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(C4664b4.i.T)) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i2 = 1; i2 < charArray.length; i2++) {
                    sb.append(charArray[i2]);
                    sb.append(charArray[i2]);
                }
                return Color.parseColor(sb.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i;
    }

    public static boolean rz(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("linear-gradient")) {
            return false;
        }
        return true;
    }

    public static int kgy(String str) {
        return kgy(str, -16777216);
    }

    public static int kgy(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    public static int kgy(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i2 = 255;
        }
        return (i & 16777215) | (i2 << 24);
    }
}
