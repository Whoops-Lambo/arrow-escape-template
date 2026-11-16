package com.adsurge.adn.V0;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final c f = new a();
    public final List a;
    public final List b;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final Map c = new ArrayMap();
    public final d e = a();

    /* JADX INFO: renamed from: com.adsurge.adn.V0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0094b {
        public final List a;
        public final Bitmap b;
        public final List c;
        public int d;
        public int e;
        public int f;
        public final List g;
        public Rect h;

        public b a() {
            List listA;
            Bitmap bitmap = this.b;
            c[] cVarArr = null;
            if (bitmap != null) {
                Bitmap bitmapB = b(bitmap);
                Rect rect = this.h;
                if (bitmapB != this.b && rect != null) {
                    double width = ((double) bitmapB.getWidth()) / ((double) this.b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapB.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapB.getHeight());
                }
                int[] iArrA = a(bitmapB);
                int i = this.d;
                if (!this.g.isEmpty()) {
                    List list = this.g;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                com.adsurge.adn.V0.a aVar = new com.adsurge.adn.V0.a(iArrA, i, cVarArr);
                if (bitmapB != this.b) {
                    bitmapB.recycle();
                }
                listA = aVar.a();
            } else {
                listA = this.a;
                if (listA == null) {
                    y.o();
                    return null;
                }
            }
            b bVar = new b(listA, this.c);
            bVar.b();
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0032  */
        public final Bitmap b(Bitmap bitmap) {
            int iMax;
            int i;
            double dSqrt;
            if (this.e > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                int i2 = this.e;
                if (height > i2) {
                    dSqrt = Math.sqrt(((double) i2) / ((double) height));
                } else {
                    dSqrt = -1.0d;
                }
            } else if (this.f <= 0 || (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) <= (i = this.f)) {
                dSqrt = -1.0d;
            } else {
                dSqrt = ((double) i) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }

        public C0094b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            this.d = 16;
            this.e = 12544;
            this.f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(b.f);
                this.b = bitmap;
                this.a = null;
                arrayList.add(com.adsurge.adn.V0.d.e);
                arrayList.add(com.adsurge.adn.V0.d.f);
                arrayList.add(com.adsurge.adn.V0.d.g);
                arrayList.add(com.adsurge.adn.V0.d.h);
                arrayList.add(com.adsurge.adn.V0.d.i);
                arrayList.add(com.adsurge.adn.V0.d.j);
                return;
            }
            defpackage.d.r("Bitmap is not valid");
            throw null;
        }

        public final int[] a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i = 0; i < iHeight; i++) {
                Rect rect2 = this.h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * iWidth, iWidth);
            }
            return iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface c {
        boolean a(int i, float[] fArr);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public boolean f;
        public int g;
        public int h;
        public float[] i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.e == dVar.e && this.d == dVar.d) {
                    return true;
                }
            }
            return false;
        }

        public final void a() {
            if (this.f) {
                return;
            }
            int iA = com.adsurge.adn.U0.a.a(-1, this.d, 4.5f);
            int iA2 = com.adsurge.adn.U0.a.a(-1, this.d, 3.0f);
            if (iA != -1 && iA2 != -1) {
                this.h = com.adsurge.adn.U0.a.d(-1, iA);
                this.g = com.adsurge.adn.U0.a.d(-1, iA2);
                this.f = true;
                return;
            }
            int iA3 = com.adsurge.adn.U0.a.a(-16777216, this.d, 4.5f);
            int iA4 = com.adsurge.adn.U0.a.a(-16777216, this.d, 3.0f);
            if (iA3 == -1 || iA4 == -1) {
                this.h = iA != -1 ? com.adsurge.adn.U0.a.d(-1, iA) : com.adsurge.adn.U0.a.d(-16777216, iA3);
                this.g = iA2 != -1 ? com.adsurge.adn.U0.a.d(-1, iA2) : com.adsurge.adn.U0.a.d(-16777216, iA4);
                this.f = true;
            } else {
                this.h = com.adsurge.adn.U0.a.d(-16777216, iA3);
                this.g = com.adsurge.adn.U0.a.d(-16777216, iA4);
                this.f = true;
            }
        }

        public float[] c() {
            if (this.i == null) {
                this.i = new float[3];
            }
            com.adsurge.adn.U0.a.a(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int d() {
            return this.e;
        }

        public int e() {
            return this.d;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }

        public d(int i, int i2) {
            this.a = Color.red(i);
            this.b = Color.green(i);
            this.c = Color.blue(i);
            this.d = i;
            this.e = i2;
        }

        public int b() {
            a();
            return this.h;
        }

        public int f() {
            a();
            return this.g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements c {
        public final boolean b(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean c(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        @Override // com.adsurge.adn.V0.b.c
        public boolean a(int i, float[] fArr) {
            if (!c(fArr) && !a(fArr) && !b(fArr)) {
                return true;
            }
            return false;
        }

        public final boolean a(float[] fArr) {
            return fArr[2] <= 0.05f;
        }
    }

    public d c(com.adsurge.adn.V0.d dVar) {
        return (d) this.c.get(dVar);
    }

    public d d() {
        return c(com.adsurge.adn.V0.d.g);
    }

    public d e() {
        return c(com.adsurge.adn.V0.d.h);
    }

    public d f() {
        return c(com.adsurge.adn.V0.d.e);
    }

    public d g() {
        return c(com.adsurge.adn.V0.d.i);
    }

    public d h() {
        return c(com.adsurge.adn.V0.d.f);
    }

    public b(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final float a(d dVar, com.adsurge.adn.V0.d dVar2) {
        int iD;
        float fAbs;
        float fAbs2;
        float[] fArrC = dVar.c();
        d dVar3 = this.e;
        if (dVar3 != null) {
            iD = dVar3.d();
        } else {
            iD = 1;
        }
        float fG = dVar2.g();
        float fD = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (fG > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fAbs = (1.0f - Math.abs(fArrC[1] - dVar2.i())) * dVar2.g();
        } else {
            fAbs = 0.0f;
        }
        if (dVar2.a() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fAbs2 = (1.0f - Math.abs(fArrC[2] - dVar2.h())) * dVar2.a();
        } else {
            fAbs2 = 0.0f;
        }
        if (dVar2.f() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fD = (dVar.d() / iD) * dVar2.f();
        }
        return fAbs + fAbs2 + fD;
    }

    public final boolean b(d dVar, com.adsurge.adn.V0.d dVar2) {
        float[] fArrC = dVar.c();
        if (fArrC[1] >= dVar2.e() && fArrC[1] <= dVar2.c() && fArrC[2] >= dVar2.d() && fArrC[2] <= dVar2.b() && !this.d.get(dVar.e())) {
            return true;
        }
        return false;
    }

    public d c() {
        return c(com.adsurge.adn.V0.d.j);
    }

    public final d b(com.adsurge.adn.V0.d dVar) {
        int size = this.a.size();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        d dVar2 = null;
        for (int i = 0; i < size; i++) {
            d dVar3 = (d) this.a.get(i);
            if (b(dVar3, dVar)) {
                float fA = a(dVar3, dVar);
                if (dVar2 == null || fA > f2) {
                    dVar2 = dVar3;
                    f2 = fA;
                }
            }
        }
        return dVar2;
    }

    public void b() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            com.adsurge.adn.V0.d dVar = (com.adsurge.adn.V0.d) this.b.get(i);
            dVar.k();
            this.c.put(dVar, a(dVar));
        }
        this.d.clear();
    }

    public final d a(com.adsurge.adn.V0.d dVar) {
        d dVarB = b(dVar);
        if (dVarB != null && dVar.j()) {
            this.d.append(dVarB.e(), true);
        }
        return dVarB;
    }

    public final d a() {
        int size = this.a.size();
        int iD = Integer.MIN_VALUE;
        d dVar = null;
        for (int i = 0; i < size; i++) {
            d dVar2 = (d) this.a.get(i);
            if (dVar2.d() > iD) {
                iD = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }
}
