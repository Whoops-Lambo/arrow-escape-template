package androidx.compose.runtime;

import androidx.media3.common.C;
import defpackage.ak1;
import defpackage.d;
import defpackage.du;
import defpackage.e32;
import defpackage.gg0;
import defpackage.jc1;
import defpackage.n8;
import defpackage.nj;
import defpackage.s71;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SlotWriter {
    public final SlotTable a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final IntStack o;
    public final IntStack p;
    public final IntStack q;
    public int r;
    public int s;
    public boolean t;
    public PrioritySet u;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final List a(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2) {
            List list;
            boolean z3;
            int iP = slotWriter.p(i);
            int i2 = i + iP;
            int iG = slotWriter.g(slotWriter.o(i), slotWriter.b);
            int iG2 = slotWriter.g(slotWriter.o(i2), slotWriter.b);
            int i3 = iG2 - iG;
            boolean z4 = i >= 0 && (slotWriter.b[(slotWriter.o(i) * 5) + 1] & 201326592) != 0;
            slotWriter2.r(iP);
            slotWriter2.s(i3, slotWriter2.r);
            if (slotWriter.e < i2) {
                slotWriter.u(i2);
            }
            if (slotWriter.j < iG2) {
                slotWriter.v(iG2, i2);
            }
            int[] iArr = slotWriter2.b;
            int i4 = slotWriter2.r;
            int i5 = i4 * 5;
            n8.O(i5, i * 5, i2 * 5, slotWriter.b, iArr);
            Object[] objArr = slotWriter2.c;
            int i6 = slotWriter2.h;
            n8.P(i6, iG, iG2, slotWriter.c, objArr);
            int i7 = slotWriter2.s;
            iArr[i5 + 2] = i7;
            int i8 = i4 - i;
            int i9 = i4 + iP;
            int iG3 = i6 - slotWriter2.g(i4, iArr);
            int i10 = slotWriter2.l;
            int i11 = slotWriter2.k;
            int length = objArr.length;
            int i12 = i10;
            int i13 = i4;
            while (i13 < i9) {
                if (i13 != i4) {
                    int i14 = (i13 * 5) + 2;
                    iArr[i14] = iArr[i14] + i8;
                }
                boolean z5 = z4;
                int iG4 = slotWriter2.g(i13, iArr) + iG3;
                if (iG4 > (i12 < i13 ? 0 : slotWriter2.j)) {
                    iG4 = -(((length - i11) - iG4) + 1);
                }
                iArr[(i13 * 5) + 4] = iG4;
                if (i13 == i12) {
                    i12++;
                }
                i13++;
                i6 = i6;
                z4 = z5;
            }
            boolean z6 = z4;
            int i15 = i6;
            slotWriter2.l = i12;
            int iE = SlotTableKt.e(slotWriter.d, i, slotWriter.n());
            int iE2 = SlotTableKt.e(slotWriter.d, i2, slotWriter.n());
            if (iE < iE2) {
                ArrayList arrayList = slotWriter.d;
                ArrayList arrayList2 = new ArrayList(iE2 - iE);
                int i16 = iE;
                while (i16 < iE2) {
                    Object obj = arrayList.get(i16);
                    obj.getClass();
                    int i17 = i16;
                    Anchor anchor = (Anchor) obj;
                    int i18 = i8;
                    anchor.a += i18;
                    arrayList2.add(anchor);
                    i16 = i17 + 1;
                    i8 = i18;
                }
                slotWriter2.d.addAll(SlotTableKt.e(slotWriter2.d, slotWriter2.r, slotWriter2.n()), arrayList2);
                arrayList.subList(iE, iE2).clear();
                list = arrayList2;
            } else {
                list = gg0.a;
            }
            int iX = slotWriter.x(i, slotWriter.b);
            if (z) {
                boolean z7 = iX >= 0;
                if (z7) {
                    slotWriter.H();
                    slotWriter.a(iX - slotWriter.r);
                    slotWriter.H();
                }
                slotWriter.a(i - slotWriter.r);
                z3 = slotWriter.z();
                if (z7) {
                    slotWriter.E();
                    slotWriter.i();
                    slotWriter.E();
                    slotWriter.i();
                }
            } else {
                boolean zA = slotWriter.A(i, iP);
                slotWriter.B(iG, i3, i - 1);
                z3 = zA;
            }
            if (z3) {
                ComposerKt.c("Unexpectedly removed anchors");
                throw null;
            }
            slotWriter2.n += SlotTableKt.d(i4, iArr) ? 1 : SlotTableKt.f(i4, iArr);
            if (z2) {
                slotWriter2.r = i9;
                slotWriter2.h = i15 + i3;
            }
            if (z6) {
                slotWriter2.K(i7);
            }
            return list;
        }
    }

    public final boolean A(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            u(i);
            if (!arrayList.isEmpty()) {
                int i3 = i + i2;
                int iE = SlotTableKt.e(this.d, i3, m() - this.f);
                if (iE >= this.d.size()) {
                    iE--;
                }
                int i4 = iE + 1;
                int i5 = 0;
                while (iE >= 0) {
                    Object obj = this.d.get(iE);
                    obj.getClass();
                    Anchor anchor = (Anchor) obj;
                    int iC = c(anchor);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        anchor.a = Integer.MIN_VALUE;
                        if (i5 == 0) {
                            i5 = iE + 1;
                        }
                        i4 = iE;
                    }
                    iE--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.e = i;
            this.f += i2;
            int i6 = this.l;
            if (i6 > i) {
                this.l = Math.max(i, i6 - i2);
            }
            int i7 = this.g;
            if (i7 >= this.e) {
                this.g = i7 - i2;
            }
            int i8 = this.s;
            if (i8 >= 0) {
                if (SlotTableKt.a(o(i8), this.b)) {
                    K(this.s);
                }
            }
        }
        return z;
    }

    public final void f() {
        this.t = true;
        if (this.o.b == 0) {
            u(n());
            v(this.c.length - this.k, this.e);
            y();
        }
        int[] iArr = this.b;
        int i = this.e;
        Object[] objArr = this.c;
        int i2 = this.j;
        ArrayList arrayList = this.d;
        arrayList.getClass();
        SlotTable slotTable = this.a;
        if (!slotTable.f) {
            d.r("Unexpected writer close()");
            return;
        }
        slotTable.f = false;
        slotTable.a = iArr;
        slotTable.b = i;
        slotTable.c = objArr;
        slotTable.d = i2;
        slotTable.h = arrayList;
    }

    public final void B(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            v(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final Object C(int i, Object obj) {
        int iG = G(o(this.r), this.b);
        int iG2 = g(o(this.r + 1), this.b);
        int i2 = iG + i;
        if (i2 < iG || i2 >= iG2) {
            StringBuilder sbS = jc1.s(i, "Write to an invalid slot index ", " for group ");
            sbS.append(this.r);
            ComposerKt.c(sbS.toString().toString());
            throw null;
        }
        int iH = h(i2);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int D() {
        int iO = o(this.r);
        int i = this.r;
        int[] iArr = this.b;
        int i2 = iArr[(iO * 5) + 3] + i;
        this.r = i2;
        this.h = g(o(i2), iArr);
        if (SlotTableKt.d(iO, this.b)) {
            return 1;
        }
        return SlotTableKt.f(iO, this.b);
    }

    public final void E() {
        int i = this.g;
        this.r = i;
        this.h = g(o(i), this.b);
    }

    public final void H() {
        if (this.m != 0) {
            d.r("Key must be supplied when inserting");
        } else {
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
            I(composer$Companion$Empty$1, composer$Companion$Empty$1, false, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Object obj, Object obj2, boolean z, int i) {
        int i2;
        byte b = this.m > 0;
        this.q.b(this.n);
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
        if (b == true) {
            r(1);
            int i3 = this.r;
            int iO = o(i3);
            int i4 = obj != composer$Companion$Empty$1 ? 1 : 0;
            int i5 = (z || obj2 == composer$Companion$Empty$1) ? 0 : 1;
            int[] iArr = this.b;
            int i6 = this.s;
            int i7 = this.h;
            int i8 = z ? 1073741824 : 0;
            int i9 = i4 != 0 ? 536870912 : 0;
            int i10 = i5 != 0 ? 268435456 : 0;
            int i11 = iO * 5;
            iArr[i11] = i;
            iArr[i11 + 1] = i8 | i9 | i10;
            iArr[i11 + 2] = i6;
            iArr[i11 + 3] = 0;
            iArr[i11 + 4] = i7;
            this.i = i7;
            int i12 = (z ? 1 : 0) + i4 + i5;
            if (i12 > 0) {
                s(i12, i3);
                Object[] objArr = this.c;
                int i13 = this.h;
                if (z) {
                    objArr[i13] = obj2;
                    i13++;
                }
                if (i4 != 0) {
                    objArr[i13] = obj;
                    i13++;
                }
                if (i5 != 0) {
                    objArr[i13] = obj2;
                    i13++;
                }
                this.h = i13;
            }
            this.n = 0;
            i2 = i3 + 1;
            this.s = i3;
            this.r = i2;
        } else {
            this.o.b(this.s);
            this.p.b((m() - this.f) - this.g);
            int i14 = this.r;
            int iO2 = o(i14);
            if (!s71.b(obj2, composer$Companion$Empty$1)) {
                if (z) {
                    L(this.r, obj2);
                } else {
                    J(obj2);
                }
            }
            this.h = G(iO2, this.b);
            this.i = g(o(this.r + 1), this.b);
            this.n = SlotTableKt.f(iO2, this.b);
            this.s = i14;
            this.r = i14 + 1;
            i2 = i14 + this.b[(iO2 * 5) + 3];
        }
        this.g = i2;
    }

    public final void J(Object obj) {
        int iO = o(this.r);
        if (SlotTableKt.b(iO, this.b)) {
            this.c[h(d(iO, this.b))] = obj;
        } else {
            ComposerKt.c("Updating the data of a group that was not created with a data slot");
            throw null;
        }
    }

    public final void K(int i) {
        if (i >= 0) {
            PrioritySet prioritySet = this.u;
            if (prioritySet == null) {
                prioritySet = new PrioritySet();
                this.u = prioritySet;
            }
            prioritySet.a(i);
        }
    }

    public final void a(int i) {
        if (i < 0) {
            d.r("Cannot seek backwards");
            return;
        }
        if (this.m > 0) {
            e32.i("Cannot call seek() while inserting");
            return;
        }
        if (i == 0) {
            return;
        }
        int i2 = this.r + i;
        if (i2 >= this.s && i2 <= this.g) {
            this.r = i2;
            int iG = g(o(i2), this.b);
            this.h = iG;
            this.i = iG;
            return;
        }
        ComposerKt.c(("Cannot seek outside the current group (" + this.s + '-' + this.g + ')').toString());
        throw null;
    }

    public final Anchor b(int i) {
        ArrayList arrayList = this.d;
        int iJ = SlotTableKt.j(arrayList, i, n());
        if (iJ >= 0) {
            Object obj = arrayList.get(iJ);
            obj.getClass();
            return (Anchor) obj;
        }
        if (i > this.e) {
            i = -(n() - i);
        }
        Anchor anchor = new Anchor(i);
        arrayList.add(-(iJ + 1), anchor);
        return anchor;
    }

    public final void e() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            this.p.b((m() - this.f) - this.g);
        }
    }

    public final int h(int i) {
        return i < this.j ? i : i + this.k;
    }

    public final void i() {
        boolean z = this.m > 0;
        int i = this.r;
        int i2 = this.g;
        int i3 = this.s;
        int iO = o(i3);
        int i4 = this.n;
        int i5 = i - i3;
        boolean zD = SlotTableKt.d(iO, this.b);
        IntStack intStack = this.q;
        if (z) {
            SlotTableKt.h(iO, i5, this.b);
            SlotTableKt.i(iO, i4, this.b);
            this.n = intStack.a() + (zD ? 1 : i4);
            this.s = x(i3, this.b);
            return;
        }
        if (i != i2) {
            d.r("Expected to be at the end of a group");
            return;
        }
        int[] iArr = this.b;
        int i6 = iArr[(iO * 5) + 3];
        int iF = SlotTableKt.f(iO, iArr);
        SlotTableKt.h(iO, i5, this.b);
        SlotTableKt.i(iO, i4, this.b);
        int iA = this.o.a();
        this.g = (m() - this.f) - this.p.a();
        this.s = iA;
        int iX = x(i3, this.b);
        int iA2 = intStack.a();
        this.n = iA2;
        if (iX == iA) {
            this.n = iA2 + (zD ? 0 : i4 - iF);
            return;
        }
        int i7 = i5 - i6;
        int i8 = zD ? 0 : i4 - iF;
        if (i7 != 0 || i8 != 0) {
            while (iX != 0 && iX != iA && (i8 != 0 || i7 != 0)) {
                int iO2 = o(iX);
                if (i7 != 0) {
                    int[] iArr2 = this.b;
                    SlotTableKt.h(iO2, iArr2[(iO2 * 5) + 3] + i7, iArr2);
                }
                if (i8 != 0) {
                    int[] iArr3 = this.b;
                    SlotTableKt.i(iO2, SlotTableKt.f(iO2, iArr3) + i8, iArr3);
                }
                if (SlotTableKt.d(iO2, this.b)) {
                    i8 = 0;
                }
                iX = x(iX, this.b);
            }
        }
        this.n += i8;
    }

    public final void j() {
        int i = this.m;
        if (i <= 0) {
            e32.i("Unbalanced begin/end insert");
            return;
        }
        int i2 = i - 1;
        this.m = i2;
        if (i2 == 0) {
            if (this.q.b == this.o.b) {
                this.g = (m() - this.f) - this.p.a();
            } else {
                ComposerKt.c("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i) {
        if (this.m > 0) {
            d.r("Cannot call ensureStarted() while inserting");
            return;
        }
        int i2 = this.s;
        if (i2 != i) {
            if (i < i2 || i >= this.g) {
                ak1.n(nj.i(i, i2, "Started group at ", " must be a subgroup of the group at "));
                return;
            }
            int i3 = this.r;
            int i4 = this.h;
            int i5 = this.i;
            this.r = i;
            H();
            this.r = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.e) {
            i = -((n() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(o(i3) * 5) + 2] = i;
            int i4 = this.b[(o(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int m() {
        return this.b.length / 5;
    }

    public final int o(int i) {
        return i < this.e ? i : i + this.f;
    }

    public final int p(int i) {
        return this.b[(o(i) * 5) + 3];
    }

    public final boolean q(int i, int i2) {
        int iM;
        int iP;
        if (i2 == this.s) {
            iM = this.g;
        } else {
            IntStack intStack = this.o;
            int i3 = intStack.b;
            if (i2 > (i3 > 0 ? intStack.a[i3 - 1] : 0)) {
                iP = p(i2);
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        i4 = -1;
                        break;
                    }
                    if (intStack.a[i4] == i2) {
                        break;
                    }
                    i4++;
                }
                if (i4 < 0) {
                    iP = p(i2);
                } else {
                    iM = (m() - this.f) - this.p.a[i4];
                }
            }
            iM = iP + i2;
        }
        return i > i2 && i < iM;
    }

    public final void r(int i) {
        if (i > 0) {
            int i2 = this.r;
            u(i2);
            int i3 = this.e;
            int i4 = this.f;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                n8.O(0, 0, i3 * 5, iArr, iArr2);
                n8.O((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.g;
            if (i7 >= i3) {
                this.g = i7 + i;
            }
            int i8 = i3 + i;
            this.e = i8;
            this.f = i4 - i;
            int iG = i5 > 0 ? g(o(i2 + i), this.b) : 0;
            int i9 = this.l >= i3 ? this.j : 0;
            int i10 = this.k;
            int length2 = this.c.length;
            if (iG > i9) {
                iG = -(((length2 - i10) - iG) + 1);
            }
            for (int i11 = i3; i11 < i8; i11++) {
                this.b[(i11 * 5) + 4] = iG;
            }
            int i12 = this.l;
            if (i12 >= i3) {
                this.l = i12 + i;
            }
        }
    }

    public final void s(int i, int i2) {
        if (i > 0) {
            v(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                n8.P(0, 0, i3, objArr, objArr2);
                n8.P(i3 + i7, i4 + i3, length, objArr, objArr2);
                this.c = objArr2;
                i4 = i7;
            }
            int i8 = this.i;
            if (i8 >= i3) {
                this.i = i8 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.r + " end=" + this.g + " size = " + n() + " gap=" + this.e + '-' + (this.e + this.f) + ')';
    }

    public final void u(int i) {
        int i2;
        int i3 = this.f;
        int i4 = this.e;
        if (i4 != i) {
            if (!this.d.isEmpty()) {
                int iM = m() - this.f;
                ArrayList arrayList = this.d;
                if (i4 >= i) {
                    for (int iE = SlotTableKt.e(arrayList, i, iM); iE < this.d.size(); iE++) {
                        Object obj = this.d.get(iE);
                        obj.getClass();
                        Anchor anchor = (Anchor) obj;
                        int i5 = anchor.a;
                        if (i5 < 0) {
                            break;
                        }
                        anchor.a = -(iM - i5);
                    }
                } else {
                    for (int iE2 = SlotTableKt.e(arrayList, i4, iM); iE2 < this.d.size(); iE2++) {
                        Object obj2 = this.d.get(iE2);
                        obj2.getClass();
                        Anchor anchor2 = (Anchor) obj2;
                        int i6 = anchor2.a;
                        if (i6 >= 0 || (i2 = i6 + iM) >= i) {
                            break;
                        }
                        anchor2.a = i2;
                    }
                }
            }
            if (i3 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i3 * 5;
                int i9 = i4 * 5;
                if (i < i4) {
                    n8.O(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    n8.O(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i4) {
                i4 = i + i3;
            }
            int iM2 = m();
            ComposerKt.f(i4 < iM2);
            while (i4 < iM2) {
                int i10 = (i4 * 5) + 2;
                int i11 = this.b[i10];
                int iN = i11 > -2 ? i11 : (n() + i11) - (-2);
                if (iN >= i) {
                    iN = -((n() - iN) - (-2));
                }
                if (iN != i11) {
                    this.b[i10] = iN;
                }
                i4++;
                if (i4 == i) {
                    i4 += i3;
                }
            }
        }
        this.e = i;
    }

    public final void v(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                n8.P(i + i3, i, i4, objArr, objArr);
            } else {
                n8.P(i4, i4 + i3, i + i3, objArr, objArr);
            }
            Arrays.fill(objArr, i, i + i3, (Object) null);
        }
        int iMin = Math.min(i2 + 1, n());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iO = o(iMin);
                int iO2 = o(i5);
                int i6 = this.e;
                while (iO < iO2) {
                    int[] iArr = this.b;
                    int i7 = (iO * 5) + 4;
                    int i8 = iArr[i7];
                    if (i8 < 0) {
                        ComposerKt.c("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i7] = -((length - i8) + 1);
                    iO++;
                    if (iO == i6) {
                        iO += this.f;
                    }
                }
            } else {
                int iO3 = o(i5);
                int iO4 = o(iMin);
                while (iO3 < iO4) {
                    int[] iArr2 = this.b;
                    int i9 = (iO3 * 5) + 4;
                    int i10 = iArr2[i9];
                    if (i10 >= 0) {
                        ComposerKt.c("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i9] = i10 + length + 1;
                    iO3++;
                    if (iO3 == this.e) {
                        iO3 += this.f;
                    }
                }
            }
            this.l = iMin;
        }
        this.j = i;
    }

    public final void w(Anchor anchor, SlotWriter slotWriter) {
        int iF;
        if (slotWriter.m <= 0) {
            d.r("Failed requirement.");
            return;
        }
        if (this.m != 0) {
            d.r("Failed requirement.");
            return;
        }
        if (!anchor.a()) {
            d.r("Failed requirement.");
            return;
        }
        int iC = c(anchor) + 1;
        int i = this.r;
        if (i > iC || iC >= this.g) {
            d.r("Failed requirement.");
            return;
        }
        int iX = x(iC, this.b);
        int iP = p(iC);
        if (SlotTableKt.d(o(iC), this.b)) {
            iF = 1;
        } else {
            iF = SlotTableKt.f(o(iC), this.b);
        }
        Companion.a(this, iC, slotWriter, false, false);
        K(iX);
        boolean z = iF > 0;
        while (iX >= i) {
            int iO = o(iX);
            int[] iArr = this.b;
            SlotTableKt.h(iO, iArr[(iO * 5) + 3] - iP, iArr);
            if (z) {
                if (SlotTableKt.d(iO, this.b)) {
                    z = false;
                } else {
                    int[] iArr2 = this.b;
                    SlotTableKt.i(iO, SlotTableKt.f(iO, iArr2) - iF, iArr2);
                }
            }
            iX = x(iX, this.b);
        }
        if (z) {
            ComposerKt.f(this.n >= iF);
            this.n -= iF;
        }
    }

    public final void y() {
        boolean z;
        PrioritySet prioritySet = this.u;
        if (prioritySet != null) {
            while (!prioritySet.a.isEmpty()) {
                int iB = prioritySet.b();
                int iO = o(iB);
                int iP = iB + 1;
                int iP2 = p(iB) + iB;
                while (true) {
                    if (iP >= iP2) {
                        z = false;
                        break;
                    } else {
                        if ((this.b[(o(iP) * 5) + 1] & 201326592) != 0) {
                            z = true;
                            break;
                        }
                        iP += p(iP);
                    }
                }
                if (SlotTableKt.a(iO, this.b) != z) {
                    int[] iArr = this.b;
                    int i = (iO * 5) + 1;
                    if (z) {
                        iArr[i] = iArr[i] | C.BUFFER_FLAG_NOT_DEPENDED_ON;
                    } else {
                        iArr[i] = iArr[i] & (-67108865);
                    }
                    int iX = x(iB, iArr);
                    if (iX >= 0) {
                        prioritySet.a(iX);
                    }
                }
            }
        }
    }

    public final boolean z() {
        if (this.m != 0) {
            d.r("Cannot remove group while inserting");
            return false;
        }
        int i = this.r;
        int i2 = this.h;
        int iD = D();
        PrioritySet prioritySet = this.u;
        if (prioritySet != null) {
            List list = prioritySet.a;
            while (!list.isEmpty() && ((Number) du.a0(list)).intValue() >= i) {
                prioritySet.b();
            }
        }
        boolean zA = A(i, this.r - i);
        B(i2, this.h - i2, i - 1);
        this.r = i;
        this.h = i2;
        this.n -= iD;
        return zA;
    }

    public SlotWriter(SlotTable slotTable) {
        this.a = slotTable;
        int[] iArr = slotTable.a;
        this.b = iArr;
        Object[] objArr = slotTable.c;
        this.c = objArr;
        this.d = slotTable.h;
        int i = slotTable.b;
        this.e = i;
        this.f = (iArr.length / 5) - i;
        this.g = i;
        int i2 = slotTable.d;
        this.j = i2;
        this.k = objArr.length - i2;
        this.l = i;
        this.o = new IntStack();
        this.p = new IntStack();
        this.q = new IntStack();
        this.s = -1;
    }

    public final Object F(int i, int i2) {
        int iG = G(o(i), this.b);
        int iG2 = g(o(i + 1), this.b);
        int i3 = i2 + iG;
        if (iG <= i3 && i3 < iG2) {
            return this.c[h(i3)];
        }
        return Composer.Companion.a;
    }

    public final int G(int i, int[] iArr) {
        if (i >= m()) {
            return this.c.length - this.k;
        }
        int iG = SlotTableKt.g(i, iArr);
        int i2 = this.k;
        int length = this.c.length;
        if (iG < 0) {
            return (length - i2) + iG + 1;
        }
        return iG;
    }

    public final void L(int i, Object obj) {
        int iO = o(i);
        int[] iArr = this.b;
        if (iO < iArr.length && SlotTableKt.d(iO, iArr)) {
            this.c[h(g(iO, this.b))] = obj;
            return;
        }
        ComposerKt.c(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw null;
    }

    public final int c(Anchor anchor) {
        anchor.getClass();
        int i = anchor.a;
        if (i < 0) {
            return n() + i;
        }
        return i;
    }

    public final int d(int i, int[] iArr) {
        int iG = g(i, iArr);
        int i2 = 1;
        switch (iArr[(i * 5) + 1] >> 29) {
            case 0:
                i2 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        return i2 + iG;
    }

    public final int g(int i, int[] iArr) {
        if (i >= m()) {
            return this.c.length - this.k;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = this.k;
        int length = this.c.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public final int n() {
        return m() - this.f;
    }

    public final void t(SlotTable slotTable, int i) {
        slotTable.getClass();
        if (this.m > 0) {
            if (i == 0 && this.r == 0 && this.a.b == 0) {
                int[] iArr = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                int[] iArr2 = slotTable.a;
                int i2 = slotTable.b;
                Object[] objArr2 = slotTable.c;
                int i3 = slotTable.d;
                this.b = iArr2;
                this.c = objArr2;
                this.d = slotTable.h;
                this.e = i2;
                this.f = (iArr2.length / 5) - i2;
                this.j = i3;
                this.k = objArr2.length - i3;
                this.l = i2;
                arrayList.getClass();
                slotTable.a = iArr;
                slotTable.b = 0;
                slotTable.c = objArr;
                slotTable.d = 0;
                slotTable.h = arrayList;
                return;
            }
            SlotWriter slotWriterD = slotTable.d();
            try {
                Companion.a(slotWriterD, i, this, true, true);
                return;
            } finally {
                slotWriterD.f();
            }
        }
        d.r("Failed requirement.");
    }

    public final int x(int i, int[] iArr) {
        int i2 = iArr[(o(i) * 5) + 2];
        if (i2 > -2) {
            return i2;
        }
        return (n() + i2) - (-2);
    }
}
