package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class iy2 extends wz2 {
    public static final int[] e = {1, 1, 1};
    public static final int[] f = {1, 1, 1, 1, 1};
    public static final int[] g = {1, 1, 1, 1, 1, 1};
    public static final int[][] h;
    public static final int[][] i;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        h = iArr;
        int[][] iArr2 = new int[20][];
        i = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i2 = 10; i2 < 20; i2++) {
            int[] iArr3 = h[i2 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                iArr4[i3] = iArr3[(iArr3.length - i3) - 1];
            }
            i[i2] = iArr4;
        }
    }

    public static boolean j0(String str) {
        int length = str.length();
        if (length != 0) {
            int i2 = length - 1;
            if (k0(str.subSequence(0, i2)) == Character.digit(str.charAt(i2), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int k0(CharSequence charSequence) throws yq0 {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            int iCharAt = charSequence.charAt(i3) - '0';
            if (iCharAt >= 0 && iCharAt <= 9) {
                i2 += iCharAt;
            } else {
                throw yq0.d();
            }
        }
        int i4 = i2 * 3;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int iCharAt2 = charSequence.charAt(i5) - '0';
            if (iCharAt2 >= 0 && iCharAt2 <= 9) {
                i4 += iCharAt2;
            } else {
                throw yq0.d();
            }
        }
        return (1000 - i4) % 10;
    }
}
