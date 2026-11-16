package com.bytedance.adsdk.ahm.noq;

import android.view.Choreographer;
import com.bytedance.adsdk.ahm.yo;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz extends kgy implements Choreographer.FrameCallback {
    private yo ra;
    private float ahm = 1.0f;
    private boolean rz = false;
    private long uq = 0;
    private float ct = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float noq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private int yo = 0;
    private float fi = -2.1474836E9f;
    private float gf = 2.1474836E9f;
    protected boolean kgy = false;
    private boolean nu = false;

    public void fi() {
        this.ra = null;
        this.fi = -2.1474836E9f;
        this.gf = 2.1474836E9f;
    }

    public void kus() {
        this.kgy = true;
        xh();
        this.uq = 0L;
        if (sx() && yo() == vs()) {
            kgy(dg());
        } else if (!sx() && yo() == dg()) {
            kgy(vs());
        }
        ct();
    }

    public void nu() {
        this.kgy = true;
        kgy(sx());
        kgy((int) (sx() ? dg() : vs()));
        this.uq = 0L;
        this.yo = 0;
        xh();
    }

    public void um() {
        uq(true);
    }

    private float fpp() {
        yo yoVar = this.ra;
        if (yoVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / yoVar.at()) / Math.abs(this.ahm);
    }

    private void gm() {
        if (this.ra == null) {
            return;
        }
        float f = this.noq;
        float f2 = this.fi;
        if (f < f2 || f > this.gf) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f2), Float.valueOf(this.gf), Float.valueOf(this.noq)));
        }
    }

    public float dg() {
        yo yoVar = this.ra;
        if (yoVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.gf;
        return f == 2.1474836E9f ? yoVar.yo() : f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fVs;
        float fDg;
        float fVs2;
        if (this.ra == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (sx()) {
            fVs = dg() - this.noq;
            fDg = dg();
            fVs2 = vs();
        } else {
            fVs = this.noq - vs();
            fDg = dg();
            fVs2 = vs();
        }
        return fVs / (fDg - fVs2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        yo yoVar = this.ra;
        if (yoVar == null) {
            return 0L;
        }
        return (long) yoVar.ct();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.kgy;
    }

    public void kgy(float f, float f2) {
        if (f > f2) {
            y.k("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        yo yoVar = this.ra;
        float fNoq = yoVar == null ? -3.4028235E38f : yoVar.noq();
        yo yoVar2 = this.ra;
        float fYo = yoVar2 == null ? Float.MAX_VALUE : yoVar2.yo();
        float fAhm = ct.ahm(f, fNoq, fYo);
        float fAhm2 = ct.ahm(f2, fNoq, fYo);
        if (fAhm == this.fi && fAhm2 == this.gf) {
            return;
        }
        this.fi = fAhm;
        this.gf = fAhm2;
        kgy((int) ct.ahm(this.noq, fAhm, fAhm2));
    }

    public float noq() {
        yo yoVar = this.ra;
        return yoVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.noq - yoVar.noq()) / (this.ra.yo() - this.ra.noq());
    }

    public float ra() {
        return this.ahm;
    }

    public void rz(boolean z) {
        this.nu = z;
    }

    public float vs() {
        yo yoVar = this.ra;
        if (yoVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.fi;
        return f == -2.1474836E9f ? yoVar.noq() : f;
    }

    public float yo() {
        return this.noq;
    }

    private boolean sx() {
        if (ra() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ahm.noq.kgy
    public void ahm() {
        super.ahm();
        ahm(sx());
    }

    public void at() {
        um();
        ahm(sx());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        ahm();
        um();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float fVs;
        float fDg;
        xh();
        if (this.ra != null && isRunning()) {
            com.bytedance.adsdk.ahm.ct.kgy("LottieValueAnimator#doFrame");
            long j2 = this.uq;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float fFpp = j3 / fpp();
            float f = this.ct;
            if (sx()) {
                fFpp = -fFpp;
            }
            float f2 = f + fFpp;
            boolean zRz = ct.rz(f2, vs(), dg());
            float f3 = this.ct;
            float fAhm = ct.ahm(f2, vs(), dg());
            this.ct = fAhm;
            if (this.nu) {
                fAhm = (float) Math.floor(fAhm);
            }
            this.noq = fAhm;
            this.uq = j;
            if (!this.nu || this.ct != f3) {
                rz();
            }
            if (!zRz) {
                if (getRepeatCount() != -1 && this.yo >= getRepeatCount()) {
                    if (this.ahm < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fDg = vs();
                    } else {
                        fDg = dg();
                    }
                    this.ct = fDg;
                    this.noq = fDg;
                    um();
                    ahm(sx());
                } else {
                    kgy();
                    this.yo++;
                    if (getRepeatMode() == 2) {
                        this.rz = !this.rz;
                        gf();
                    } else {
                        if (sx()) {
                            fVs = dg();
                        } else {
                            fVs = vs();
                        }
                        this.ct = fVs;
                        this.noq = fVs;
                    }
                    this.uq = j;
                }
            }
            gm();
            com.bytedance.adsdk.ahm.ct.ahm("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(noq());
    }

    public void gf() {
        rz(-ra());
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.rz) {
            this.rz = false;
            gf();
        }
    }

    public void twf() {
        um();
        uq();
    }

    public void uq(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.kgy = false;
        }
    }

    public void xh() {
        if (isRunning()) {
            uq(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void rz(float f) {
        this.ahm = f;
    }

    public void ahm(float f) {
        kgy(this.fi, f);
    }

    public void kgy(float f) {
        if (this.ct == f) {
            return;
        }
        float fAhm = ct.ahm(f, vs(), dg());
        this.ct = fAhm;
        if (this.nu) {
            fAhm = (float) Math.floor(fAhm);
        }
        this.noq = fAhm;
        this.uq = 0L;
        rz();
    }

    public void kgy(int i) {
        kgy(i, (int) this.gf);
    }

    public void kgy(yo yoVar) {
        boolean z = this.ra == null;
        this.ra = yoVar;
        if (z) {
            kgy(Math.max(this.fi, yoVar.noq()), Math.min(this.gf, yoVar.yo()));
        } else {
            kgy((int) yoVar.noq(), (int) yoVar.yo());
        }
        float f = this.noq;
        this.noq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ct = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        kgy((int) f);
        rz();
    }
}
