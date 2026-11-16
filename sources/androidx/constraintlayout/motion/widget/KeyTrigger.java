package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class KeyTrigger extends Key {
    public View b;
    public HashMap c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Loader {
        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: a */
    public final Key clone() {
        KeyTrigger keyTrigger = new KeyTrigger();
        keyTrigger.b = null;
        new RectF();
        new RectF();
        keyTrigger.c = new HashMap();
        keyTrigger.a = new HashMap();
        keyTrigger.a = this.a;
        keyTrigger.b = this.b;
        keyTrigger.c = this.c;
        return keyTrigger;
    }
}
