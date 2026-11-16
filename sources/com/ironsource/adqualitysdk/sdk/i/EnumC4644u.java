package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC4644u {
    f469,
    f468,
    f467;

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static EnumC4644u m441(String str) {
        byte b;
        if (!TextUtils.isEmpty(str)) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3642) {
                if (iHashCode != 96921) {
                    if (iHashCode == 109261 && str.equals(StringFog.decrypt("2nol\n", "tBVL3XG6UlY=\n"))) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(StringFog.decrypt("SnMF\n", "Kwdp6NRCWZ8=\n"))) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals(StringFog.decrypt("tU0=\n", "xyHjbErsqy4=\n"))) {
                b = 2;
            } else {
                b = -1;
            }
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        return f467;
                    }
                    return null;
                }
                return f468;
            }
            return f469;
        }
        return null;
    }
}
