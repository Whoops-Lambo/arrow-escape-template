package com.adsurge.adn.V0;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public final float[] a;
    public final float[] b;
    public final float[] c = new float[3];
    public boolean d = true;

    public static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    static {
        d dVar = new d();
        e = dVar;
        b(dVar);
        e(dVar);
        d dVar2 = new d();
        f = dVar2;
        d(dVar2);
        e(dVar2);
        d dVar3 = new d();
        g = dVar3;
        a(dVar3);
        e(dVar3);
        d dVar4 = new d();
        h = dVar4;
        b(dVar4);
        c(dVar4);
        d dVar5 = new d();
        i = dVar5;
        d(dVar5);
        c(dVar5);
        d dVar6 = new d();
        j = dVar6;
        a(dVar6);
        c(dVar6);
    }

    public static void b(d dVar) {
        float[] fArr = dVar.b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void c(d dVar) {
        float[] fArr = dVar.a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void d(d dVar) {
        float[] fArr = dVar.b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void e(d dVar) {
        float[] fArr = dVar.a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public float f() {
        return this.c[2];
    }

    public float g() {
        return this.c[0];
    }

    public float h() {
        return this.b[1];
    }

    public float i() {
        return this.a[1];
    }

    public boolean j() {
        return this.d;
    }

    public void k() {
        int length = this.c.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.c[i2];
            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 += f3;
            }
        }
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int length2 = this.c.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.c;
                float f4 = fArr[i3];
                if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fArr[i3] = f4 / f2;
                }
            }
        }
    }

    public final void l() {
        float[] fArr = this.c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    public d() {
        float[] fArr = new float[3];
        this.a = fArr;
        float[] fArr2 = new float[3];
        this.b = fArr2;
        a(fArr);
        a(fArr2);
        l();
    }

    public float e() {
        return this.a[0];
    }

    public float a() {
        return this.c[1];
    }

    public float b() {
        return this.b[2];
    }

    public float c() {
        return this.a[2];
    }

    public static void a(d dVar) {
        float[] fArr = dVar.b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public float d() {
        return this.b[0];
    }
}
