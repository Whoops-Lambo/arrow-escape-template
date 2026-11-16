package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.d;
import defpackage.n30;
import defpackage.pv1;
import defpackage.vq2;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class StringUtils {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public static String toFullSHA1Hash(String str) {
        return a(str, -1);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i) {
        return createSpannedString(str, i, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i) {
        return createSpannedString(str, i, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i, int i2, int i3) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i3), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static String join(CharSequence charSequence, List<?> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(charSequence);
        }
        sb.delete(sb.length() - charSequence.length(), sb.length());
        return sb.toString();
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 == null) {
            d.r("No replacement target specified");
            return null;
        }
        if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int iIndexOf = sb.indexOf(str2);
        while (iIndexOf != -1) {
            sb.replace(iIndexOf, str2.length() + iIndexOf, str3);
            iIndexOf = sb.indexOf(str2, str3.length() + iIndexOf);
        }
        return sb.toString();
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            d.r("No data specified");
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            char[] cArr2 = a;
            byte b = bArr[i];
            cArr[i2] = cArr2[(b & 240) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String toHttpsString(String str) {
        return str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v) ? str.replace(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v, "https://") : str;
    }

    public static String toShortSHA1Hash(String str) {
        return a(str, 16);
    }

    private static String a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(str.getBytes("UTF-8"));
            String hexString = toHexString(messageDigest.digest());
            if (num.intValue() > 0) {
                return hexString.substring(0, Math.min(num.intValue(), hexString.length()));
            }
            return hexString;
        } catch (Throwable th) {
            vq2.n(pv1.n("SHA-1 for \"", str, "\" failed."), th);
            return null;
        }
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            spannable.setSpan(clickableSpan, iStart, iEnd, 33);
            if (z) {
                spannable.setSpan(new StyleSpan(1), iStart, iEnd, 256);
            }
        }
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter(str2, str3);
            return builderBuildUpon.build().toString();
        }
        return str;
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z) {
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            if (z) {
                TreeMap treeMap = new TreeMap(new a());
                treeMap.putAll(map);
                map = treeMap;
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return builderBuildUpon.build().toString();
        }
        return str;
    }

    public static boolean containsAtLeastOneSubstring(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        if (isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static String defaultIfEmpty(String str, String str2) {
        if (isValidString(str)) {
            return str;
        }
        return str2;
    }

    public static String encodeUriString(String str) {
        if (isValidString(str)) {
            return Uri.encode(str);
        }
        return "";
    }

    public static Boolean endsWith(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = Uri.parse(str);
        if (uri.getHost() == null) {
            return "";
        }
        return uri.getHost();
    }

    public static String getHostAndPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = Uri.parse(str);
        return n30.m(emptyIfNull(uri.getHost()), emptyIfNull(uri.getPath()));
    }

    public static List<String> getRegexMatches(Matcher matcher, int i) {
        matcher.reset();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String strGroup = matcher.group(i);
            if (isValidString(strGroup)) {
                arrayList.add(strGroup);
            }
        }
        return arrayList;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '-' && cCharAt != '+') {
            i = 0;
        } else {
            i = 1;
        }
        int length = str.length();
        if (i == 1 && length == 1) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static Matcher match(String str, String str2) {
        return Pattern.compile(str2).matcher(str);
    }

    public static float parseFloat(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f;
        }
    }

    public static int parseInt(String str, int i) {
        if (isNumeric(str)) {
            return Integer.parseInt(str);
        }
        return i;
    }

    public static long parseLong(String str, long j) {
        if (isNumeric(str)) {
            return Long.parseLong(str);
        }
        return j;
    }

    public static String prefixToIndex(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.substring(0, Math.min(i, str.length()));
    }

    public static void replaceAll(StringBuffer stringBuffer, String str, String str2) {
        if (!TextUtils.isEmpty(stringBuffer) && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                int iIndexOf = stringBuffer.indexOf(str);
                while (iIndexOf != -1) {
                    stringBuffer.replace(iIndexOf, str.length() + iIndexOf, str2);
                    iIndexOf = stringBuffer.indexOf(str, str2.length() + iIndexOf);
                }
                return;
            }
            d.r("No replacement target specified");
        }
    }

    public static boolean startsWithAtLeastOnePrefix(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\.");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (isValidString(str2)) {
                for (String str3 : str2.split("[^0-9]+")) {
                    if (isValidString(str3)) {
                        arrayList.add(str3);
                        break;
                    }
                }
            }
        }
        return TextUtils.join(UserDetailsUtils.UserDetailsLiterals.DOT, arrayList);
    }

    public static String toHumanReadableString(String str) {
        if (!isValidString(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    String strSubstring = str2.substring(0, 1);
                    Locale locale = Locale.ENGLISH;
                    sb.append(strSubstring.toUpperCase(locale));
                    sb.append(str2.substring(1).toLowerCase(locale));
                }
                sb.append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static SpannedString createSpannedString(String str, int i, int i2) {
        return createSpannedString(str, i, i2, 0);
    }

    public static String replace(String str, Map<String, String> map) {
        if (str != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }
}
