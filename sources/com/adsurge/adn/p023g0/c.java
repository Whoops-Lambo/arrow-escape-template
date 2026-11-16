package com.adsurge.adn.p023g0;

import com.adsurge.adn.p038l0.i;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c {
    public final i a;
    public final i.f b;
    public b c;

    public c(i iVar, i.f fVar) {
        this.a = iVar;
        this.b = fVar;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            int i = aVar.a;
            if (i == 1 || i == 2 || i == 3) {
                if (this.c == null) {
                    this.c = new d(this.a, this.b);
                }
                this.c.a(aVar);
            }
        }
    }
}
