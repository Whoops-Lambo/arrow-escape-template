package io.p071bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p {
    public static final p b = new p(0);
    public static final p c = new p(1);
    public static final p d = new p(2);
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    public static int[] a(Bitmap bitmap, Rect rect) {
        bitmap.getClass();
        int[] iArr = new int[rect.height() * rect.width()];
        bitmap.getPixels(iArr, 0, rect.width(), rect.left, rect.top, rect.width(), rect.height());
        return iArr;
    }
}
