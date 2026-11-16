package androidx.compose.runtime.collection;

import defpackage.n8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "", "Key", "Value", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IdentityArrayMap<Key, Value> {
    public Object[] a = new Object[16];
    public Object[] b = new Object[16];
    public int c;

    public final int a(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = this.c - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.a[i3];
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i2 = i3 + 1;
            } else if (iIdentityHashCode2 > iIdentityHashCode) {
                i = i3 - 1;
            } else {
                if (obj == obj2) {
                    return i3;
                }
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    Object obj3 = this.a[i4];
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != iIdentityHashCode) {
                        break;
                    }
                }
                int i5 = this.c;
                for (int i6 = i3 + 1; i6 < i5; i6++) {
                    Object obj4 = this.a[i6];
                    if (obj4 == obj) {
                        return i6;
                    }
                    if (System.identityHashCode(obj4) != iIdentityHashCode) {
                        return -(i6 + 1);
                    }
                }
                return -(this.c + 1);
            }
        }
        return -(i2 + 1);
    }

    public final void b(Object obj, Object obj2) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        int iA = a(obj);
        if (iA >= 0) {
            this.b[iA] = obj2;
            return;
        }
        int i = -(iA + 1);
        int i2 = this.c;
        Object[] objArr3 = this.a;
        if (i2 == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[i2 * 2];
        } else {
            objArr = objArr3;
        }
        int i3 = i + 1;
        n8.P(i3, i, i2, objArr3, objArr);
        if (z) {
            n8.S(0, i, 6, this.a, objArr);
        }
        objArr[i] = obj;
        this.a = objArr;
        if (z) {
            objArr2 = new Object[this.c * 2];
        } else {
            objArr2 = this.b;
        }
        n8.P(i3, i, this.c, this.b, objArr2);
        if (z) {
            n8.S(0, i, 6, this.b, objArr2);
        }
        objArr2[i] = obj2;
        this.b = objArr2;
        this.c++;
    }
}
