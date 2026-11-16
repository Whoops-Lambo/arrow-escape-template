package com.adsurge.adn.V0;

import android.graphics.Color;
import android.util.TimingLogger;
import defpackage.e32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static final Comparator g = new C0093a();
    public final int[] a;
    public final int[] b;
    public final List c;
    public final com.adsurge.adn.V0.b.c[] e;
    public final float[] f = new float[3];
    public final TimingLogger d = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            c();
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.a;
            int[] iArr2 = aVar.b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.a; i8 <= this.b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int iF = a.f(i9);
                int iE = a.e(i9);
                int iD = a.d(i9);
                if (iF > i2) {
                    i2 = iF;
                }
                if (iF < i) {
                    i = iF;
                }
                if (iE > i3) {
                    i3 = iE;
                }
                if (iE < i6) {
                    i6 = iE;
                }
                if (iD > i4) {
                    i4 = iD;
                }
                if (iD < i7) {
                    i7 = iD;
                }
            }
            this.d = i;
            this.e = i2;
            this.f = i6;
            this.g = i3;
            this.h = i7;
            this.i = i4;
            this.c = i5;
        }

        public final com.adsurge.adn.V0.b.d d() {
            a aVar = a.this;
            int[] iArr = aVar.a;
            int[] iArr2 = aVar.b;
            int iD = 0;
            int iE = 0;
            int iF = 0;
            int i = 0;
            for (int i2 = this.a; i2 <= this.b; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr2[i3];
                i += i4;
                iF += a.f(i3) * i4;
                iE += a.e(i3) * i4;
                iD += a.d(i3) * i4;
            }
            float f = i;
            return new com.adsurge.adn.V0.b.d(a.a(Math.round(iF / f), Math.round(iE / f), Math.round(iD / f)), i);
        }

        public final int e() {
            return (this.b + 1) - this.a;
        }

        public final int f() {
            int i = this.e - this.d;
            int i2 = this.g - this.f;
            int i3 = this.i - this.h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
        }

        public final boolean a() {
            if (e() > 1) {
                return true;
            }
            return false;
        }

        public final int b() {
            int iF = f();
            a aVar = a.this;
            int[] iArr = aVar.a;
            int[] iArr2 = aVar.b;
            a.a(iArr, iF, this.a, this.b);
            Arrays.sort(iArr, this.a, this.b + 1);
            a.a(iArr, iF, this.a, this.b);
            int i = this.c / 2;
            int i2 = this.a;
            int i3 = 0;
            while (true) {
                int i4 = this.b;
                if (i2 <= i4) {
                    i3 += iArr2[iArr[i2]];
                    if (i3 >= i) {
                        return Math.min(i4 - 1, i2);
                    }
                    i2++;
                } else {
                    return this.a;
                }
            }
        }

        public final b h() {
            if (a()) {
                int iB = b();
                b bVar = a.this.new b(iB + 1, this.b);
                this.b = iB;
                c();
                return bVar;
            }
            e32.i("Can not split a box with only 1 color");
            return null;
        }
    }

    public static void a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = d(i4) | (e(i4) << 10) | (f(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = f(i5) | (d(i5) << 10) | (e(i5) << 5);
            i2++;
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.V0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0093a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    public static int d(int i) {
        return i & 31;
    }

    public static int e(int i) {
        return (i >> 5) & 31;
    }

    public static int f(int i) {
        return (i >> 10) & 31;
    }

    public final List c(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, g);
        priorityQueue.offer(new b(0, this.a.length - 1));
        a(priorityQueue, i);
        return a(priorityQueue);
    }

    public a(int[] iArr, int i, com.adsurge.adn.V0.b.c[] cVarArr) {
        this.e = cVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iB = b(iArr[i2]);
            iArr[i2] = iB;
            iArr2[iB] = iArr2[iB] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && g(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.c.add(new com.adsurge.adn.V0.b.d(a(i8), iArr2[i8]));
            }
            return;
        }
        this.c = c(i);
    }

    public static int b(int i) {
        return b(Color.blue(i), 8, 5) | (b(Color.red(i), 8, 5) << 10) | (b(Color.green(i), 8, 5) << 5);
    }

    public final boolean g(int i) {
        int iA = a(i);
        com.adsurge.adn.U0.a.a(iA, this.f);
        return a(iA, this.f);
    }

    public static int b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public final void a(PriorityQueue priorityQueue, int i) {
        b bVar;
        while (priorityQueue.size() < i && (bVar = (b) priorityQueue.poll()) != null && bVar.a()) {
            priorityQueue.offer(bVar.h());
            priorityQueue.offer(bVar);
        }
    }

    public final List a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.adsurge.adn.V0.b.d dVarD = ((b) it.next()).d();
            if (!a(dVarD)) {
                arrayList.add(dVarD);
            }
        }
        return arrayList;
    }

    public List a() {
        return this.c;
    }

    public final boolean a(com.adsurge.adn.V0.b.d dVar) {
        return a(dVar.e(), dVar.c());
    }

    public final boolean a(int i, float[] fArr) {
        com.adsurge.adn.V0.b.c[] cVarArr = this.e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.e[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int a(int i, int i2, int i3) {
        return Color.rgb(b(i, 5, 8), b(i2, 5, 8), b(i3, 5, 8));
    }

    public static int a(int i) {
        return a(f(i), e(i), d(i));
    }
}
