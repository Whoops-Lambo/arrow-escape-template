package io.p071bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;
import defpackage.du;
import defpackage.j71;
import defpackage.tb5;
import io.p071bidmachine.rendering.model.j;
import io.p071bidmachine.t1;
import io.p071bidmachine.util.p;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public final j a;
    public final /* synthetic */ int b;

    public b(j jVar, int i) {
        this.b = i;
        this.a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [int] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    public final Boolean b(Bitmap bitmap) {
        float f;
        float f2;
        boolean z;
        float fIntValue;
        int i;
        float f3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ?? r16;
        float f4;
        int i8;
        int i9;
        Float fValueOf;
        j71 j71Var;
        Boolean boolValueOf;
        int i10 = this.b;
        int i11 = 1;
        j jVar = this.a;
        switch (i10) {
            case 0:
                bitmap.getClass();
                j71 j71VarD = tb5.D(0, bitmap.getWidth());
                j71 j71VarD2 = tb5.D(0, bitmap.getHeight());
                int iV = du.V(j71VarD2) * du.V(j71VarD);
                int[] iArr = new int[bitmap.getWidth()];
                int i12 = j71VarD2.a;
                int i13 = j71VarD2.b;
                if (i12 <= i13) {
                    int i14 = i12;
                    f = 0.0f;
                    f2 = 0.0f;
                    while (true) {
                        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i14, bitmap.getWidth(), 1);
                        int i15 = j71VarD.a;
                        int i16 = j71VarD.b;
                        if (i15 <= i16) {
                            while (true) {
                                int i17 = iArr[i15];
                                float fG = (p.g(i17) * 0.114f) + (p.z(i17) * 0.587f) + (p.Q(i17) * 0.299f);
                                f += fG;
                                f2 += fG * fG;
                                if (i15 != i16) {
                                    i15++;
                                }
                            }
                        }
                        if (i14 != i13) {
                            i14++;
                        }
                    }
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
                float f5 = iV;
                float f6 = f / f5;
                float f7 = (f2 / f5) - (f6 * f6);
                float fSqrt = f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (float) Math.sqrt(f7);
                boolean z2 = fSqrt <= jVar.b;
                c(Float.valueOf(fSqrt), Boolean.valueOf(z2));
                return Boolean.valueOf(z2);
            case 1:
                Bitmap bitmap2 = bitmap;
                boolean z3 = true;
                bitmap2.getClass();
                float f8 = jVar.b;
                if (f8 > 0.5f) {
                    j71 j71VarD3 = tb5.D(0, bitmap2.getWidth());
                    j71 j71VarD4 = tb5.D(0, bitmap2.getHeight());
                    int iV2 = du.V(j71VarD3);
                    int i18 = j71VarD3.b;
                    int i19 = j71VarD3.a;
                    int iV3 = du.V(j71VarD4) * iV2;
                    int[] iArr2 = new int[bitmap2.getWidth()];
                    int i20 = j71VarD4.a;
                    int i21 = j71VarD4.b;
                    if (i20 <= i21) {
                        int i22 = i20;
                        int i23 = i22;
                        ?? r17 = 0;
                        i4 = 0;
                        while (true) {
                            int width = bitmap2.getWidth();
                            int width2 = bitmap2.getWidth();
                            i = i22;
                            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            z = z3;
                            i2 = i21;
                            bitmap2.getPixels(iArr2, 0, width, 0, i23, width2, 1);
                            ?? r18 = r17;
                            if (i19 <= i18) {
                                int i24 = i19;
                                int i25 = i4;
                                ?? r19 = r17;
                                while (true) {
                                    int i26 = iArr2[i24];
                                    if (r19 == 0) {
                                        i25 = i26;
                                        r16 = z;
                                    } else if (i26 == i25) {
                                        i7 = r19 + 1;
                                    } else {
                                        i6 = r19 - 1;
                                    }
                                    if (i24 != i18) {
                                        r16 = i6;
                                        r16 = i7;
                                        i24++;
                                        r19 = r16;
                                    } else {
                                        r16 = i6;
                                        r16 = i7;
                                        i4 = i25;
                                        r18 = r16;
                                    }
                                }
                            }
                            if (i23 != i2) {
                                i23++;
                                bitmap2 = bitmap;
                                i22 = i;
                                i21 = i2;
                                z3 = z;
                                r17 = r18;
                            } else {
                                i3 = r18 == true ? 1 : 0;
                            }
                        }
                    } else {
                        i = i20;
                        z = true;
                        f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        i2 = i21;
                        i3 = 0;
                        i4 = 0;
                    }
                    float f9 = iV3;
                    if (i3 < ((2.0f * f8) - 1.0f) * f9) {
                        fIntValue = f3;
                    } else {
                        if (i <= i2) {
                            int i27 = i;
                            i5 = 0;
                            while (true) {
                                int i28 = i4;
                                bitmap.getPixels(iArr2, 0, bitmap.getWidth(), 0, i27, bitmap.getWidth(), 1);
                                if (i19 <= i18) {
                                    int i29 = i19;
                                    while (true) {
                                        if (iArr2[i29] == i28) {
                                            i5++;
                                        }
                                        if (i29 != i18) {
                                            i29++;
                                        }
                                    }
                                }
                                if (i27 != i2) {
                                    i27++;
                                    i4 = i28;
                                }
                            }
                        } else {
                            i5 = 0;
                        }
                        fIntValue = i5 / f9;
                    }
                } else {
                    z = true;
                    j71 j71VarD5 = tb5.D(0, bitmap.getWidth());
                    j71 j71VarD6 = tb5.D(0, bitmap.getHeight());
                    int iV4 = du.V(j71VarD6) * du.V(j71VarD5);
                    int[] iArr3 = new int[bitmap.getWidth()];
                    HashMap map = new HashMap();
                    int i30 = j71VarD6.a;
                    int i31 = j71VarD6.b;
                    if (i30 <= i31) {
                        int i32 = i30;
                        while (true) {
                            bitmap.getPixels(iArr3, 0, bitmap.getWidth(), 0, i32, bitmap.getWidth(), 1);
                            int i33 = j71VarD5.a;
                            int i34 = j71VarD5.b;
                            if (i33 <= i34) {
                                while (true) {
                                    int i35 = iArr3[i33];
                                    Integer numValueOf = Integer.valueOf(i35);
                                    Integer num = (Integer) map.get(Integer.valueOf(i35));
                                    map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                    if (i33 != i34) {
                                        i33++;
                                    }
                                }
                            }
                            if (i32 != i31) {
                                i32++;
                            }
                        }
                    }
                    Integer num2 = (Integer) du.j0(map.values());
                    fIntValue = (num2 != null ? num2.intValue() : 0) / iV4;
                }
                boolean z4 = fIntValue >= f8 ? z : false;
                c(Float.valueOf(fIntValue), Boolean.valueOf(z4));
                return Boolean.valueOf(z4);
            default:
                bitmap.getClass();
                float f10 = jVar.b;
                j71 j71VarD7 = tb5.D(1, bitmap.getWidth() - 1);
                j71 j71VarD8 = tb5.D(1, bitmap.getHeight() - 1);
                int iV5 = du.V(j71VarD8) * du.V(j71VarD7);
                if (iV5 <= 0) {
                    i8 = 1;
                    fValueOf = null;
                } else {
                    int[] iArr4 = new int[bitmap.getWidth()];
                    float[] fArr = new float[bitmap.getWidth()];
                    float f11 = iV5;
                    float f12 = f10 * f11;
                    int i36 = j71VarD8.a;
                    int i37 = j71VarD8.b;
                    if (i36 <= i37) {
                        int i38 = i36;
                        int i39 = 0;
                        while (true) {
                            f4 = f11;
                            int i40 = i37;
                            bitmap.getPixels(iArr4, 0, bitmap.getWidth(), 0, i38, bitmap.getWidth(), 1);
                            int i41 = j71VarD7.a;
                            int i42 = j71VarD7.b;
                            if (i41 <= i42) {
                                Float f13 = null;
                                while (true) {
                                    int iD = d(iArr4[i41]);
                                    int iD2 = d(bitmap.getPixel(i41, i38 - 1));
                                    int iD3 = d(bitmap.getPixel(i41, i38 + 1));
                                    float fA = i38 == i11 ? a(iD, iD2) : fArr[i41];
                                    float fA2 = a(iD, iD3);
                                    fArr[i41] = fA2;
                                    float f14 = fA + fA2;
                                    i8 = i11;
                                    j71Var = j71VarD7;
                                    if (f14 > 0.2d) {
                                        i39++;
                                    } else {
                                        int iD4 = d(bitmap.getPixel(i41 - 1, i38));
                                        int iD5 = d(bitmap.getPixel(i41 + 1, i38));
                                        float fFloatValue = f13 != null ? f13.floatValue() : a(iD, iD4);
                                        float fA3 = a(iD, iD5);
                                        Float fValueOf2 = Float.valueOf(fA3);
                                        if (fFloatValue + fA3 > 0.2d) {
                                            f13 = fValueOf2;
                                            i39++;
                                        } else {
                                            f13 = fValueOf2;
                                        }
                                    }
                                    int i43 = i39;
                                    if (i43 > f12) {
                                        fValueOf = Float.valueOf(1.0f);
                                    } else if (i41 != i42) {
                                        i41++;
                                        i39 = i43;
                                        i11 = i8;
                                        j71VarD7 = j71Var;
                                    } else {
                                        i39 = i43;
                                    }
                                }
                            } else {
                                i8 = i11;
                                j71Var = j71VarD7;
                            }
                            if (i38 != i40) {
                                i38++;
                                i37 = i40;
                                i11 = i8;
                                f11 = f4;
                                j71VarD7 = j71Var;
                            } else {
                                i9 = i39;
                            }
                        }
                    } else {
                        f4 = f11;
                        i8 = 1;
                        i9 = 0;
                    }
                    fValueOf = Float.valueOf(i9 / f4);
                }
                if (fValueOf != null) {
                    boolValueOf = Boolean.valueOf((boolean) (fValueOf.floatValue() <= f10 ? i8 : 0));
                } else {
                    boolValueOf = null;
                }
                c(fValueOf, boolValueOf);
                return boolValueOf;
        }
    }

    public final void c(Float f, Boolean bool) {
        if (t1.b) {
            t1.l("BrokenCreativeDetector", this.a.a.name() + " result - " + f + " (isBroken - " + bool + ')', false, new Object[0]);
        }
    }

    public static float a(int i, int i2) {
        float fQ = p.Q(i) - p.Q(i2);
        float fZ = p.z(i) - p.z(i2);
        float fG = p.g(i) - p.g(i2);
        return (float) Math.sqrt((fG * fG) + (fZ * fZ) + (fQ * fQ));
    }

    public static int d(int i) {
        return (int) ((Color.blue(i) * 0.114f) + (Color.green(i) * 0.587f) + (Color.red(i) * 0.299f));
    }
}
