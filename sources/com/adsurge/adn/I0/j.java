package com.adsurge.adn.I0;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static ShapeDrawable a(float f, float f2, float f3, float f4, int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setAlpha(i2);
        return shapeDrawable;
    }

    public static ShapeDrawable a(float f, int i, int i2) {
        return a(f, f, f, f, i, i2);
    }
}
