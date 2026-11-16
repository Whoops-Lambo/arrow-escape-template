package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class yy1 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(xy1.a, 0);
        map.put(xy1.b, 1);
        map.put(xy1.c, 2);
        for (xy1 xy1Var : map.keySet()) {
            a.append(((Integer) b.get(xy1Var)).intValue(), xy1Var);
        }
    }

    public static int a(xy1 xy1Var) {
        Integer num = (Integer) b.get(xy1Var);
        if (num != null) {
            return num.intValue();
        }
        vq2.v(xy1Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static xy1 b(int i) {
        xy1 xy1Var = (xy1) a.get(i);
        if (xy1Var != null) {
            return xy1Var;
        }
        d.r(pv1.k(i, "Unknown Priority for value "));
        return null;
    }
}
