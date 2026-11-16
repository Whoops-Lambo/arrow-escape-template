package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.jc1;
import defpackage.q63;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0823 {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static volatile boolean f2182;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final C0826 f2183;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final Pattern f2184;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final Pattern f2185;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final Pattern f2186;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final Pattern f2187;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static final Pattern f2188;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final Pattern f2189;

    static {
        StringFog.decrypt("GAgWQDk=\n", "VG1uJUsAySg=\n");
        f2189 = Pattern.compile(StringFog.decrypt("UhAM0p5Wkc4oFDCkhTrG1SERXdLdM+PJJg==\n", "DEtt/+QXvJQ=\n"));
        f2188 = Pattern.compile(StringFog.decrypt("fB40BM8zb55eZ0IZqEYZng==\n", "IjwcO/VvM7w=\n"));
        f2187 = Pattern.compile(StringFog.decrypt("om/ZPo2WUB+AE68m6uMmHw==\n", "/EjxAbfKDDg=\n"));
        f2186 = Pattern.compile(StringFog.decrypt("ammDvs1TxGkaaYO+zVPE\n", "NDKzk/QO7zU=\n"));
        f2185 = Pattern.compile(StringFog.decrypt("VLIrl9oKUQ==\n", "CukbuuNXes4=\n"));
        f2184 = Pattern.compile(StringFog.decrypt("trPLgVCJF9zMt/f3S+VAx8WymoET7GWotcL2gkmkW/WbwJWNduAT\n", "6OiqrCrIOoY=\n"));
        f2183 = new C0826();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0054. Please report as an issue. */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m625(String str, String str2, String str3) {
        C4640s c4640s;
        int length;
        String strM624;
        int length2;
        String strM625;
        String strM626;
        synchronized (C4640s.class) {
            c4640s = C4640s.f448;
            if (c4640s == null) {
                c4640s = new C4640s();
                C4640s.f448 = c4640s;
            }
        }
        ArrayList arrayList = new ArrayList();
        int iA = 0;
        while (iA < str3.length()) {
            char cCharAt = str3.charAt(iA);
            int i = iA + 1;
            char cCharAt2 = i < str3.length() ? str3.charAt(i) : (char) 0;
            if (cCharAt != '\n') {
                if (cCharAt != '[' && cCharAt != ']') {
                    if (cCharAt != '!') {
                        if (cCharAt != '\"') {
                            switch (cCharAt) {
                                case '%':
                                case '(':
                                case ')':
                                case '*':
                                case ',':
                                case '.':
                                    break;
                                case '&':
                                    if (cCharAt2 == cCharAt) {
                                        arrayList.add(c4640s.m438(cCharAt, cCharAt2));
                                        iA += 2;
                                    } else if (!Character.isWhitespace(cCharAt)) {
                                        strM624 = m624(f2189, str3, iA);
                                        if (TextUtils.isEmpty(strM624)) {
                                            strM625 = m624(f2186, str3, iA);
                                            if (TextUtils.isEmpty(strM625)) {
                                                strM626 = m624(f2185, str3, iA);
                                                if (TextUtils.isEmpty(strM626)) {
                                                    String strI = q63.i("joQN9fBS\n", "wuF1kIJ98lk=\n", str);
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(StringFog.decrypt("NoBke0BxUFMKlHN6A31fXBHO\n", "Y+4WHiMeNz0=\n"));
                                                    sb.append(cCharAt);
                                                    sb.append(StringFog.decrypt("tDxyLkRfaCngNGlgFA==\n", "lF0GDjQwG0A=\n"));
                                                    sb.append(iA);
                                                    AbstractC0914.m680(strI, AbstractC0529.m515("J+Achg==\n", "B4lypkot8E4=\n", sb, str2), null, null);
                                                } else {
                                                    arrayList.add(c4640s.m436(strM626));
                                                    length = strM626.length();
                                                }
                                            } else {
                                                arrayList.add(c4640s.m439(strM625));
                                                length = strM625.length();
                                            }
                                            break;
                                        } else {
                                            length2 = strM624.length() + iA;
                                            if (length2 < str3.length() || str3.charAt(length2) != '.') {
                                                arrayList.add(c4640s.m434(strM624));
                                                length = strM624.length();
                                            } else {
                                                String strM627 = m624(f2184, str3, iA);
                                                if (TextUtils.isEmpty(strM627)) {
                                                    arrayList.add(c4640s.m434(strM624));
                                                    length = strM624.length();
                                                } else {
                                                    arrayList.add(new r(EnumC4637q.f433, strM627));
                                                    length = strM627.length();
                                                }
                                            }
                                        }
                                        iA += length;
                                    }
                                    break;
                                case '\'':
                                    String strM628 = m624(f2187, str3, iA);
                                    if (strM628 != null) {
                                        String strJ = jc1.j(1, 1, strM628);
                                        if (strJ.length() == 1) {
                                            arrayList.add(c4640s.m436(String.valueOf((int) strJ.charAt(0))));
                                        } else {
                                            arrayList.add(c4640s.m435(strJ));
                                        }
                                        iA = q63.a(2, iA, strJ);
                                    } else {
                                        String strI2 = q63.i("oLdSlDT2\n", "7NIq8UbZKaY=\n", str);
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(StringFog.decrypt("LgLSry8Q6LEZA8muOhDrpBkZzqd9UezwGx/TqSlZ975L\n", "a3CgwF0wmNA=\n"));
                                        sb2.append(iA);
                                        AbstractC0914.m680(strI2, AbstractC0529.m515("qx/l0Q==\n", "i3aL8QLx7wQ=\n", sb2, str2), null, null);
                                    }
                                    break;
                                case '+':
                                    if (cCharAt2 != '+') {
                                        arrayList.add(!c4640s.f458 ? new r(EnumC4637q.f438, String.valueOf(cCharAt)) : c4640s.f457[cCharAt]);
                                    } else {
                                        arrayList.add(c4640s.m438(cCharAt, cCharAt2));
                                        iA += 2;
                                    }
                                    break;
                                case '-':
                                    if (cCharAt2 == '-') {
                                        arrayList.add(c4640s.m438(cCharAt, cCharAt2));
                                        iA += 2;
                                    }
                                    break;
                                case '/':
                                    arrayList.add(!c4640s.f458 ? new r(EnumC4637q.f438, String.valueOf(cCharAt)) : c4640s.f457[cCharAt]);
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case ':':
                                        case ';':
                                        case '?':
                                            break;
                                        case '<':
                                        case '=':
                                        case '>':
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case INVALID_RI_ENDPOINT_VALUE:
                                                case INVALID_METRICS_ENDPOINT_VALUE:
                                                    break;
                                                case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                    if (cCharAt2 == cCharAt) {
                                                        arrayList.add(c4640s.m438(cCharAt, cCharAt2));
                                                        iA += 2;
                                                    } else if (!Character.isWhitespace(cCharAt)) {
                                                        strM624 = m624(f2189, str3, iA);
                                                        if (TextUtils.isEmpty(strM624)) {
                                                            strM625 = m624(f2186, str3, iA);
                                                            if (TextUtils.isEmpty(strM625)) {
                                                                strM626 = m624(f2185, str3, iA);
                                                                if (TextUtils.isEmpty(strM626)) {
                                                                    String strI3 = q63.i("joQN9fBS\n", "wuF1kIJ98lk=\n", str);
                                                                    StringBuilder sb3 = new StringBuilder();
                                                                    sb3.append(StringFog.decrypt("NoBke0BxUFMKlHN6A31fXBHO\n", "Y+4WHiMeNz0=\n"));
                                                                    sb3.append(cCharAt);
                                                                    sb3.append(StringFog.decrypt("tDxyLkRfaCngNGlgFA==\n", "lF0GDjQwG0A=\n"));
                                                                    sb3.append(iA);
                                                                    AbstractC0914.m680(strI3, AbstractC0529.m515("J+Achg==\n", "B4lypkot8E4=\n", sb3, str2), null, null);
                                                                } else {
                                                                    arrayList.add(c4640s.m436(strM626));
                                                                    length = strM626.length();
                                                                }
                                                            } else {
                                                                arrayList.add(c4640s.m439(strM625));
                                                                length = strM625.length();
                                                            }
                                                            break;
                                                        } else {
                                                            length2 = strM624.length() + iA;
                                                            if (length2 < str3.length()) {
                                                                arrayList.add(c4640s.m434(strM624));
                                                                length = strM624.length();
                                                            } else {
                                                                arrayList.add(c4640s.m434(strM624));
                                                                length = strM624.length();
                                                            }
                                                        }
                                                        iA += length;
                                                    }
                                                    break;
                                                default:
                                                    if (!Character.isWhitespace(cCharAt)) {
                                                        strM624 = m624(f2189, str3, iA);
                                                        if (TextUtils.isEmpty(strM624)) {
                                                            strM625 = m624(f2186, str3, iA);
                                                            if (TextUtils.isEmpty(strM625)) {
                                                                strM626 = m624(f2185, str3, iA);
                                                                if (TextUtils.isEmpty(strM626)) {
                                                                    String strI4 = q63.i("joQN9fBS\n", "wuF1kIJ98lk=\n", str);
                                                                    StringBuilder sb4 = new StringBuilder();
                                                                    sb4.append(StringFog.decrypt("NoBke0BxUFMKlHN6A31fXBHO\n", "Y+4WHiMeNz0=\n"));
                                                                    sb4.append(cCharAt);
                                                                    sb4.append(StringFog.decrypt("tDxyLkRfaCngNGlgFA==\n", "lF0GDjQwG0A=\n"));
                                                                    sb4.append(iA);
                                                                    AbstractC0914.m680(strI4, AbstractC0529.m515("J+Achg==\n", "B4lypkot8E4=\n", sb4, str2), null, null);
                                                                } else {
                                                                    arrayList.add(c4640s.m436(strM626));
                                                                    length = strM626.length();
                                                                }
                                                            } else {
                                                                arrayList.add(c4640s.m439(strM625));
                                                                length = strM625.length();
                                                            }
                                                            break;
                                                        } else {
                                                            length2 = strM624.length() + iA;
                                                            if (length2 < str3.length()) {
                                                                arrayList.add(c4640s.m434(strM624));
                                                                length = strM624.length();
                                                            } else {
                                                                arrayList.add(c4640s.m434(strM624));
                                                                length = strM624.length();
                                                            }
                                                        }
                                                        iA += length;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            String strM629 = m624(f2188, str3, iA);
                            if (strM629 == null) {
                                String strI5 = q63.i("Vm/1iNbC\n", "GgqN7aTtejs=\n", str);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(StringFog.decrypt("bCYQl39Me+xbJwuWakx4+Vs9DJ8tDX+tWTsRkXkFZOMJ\n", "KVRi+A1sC40=\n"));
                                sb5.append(iA);
                                AbstractC0914.m680(strI5, AbstractC0529.m515("O8p1fg==\n", "G6MbXucAu8A=\n", sb5, str2), null, null);
                            } else {
                                String strJ2 = jc1.j(1, 1, strM629);
                                arrayList.add(c4640s.m435(strJ2));
                                length = strJ2.length() + 2;
                                iA += length;
                            }
                        }
                    }
                    if (cCharAt2 == '=') {
                        arrayList.add(c4640s.m438(cCharAt, cCharAt2));
                        iA += 2;
                    } else {
                        arrayList.add(!c4640s.f458 ? new r(EnumC4637q.f438, String.valueOf(cCharAt)) : c4640s.f457[cCharAt]);
                    }
                }
                arrayList.add(!c4640s.f458 ? new r(EnumC4637q.f438, String.valueOf(cCharAt)) : c4640s.f457[cCharAt]);
            }
            iA = i;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m624(Pattern pattern, String str, int i) {
        Matcher matcher;
        if (f2182) {
            Map map = (Map) f2183.get();
            matcher = (Matcher) map.get(pattern);
            if (matcher == null) {
                matcher = pattern.matcher("");
                map.put(pattern, matcher);
            }
            matcher.reset(str);
        } else {
            matcher = pattern.matcher(str);
        }
        matcher.region(i, str.length());
        if (matcher.find()) {
            return str.substring(matcher.start(), matcher.end());
        }
        return null;
    }
}
