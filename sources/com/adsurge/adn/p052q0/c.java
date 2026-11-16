package com.adsurge.adn.p052q0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.adsurge.adn.X0.a;
import com.adsurge.adn.p038l0.f;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p041m0.d;
import com.adsurge.adn.p050p0.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class c extends a implements f {
    public i b;
    public b c;

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.b(false);
        }
        super.dispatchDraw(canvas);
        b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.a(false);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int width;
        int height;
        b bVar = this.c;
        if (bVar != null) {
            bVar.b(true);
        }
        i iVar = this.b;
        d dVarU = iVar == null ? null : iVar.u();
        if (dVarU != null) {
            width = getWidth();
            height = getHeight();
            dVarU.a(canvas, width, height);
        } else {
            width = 0;
            height = 0;
        }
        super.draw(canvas);
        if (dVarU != null) {
            dVarU.b(canvas, width, height);
        }
        b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.a(true);
        }
    }

    @Override // com.adsurge.adn.X0.a, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.c();
        }
        super.onLayout(z, i, i2, i3, i4);
        b bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    @Override // com.adsurge.adn.X0.a, android.view.View
    public void onMeasure(int i, int i2) {
        i iVar = this.b;
        if (iVar != null) {
            com.adsurge.adn.p050p0.d dVarX = iVar.x();
            if (dVarX instanceof a) {
                b bVar = this.c;
                if (bVar != null) {
                    bVar.d();
                }
                dVarX.b(i, i2);
                super.onMeasure(i, i2);
                if (!(getParent() instanceof c) && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    getYogaNode();
                    com.adsurge.adn.W0.d dVar = com.adsurge.adn.W0.d.LEFT;
                    throw null;
                }
                b bVar2 = this.c;
                if (bVar2 != null) {
                    bVar2.b();
                    return;
                }
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.a(view, i);
        }
    }

    @Override // com.adsurge.adn.p038l0.f
    public void setPerfCollector(b bVar) {
        this.c = bVar;
    }

    @Override // com.adsurge.adn.p038l0.e
    public void setViewNode(i iVar) {
        this.b = iVar;
    }

    public c(Context context) {
        super(context);
    }
}
