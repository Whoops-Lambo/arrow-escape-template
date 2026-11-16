package com.vungle.ads.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a1 implements Runnable {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ b1 c;

    public a1(b1 b1Var) {
        this.c = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y0 y0VarA;
        y0 y0VarA2;
        this.c.g = false;
        for (Map.Entry entry : this.c.a.entrySet()) {
            View view = (View) entry.getKey();
            if (b1.a(this.c, view, ((z0) entry.getValue()).b())) {
                this.a.add(view);
            } else {
                this.b.add(view);
            }
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            View view2 = (View) obj;
            z0 z0Var = (z0) this.c.a.get(view2);
            if (z0Var != null && (y0VarA2 = z0Var.a()) != null) {
                y0VarA2.onImpression(view2);
            }
            b1 b1Var = this.c;
            view2.getClass();
            b1Var.a(view2);
        }
        this.a.clear();
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            View view3 = (View) obj2;
            z0 z0Var2 = (z0) this.c.a.get(view3);
            if (z0Var2 != null && (y0VarA = z0Var2.a()) != null) {
                y0VarA.onViewInvisible(view3);
            }
        }
        this.b.clear();
        if (this.c.a.isEmpty() || this.c.h) {
            return;
        }
        b1.d(this.c);
    }
}
