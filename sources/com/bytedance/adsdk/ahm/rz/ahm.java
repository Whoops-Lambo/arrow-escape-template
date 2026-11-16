package com.bytedance.adsdk.ahm.rz;

import android.graphics.PointF;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ahm {
    public String ahm;
    public PointF at;
    public int ct;
    public int fi;
    public int gf;
    public String kgy;
    public float noq;
    public boolean nu;
    public float ra;
    public float rz;
    public PointF twf;
    public kgy uq;
    public float yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public int hashCode() {
        int iOrdinal = ((this.uq.ordinal() + (((int) (n30.c(this.kgy.hashCode() * 31, 31, this.ahm) + this.rz)) * 31)) * 31) + this.ct;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.noq);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.fi;
    }

    public void kgy(String str, String str2, float f, kgy kgyVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.kgy = str;
        this.ahm = str2;
        this.rz = f;
        this.uq = kgyVar;
        this.ct = i;
        this.noq = f2;
        this.yo = f3;
        this.fi = i2;
        this.gf = i3;
        this.ra = f4;
        this.nu = z;
        this.at = pointF;
        this.twf = pointF2;
    }

    public ahm(String str, String str2, float f, kgy kgyVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        kgy(str, str2, f, kgyVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public ahm() {
    }
}
