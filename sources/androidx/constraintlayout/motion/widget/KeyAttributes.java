package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends Key {
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
    public float o;
    public float p;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Loader {
        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: a */
    public final Key clone() {
        KeyAttributes keyAttributes = new KeyAttributes();
        keyAttributes.b = -1;
        keyAttributes.c = Float.NaN;
        keyAttributes.d = Float.NaN;
        keyAttributes.e = Float.NaN;
        keyAttributes.f = Float.NaN;
        keyAttributes.g = Float.NaN;
        keyAttributes.h = Float.NaN;
        keyAttributes.i = Float.NaN;
        keyAttributes.j = Float.NaN;
        keyAttributes.k = Float.NaN;
        keyAttributes.l = Float.NaN;
        keyAttributes.m = Float.NaN;
        keyAttributes.n = Float.NaN;
        keyAttributes.o = Float.NaN;
        keyAttributes.p = Float.NaN;
        keyAttributes.a = new HashMap();
        keyAttributes.a = this.a;
        keyAttributes.b = this.b;
        keyAttributes.c = this.c;
        keyAttributes.d = this.d;
        keyAttributes.e = this.e;
        keyAttributes.f = this.f;
        keyAttributes.g = this.g;
        keyAttributes.h = this.h;
        keyAttributes.i = this.i;
        keyAttributes.j = this.j;
        keyAttributes.k = this.k;
        keyAttributes.l = this.l;
        keyAttributes.m = this.m;
        keyAttributes.n = this.n;
        keyAttributes.o = this.o;
        keyAttributes.p = this.p;
        return keyAttributes;
    }
}
