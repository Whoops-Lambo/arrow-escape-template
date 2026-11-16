package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.rz;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class PAGBannerSize {
    private int ahm;
    private int kgy;
    private int rz = 1;
    private int uq;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        int iKgy = rz.kgy(context, i, 0);
        if (iKgy == rz.kgy) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, iKgy);
        pAGBannerSize.rz = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int iKgy = rz.kgy(context, 0);
        if (iKgy == rz.kgy) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.uq = iKgy;
        pAGBannerSize.rz = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.uq = i2;
        pAGBannerSize.rz = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.ahm;
    }

    public int getMaxHeight() {
        return this.uq;
    }

    public int getType() {
        return this.rz;
    }

    public int getWidth() {
        return this.kgy;
    }

    public PAGBannerSize(int i, int i2) {
        this.kgy = i;
        this.ahm = i2;
    }
}
