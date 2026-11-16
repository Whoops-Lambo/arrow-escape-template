package com.bytedance.sdk.openadsdk.ioy;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class um {
    public static final Charset ahm;
    public static final Charset kgy;

    static {
        Charset charsetForName;
        Charset charsetForName2 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf6w==", "aPo/nA27XNOJRsQ=", "B+0hnA21fZk=", 35);
            charsetForName = null;
        }
        kgy = charsetForName;
        try {
            charsetForName2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException e2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf6w==", "aPo/nA27XNOJRsQ=", "B+0hnA21fZk=", 46);
        }
        ahm = charsetForName2;
    }
}
