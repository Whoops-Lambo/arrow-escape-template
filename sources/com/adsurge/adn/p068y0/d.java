package com.adsurge.adn.p068y0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.NinePatch;
import android.graphics.drawable.NinePatchDrawable;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import com.adsurge.adn.p038l0.e;
import com.adsurge.adn.p038l0.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class d extends ImageView implements e {
    public a a;
    public b b;
    public int c;
    public int d;

    public final void a(Canvas canvas) {
        if (this.c <= 0 || this.d <= 0 || this.a == null) {
            return;
        }
        int height = getHeight();
        int width = getWidth();
        if (height <= 0 || width <= 0 || this.a.R() != 3) {
            return;
        }
        double d = ((double) height) / ((double) width);
        int i = this.d;
        int i2 = this.c;
        if (d <= ((double) i) / ((double) i2)) {
            getDrawable().setBounds(0, 0, width, (i * width) / i2);
        } else {
            int i3 = (((i2 * height) / i) - width) / 2;
            getDrawable().setBounds(-i3, 0, width + i3, height);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int height;
        a aVar = this.a;
        com.adsurge.adn.p041m0.d dVarU = aVar == null ? null : aVar.u();
        if (dVarU != null) {
            width = getWidth();
            height = getHeight();
            dVarU.a(canvas, width, height);
        } else {
            width = 0;
            height = 0;
        }
        b bVar = this.b;
        if (bVar == null) {
            a(canvas);
            super.onDraw(canvas);
        } else {
            bVar.a(canvas);
        }
        if (dVarU != null) {
            dVarU.b(canvas, width, height);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        com.adsurge.adn.p050p0.d dVarX = this.a.x();
        if (dVarX == null) {
            super.onMeasure(i, i2);
            return;
        }
        Pair pairB = dVarX.b(i, i2);
        super.onMeasure(((Integer) pairB.first).intValue(), ((Integer) pairB.second).intValue());
        Pair pairA = dVarX.a(i, i2);
        if (pairA != null) {
            super.setMeasuredDimension(View.MeasureSpec.getSize(((Integer) pairA.first).intValue()), View.MeasureSpec.getSize(((Integer) pairA.second).intValue()));
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(view, i);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.a.f(i);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        if (ninePatchChunk == null || !NinePatch.isNinePatchChunk(ninePatchChunk)) {
            super.setImageBitmap(bitmap);
        } else {
            super.setImageDrawable(new NinePatchDrawable(bitmap, ninePatchChunk, null, null));
        }
        this.c = bitmap.getWidth();
        this.d = bitmap.getHeight();
    }

    public void setMovie(Movie movie) {
        if (movie == null) {
            return;
        }
        this.b = new b(this.a, this, movie);
    }

    @Override // com.adsurge.adn.p038l0.e
    public void setViewNode(i iVar) {
        this.a = (a) iVar;
    }

    public d(Context context) {
        super(context);
    }
}
