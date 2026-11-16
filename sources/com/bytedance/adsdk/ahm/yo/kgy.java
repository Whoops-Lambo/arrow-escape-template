package com.bytedance.adsdk.ahm.yo;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.ahm.yo;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy<T> {
    public T ahm;
    private float at;
    public final Interpolator ct;
    private float dg;
    public PointF fi;
    public PointF gf;
    public final T kgy;
    private int kus;
    public final float noq;
    private float nu;
    private final yo ra;
    public final Interpolator rz;
    private int twf;
    public final Interpolator uq;
    private float vs;
    public Float yo;

    public boolean ct() {
        return this.rz == null && this.uq == null && this.ct == null;
    }

    public int fi() {
        if (this.twf == 784923401) {
            this.twf = ((Integer) this.kgy).intValue();
        }
        return this.twf;
    }

    public int gf() {
        if (this.kus == 784923401) {
            this.kus = ((Integer) this.ahm).intValue();
        }
        return this.kus;
    }

    public float noq() {
        if (this.nu == -3987645.8f) {
            this.nu = ((Float) this.kgy).floatValue();
        }
        return this.nu;
    }

    public float rz() {
        yo yoVar = this.ra;
        if (yoVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.vs == Float.MIN_VALUE) {
            this.vs = (this.noq - yoVar.noq()) / this.ra.xh();
        }
        return this.vs;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.kgy + ", endValue=" + this.ahm + ", startFrame=" + this.noq + ", endFrame=" + this.yo + ", interpolator=" + this.rz + '}';
    }

    public float uq() {
        if (this.ra == null) {
            return 1.0f;
        }
        if (this.dg == Float.MIN_VALUE) {
            if (this.yo == null) {
                this.dg = 1.0f;
            } else {
                this.dg = ((this.yo.floatValue() - this.noq) / this.ra.xh()) + rz();
            }
        }
        return this.dg;
    }

    public float yo() {
        if (this.at == -3987645.8f) {
            this.at = ((Float) this.ahm).floatValue();
        }
        return this.at;
    }

    public kgy(T t) {
        this.nu = -3987645.8f;
        this.at = -3987645.8f;
        this.twf = 784923401;
        this.kus = 784923401;
        this.vs = Float.MIN_VALUE;
        this.dg = Float.MIN_VALUE;
        this.fi = null;
        this.gf = null;
        this.ra = null;
        this.kgy = t;
        this.ahm = t;
        this.rz = null;
        this.uq = null;
        this.ct = null;
        this.noq = Float.MIN_VALUE;
        this.yo = Float.valueOf(Float.MAX_VALUE);
    }

    public boolean kgy(float f) {
        if (f >= rz() && f < uq()) {
            return true;
        }
        return false;
    }

    public kgy<T> kgy(T t, T t2) {
        return new kgy<>(t, t2);
    }

    public kgy(yo yoVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.nu = -3987645.8f;
        this.at = -3987645.8f;
        this.twf = 784923401;
        this.kus = 784923401;
        this.vs = Float.MIN_VALUE;
        this.dg = Float.MIN_VALUE;
        this.fi = null;
        this.gf = null;
        this.ra = yoVar;
        this.kgy = t;
        this.ahm = t2;
        this.rz = null;
        this.uq = interpolator;
        this.ct = interpolator2;
        this.noq = f;
        this.yo = f2;
    }

    public kgy(yo yoVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.nu = -3987645.8f;
        this.at = -3987645.8f;
        this.twf = 784923401;
        this.kus = 784923401;
        this.vs = Float.MIN_VALUE;
        this.dg = Float.MIN_VALUE;
        this.fi = null;
        this.gf = null;
        this.ra = yoVar;
        this.kgy = t;
        this.ahm = t2;
        this.rz = interpolator;
        this.uq = interpolator2;
        this.ct = interpolator3;
        this.noq = f;
        this.yo = f2;
    }

    public kgy(yo yoVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.nu = -3987645.8f;
        this.at = -3987645.8f;
        this.twf = 784923401;
        this.kus = 784923401;
        this.vs = Float.MIN_VALUE;
        this.dg = Float.MIN_VALUE;
        this.fi = null;
        this.gf = null;
        this.ra = yoVar;
        this.kgy = t;
        this.ahm = t2;
        this.rz = interpolator;
        this.uq = null;
        this.ct = null;
        this.noq = f;
        this.yo = f2;
    }

    private kgy(T t, T t2) {
        this.nu = -3987645.8f;
        this.at = -3987645.8f;
        this.twf = 784923401;
        this.kus = 784923401;
        this.vs = Float.MIN_VALUE;
        this.dg = Float.MIN_VALUE;
        this.fi = null;
        this.gf = null;
        this.ra = null;
        this.kgy = t;
        this.ahm = t2;
        this.rz = null;
        this.uq = null;
        this.ct = null;
        this.noq = Float.MIN_VALUE;
        this.yo = Float.valueOf(Float.MAX_VALUE);
    }
}
