package com.adsurge.adn.p013d;

import android.view.View;
import com.adsurge.adn.p010c.a;
import com.adsurge.adn.p010c.e;
import com.adsurge.adn.p010c.f;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends a {
    public final a b;
    public final View c;

    @Override // com.adsurge.adn.p013d.a, com.adsurge.adn.p013d.e
    public String a(int i) {
        return (this.b == null || this.c == null) ? "" : super.a(i);
    }

    @Override // com.adsurge.adn.p013d.a
    public com.adsurge.adn.p007b.c b(int i) {
        return new e(new com.adsurge.adn.p010c.c(this.c.getContext(), new f(this.c, this.b, i))).a();
    }

    public c(a aVar, View view) {
        this.b = aVar;
        this.c = view;
    }

    @Override // com.adsurge.adn.p013d.a
    public com.adsurge.adn.p007b.c a() {
        return this.b.d();
    }
}
