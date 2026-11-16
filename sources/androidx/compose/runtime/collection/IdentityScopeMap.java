package androidx.compose.runtime.collection;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n8;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/IdentityScopeMap;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IdentityScopeMap<T> {
    public int[] a;
    public Object[] b;
    public IdentityArraySet[] c;
    public int d;

    public final IdentityArraySet e(int i) {
        IdentityArraySet identityArraySet = this.c[this.a[i]];
        identityArraySet.getClass();
        return identityArraySet;
    }

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.a = iArr;
        this.b = new Object[50];
        this.c = new IdentityArraySet[50];
    }

    public final void a(Object obj, Object obj2) {
        int iB;
        IdentityArraySet identityArraySet;
        IdentityArraySet identityArraySetE;
        obj.getClass();
        obj2.getClass();
        if (this.d > 0) {
            iB = b(obj);
            if (iB >= 0) {
                identityArraySetE = e(iB);
            }
            identityArraySetE.add(obj2);
        }
        iB = -1;
        int i = -(iB + 1);
        int i2 = this.d;
        int[] iArr = this.a;
        if (i2 < iArr.length) {
            int i3 = iArr[i2];
            this.b[i3] = obj;
            IdentityArraySet[] identityArraySetArr = this.c;
            identityArraySet = identityArraySetArr[i3];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet();
                identityArraySetArr[i3] = identityArraySet;
            }
            if (i < i2) {
                n8.O(i + 1, i, i2, iArr, iArr);
            }
            this.a[i] = i3;
            this.d++;
        } else {
            int length = iArr.length * 2;
            IdentityArraySet[] identityArraySetArr2 = (IdentityArraySet[]) Arrays.copyOf(this.c, length);
            this.c = identityArraySetArr2;
            identityArraySet = new IdentityArraySet();
            identityArraySetArr2[i2] = identityArraySet;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, length);
            this.b = objArrCopyOf;
            objArrCopyOf[i2] = obj;
            int[] iArr2 = new int[length];
            int i4 = this.d;
            while (true) {
                i4++;
                if (i4 >= length) {
                    break;
                } else {
                    iArr2[i4] = i4;
                }
            }
            int i5 = this.d;
            if (i < i5) {
                n8.O(i + 1, i, i5, this.a, iArr2);
            }
            iArr2[i] = i2;
            if (i > 0) {
                n8.T(i, 6, this.a, iArr2);
            }
            this.a = iArr2;
            this.d++;
        }
        identityArraySetE = identityArraySet;
        identityArraySetE.add(obj2);
    }

    public final int b(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        int i = this.d - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.b[this.a[i3]];
            obj2.getClass();
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
                    Object obj3 = this.b[this.a[i4]];
                    obj3.getClass();
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != iIdentityHashCode) {
                        break;
                    }
                }
                int i5 = this.d;
                for (int i6 = i3 + 1; i6 < i5; i6++) {
                    Object obj4 = this.b[this.a[i6]];
                    obj4.getClass();
                    if (obj4 == obj) {
                        return i6;
                    }
                    if (System.identityHashCode(obj4) != iIdentityHashCode) {
                        return -(i6 + 1);
                    }
                }
                return -(this.d + 1);
            }
        }
        return -(i2 + 1);
    }

    public final boolean c(Object obj, Object obj2) {
        int i;
        IdentityArraySet identityArraySet;
        obj.getClass();
        obj2.getClass();
        int iB = b(obj);
        if (iB >= 0 && (identityArraySet = this.c[(i = this.a[iB])]) != null) {
            boolean zRemove = identityArraySet.remove(obj2);
            if (identityArraySet.a == 0) {
                int i2 = iB + 1;
                int i3 = this.d;
                if (i2 < i3) {
                    int[] iArr = this.a;
                    n8.O(iB, i2, i3, iArr, iArr);
                }
                int[] iArr2 = this.a;
                int i4 = this.d;
                iArr2[i4 - 1] = i;
                this.b[i] = null;
                this.d = i4 - 1;
            }
            return zRemove;
        }
        return false;
    }

    public final void d(Object obj) {
        obj.getClass();
        int i = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.a[i3];
            IdentityArraySet identityArraySet = this.c[i4];
            identityArraySet.getClass();
            identityArraySet.remove(obj);
            if (identityArraySet.a > 0) {
                if (i2 != i3) {
                    int[] iArr = this.a;
                    int i5 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i5;
                }
                i2++;
            }
        }
        int i6 = this.d;
        for (int i7 = i2; i7 < i6; i7++) {
            this.b[this.a[i7]] = null;
        }
        this.d = i2;
    }
}
