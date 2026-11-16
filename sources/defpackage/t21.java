package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class t21 {
    public Object[] a;
    public int b;
    public boolean c;

    public final void b(Object... objArr) {
        int length = objArr.length;
        tb5.d(length, objArr);
        e(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public abstract t21 c(Object obj);

    public static int f(int i, int i2) {
        if (i2 < 0) {
            d.r("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof u21) {
                this.b = ((u21) collection).h(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int iF = f(objArr.length, this.b + i);
        if (iF > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, iF);
            this.c = false;
        }
    }

    public t21(int i) {
        l93.i(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }
}
