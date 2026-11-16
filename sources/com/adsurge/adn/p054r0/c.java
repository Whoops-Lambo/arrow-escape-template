package com.adsurge.adn.p054r0;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.adsurge.adn.p038l0.f;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p041m0.d;
import com.adsurge.adn.p050p0.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class c extends FrameLayout implements f {
    public i a;
    public b b;

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        b bVar = this.b;
        if (bVar != null) {
            bVar.b(false);
        }
        super.dispatchDraw(canvas);
        b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.a(false);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int width;
        int height;
        b bVar = this.b;
        if (bVar != null) {
            bVar.b(true);
        }
        i iVar = this.a;
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
        b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.a(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b bVar = this.b;
        if (bVar != null) {
            bVar.c();
        }
        super.onLayout(z, i, i2, i3, i4);
        b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        com.adsurge.adn.p050p0.d dVarX;
        i iVar = this.a;
        if (iVar == null || (dVarX = iVar.x()) == null) {
            super.onMeasure(i, i2);
            return;
        }
        b bVar = this.b;
        if (bVar != null) {
            bVar.d();
        }
        Pair pairB = dVarX.b(i, i2);
        super.onMeasure(((Integer) pairB.first).intValue(), ((Integer) pairB.second).intValue());
        Pair pairA = dVarX.a(i, i2);
        if (pairA != null) {
            super.onMeasure(((Integer) pairA.first).intValue(), ((Integer) pairA.second).intValue());
        }
        b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.a(view, i);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.a.f(i);
    }

    @Override // com.adsurge.adn.p038l0.f
    public void setPerfCollector(b bVar) {
        this.b = bVar;
    }

    @Override // com.adsurge.adn.p038l0.e
    public void setViewNode(i iVar) {
        this.a = iVar;
    }

    public c(Context context) {
        super(context);
    }
}
