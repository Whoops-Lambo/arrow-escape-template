package defpackage;

import com.facebook.a0;
import com.facebook.w0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class lz {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static boolean b;

    public static final void a(Object obj, Throwable th) {
        obj.getClass();
        if (b) {
            a.add(obj);
            a0 a0Var = a0.a;
            if (w0.c()) {
                si0.a(th);
                ep0.d(th, w61.e).b();
            }
        }
    }
}
