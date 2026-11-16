package io.p071bidmachine.ads.networks.gam.versions.v21_0_0;

import io.p071bidmachine.AdsFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdsFormat.values().length];
        a = iArr;
        try {
            iArr[AdsFormat.Banner.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[AdsFormat.Banner_320x50.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[AdsFormat.Banner_728x90.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[AdsFormat.Banner_300x250.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[AdsFormat.Interstitial.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[AdsFormat.InterstitialStatic.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[AdsFormat.InterstitialVideo.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[AdsFormat.Rewarded.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[AdsFormat.RewardedStatic.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[AdsFormat.RewardedVideo.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
