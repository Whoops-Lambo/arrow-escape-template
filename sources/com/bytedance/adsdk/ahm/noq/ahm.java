package com.bytedance.adsdk.ahm.noq;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ahm {
    public static int kgy(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fAhm = ahm(((i >> 16) & 255) / 255.0f);
        float fAhm2 = ahm(((i >> 8) & 255) / 255.0f);
        float fAhm3 = ahm((i & 255) / 255.0f);
        float fAhm4 = ahm(((i2 >> 16) & 255) / 255.0f);
        float fAhm5 = ahm(((i2 >> 8) & 255) / 255.0f);
        float fAhm6 = ahm((i2 & 255) / 255.0f);
        float fC = h50.c(f3, f2, f, f2);
        float fC2 = h50.c(fAhm4, fAhm, f, fAhm);
        float fC3 = h50.c(fAhm5, fAhm2, f, fAhm2);
        float fC4 = h50.c(fAhm6, fAhm3, f, fAhm3);
        float fKgy = kgy(fC2) * 255.0f;
        float fKgy2 = kgy(fC3) * 255.0f;
        return Math.round(kgy(fC4) * 255.0f) | (Math.round(fKgy) << 16) | (Math.round(fC * 255.0f) << 24) | (Math.round(fKgy2) << 8);
    }

    private static float ahm(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float kgy(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
