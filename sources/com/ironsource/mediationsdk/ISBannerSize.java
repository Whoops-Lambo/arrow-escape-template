package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.Y7;
import com.unity3d.mediation.LevelPlayAdSize;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ISBannerSize {
    private final int a;
    private final int b;
    private final String c;
    private boolean d;
    Y7 e;
    public static final ISBannerSize BANNER = j.a("BANNER", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final ISBannerSize LARGE = j.a(j.b, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90);
    public static final ISBannerSize RECTANGLE = j.a(j.c, 300, 250);
    protected static final ISBannerSize f = j.a();
    public static final ISBannerSize SMART = j.a(j.e, 0, 0);

    public void a(Y7 y7) {
        if (j.a(y7, this.a, this.b)) {
            this.e = y7;
        }
    }

    public String getDescription() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    public boolean isAdaptive() {
        return this.d;
    }

    public boolean isSmart() {
        return this.c.equals(j.e);
    }

    public void setAdaptive(boolean z) {
        this.d = z;
    }

    public ISBannerSize(String str, int i, int i2) {
        this.c = str;
        this.a = i;
        this.b = i2;
        this.e = new Y7(i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return j.b(i);
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.e.d()));
        }
        String description = getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.a, this.b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(int i, int i2) {
        this(j.f, i, i2);
    }
}
