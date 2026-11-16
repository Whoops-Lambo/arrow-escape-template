package com.adsurge.adn.p058t0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p060u0.b;
import com.adsurge.adn.p060u0.d;
import com.adsurge.adn.p060u0.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class c extends com.adsurge.adn.p050p0.c {
    @Override // com.adsurge.adn.p050p0.d
    public d a(View view) {
        return new b();
    }

    @Override // com.adsurge.adn.p050p0.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout.LayoutParams a(d dVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) new e(dVar));
        layoutParams.gravity = dVar.l();
        return layoutParams;
    }

    public void c(int i) {
        ((b) this.b).setGravity(i);
    }

    @Override // com.adsurge.adn.p050p0.c
    public ViewGroup.LayoutParams i() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public final void j() {
        ((b) this.b).setOrientation(0);
    }

    public c(i iVar, b bVar) {
        super(iVar, bVar);
        j();
    }
}
