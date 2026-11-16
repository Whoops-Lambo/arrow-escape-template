package com.adsurge.adn.p052q0;

import android.view.View;
import android.view.ViewGroup;
import com.adsurge.adn.W0.h;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p050p0.c;
import com.adsurge.adn.p060u0.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a extends c {
    public com.adsurge.adn.p060u0.c l;

    @Override // com.adsurge.adn.p050p0.c
    public void a(i iVar, View view) {
        if (((c) this.a.C()) == null) {
            return;
        }
        d dVarY = iVar.y();
        if (dVarY instanceof com.adsurge.adn.p060u0.a) {
            ((com.adsurge.adn.p060u0.a) dVarY).q();
        }
    }

    @Override // com.adsurge.adn.p050p0.c
    public ViewGroup.LayoutParams i() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final h j() {
        d dVarY = this.a.y();
        if (dVarY instanceof com.adsurge.adn.p060u0.a) {
            ((com.adsurge.adn.p060u0.a) dVarY).q();
        }
        return null;
    }

    public a(i iVar, c cVar) {
        super(iVar, cVar);
    }

    @Override // com.adsurge.adn.p050p0.d
    public void b(int i) {
        j();
        super.b(i);
    }

    public final h b(View view) {
        com.adsurge.adn.W0.i.a();
        throw null;
    }

    @Override // com.adsurge.adn.p050p0.c
    public ViewGroup.LayoutParams a(d dVar) {
        if (this.l == null) {
            this.l = new com.adsurge.adn.p060u0.c((com.adsurge.adn.p060u0.a) dVar);
        }
        return this.l;
    }

    @Override // com.adsurge.adn.p050p0.d
    public d a(View view) {
        com.adsurge.adn.p060u0.a aVar = new com.adsurge.adn.p060u0.a();
        b(view);
        aVar.a((h) null);
        return aVar;
    }

    @Override // com.adsurge.adn.p050p0.d
    public void a(int i) {
        j();
        super.a(i);
    }
}
