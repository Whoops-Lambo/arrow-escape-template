package defpackage;

import com.ironsource.C4664b4;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n8 extends fs1 {
    public static float[] V(int i, int i2, float[] fArr) {
        fs1.s(i2, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i, i2);
        fArrCopyOfRange.getClass();
        return fArrCopyOfRange;
    }

    public static void Y(int i, int[] iArr) {
        int length = iArr.length;
        iArr.getClass();
        Arrays.fill(iArr, 0, length, i);
    }

    public static void Z(long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static int c0(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        vq2.s("Array is empty.");
        return 0;
    }

    public static int k0(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[iArr.length - 1];
        }
        vq2.s("Array is empty.");
        return 0;
    }

    public static char l0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            vq2.s("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        d.r("Array has more than one element.");
        return (char) 0;
    }

    public static final void m0(Object[] objArr, AbstractSet abstractSet) {
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static Set q0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return kg0.a;
        }
        if (length == 1) {
            return kc2.x(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(rh1.U(objArr.length));
        m0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static /* synthetic */ void S(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        P(0, i, i2, objArr, objArr2);
    }

    public static /* synthetic */ void T(int i, int i2, int[] iArr, int[] iArr2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        O(0, 0, i, iArr, iArr2);
    }

    public static j71 f0(int[] iArr) {
        return new j71(0, iArr.length - 1, 1);
    }

    public static String j0(int i, Object[] objArr) {
        String str = (i & 1) != 0 ? ", " : ",";
        CharSequence charSequence = (i & 2) != 0 ? "" : C4664b4.j.d;
        String str2 = (i & 4) == 0 ? C4664b4.j.e : "";
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        i0(objArr, sb, str, charSequence, str2, "...", null);
        return sb.toString();
    }

    public static l92 L(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return jg0.a;
        }
        return new p8(objArr, 0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static boolean M(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i != iArr[i2]) {
                i2++;
            } else {
                if (i2 >= 0) {
                    return false;
                }
                return true;
            }
        }
        i2 = -1;
        if (i2 >= 0) {
            return false;
        }
        return true;
    }

    public static boolean N(Object[] objArr, Object obj) {
        objArr.getClass();
        if (h0(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }

    public static void O(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void P(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void Q(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void R(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static byte[] U(int i, int i2, byte[] bArr) {
        bArr.getClass();
        fs1.s(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] W(Object[] objArr, int i, int i2) {
        objArr.getClass();
        fs1.s(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static void X(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static ArrayList b0(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object d0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        vq2.s("Array is empty.");
        return null;
    }

    public static Object e0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Object g0(int i, Object[] objArr) {
        objArr.getClass();
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static int h0(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void i0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, wr0 wr0Var) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            ek2.e(sb, obj, wr0Var);
        }
        sb.append(charSequence3);
    }

    public static List n0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return eu.y(Long.valueOf(jArr[0]));
        }
        return gg0.a;
    }

    public static List o0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return p0(objArr);
            }
            return eu.y(objArr[0]);
        }
        return gg0.a;
    }

    public static ArrayList p0(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new c8(objArr, false));
    }
}
