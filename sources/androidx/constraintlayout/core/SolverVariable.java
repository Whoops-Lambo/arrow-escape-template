package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    public boolean a;
    public float e;
    public Type i;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public ArrayRow[] j = new ArrayRow[16];
    public int k = 0;
    public int l = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Type {
        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final /* synthetic */ Type[] e;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            a = type;
            Type type2 = new Type("CONSTANT", 1);
            Type type3 = new Type("SLACK", 2);
            b = type3;
            Type type4 = new Type("ERROR", 3);
            c = type4;
            Type type5 = new Type("UNKNOWN", 4);
            d = type5;
            e = new Type[]{type, type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) e.clone();
        }
    }

    public final void a(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            ArrayRow[] arrayRowArr = this.j;
            if (i >= i2) {
                if (i2 >= arrayRowArr.length) {
                    this.j = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.j;
                int i3 = this.k;
                arrayRowArr2[i3] = arrayRow;
                this.k = i3 + 1;
                return;
            }
            if (arrayRowArr[i] == arrayRow) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.SolverVariable$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Type.values().length];
            a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void b(ArrayRow arrayRow) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == arrayRow) {
                while (i2 < i - 1) {
                    ArrayRow[] arrayRowArr = this.j;
                    int i3 = i2 + 1;
                    arrayRowArr[i2] = arrayRowArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.i = Type.d;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.a = false;
        Arrays.fill(this.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.b - solverVariable.b;
    }

    public final void d(LinearSystem linearSystem, float f) {
        this.e = f;
        this.f = true;
        int i = this.k;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].h(linearSystem, this, false);
        }
        this.k = 0;
    }

    public final void e(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].i(linearSystem, arrayRow, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.b;
    }

    public SolverVariable(Type type) {
        this.i = type;
    }
}
