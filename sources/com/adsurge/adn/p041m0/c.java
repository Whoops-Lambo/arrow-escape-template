package com.adsurge.adn.p041m0;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static float[] a(float[] fArr, float[] fArr2, float f, int i) {
        int i2 = i % 4;
        double d = (float) ((((i2 == 1 || i2 == 3) ? 90.0f - f : f) / 180.0d) * 3.141592653589793d);
        double dSin = Math.sin(d);
        double dCos = Math.cos(d);
        double dTan = ((float) (0.5d / dCos)) + ((float) (((double) (0.5f - ((float) (Math.tan(d) * 0.5d)))) * dSin));
        float f2 = ((float) (dTan * dSin)) / 1.0f;
        float f3 = ((float) (dTan * dCos)) / 1.0f;
        if (i == 0) {
            fArr2[0] = 0.5f - f2;
            fArr2[1] = f3 + 0.5f;
            fArr2[2] = f2 + 0.5f;
            fArr2[3] = 0.5f - f3;
        } else if (i == 1) {
            fArr2[0] = 0.5f - f2;
            fArr2[1] = 0.5f - f3;
            fArr2[2] = f2 + 0.5f;
            fArr2[3] = f3 + 0.5f;
        } else if (i == 2) {
            fArr2[0] = f2 + 0.5f;
            fArr2[1] = 0.5f - f3;
            fArr2[2] = 0.5f - f2;
            fArr2[3] = f3 + 0.5f;
        } else {
            fArr2[0] = f2 + 0.5f;
            fArr2[1] = f3 + 0.5f;
            fArr2[2] = 0.5f - f2;
            fArr2[3] = 0.5f - f3;
        }
        if (fArr != null && fArr.length >= 2) {
            float f4 = fArr[0];
            float f5 = fArr[fArr.length - 1];
            float fMin = Math.min(f4, f5);
            float fMax = Math.max(f4, f5);
            float fAbs = (float) (((double) (Math.abs(fArr2[0] - fArr2[2]) * 1.0f)) / dSin);
            if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                double dAbs = Math.abs(fMin) * fAbs;
                float f6 = ((float) (dAbs * dSin)) / 1.0f;
                float f7 = ((float) (dAbs * dCos)) / 1.0f;
                if (i == 0) {
                    fArr2[0] = fArr2[0] - f6;
                    fArr2[1] = fArr2[1] + f7;
                } else if (i == 1) {
                    fArr2[0] = fArr2[0] - f6;
                    fArr2[1] = fArr2[1] - f7;
                } else if (i == 2) {
                    fArr2[0] = fArr2[0] + f6;
                    fArr2[1] = fArr2[1] - f7;
                } else if (i == 3) {
                    fArr2[0] = fArr2[0] + f6;
                    fArr2[1] = fArr2[1] + f7;
                }
            }
            if (fMax > 1.0f) {
                double d2 = (fMax - 1.0f) * fAbs;
                float f8 = ((float) (dSin * d2)) / 1.0f;
                float f9 = ((float) (d2 * dCos)) / 1.0f;
                if (i == 0) {
                    fArr2[2] = fArr2[2] + f8;
                    fArr2[3] = fArr2[3] - f9;
                } else {
                    if (i == 1) {
                        fArr2[2] = fArr2[2] + f8;
                        fArr2[3] = fArr2[3] + f9;
                        return fArr2;
                    }
                    if (i == 2) {
                        fArr2[2] = fArr2[2] - f8;
                        fArr2[3] = fArr2[3] + f9;
                        return fArr2;
                    }
                    if (i == 3) {
                        fArr2[2] = fArr2[2] - f8;
                        fArr2[3] = fArr2[3] - f9;
                        return fArr2;
                    }
                }
            }
        }
        return fArr2;
    }

    public static float[] a(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[4];
        float f = fArr[0] % 360.0f;
        int i = (int) (f / 90.0f);
        float f2 = f % 90.0f;
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return a(fArr2, fArr3, i);
        }
        return a(fArr2, fArr3, f2, i);
    }

    public static float[] a(float[] fArr) {
        int length;
        if (fArr == null || (length = fArr.length) < 2) {
            return fArr;
        }
        float f = fArr[0];
        float f2 = fArr[length - 1];
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f || f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 > 1.0f) {
            float fMin = Math.min(Math.min(f, f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float fMax = Math.max(Math.max(f, f2), 1.0f) - fMin;
            if (fMax > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float[] fArr2 = new float[length];
                for (int i = 0; i < length; i++) {
                    fArr2[i] = (fArr[i] - fMin) / fMax;
                }
                return fArr2;
            }
        }
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    public static Shader a(Object[] objArr, int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        Matrix matrix;
        float f5;
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Integer) objArr[1]).intValue();
        float[] fArr = (float[]) objArr[2];
        float[] fArr2 = (float[]) objArr[3];
        int i3 = 4;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue == 3) {
                    f5 = i2;
                    f = i;
                    f2 = 0.0f;
                } else if (iIntValue != 4) {
                    if (iIntValue != 5) {
                        f3 = i2;
                        i3 = 4;
                        f = 0.0f;
                        f2 = 0.0f;
                    } else if (fArr2 == null || fArr2.length < 3) {
                        f = 0.0f;
                        f2 = 0.0f;
                    } else {
                        float f7 = i;
                        float f8 = fArr2[0] * f7;
                        float f9 = i2 * fArr2[1];
                        float f10 = f7 * fArr2[2];
                        f = f8;
                        i3 = 4;
                        f3 = 0.0f;
                        f6 = f10;
                        f2 = f9;
                    }
                } else if (fArr2 != null) {
                    float[] fArrA = a(fArr2, fArr);
                    float fMin = Math.min(i, i2);
                    float f11 = fArrA[0] * fMin;
                    float f12 = fArrA[1] * fMin;
                    float f13 = fArrA[2] * fMin;
                    float f14 = fMin * fArrA[3];
                    f2 = f12;
                    i3 = 4;
                    f3 = f14;
                    f6 = f13;
                    f = f11;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
                if (5 == iIntValue) {
                    return new RadialGradient(f, f2, f6, iArr, fArr, Shader.TileMode.CLAMP);
                }
                f4 = f6;
                if (i3 == iIntValue) {
                    LinearGradient linearGradient = new LinearGradient(f, f2, f4, f3, iArr, a(fArr), Shader.TileMode.CLAMP);
                    matrix = new Matrix();
                    if (i < i2) {
                        matrix.setScale(1.0f, (i2 * 1.0f) / i);
                    } else {
                        matrix.setScale((i * 1.0f) / i2, 1.0f);
                    }
                    linearGradient.setLocalMatrix(matrix);
                    return linearGradient;
                }
                return new LinearGradient(f, f2, f4, f3, iArr, fArr, Shader.TileMode.CLAMP);
            }
            f5 = i2;
            f = 0.0f;
            f2 = 0.0f;
            f6 = i;
            f3 = f5;
            if (5 == iIntValue) {
                return new RadialGradient(f, f2, f6, iArr, fArr, Shader.TileMode.CLAMP);
            }
            f4 = f6;
            if (i3 == iIntValue) {
                LinearGradient linearGradient2 = new LinearGradient(f, f2, f4, f3, iArr, a(fArr), Shader.TileMode.CLAMP);
                matrix = new Matrix();
                if (i < i2) {
                    matrix.setScale(1.0f, (i2 * 1.0f) / i);
                } else {
                    matrix.setScale((i * 1.0f) / i2, 1.0f);
                }
                linearGradient2.setLocalMatrix(matrix);
                return linearGradient2;
            }
            return new LinearGradient(f, f2, f4, f3, iArr, fArr, Shader.TileMode.CLAMP);
        }
        f = 0.0f;
        f2 = 0.0f;
        f6 = i;
        f3 = f2;
        if (5 == iIntValue) {
            return new RadialGradient(f, f2, f6, iArr, fArr, Shader.TileMode.CLAMP);
        }
        f4 = f6;
        if (i3 == iIntValue) {
            LinearGradient linearGradient3 = new LinearGradient(f, f2, f4, f3, iArr, a(fArr), Shader.TileMode.CLAMP);
            matrix = new Matrix();
            if (i < i2) {
                matrix.setScale(1.0f, (i2 * 1.0f) / i);
            } else {
                matrix.setScale((i * 1.0f) / i2, 1.0f);
            }
            linearGradient3.setLocalMatrix(matrix);
            return linearGradient3;
        }
        return new LinearGradient(f, f2, f4, f3, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public static float[] a(float[] fArr, float[] fArr2, int i) {
        int i2 = i % 4;
        if (i2 == 0) {
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
        } else if (i2 == 1) {
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 1.0f;
            fArr2[3] = 0.0f;
        } else if (i2 == 2) {
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 1.0f;
        } else if (i2 == 3) {
            fArr2[0] = 1.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
        }
        if (fArr != null && fArr.length >= 2) {
            float f = fArr[0];
            float f2 = fArr[fArr.length - 1];
            float fMin = Math.min(f, f2);
            float fMax = Math.max(f, f2);
            if (fMin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float fAbs = Math.abs(fMin);
                if (i2 == 0) {
                    fArr2[1] = fAbs + 1.0f;
                } else if (i2 == 1) {
                    fArr2[0] = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - fAbs;
                } else if (i2 == 2) {
                    fArr2[1] = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - fAbs;
                } else if (i2 == 3) {
                    fArr2[0] = fAbs + 1.0f;
                }
            }
            if (fMax > 1.0f) {
                float f3 = fMax - 1.0f;
                if (i2 == 0) {
                    fArr2[3] = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
                } else {
                    if (i2 == 1) {
                        fArr2[2] = f3 + 1.0f;
                        return fArr2;
                    }
                    if (i2 == 2) {
                        fArr2[3] = f3 + 1.0f;
                        return fArr2;
                    }
                    if (i2 == 3) {
                        fArr2[2] = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
                        return fArr2;
                    }
                }
            }
        }
        return fArr2;
    }
}
