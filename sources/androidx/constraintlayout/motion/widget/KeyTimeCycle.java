package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class KeyTimeCycle extends Key {
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Loader {
        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: a */
    public final Key clone() {
        KeyTimeCycle keyTimeCycle = new KeyTimeCycle();
        keyTimeCycle.b = -1;
        keyTimeCycle.c = Float.NaN;
        keyTimeCycle.d = Float.NaN;
        keyTimeCycle.e = Float.NaN;
        keyTimeCycle.f = Float.NaN;
        keyTimeCycle.g = Float.NaN;
        keyTimeCycle.h = Float.NaN;
        keyTimeCycle.i = Float.NaN;
        keyTimeCycle.j = Float.NaN;
        keyTimeCycle.k = Float.NaN;
        keyTimeCycle.l = Float.NaN;
        keyTimeCycle.m = Float.NaN;
        keyTimeCycle.n = Float.NaN;
        keyTimeCycle.a = new HashMap();
        keyTimeCycle.a = this.a;
        keyTimeCycle.b = this.b;
        keyTimeCycle.n = this.n;
        keyTimeCycle.c = this.c;
        keyTimeCycle.d = this.d;
        keyTimeCycle.e = this.e;
        keyTimeCycle.h = this.h;
        keyTimeCycle.f = this.f;
        keyTimeCycle.g = this.g;
        keyTimeCycle.i = this.i;
        keyTimeCycle.j = this.j;
        keyTimeCycle.k = this.k;
        keyTimeCycle.l = this.l;
        keyTimeCycle.m = this.m;
        return keyTimeCycle;
    }
}
