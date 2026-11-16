package com.adsurge.adn.p010c;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.adsurge.adn.I0.i;
import com.adsurge.adn.N.b;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p007b.c;
import com.adsurge.adn.x1.u;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class f implements d {
    public static final SparseArray e = new SparseArray();
    public static Boolean f;
    public final WeakReference a;
    public final d b;
    public final int c;
    public final a d = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public float a;
        public float b;
        public long c;
        public long d;
    }

    public void a(MotionEvent motionEvent, c cVar) {
        View view = (View) this.a.get();
        if (motionEvent == null || cVar == null || view == null) {
            return;
        }
        cVar.l = String.valueOf(motionEvent.getToolType(0));
        cVar.m = String.valueOf(motionEvent.getSource());
        int action = motionEvent.getAction();
        if (action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            cVar.d = String.valueOf(i.b(view.getContext(), x));
            cVar.e = String.valueOf(i.b(view.getContext(), y));
            this.d.c = SystemClock.elapsedRealtime();
        } else if (action == 1) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            cVar.f = String.valueOf(i.b(view.getContext(), x2));
            cVar.g = String.valueOf(i.b(view.getContext(), y2));
            this.d.d = SystemClock.elapsedRealtime();
            a aVar = this.d;
            cVar.a = String.valueOf(aVar.d - aVar.c);
            this.d.a = motionEvent.getPressure();
            this.d.b = motionEvent.getSize();
        }
        e.put(com.adsurge.adn.p007b.a.e(view), this.d);
    }

    public final void b(c cVar) {
        View view = (View) this.a.get();
        if (view == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int i = rect.top;
        int i2 = rect.left;
        int i3 = rect.right;
        int i4 = rect.bottom;
        cVar.p = String.valueOf(i.b(view.getContext(), iArr[0]));
        cVar.q = String.valueOf(i.b(view.getContext(), iArr[1]));
        cVar.s = String.valueOf(i.b(view.getContext(), i3 - i2));
        cVar.t = String.valueOf(i.b(view.getContext(), i4 - i));
        cVar.toString();
    }

    public final void c(c cVar) {
        View view = (View) this.a.get();
        if (view != null) {
            float fA = u.a(view);
            boolean zC = u.c(view);
            cVar.v = String.format(Locale.US, "%.2f", Float.valueOf(fA));
            cVar.u = String.valueOf(zC ? 1 : 0);
        }
        cVar.toString();
    }

    public f(View view, d dVar, int i) {
        this.a = new WeakReference(view);
        this.b = dVar;
        this.c = i;
    }

    @Override // com.adsurge.adn.p010c.d
    public c a() {
        c cVarA = this.b.a();
        View view = (View) this.a.get();
        if (view == null) {
            return cVarA;
        }
        int iE = com.adsurge.adn.p007b.a.e(view);
        SparseArray sparseArray = e;
        a aVar = (a) sparseArray.get(iE);
        if (aVar != null && aVar.d != 0) {
            cVarA.b = String.valueOf(SystemClock.elapsedRealtime() - aVar.d);
            cVarA.c = String.valueOf(SystemClock.elapsedRealtime() - aVar.c);
            cVarA.h = String.valueOf(aVar.a);
            cVarA.i = String.valueOf(aVar.b);
            sparseArray.remove(iE);
        }
        a(cVarA);
        b(cVarA);
        c(cVarA);
        if (f == null) {
            f = Boolean.valueOf(b.a("cvic", 1, (AdSurgeAdFormat) null, (String) null) == 1);
        }
        if (f.booleanValue()) {
            cVarA.w = String.valueOf(u.a(view, 100, this.c).second);
        }
        cVarA.toString();
        return cVarA;
    }

    public final void a(c cVar) {
        View view = (View) this.a.get();
        if (cVar == null || view == null) {
            return;
        }
        cVar.n = String.valueOf(i.b(view.getContext(), view.getWidth()));
        cVar.o = String.valueOf(i.b(view.getContext(), view.getHeight()));
        cVar.toString();
    }
}
