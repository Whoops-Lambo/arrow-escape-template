package com.bytedance.adsdk.ugeno.ahm.ahm;

import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class uq {
    private final ahm.rz ahm;
    private final float[] at;
    private final float[] ct;
    private int dg;
    private final float[] fi;
    private final float[] gf;
    private final ahm kgy;
    private int kus;
    private final float[] noq;
    private final float[] nu;
    private final float[] ra;
    private final ahm.uq[] rz;
    private final int[] twf;
    private int um;
    private final float[] uq;
    private final float[] vs;
    private int xh;
    private final float[] yo;

    private void ahm(int i) {
        float fKgy = this.ahm.gf.kgy(this.xh);
        float fKgy2 = this.ahm.ra.kgy(this.um);
        float f = fKgy < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : fKgy;
        float f2 = fKgy2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : fKgy2;
        float fKgy3 = this.ahm.yo.kgy(this.xh);
        float fKgy4 = this.ahm.fi.kgy(this.um);
        float f3 = f / 2.0f;
        float f4 = fKgy3 - f3;
        float f5 = f2 / 2.0f;
        float f6 = fKgy4 - f5;
        ahm.rz rzVar = this.ahm;
        int i2 = rzVar.uq;
        int i3 = rzVar.ct;
        if (i2 == 2) {
            if (i3 == 1) {
                kgy(i, f4, f6, f, f2);
                return;
            } else {
                this.uq[i] = (rz() * f) + f4;
                this.ct[i] = (rz() * f2) + f6;
                return;
            }
        }
        if (i2 == 3 || i2 == 4) {
            float fRz = rz() * 6.2831855f;
            float fSqrt = i3 == 1 ? 1.0f : (float) Math.sqrt(rz());
            double d = fRz;
            this.uq[i] = (((float) Math.cos(d)) * f3 * fSqrt) + fKgy3;
            this.ct[i] = (((float) Math.sin(d)) * f5 * fSqrt) + fKgy4;
            return;
        }
        float[] fArr = this.uq;
        if (i2 == 1) {
            fArr[i] = (rz() * f) + f4;
            this.ct[i] = fKgy4;
        } else {
            fArr[i] = fKgy3;
            this.ct[i] = fKgy4;
        }
    }

    private void kgy(int i, ahm.uq uqVar) {
        int i2 = this.kus;
        this.kus = i2 + 1;
        float fKgy = kgy(uqVar.rz, uqVar.uq);
        if (fKgy < 0.01f) {
            fKgy = 0.01f;
        }
        float fKgy2 = kgy(uqVar.ct, uqVar.noq);
        if (fKgy2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fKgy2 = 0.0f;
        }
        float fKgy3 = kgy(uqVar.yo, uqVar.fi);
        if (fKgy3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fKgy3 = 0.0f;
        }
        float fRz = rz() * 6.2831855f;
        float radians = (float) Math.toRadians(uqVar.gf);
        if (radians > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fRz = h50.c(rz(), 0.5f, radians, fRz);
        }
        float fRz2 = 1.0f - (uqVar.ra > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? rz() * uqVar.ra : 0.0f);
        if (fRz2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fRz2 = 0.0f;
        }
        this.fi[i2] = 0.0f;
        this.gf[i2] = fKgy;
        this.ra[i2] = fKgy2;
        double d = fRz;
        this.noq[i2] = ((float) Math.cos(d)) * fKgy3;
        this.yo[i2] = ((float) Math.sin(d)) * fKgy3;
        this.nu[i2] = fRz2;
        this.at[i2] = uqVar.nu;
        this.twf[i2] = i;
        ahm(i2);
    }

    private void rz(float f) {
        ahm.uq[] uqVarArr = this.rz;
        float[] fArr = this.vs;
        for (int i = 0; i < uqVarArr.length; i++) {
            ahm.uq uqVar = uqVarArr[i];
            float f2 = uqVar.ahm;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[i] = (f2 * f) + fArr[i];
                while (true) {
                    float f3 = fArr[i];
                    if (f3 < 1.0f || this.kus >= 600) {
                        break;
                    }
                    fArr[i] = f3 - 1.0f;
                    kgy(i, uqVar);
                }
                if (this.kus >= 600) {
                    fArr[i] = 0.0f;
                }
            }
        }
    }

    public uq(ahm ahmVar) {
        this.kgy = ahmVar;
        this.ahm = ahmVar.kgy();
        ahm.uq[] uqVarArr = (ahm.uq[]) ahmVar.ahm().toArray(new ahm.uq[0]);
        this.rz = uqVarArr;
        this.uq = new float[600];
        this.ct = new float[600];
        this.noq = new float[600];
        this.yo = new float[600];
        this.fi = new float[600];
        this.gf = new float[600];
        this.ra = new float[600];
        this.nu = new float[600];
        this.at = new float[600];
        this.twf = new int[600];
        this.vs = new float[uqVarArr.length];
        int iNanoTime = (int) (System.nanoTime() ^ ((long) System.identityHashCode(this)));
        this.dg = iNanoTime == 0 ? 305441741 : iNanoTime;
    }

    private float rz() {
        int i = this.dg;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        if (i4 == 0) {
            i4 = -1640531527;
        }
        this.dg = i4;
        return (i4 >>> 8) * 5.9604645E-8f;
    }

    public ahm.uq[] kgy() {
        return this.rz;
    }

    public void kgy(float f) {
        if (this.xh <= 0 || this.um <= 0 || this.rz.length == 0) {
            return;
        }
        ahm(f);
        rz(f);
    }

    private void kgy(int i) {
        int i2 = this.kus - 1;
        this.kus = i2;
        if (i != i2) {
            float[] fArr = this.uq;
            fArr[i] = fArr[i2];
            float[] fArr2 = this.ct;
            fArr2[i] = fArr2[i2];
            float[] fArr3 = this.noq;
            fArr3[i] = fArr3[i2];
            float[] fArr4 = this.yo;
            fArr4[i] = fArr4[i2];
            float[] fArr5 = this.fi;
            fArr5[i] = fArr5[i2];
            float[] fArr6 = this.gf;
            fArr6[i] = fArr6[i2];
            float[] fArr7 = this.ra;
            fArr7[i] = fArr7[i2];
            float[] fArr8 = this.nu;
            fArr8[i] = fArr8[i2];
            float[] fArr9 = this.at;
            fArr9[i] = fArr9[i2];
            int[] iArr = this.twf;
            iArr[i] = iArr[i2];
        }
    }

    public void kgy(int i, int i2) {
        this.xh = i;
        this.um = i2;
    }

    private void kgy(int i, float f, float f2, float f3, float f4) {
        float f5 = f3 + f4;
        float f6 = f5 * 2.0f;
        if (f6 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.uq[i] = f;
            this.ct[i] = f2;
            return;
        }
        float fRz = rz() * f6;
        if (fRz < f3) {
            this.uq[i] = f + fRz;
            this.ct[i] = f2;
            return;
        }
        if (fRz < f5) {
            this.uq[i] = f + f3;
            this.ct[i] = (fRz - f3) + f2;
            return;
        }
        float f7 = 2.0f * f3;
        float f8 = f7 + f4;
        float[] fArr = this.uq;
        if (fRz < f8) {
            fArr[i] = (f + f3) - ((fRz - f3) - f4);
            this.ct[i] = f2 + f4;
        } else {
            fArr[i] = f;
            this.ct[i] = (f2 + f4) - ((fRz - f7) - f4);
        }
    }

    private float kgy(float f, float f2) {
        return f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f : (((rz() * 2.0f) - 1.0f) * f2) + f;
    }

    public void kgy(noq noqVar) {
        int i = this.kus;
        noqVar.kgy(600);
        noqVar.kgy = i;
        System.arraycopy(this.uq, 0, noqVar.rz, 0, i);
        System.arraycopy(this.ct, 0, noqVar.uq, 0, i);
        System.arraycopy(this.ra, 0, noqVar.ct, 0, i);
        System.arraycopy(this.nu, 0, noqVar.noq, 0, i);
        System.arraycopy(this.fi, 0, noqVar.yo, 0, i);
        System.arraycopy(this.twf, 0, noqVar.fi, 0, i);
        noqVar.ahm = this.ahm.noq;
    }

    private void ahm(float f) {
        float[] fArr = this.uq;
        float[] fArr2 = this.ct;
        float[] fArr3 = this.noq;
        float[] fArr4 = this.yo;
        float[] fArr5 = this.fi;
        float[] fArr6 = this.gf;
        float[] fArr7 = this.nu;
        float[] fArr8 = this.at;
        int i = 0;
        while (i < this.kus) {
            float f2 = fArr5[i] + f;
            if (f2 >= fArr6[i]) {
                kgy(i);
            } else {
                float f3 = (fArr8[i] * f) + fArr7[i];
                if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    kgy(i);
                } else {
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    fArr5[i] = f2;
                    fArr7[i] = f3;
                    fArr[i] = (fArr3[i] * f) + fArr[i];
                    fArr2[i] = (fArr4[i] * f) + fArr2[i];
                    i++;
                }
            }
        }
    }

    public ahm ahm() {
        return this.kgy;
    }
}
