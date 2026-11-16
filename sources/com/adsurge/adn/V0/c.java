package com.adsurge.adn.V0;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final a[] a;
    public static final int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public final float a;
        public final float b;
        public final float c;
        public final int d;

        public final int a(float[] fArr) {
            float f = this.a;
            if (f != -1.0f && fArr[1] > f) {
                return c.b;
            }
            float f2 = this.b;
            if (f2 != -1.0f && fArr[0] < f2) {
                return c.b;
            }
            float f3 = this.c;
            return (f3 == -1.0f || fArr[0] < f3) ? this.d : c.b;
        }

        public a(float f, float f2, int i) {
            this.a = -1.0f;
            this.b = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1.0f : f;
            this.c = f2 >= 360.0f ? -1.0f : f2;
            this.d = i;
        }

        public a(float f, int i) {
            this.a = (f > 1.0f || f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? -1.0f : f;
            this.c = -1.0f;
            this.b = -1.0f;
            this.d = i;
        }
    }

    static {
        a[] aVarArr = {new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Color.rgb(161, 166, 178)), new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, Color.rgb(178, 79, 71)), new a(340.0f, 360.0f, Color.rgb(178, 79, 71)), new a(10.0f, 30.0f, Color.rgb(204, 116, 82)), new a(30.0f, 60.0f, Color.rgb(204, 142, 71)), new a(60.0f, 120.0f, Color.rgb(159, 163, 95)), new a(120.0f, 180.0f, Color.rgb(com.safedk.android.analytics.brandsafety.b.v, 161, 112)), new a(180.0f, 190.0f, Color.rgb(107, 153, 153)), new a(190.0f, 240.0f, Color.rgb(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 158, 184)), new a(240.0f, 260.0f, Color.rgb(142, 130, 178)), new a(260.0f, 310.0f, Color.rgb(158, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 148)), new a(310.0f, 340.0f, Color.rgb(184, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 135))};
        a = aVarArr;
        b = aVarArr[0].d;
    }

    public static b b(Bitmap bitmap) {
        return new b.C0094b(bitmap).a();
    }

    public static b.d a(Bitmap bitmap) {
        b bVarB = b(bitmap);
        b.d[] dVarArr = {bVarB.h(), bVarB.d(), bVarB.c(), bVarB.g(), bVarB.e(), bVarB.f()};
        b.d dVar = null;
        for (int i = 0; i < 6; i++) {
            b.d dVar2 = dVarArr[i];
            if (dVar2 != null && (dVar == null || dVar2.d() > dVar.d())) {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public static int a(Bitmap bitmap, int i) {
        b.d dVarA = a(bitmap);
        if (dVarA == null) {
            return b;
        }
        float[] fArrC = dVarA.c();
        int i2 = 0;
        while (true) {
            a[] aVarArr = a;
            if (i2 < aVarArr.length) {
                int iA = aVarArr[i2].a(fArrC);
                if (iA != b) {
                    if (i == 0) {
                        return iA;
                    }
                    int length = (((i2 - 1) + i) % (aVarArr.length - 1)) + 1;
                    if (length < 0) {
                        length += aVarArr.length;
                    }
                    return aVarArr[length].d;
                }
                i2++;
            } else {
                return b;
            }
        }
    }
}
