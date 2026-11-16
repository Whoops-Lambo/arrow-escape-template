package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import defpackage.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConstraintAnchor {
    public int b;
    public boolean c;
    public final ConstraintWidget d;
    public final Type e;
    public ConstraintAnchor f;
    public SolverVariable i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Type {
        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        public static final /* synthetic */ Type[] i;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("NONE", 0);
            Type type2 = new Type("LEFT", 1);
            a = type2;
            Type type3 = new Type("TOP", 2);
            b = type3;
            Type type4 = new Type("RIGHT", 3);
            c = type4;
            Type type5 = new Type("BOTTOM", 4);
            d = type5;
            Type type6 = new Type("BASELINE", 5);
            e = type6;
            Type type7 = new Type("CENTER", 6);
            f = type7;
            Type type8 = new Type("CENTER_X", 7);
            g = type8;
            Type type9 = new Type("CENTER_Y", 8);
            h = type9;
            i = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) i.clone();
        }
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            j();
            return true;
        }
        if (!z && !i(constraintAnchor)) {
            return false;
        }
        this.f = constraintAnchor;
        if (constraintAnchor.a == null) {
            constraintAnchor.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0066 A[RETURN] */
    public final boolean i(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor != null) {
            ConstraintWidget constraintWidget = constraintAnchor.d;
            Type type = constraintAnchor.e;
            Type type2 = Type.e;
            Type type3 = this.e;
            if (type != type3) {
                int iOrdinal = type3.ordinal();
                Type type4 = Type.g;
                Type type5 = Type.h;
                Type type6 = Type.c;
                Type type7 = Type.a;
                switch (iOrdinal) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = type == type7 || type == type6;
                        if (!(constraintWidget instanceof Guideline)) {
                            return z;
                        }
                        if (z || type == type4) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = type == Type.b || type == Type.d;
                        if (!(constraintWidget instanceof Guideline)) {
                            return z2;
                        }
                        if (z2 || type == type5) {
                            return true;
                        }
                        break;
                    case 5:
                        if (type != type7 && type != type6) {
                            return true;
                        }
                        break;
                    case 6:
                        if (type != type2 && type != type4 && type != type5) {
                            return true;
                        }
                        break;
                    default:
                        d.p(type3.name());
                        return false;
                }
            } else if (type3 != type2 || (constraintWidget.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Type.values().length];
            a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public final void a(ConstraintAnchor constraintAnchor, int i) {
        b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public final void c(int i, WidgetGroup widgetGroup, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.a(((ConstraintAnchor) it.next()).d, i, arrayList, widgetGroup);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        ConstraintAnchor constraintAnchor;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (constraintAnchor = this.f) == null || constraintAnchor.d.i0 != 8) ? this.g : i;
    }

    public final ConstraintAnchor f() {
        Type type = this.e;
        int iOrdinal = type.ordinal();
        ConstraintWidget constraintWidget = this.d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.L;
            case 2:
                return constraintWidget.M;
            case 3:
                return constraintWidget.J;
            case 4:
                return constraintWidget.K;
            default:
                d.p(type.name());
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final void j() {
        HashSet hashSet;
        ConstraintAnchor constraintAnchor = this.f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        SolverVariable solverVariable = this.i;
        if (solverVariable == null) {
            this.i = new SolverVariable(SolverVariable.Type.a);
        } else {
            solverVariable.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.j0 + ":" + this.e.toString();
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.d = constraintWidget;
        this.e = type;
    }
}
