package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class KeyCycle extends Key {
    public float b;
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

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Loader {
        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: a */
    public final Key clone() {
        KeyCycle keyCycle = new KeyCycle();
        keyCycle.b = Float.NaN;
        keyCycle.c = Float.NaN;
        keyCycle.d = Float.NaN;
        keyCycle.e = Float.NaN;
        keyCycle.f = Float.NaN;
        keyCycle.g = Float.NaN;
        keyCycle.h = Float.NaN;
        keyCycle.i = Float.NaN;
        keyCycle.j = Float.NaN;
        keyCycle.k = Float.NaN;
        keyCycle.l = Float.NaN;
        keyCycle.a = new HashMap();
        keyCycle.a = this.a;
        keyCycle.b = this.b;
        keyCycle.c = this.c;
        keyCycle.d = this.d;
        keyCycle.e = this.e;
        keyCycle.f = this.f;
        keyCycle.g = this.g;
        keyCycle.h = this.h;
        keyCycle.i = this.i;
        keyCycle.j = this.j;
        keyCycle.k = this.k;
        keyCycle.l = this.l;
        return keyCycle;
    }
}
