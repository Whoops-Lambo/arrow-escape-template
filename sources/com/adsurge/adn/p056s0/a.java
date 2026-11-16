package com.adsurge.adn.p056s0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p050p0.c;
import com.adsurge.adn.p060u0.b;
import com.adsurge.adn.p060u0.d;
import com.adsurge.adn.p060u0.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends c {
    public boolean l;

    public void d(int i) {
        if (i == 0) {
            this.l = false;
            ((c) this.b).setOrientation(0);
            return;
        }
        if (i == 1) {
            this.l = false;
            ((c) this.b).setOrientation(1);
        } else if (i == 2) {
            this.l = true;
            ((c) this.b).setOrientation(0);
        } else {
            if (i != 3) {
                return;
            }
            this.l = true;
            ((c) this.b).setOrientation(1);
        }
    }

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
        ((c) this.b).setGravity(i);
    }

    @Override // com.adsurge.adn.p050p0.c
    public ViewGroup.LayoutParams i() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public boolean j() {
        return this.l;
    }

    public a(i iVar, c cVar) {
        super(iVar, cVar);
        this.l = false;
    }
}
