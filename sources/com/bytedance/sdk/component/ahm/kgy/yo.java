package com.bytedance.sdk.component.ahm.kgy;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.d;
import defpackage.dr0;
import defpackage.e32;
import defpackage.jc1;
import defpackage.pv1;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class yo {
    private static final char[] uq = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String ahm;
    private final String ct;
    private final List<String> fi;
    private final String gf;
    final String kgy;
    private final String noq;
    private final String ra;
    final int rz;
    private final List<String> yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        String fi;
        String kgy;
        final List<String> noq;
        String uq;
        List<String> yo;
        String ahm = "";
        String rz = "";
        int ct = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.ahm.kgy.yo$kgy$kgy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public enum EnumC0213kgy {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        private static int noq(String str, int i, int i2) {
            try {
                int i3 = Integer.parseInt(yo.kgy(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (NumberFormatException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X4=", "c/o5hTauZYOiX95RiBSy", "S+8/hgaMZtWU", 671);
                return -1;
            }
        }

        private static int ahm(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private boolean ct(String str) {
            return str.equals(UserDetailsUtils.UserDetailsLiterals.DOT) || str.equalsIgnoreCase("%2e");
        }

        private void rz() {
            List<String> list = this.noq;
            if (!list.remove(list.size() - 1).isEmpty() || this.noq.isEmpty()) {
                this.noq.add("");
            } else {
                List<String> list2 = this.noq;
                list2.set(list2.size() - 1, "");
            }
        }

        private static int uq(String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        public EnumC0213kgy kgy(yo yoVar, String str) {
            int iKgy;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int iKgy2 = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str4, 0, str4.length());
            int iAhm = com.bytedance.sdk.component.ahm.kgy.ahm.gf.ahm(str4, iKgy2, str4.length());
            if (ahm(str4, iKgy2, iAhm) != -1) {
                if (str4.regionMatches(true, iKgy2, "https:", 0, 6)) {
                    this.kgy = HttpRequest.DEFAULT_SCHEME;
                    iKgy2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (!str4.regionMatches(true, iKgy2, "http:", 0, 5)) {
                        return EnumC0213kgy.UNSUPPORTED_SCHEME;
                    }
                    this.kgy = g.e;
                    iKgy2 += 5;
                }
            } else {
                if (yoVar == null) {
                    return EnumC0213kgy.MISSING_SCHEME;
                }
                this.kgy = yoVar.kgy;
            }
            int iRz = rz(str4, iKgy2, iAhm);
            char c = '#';
            if (iRz >= 2 || yoVar == null || !yoVar.kgy.equals(this.kgy)) {
                int i2 = iKgy2 + iRz;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iKgy = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str4, i2, iAhm, "@/\\?#");
                    byte bCharAt = iKgy != iAhm ? str4.charAt(iKgy) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            i = iKgy;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.rz);
                            sb.append("%40");
                            str3 = str;
                            sb.append(yo.kgy(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.rz = sb.toString();
                        } else {
                            int iKgy3 = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str4, i2, iKgy, ':');
                            String strKgy = yo.kgy(str, i2, iKgy3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strKgy = jc1.o(this.ahm, "%40", new StringBuilder(), strKgy);
                            }
                            this.ahm = strKgy;
                            if (iKgy3 != iKgy) {
                                i = iKgy;
                                this.rz = yo.kgy(str, iKgy3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = iKgy;
                            }
                            str3 = str;
                            z2 = true;
                        }
                        i2 = i + 1;
                        str4 = str3;
                        c = '#';
                    }
                }
                str2 = str4;
                int i3 = i2;
                int iUq = uq(str2, i3, iKgy);
                int i4 = iUq + 1;
                if (i4 < iKgy) {
                    this.uq = ct(str2, i3, iUq);
                    int iNoq = noq(str2, i4, iKgy);
                    this.ct = iNoq;
                    if (iNoq == -1) {
                        return EnumC0213kgy.INVALID_PORT;
                    }
                } else {
                    this.uq = ct(str2, i3, iUq);
                    this.ct = yo.kgy(this.kgy);
                }
                if (this.uq == null) {
                    return EnumC0213kgy.INVALID_HOST;
                }
                iKgy2 = iKgy;
            } else {
                this.ahm = yoVar.ahm();
                this.rz = yoVar.rz();
                this.uq = yoVar.ahm;
                this.ct = yoVar.rz;
                this.noq.clear();
                this.noq.addAll(yoVar.uq());
                if (iKgy2 == iAhm || str4.charAt(iKgy2) == '#') {
                    uq(yoVar.ct());
                }
                str2 = str4;
            }
            int iKgy4 = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str2, iKgy2, iAhm, "?#");
            kgy(str2, iKgy2, iKgy4);
            if (iKgy4 < iAhm && str2.charAt(iKgy4) == '?') {
                int iKgy5 = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str2, iKgy4, iAhm, '#');
                this.yo = yo.ahm(yo.kgy(str2, iKgy4 + 1, iKgy5, " \"'<>#", true, false, true, true, null));
                iKgy4 = iKgy5;
            }
            if (iKgy4 < iAhm && str2.charAt(iKgy4) == '#') {
                this.fi = yo.kgy(str2, iKgy4 + 1, iAhm, "", true, false, false, false, null);
            }
            return EnumC0213kgy.SUCCESS;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.kgy);
            sb.append("://");
            if (!this.ahm.isEmpty() || !this.rz.isEmpty()) {
                sb.append(this.ahm);
                if (!this.rz.isEmpty()) {
                    sb.append(':');
                    sb.append(this.rz);
                }
                sb.append('@');
            }
            if (this.uq.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.uq);
                sb.append(']');
            } else {
                sb.append(this.uq);
            }
            int iKgy = kgy();
            if (iKgy != yo.kgy(this.kgy)) {
                sb.append(':');
                sb.append(iKgy);
            }
            yo.kgy(sb, this.noq);
            if (this.yo != null) {
                sb.append('?');
                yo.ahm(sb, this.yo);
            }
            if (this.fi != null) {
                sb.append('#');
                sb.append(this.fi);
            }
            return sb.toString();
        }

        public kgy() {
            ArrayList arrayList = new ArrayList();
            this.noq = arrayList;
            arrayList.add("");
        }

        private static String ct(String str, int i, int i2) {
            return com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(yo.kgy(str, i, i2, false));
        }

        public kgy uq(String str) {
            this.yo = str != null ? yo.ahm(yo.kgy(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        private boolean noq(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public kgy rz(String str) {
            if (str != null) {
                return kgy(str, true);
            }
            d.w("encodedPathSegments == null");
            return null;
        }

        private static int rz(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public yo ahm() {
            if (this.kgy != null) {
                if (this.uq != null) {
                    return new yo(this);
                }
                e32.i("host == null");
                return null;
            }
            e32.i("scheme == null");
            return null;
        }

        public kgy ahm(String str) {
            if (str != null) {
                String strCt = ct(str, 0, str.length());
                if (strCt != null) {
                    this.uq = strCt;
                    return this;
                }
                d.r("unexpected host: ".concat(str));
                return null;
            }
            d.w("host == null");
            return null;
        }

        public int kgy() {
            int i = this.ct;
            return i != -1 ? i : yo.kgy(this.kgy);
        }

        private kgy kgy(String str, boolean z) {
            int i = 0;
            while (true) {
                int iKgy = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str, i, str.length(), "/\\");
                this.kgy(str, i, iKgy, iKgy < str.length(), z);
                i = iKgy + 1;
                if (i > str.length()) {
                    return this;
                }
                this = this;
                str = str;
                z = z;
            }
        }

        public kgy kgy(String str, String str2) {
            if (str != null) {
                if (this.yo == null) {
                    this.yo = new ArrayList();
                }
                this.yo.add(yo.kgy(str, " \"'<>#&=", true, false, true, true));
                this.yo.add(str2 != null ? yo.kgy(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            d.w("encodedName == null");
            return null;
        }

        public kgy kgy(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase(g.e)) {
                    this.kgy = g.e;
                    return this;
                }
                if (str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                    this.kgy = HttpRequest.DEFAULT_SCHEME;
                    return this;
                }
                d.r("unexpected scheme: ".concat(str));
                return null;
            }
            d.w("scheme == null");
            return null;
        }

        private void kgy(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.noq;
                list.set(list.size() - 1, "");
            } else {
                this.noq.clear();
                this.noq.add("");
                i++;
            }
            int i3 = i;
            while (i3 < i2) {
                int iKgy = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str, i3, i2, "/\\");
                boolean z = iKgy < i2;
                kgy kgyVar = this;
                String str2 = str;
                kgyVar.kgy(str2, i3, iKgy, z, true);
                if (z) {
                    iKgy++;
                }
                i3 = iKgy;
                this = kgyVar;
                str = str2;
            }
        }

        private void kgy(String str, int i, int i2, boolean z, boolean z2) {
            String strKgy = yo.kgy(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (ct(strKgy)) {
                return;
            }
            if (noq(strKgy)) {
                rz();
                return;
            }
            boolean zIsEmpty = ((String) pv1.i(1, this.noq)).isEmpty();
            List<String> list = this.noq;
            if (zIsEmpty) {
                list.set(list.size() - 1, strKgy);
            } else {
                list.add(strKgy);
            }
            if (z) {
                this.noq.add("");
            }
        }
    }

    public static void kgy(com.bytedance.sdk.component.ahm.kgy.ahm.kgy kgyVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.ahm.kgy.ahm.kgy kgyVar2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    kgyVar.kgy(z ? UserDetailsUtils.UserDetailsLiterals.PLUS : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !kgy(str, i, i2)))))) {
                    if (kgyVar2 == null) {
                        kgyVar2 = new com.bytedance.sdk.component.ahm.kgy.ahm.kgy();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy)) {
                        kgyVar2.kgy(iCodePointAt);
                    } else {
                        kgyVar2.kgy(str, i, Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!kgyVar2.kgy()) {
                        byte bAhm = kgyVar2.ahm();
                        int i3 = bAhm & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        kgyVar.ahm(37);
                        char[] cArr = uq;
                        kgyVar.ahm((int) cArr[(i3 >> 4) & 15]);
                        kgyVar.ahm((int) cArr[bAhm & 15]);
                    }
                } else {
                    kgyVar.kgy(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static List<String> ahm(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public String ct() {
        if (this.fi == null) {
            return null;
        }
        int iIndexOf = this.ra.indexOf(63) + 1;
        String str = this.ra;
        return this.ra.substring(iIndexOf, com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof yo) && ((yo) obj).ra.equals(this.ra);
    }

    public int hashCode() {
        return this.ra.hashCode();
    }

    public String rz() {
        if (this.noq.isEmpty()) {
            return "";
        }
        return this.ra.substring(this.ra.indexOf(58, this.kgy.length() + 3) + 1, this.ra.indexOf(64));
    }

    public String toString() {
        return this.ra;
    }

    public List<String> uq() {
        int iIndexOf = this.ra.indexOf(47, this.kgy.length() + 3);
        String str = this.ra;
        int iKgy = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iKgy) {
            int i = iIndexOf + 1;
            int iKgy2 = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(this.ra, i, iKgy, '/');
            arrayList.add(this.ra.substring(i, iKgy2));
            iIndexOf = iKgy2;
        }
        return arrayList;
    }

    public yo(kgy kgyVar) {
        List<String> listKgy;
        this.kgy = kgyVar.kgy;
        this.ct = kgy(kgyVar.ahm, false);
        this.noq = kgy(kgyVar.rz, false);
        this.ahm = kgyVar.uq;
        this.rz = kgyVar.kgy();
        this.yo = kgy(kgyVar.noq, false);
        List<String> list = kgyVar.yo;
        if (list != null) {
            listKgy = kgy(list, true);
        } else {
            listKgy = null;
        }
        this.fi = listKgy;
        String str = kgyVar.fi;
        this.gf = str != null ? kgy(str, false) : null;
        this.ra = kgyVar.toString();
    }

    public static yo rz(String str) {
        kgy kgyVar = new kgy();
        if (kgyVar.kgy((yo) null, str) == kgy.EnumC0213kgy.SUCCESS) {
            return kgyVar.ahm();
        }
        return null;
    }

    public static void ahm(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(G5.U);
                sb.append(str2);
            }
        }
    }

    public String ahm() {
        if (this.ct.isEmpty()) {
            return "";
        }
        int length = this.kgy.length() + 3;
        String str = this.ra;
        return this.ra.substring(length, com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str, length, str.length(), ":@"));
    }

    public static int kgy(String str) {
        if (str.equals(g.e)) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static void kgy(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public static String kgy(String str, boolean z) {
        return kgy(str, 0, str.length(), z);
    }

    private List<String> kgy(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? kgy(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String kgy(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                com.bytedance.sdk.component.ahm.kgy.ahm.kgy kgyVar = new com.bytedance.sdk.component.ahm.kgy.ahm.kgy();
                kgyVar.kgy(str, i, i3);
                kgy(kgyVar, str, i3, i2, z);
                return kgyVar.rz();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void kgy(com.bytedance.sdk.component.ahm.kgy.ahm.kgy kgyVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iKgy = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str.charAt(i + 1));
                int iKgy2 = com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str.charAt(i3));
                if (iKgy != -1 && iKgy2 != -1) {
                    kgyVar.ahm((iKgy << 4) + iKgy2);
                    i = i3;
                } else {
                    kgyVar.kgy(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z) {
                kgyVar.ahm(32);
            } else {
                kgyVar.kgy(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static boolean kgy(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy(str.charAt(i3)) != -1;
    }

    public static String kgy(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || kgy(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.ahm.kgy.ahm.kgy kgyVar = new com.bytedance.sdk.component.ahm.kgy.ahm.kgy();
                kgyVar.kgy(str, i, iCharCount);
                kgy(kgyVar, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
                return kgyVar.rz();
            }
        }
        return str.substring(i, i2);
    }

    public URL kgy() {
        try {
            return new URL(this.ra);
        } catch (MalformedURLException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X4=", "c/o5hTauZQ==", "Tvwh", 56);
            dr0.m(e);
            return null;
        }
    }

    public static String kgy(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return kgy(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
