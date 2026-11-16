package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0839 {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2218;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2219;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2220;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2221 = StringFog.decrypt("0OXLKLLP4u/hzsw1ts765dDlyyC+yw==\n", "k4qlRtesloA=\n");

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f2222;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List f2223;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final EnumC0842 f2224;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m626(String str) {
        try {
            int iOrdinal = this.f2224.ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal == 1) {
                return this.f2223.size() <= 0 && AbstractC0793.m609(str, (String) this.f2223.get(0)) >= 0;
            }
            if (iOrdinal == 2) {
                if (this.f2223.size() > 0) {
                    return AbstractC0793.m609(str, (String) this.f2223.get(0)) < 0;
                }
                if (this.f2223.size() <= 0) {
                }
            } else if (iOrdinal == 3) {
                return this.f2223.contains(str);
            }
            return false;
        } catch (Exception e) {
            AbstractC1290.m905(f2221, StringFog.decrypt("Xb2AVY+lTaU4vJpViOlAj3G8k1iR4A==\n", "GM/yOv2FJMs=\n"), (Throwable) e, false);
        }
    }

    static {
        StringFog.decrypt("4Q5t+g==\n", "lXcdnxSbKZg=\n");
        StringFog.decrypt("sEU=\n", "xitJpcLEOPQ=\n");
        StringFog.decrypt("LkrVaKPk\n", "XC+0G8yKmK8=\n");
        f2220 = StringFog.decrypt("OayYAC8=\n", "WM73dkoojoc=\n");
        f2219 = StringFog.decrypt("MBpcZxo=\n", "Un8wCG2jE00=\n");
        f2218 = StringFog.decrypt("9AYO7aA=\n", "kX5vjtTwD7U=\n");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    public C0839(JSONObject jSONObject) {
        byte b;
        EnumC0842 enumC0842;
        String strOptString = jSONObject.optString(StringFog.decrypt("AEzE4A==\n", "dDW0hWHfsP0=\n"));
        int iHashCode = strOptString.hashCode();
        if (iHashCode != 92611485) {
            if (iHashCode != 93621297) {
                if (iHashCode == 96946943 && strOptString.equals(f2218)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (strOptString.equals(f2219)) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (strOptString.equals(f2220)) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    enumC0842 = EnumC0842.f2234;
                } else {
                    enumC0842 = EnumC0842.f2232;
                }
            } else {
                enumC0842 = EnumC0842.f2233;
            }
        } else {
            enumC0842 = EnumC0842.f2231;
        }
        this.f2224 = enumC0842;
        String strOptString2 = jSONObject.optString(StringFog.decrypt("T44=\n", "OeB4TynMPqg=\n"));
        this.f2223 = TextUtils.isEmpty(strOptString2) ? new ArrayList() : Arrays.asList(strOptString2.split(StringFog.decrypt("3w==\n", "8wlm/xca7OU=\n")));
        String strOptString3 = jSONObject.optString(StringFog.decrypt("33HDCXno\n", "rRSiehaGVYs=\n"));
        this.f2222 = (TextUtils.isEmpty(strOptString3) || strOptString3.equals(StringFog.decrypt("vhdjEQ==\n", "0GIPfYISeH4=\n"))) ? null : strOptString3;
    }
}
