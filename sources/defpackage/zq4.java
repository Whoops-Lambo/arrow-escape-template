package defpackage;

import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgyx;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zq4 extends zzgyw {
    public Object[] a;
    public int b;
    public boolean c;

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof zzgyx) {
                this.b = ((zzgyx) collection).r(this.a, this.b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i) {
        int length = this.a.length;
        int iB = zzgyw.b(length, this.b + i);
        if (iB > length || this.c) {
            this.a = Arrays.copyOf(this.a, iB);
            this.c = false;
        }
    }

    public zq4(int i) {
        c71.z(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }
}
