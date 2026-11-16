package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4640s {

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static volatile boolean f447;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static volatile C4640s f448;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final String f451 = StringFog.decrypt("reACdA==\n", "2ZJ3EUq2F8g=\n");

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static final String f450 = StringFog.decrypt("o+i+ebI=\n", "xYnSCtcKbOg=\n");

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static final List f449 = Arrays.asList(StringFog.decrypt("nx4=\n", "9niG8tBYpfw=\n"), StringFog.decrypt("by7Usw==\n", "CkKn1ql4DkU=\n"), StringFog.decrypt("+1djWA==\n", "lSIPNDZjxas=\n"), StringFog.decrypt("Q4T1W5fZ\n", "MeGBLuW3nAY=\n"), StringFog.decrypt("DgmiSj4=\n", "fXzSL0yQYO8=\n"), StringFog.decrypt("KgQr\n", "XnZS+VmQ2mY=\n"), StringFog.decrypt("9+aRwCI=\n", "lIflo0os5XI=\n"));

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final r[] f457 = new r[128];

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final r[] f456 = new r[128];

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final HashMap f455 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final HashMap f454 = new HashMap();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final HashMap f453 = new HashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final HashMap f452 = new HashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f458 = f447;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized r m434(String str) {
        EnumC4637q enumC4637q;
        try {
            if (this.f458) {
                return m440(this.f455, EnumC4637q.f439, str);
            }
            if (f451.equals(str) || f450.equals(str)) {
                enumC4637q = EnumC4637q.f434;
            } else {
                enumC4637q = f449.contains(str) ? EnumC4637q.f440 : EnumC4637q.f439;
            }
            return new r(enumC4637q, str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized r m435(String str) {
        return m440(this.f454, EnumC4637q.f437, str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m437() {
        this.f455.clear();
        this.f454.clear();
        this.f453.clear();
        this.f452.clear();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final r m438(char c, char c2) {
        if (this.f458) {
            return this.f456[c];
        }
        return new r(EnumC4637q.f438, "" + c + c2);
    }

    public C4640s() {
        String strDecrypt = StringFog.decrypt("s//qLQFnJxi3+ew7AzFwbM/u6T0=\n", "ksLWEypKDTc=\n");
        for (int i = 0; i < strDecrypt.length(); i++) {
            char cCharAt = strDecrypt.charAt(i);
            this.f457[cCharAt] = new r(EnumC4637q.f438, String.valueOf(cCharAt));
        }
        for (String str : Arrays.asList(StringFog.decrypt("eAA=\n", "RT2tn25Llck=\n"), StringFog.decrypt("1PY=\n", "9cvh12/l4E4=\n"), StringFog.decrypt("n04=\n", "o3MuvqcpjQ0=\n"), StringFog.decrypt("dV4=\n", "S2OH0qmjlqk=\n"), StringFog.decrypt("5Og=\n", "z8MwwhEHN40=\n"), StringFog.decrypt("aCg=\n", "RQVCV77srrA=\n"), StringFog.decrypt("7+4=\n", "k5LTGamCddE=\n"), StringFog.decrypt("Ai0=\n", "JAuEs+Ad1Bw=\n"))) {
            this.f456[str.charAt(0)] = new r(EnumC4637q.f438, str);
        }
        for (String str2 : f449) {
            this.f455.put(str2, new r(EnumC4637q.f440, str2));
        }
        HashMap map = this.f455;
        String strDecrypt2 = StringFog.decrypt("ULnPOw==\n", "JMu6XmfE8Ts=\n");
        EnumC4637q enumC4637q = EnumC4637q.f434;
        map.put(strDecrypt2, new r(enumC4637q, StringFog.decrypt("PPCA/g==\n", "SIL1mwa6hVA=\n")));
        this.f455.put(StringFog.decrypt("GvVyytg=\n", "fJQeub1c4Rc=\n"), new r(enumC4637q, StringFog.decrypt("FizDIV8=\n", "cE2vUjrNGpQ=\n")));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized r m436(String str) {
        return m440(this.f453, EnumC4637q.f436, str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m433() {
        C4640s c4640s = f448;
        f448 = null;
        if (c4640s != null) {
            c4640s.m437();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized r m439(String str) {
        return m440(this.f453, EnumC4637q.f435, str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final r m440(HashMap map, EnumC4637q enumC4637q, String str) {
        if (!this.f458) {
            return new r(enumC4637q, str);
        }
        r rVar = (r) map.get(str);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(enumC4637q, str);
        map.put(str, rVar2);
        return rVar2;
    }
}
