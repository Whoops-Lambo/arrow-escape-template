package com.google.android.gms.internal.ads;

import defpackage.cw4;
import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhoi {
    public static zziee b(String str) throws IOException {
        try {
            return cw4.a(new zzifa(new StringReader(str)));
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    public static boolean a(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char cCharAt = str.charAt(i);
            int i2 = i + 1;
            if (Character.isSurrogate(cCharAt)) {
                if (Character.isLowSurrogate(cCharAt) || i2 == length || !Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            } else {
                i = i2;
            }
        }
        return true;
    }
}
