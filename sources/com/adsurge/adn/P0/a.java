package com.adsurge.adn.P0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.adsurge.adn.R0.d;
import com.adsurge.adn.R0.f;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public final d a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Rect g = new Rect();
    public final Rect h = new Rect();

    public abstract Bitmap a(Canvas canvas, Paint paint, int i, Bitmap bitmap, f fVar);

    public a(d dVar) {
        this.a = dVar;
    }
}
