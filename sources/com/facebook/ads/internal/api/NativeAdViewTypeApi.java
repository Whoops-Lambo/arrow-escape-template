package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public interface NativeAdViewTypeApi {
    public static final int HEIGHT_100 = 0;
    public static final int HEIGHT_120 = 1;

    @Deprecated
    public static final int HEIGHT_300 = 2;

    @Deprecated
    public static final int HEIGHT_400 = 3;
    public static final int HEIGHT_50 = 4;
    public static final int RECT_DYNAMIC = 5;

    int getHeight();

    int getValue();

    int getWidth();
}
