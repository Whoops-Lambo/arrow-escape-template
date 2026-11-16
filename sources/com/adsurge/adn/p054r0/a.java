package com.adsurge.adn.p054r0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p050p0.c;
import com.adsurge.adn.p060u0.b;
import com.adsurge.adn.p060u0.d;
import com.adsurge.adn.p060u0.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends c {
    @Override // com.adsurge.adn.p050p0.d
    public d a(View view) {
        return new b();
    }

    @Override // com.adsurge.adn.p050p0.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams a(d dVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) new e(dVar));
        layoutParams.gravity = dVar.l();
        return layoutParams;
    }

    @Override // com.adsurge.adn.p050p0.c
    public ViewGroup.LayoutParams i() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public a(i iVar, c cVar) {
        super(iVar, cVar);
    }
}
