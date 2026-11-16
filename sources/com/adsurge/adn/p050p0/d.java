package com.adsurge.adn.p050p0;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.adsurge.adn.p032j0.g;
import com.adsurge.adn.p038l0.c;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p064w0.b;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public final i a;
    public final View b;
    public Boolean c;
    public boolean d = false;
    public boolean e = false;
    public int f;
    public int g;
    public int h;
    public int i;
    public int[] j;
    public int[] k;

    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    public Pair a(int i, int i2) {
        Pair pair;
        int iA = this.a.A();
        int iB = this.a.B();
        Boolean bool = this.c;
        if (bool == null) {
            pair = null;
        } else if (bool.booleanValue()) {
            if (View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE || View.MeasureSpec.getSize(i2) == iA) {
                pair = null;
            } else {
                i = View.MeasureSpec.makeMeasureSpec((int) (((double) (this.a.y().getAspectRatio() * iA)) + 0.5d), 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(iA, Integer.MIN_VALUE);
                pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            }
        } else if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE || View.MeasureSpec.getSize(i) == iB) {
            pair = null;
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((double) (iB / this.a.y().getAspectRatio())) + 0.5d), 1073741824);
            i = View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
            pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        Pair pairA = a(i, i2, pair, iA, iB, this.a.y());
        if (pairA != null) {
            c(((Integer) pairA.first).intValue(), ((Integer) pairA.second).intValue());
        }
        return pairA;
    }

    public int d() {
        return this.b.getMeasuredHeight();
    }

    public int e() {
        return this.b.getMeasuredWidth();
    }

    public final boolean f() {
        i iVar = this.a;
        boolean z = false;
        if (iVar != null && (this.j != null || this.k != null)) {
            b bVarF = iVar.F();
            if (bVarF == null) {
                return false;
            }
            z = a(bVarF.e(), this.j) || a(bVarF.g(), this.k);
            this.a.a(z);
        }
        return z;
    }

    public void g() {
        c cVarD = this.a.D();
        if (cVarD.f()) {
            this.b.setPadding(cVarD.c(), cVarD.e(), cVarD.d(), cVarD.b());
            cVarD.a();
        }
        a aVarE = this.a.E();
        if (aVarE == null || this.b.getLayoutParams() == null) {
            return;
        }
        com.adsurge.adn.p060u0.d dVarY = this.a.y();
        if (dVarY.e()) {
            this.b.setLayoutParams(aVarE.a(dVarY));
            dVarY.d();
        }
    }

    public final boolean h() {
        int iE = this.a.F().e();
        int iG = this.a.F().g();
        if (this.h == iE && this.i == iG) {
            return false;
        }
        this.h = iE;
        this.i = iG;
        return true;
    }

    public d(i iVar, View view) {
        this.a = iVar;
        this.b = view;
    }

    public Pair b(int i, int i2) {
        if (f()) {
            return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        com.adsurge.adn.p060u0.d dVarY = this.a.y();
        float aspectRatio = dVarY.getAspectRatio();
        if (aspectRatio > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (dVarY.f() == 0 && dVarY.g() != 0) {
                i = View.MeasureSpec.makeMeasureSpec((int) (((double) (aspectRatio * View.MeasureSpec.getSize(i2))) + 0.5d), 1073741824);
                this.c = Boolean.TRUE;
            } else if (dVarY.f() != 0 && dVarY.g() == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (((double) (View.MeasureSpec.getSize(i) / aspectRatio)) + 0.5d), 1073741824);
                this.c = Boolean.FALSE;
            }
        }
        Pair pairA = a(dVarY, i, i2);
        Integer num = (Integer) pairA.first;
        int iIntValue = num.intValue();
        Integer num2 = (Integer) pairA.second;
        boolean zC = c(iIntValue, num2.intValue());
        boolean zH = h();
        if ((zC || zH) && this.d && (this.a instanceof a)) {
            a();
        }
        return new Pair(num, num2);
    }

    public final boolean c(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f == size && this.g == size2) {
            return false;
        }
        this.f = size;
        this.g = size2;
        return true;
    }

    public int c() {
        return this.f;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public static int b(int i, int i2, int i3, int i4) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE) {
            if (i > 0 && Math.max(size, i3) > i) {
                i4 = View.MeasureSpec.makeMeasureSpec(i, mode);
            }
            return (i2 <= 0 || Math.min(i3, size) >= i2) ? i4 : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (i > 0 && size > i) {
            i4 = View.MeasureSpec.makeMeasureSpec(i, View.MeasureSpec.getMode(i4));
        }
        return (i2 <= 0 || size >= i2) ? i4 : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    public int b() {
        return this.g;
    }

    public void b(int[] iArr) {
        this.j = iArr;
    }

    public void b(int i) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i;
        this.b.setLayoutParams(layoutParams);
    }

    public void a(boolean z) {
        this.d = z;
    }

    public Pair a(com.adsurge.adn.p060u0.d dVar, int i, int i2) {
        return new Pair(Integer.valueOf(a(dVar.n(), dVar.c(), i)), Integer.valueOf(a(dVar.h(), dVar.b(), i2)));
    }

    public static int a(int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i3);
        if (i > 0 && size > i) {
            i3 = View.MeasureSpec.makeMeasureSpec(i, View.MeasureSpec.getMode(i3));
        }
        return (i2 <= 0 || size >= i2) ? i3 : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    public com.adsurge.adn.p060u0.d a(View view) {
        return new com.adsurge.adn.p060u0.b();
    }

    public Pair a(int i, int i2, Pair pair, int i3, int i4, com.adsurge.adn.p060u0.d dVar) {
        int iN = dVar.n();
        int iC = dVar.c();
        int iH = dVar.h();
        int iB = dVar.b();
        if (pair == null && ((iN <= 0 || i4 <= iN) && ((iC <= 0 || i4 >= iC) && ((iH <= 0 || i3 <= iH) && (iB <= 0 || i3 >= iB))))) {
            return pair;
        }
        return new Pair(Integer.valueOf(b(iN, iC, i4, i)), Integer.valueOf(b(iH, iB, i3, i2)));
    }

    public void a() {
        a aVar = (a) this.a;
        int iQ = aVar.Q();
        for (int i = 0; i < iQ; i++) {
            d dVarX = aVar.m(i).x();
            if (dVarX != null) {
                dVarX.a(this.f, this.g, this.h, this.i);
            }
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.e) {
            com.adsurge.adn.p060u0.d dVarY = this.a.y();
            View viewC = this.a.C();
            if (viewC == null) {
                return;
            }
            if (dVarY.a(new com.adsurge.adn.p038l0.b(i, i2, i3, i4))) {
                ViewGroup.LayoutParams layoutParams = viewC.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.width = dVarY.f();
                    marginLayoutParams.height = dVarY.g();
                    marginLayoutParams.leftMargin = dVarY.k();
                    marginLayoutParams.rightMargin = dVarY.a();
                    marginLayoutParams.topMargin = dVarY.o();
                    marginLayoutParams.bottomMargin = dVarY.i();
                }
            }
            c cVarD = this.a.D();
            if (cVarD.a(new com.adsurge.adn.p038l0.b(i, i2, i3, i4))) {
                viewC.setPadding(cVarD.c(), cVarD.e(), cVarD.d(), cVarD.b());
            }
            this.a.l();
        }
    }

    public void a(int[] iArr) {
        this.k = iArr;
    }

    public final boolean a(int i, int[] iArr) {
        if (i <= 0 || iArr == null || iArr.length > 2) {
            return false;
        }
        int iB = g.b(i);
        return iB < iArr[0] || iB > iArr[1];
    }

    public void a(int i) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        this.b.setLayoutParams(layoutParams);
    }
}
