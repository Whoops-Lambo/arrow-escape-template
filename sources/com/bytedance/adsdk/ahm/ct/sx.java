package com.bytedance.adsdk.ahm.ct;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class sx {
    private static SparseArray<WeakReference<Interpolator>> ahm;
    private static final Interpolator kgy = new LinearInterpolator();

    /* JADX WARN: Code duplicated, block: B:129:0x0276  */
    private static <T> com.bytedance.adsdk.ahm.yo.kgy<T> ahm(com.bytedance.adsdk.ahm.yo yoVar, JsonReader jsonReader, float f, gbb<T> gbbVar) throws IOException {
        Interpolator interpolatorKgy;
        Interpolator interpolatorKgy2;
        T t;
        Interpolator interpolator;
        Interpolator interpolatorKgy3;
        com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar;
        T t2;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        jsonReader.beginObject();
        boolean z = false;
        PointF pointFAhm = null;
        PointF pointFAhm2 = null;
        PointF pointF5 = null;
        T tAhm = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointFAhm3 = null;
        PointF pointFAhm4 = null;
        float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        T tAhm2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tAhm2 = gbbVar.ahm(jsonReader, f);
                    continue;
                    break;
                case "h":
                    t2 = tAhm;
                    pointF = pointFAhm3;
                    pointF2 = pointFAhm4;
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "i":
                    boolean z2 = z;
                    t2 = tAhm;
                    pointF = pointFAhm3;
                    pointF2 = pointFAhm4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("x")) {
                                JsonToken jsonTokenPeek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (jsonTokenPeek == jsonToken) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName2.equals("y")) {
                                JsonToken jsonTokenPeek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (jsonTokenPeek2 == jsonToken2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF9 = new PointF(fNextDouble2, fNextDouble3);
                        pointF8 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF7 = pointF9;
                    } else {
                        pointFAhm2 = fpp.ahm(jsonReader, f);
                    }
                    z = z2;
                    break;
                case "o":
                    boolean z3 = z;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            tAhm = tAhm;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("x")) {
                                pointF3 = pointFAhm3;
                                pointF4 = pointFAhm4;
                                JsonToken jsonTokenPeek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (jsonTokenPeek3 == jsonToken3) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName3.equals("y")) {
                                JsonToken jsonTokenPeek4 = jsonReader.peek();
                                JsonToken jsonToken4 = JsonToken.NUMBER;
                                if (jsonTokenPeek4 == jsonToken4) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    pointF3 = pointFAhm3;
                                    pointF4 = pointFAhm4;
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == jsonToken4 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            pointFAhm3 = pointF3;
                            pointFAhm4 = pointF4;
                        }
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF11 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF5 = pointF10;
                        pointF6 = pointF11;
                    } else {
                        pointFAhm = fpp.ahm(jsonReader, f);
                    }
                    z = z3;
                    continue;
                    break;
                case "s":
                    tAhm = gbbVar.ahm(jsonReader, f);
                    continue;
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "ti":
                    pointFAhm4 = fpp.ahm(jsonReader, f);
                    continue;
                    break;
                case "to":
                    pointFAhm3 = fpp.ahm(jsonReader, f);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            tAhm = t2;
            pointFAhm3 = pointF;
            pointFAhm4 = pointF2;
        }
        boolean z4 = z;
        T t3 = tAhm;
        PointF pointF12 = pointFAhm3;
        PointF pointF13 = pointFAhm4;
        jsonReader.endObject();
        if (!z4) {
            if (pointFAhm != null && pointFAhm2 != null) {
                interpolatorKgy3 = kgy(pointFAhm, pointFAhm2);
                interpolator = interpolatorKgy3;
                t = tAhm2;
                interpolatorKgy = null;
                interpolatorKgy2 = null;
            } else if (pointF5 != null && pointF6 != null && pointF7 != null && pointF8 != null) {
                interpolatorKgy = kgy(pointF5, pointF7);
                interpolatorKgy2 = kgy(pointF6, pointF8);
                t = tAhm2;
                interpolator = null;
            }
            if (interpolatorKgy != null || interpolatorKgy2 == null) {
                kgyVar = new com.bytedance.adsdk.ahm.yo.kgy<>(yoVar, t3, t, interpolator, fNextDouble, null);
            } else {
                kgyVar = new com.bytedance.adsdk.ahm.yo.kgy<>(yoVar, t3, t, interpolatorKgy, interpolatorKgy2, fNextDouble, null);
            }
            kgyVar.fi = pointF12;
            kgyVar.gf = pointF13;
            return kgyVar;
        }
        tAhm2 = t3;
        interpolatorKgy3 = kgy;
        interpolator = interpolatorKgy3;
        t = tAhm2;
        interpolatorKgy = null;
        interpolatorKgy2 = null;
        if (interpolatorKgy != null) {
            kgyVar = new com.bytedance.adsdk.ahm.yo.kgy<>(yoVar, t3, t, interpolator, fNextDouble, null);
        } else {
            kgyVar = new com.bytedance.adsdk.ahm.yo.kgy<>(yoVar, t3, t, interpolator, fNextDouble, null);
        }
        kgyVar.fi = pointF12;
        kgyVar.gf = pointF13;
        return kgyVar;
    }

    private static <T> com.bytedance.adsdk.ahm.yo.kgy<T> kgy(com.bytedance.adsdk.ahm.yo yoVar, JsonReader jsonReader, float f, gbb<T> gbbVar) throws IOException {
        Interpolator interpolatorKgy;
        jsonReader.beginObject();
        PointF pointFAhm = null;
        T tAhm = null;
        T tAhm2 = null;
        PointF pointFAhm2 = null;
        PointF pointFAhm3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFAhm4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tAhm = gbbVar.ahm(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "i":
                    pointFAhm4 = fpp.ahm(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFAhm = fpp.ahm(jsonReader, 1.0f);
                    break;
                case "s":
                    tAhm2 = gbbVar.ahm(jsonReader, f);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFAhm3 = fpp.ahm(jsonReader, f);
                    break;
                case "to":
                    pointFAhm2 = fpp.ahm(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z) {
            if (pointFAhm != null && pointFAhm4 != null) {
                interpolatorKgy = kgy(pointFAhm, pointFAhm4);
            }
            com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar = new com.bytedance.adsdk.ahm.yo.kgy<>(yoVar, tAhm2, tAhm, interpolatorKgy, fNextDouble, null);
            kgyVar.fi = pointFAhm2;
            kgyVar.gf = pointFAhm3;
            return kgyVar;
        }
        tAhm = tAhm2;
        interpolatorKgy = kgy;
        com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar2 = new com.bytedance.adsdk.ahm.yo.kgy<>(yoVar, tAhm2, tAhm, interpolatorKgy, fNextDouble, null);
        kgyVar2.fi = pointFAhm2;
        kgyVar2.gf = pointFAhm3;
        return kgyVar2;
    }

    private static WeakReference<Interpolator> kgy(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (sx.class) {
            weakReference = kgy().get(i);
        }
        return weakReference;
    }

    private static void kgy(int i, WeakReference<Interpolator> weakReference) {
        synchronized (sx.class) {
            ahm.put(i, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.ahm.yo.kgy<T> kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, float f, gbb<T> gbbVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return ahm(yoVar, jsonReader, f, gbbVar);
        }
        if (z) {
            return kgy(yoVar, jsonReader, f, gbbVar);
        }
        return kgy(jsonReader, f, gbbVar);
    }

    private static SparseArray<WeakReference<Interpolator>> kgy() {
        if (ahm == null) {
            ahm = new SparseArray<>();
        }
        return ahm;
    }

    private static Interpolator kgy(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.ahm.noq.ct.ahm(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.ahm.noq.ct.ahm(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.ahm.noq.ct.ahm(pointF2.x, -1.0f, 1.0f);
        float fAhm = com.bytedance.adsdk.ahm.noq.ct.ahm(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fAhm;
        int iKgy = com.bytedance.adsdk.ahm.noq.noq.kgy(pointF.x, pointF.y, pointF2.x, fAhm);
        WeakReference<Interpolator> weakReferenceKgy = com.bytedance.adsdk.ahm.ct.kgy() ? null : kgy(iKgy);
        Interpolator interpolator = weakReferenceKgy != null ? weakReferenceKgy.get() : null;
        if (weakReferenceKgy != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.ahm.xh.kgy(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.ahm.xh.kgy(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.ahm.ct.kgy()) {
            try {
                kgy(iKgy, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.ahm.yo.kgy<T> kgy(JsonReader jsonReader, float f, gbb<T> gbbVar) throws IOException {
        return new com.bytedance.adsdk.ahm.yo.kgy<>(gbbVar.ahm(jsonReader, f));
    }
}
