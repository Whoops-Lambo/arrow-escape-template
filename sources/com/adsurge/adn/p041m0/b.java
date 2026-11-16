package com.adsurge.adn.p041m0;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class b implements d {
    public final a a = new a();
    public List b;

    @Override // com.adsurge.adn.p041m0.d
    public void a(Canvas canvas, int i, int i2) {
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(canvas, i, i2);
            }
        }
        this.a.a(canvas, i, i2);
    }

    @Override // com.adsurge.adn.p041m0.d
    public void b(Canvas canvas, int i, int i2) {
        this.a.b(canvas, i, i2);
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(canvas, i, i2);
            }
        }
    }

    public boolean c(int i) {
        return this.a.c(i);
    }

    public boolean a(int i) {
        return this.a.a(i);
    }

    public boolean b(int i) {
        return this.a.b(i);
    }

    public boolean a(int[] iArr) {
        return this.a.a(iArr);
    }

    public boolean b(int[] iArr) {
        return this.a.b(iArr);
    }

    public boolean a(Object[] objArr) {
        return this.a.a(objArr);
    }

    public boolean a() {
        return this.a.a() || this.b != null;
    }

    public void a(d dVar) {
        if (this.b == null) {
            this.b = new ArrayList(2);
        }
        this.b.add(dVar);
    }
}
