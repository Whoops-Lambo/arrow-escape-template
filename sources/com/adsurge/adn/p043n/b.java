package com.adsurge.adn.p043n;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b implements c.a {
    public final List a;
    public int b = 0;

    @Override // com.adsurge.adn.n.c.a
    public void a(boolean z) {
        if (this.b >= this.a.size()) {
            return;
        }
        List list = this.a;
        int i = this.b;
        this.b = i + 1;
        ((c) list.get(i)).a(this, !z);
    }

    public b(List list) {
        this.a = list;
    }
}
