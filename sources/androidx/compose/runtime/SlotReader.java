package androidx.compose.runtime;

import defpackage.d;
import defpackage.h50;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SlotReader {
    public final SlotTable a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public final Anchor a(int i) {
        ArrayList arrayList = this.a.h;
        int iJ = SlotTableKt.j(arrayList, i, this.c);
        if (iJ < 0) {
            Anchor anchor = new Anchor(i);
            arrayList.add(-(iJ + 1), anchor);
            return anchor;
        }
        Object obj = arrayList.get(iJ);
        obj.getClass();
        return (Anchor) obj;
    }

    public final void c() {
        SlotTable slotTable = this.a;
        int i = slotTable.e;
        if (i > 0) {
            slotTable.e = i - 1;
        } else {
            d.r("Unexpected reader close()");
        }
    }

    public final void d() {
        if (this.i == 0) {
            if (this.f != this.g) {
                d.r("endGroup() not called at the end of a group");
                return;
            }
            int i = (this.h * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.h = i2;
            this.g = i2 < 0 ? this.c : i2 + iArr[(i2 * 5) + 3];
        }
    }

    public final Object e() {
        int i = this.f;
        if (i < this.g) {
            return b(i, this.b);
        }
        return 0;
    }

    public final int f() {
        int i = this.f;
        if (i >= this.g) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object g(int i, int i2) {
        int[] iArr = this.b;
        int iG = SlotTableKt.g(i, iArr);
        int i3 = i + 1;
        int i4 = iG + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : Composer.Companion.a;
    }

    public final Object h(int i) {
        int[] iArr = this.b;
        if (!SlotTableKt.d(i, iArr)) {
            return null;
        }
        if (!SlotTableKt.d(i, iArr)) {
            return Composer.Companion.a;
        }
        return this.d[iArr[(i * 5) + 4]];
    }

    public final void j(int i) {
        if (this.i != 0) {
            d.r("Cannot reposition while in an empty region");
            return;
        }
        this.f = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        this.h = i3;
        if (i3 < 0) {
            this.g = i2;
        } else {
            this.g = iArr[(i3 * 5) + 3] + i3;
        }
        this.j = 0;
        this.k = 0;
    }

    public final int k() {
        if (this.i != 0) {
            d.r("Cannot skip while in an empty region");
            return 0;
        }
        int i = this.f;
        int[] iArr = this.b;
        int iF = SlotTableKt.d(i, iArr) ? 1 : SlotTableKt.f(this.f, iArr);
        int i2 = this.f;
        this.f = iArr[(i2 * 5) + 3] + i2;
        return iF;
    }

    public final void l() {
        if (this.i == 0) {
            this.f = this.g;
        } else {
            d.r("Cannot skip the enclosing group while in an empty region");
        }
    }

    public final void m() {
        if (this.i <= 0) {
            int i = this.f;
            int[] iArr = this.b;
            if (iArr[(i * 5) + 2] != this.h) {
                d.r("Invalid slot table detected");
                return;
            }
            this.h = i;
            this.g = iArr[(i * 5) + 3] + i;
            int i2 = i + 1;
            this.f = i2;
            this.j = SlotTableKt.g(i, iArr);
            this.k = i >= this.c + (-1) ? this.e : iArr[(i2 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.h);
        sb.append(", end=");
        return h50.l(sb, this.g, ')');
    }

    public SlotReader(SlotTable slotTable) {
        this.a = slotTable;
        this.b = slotTable.a;
        int i = slotTable.b;
        this.c = i;
        this.d = slotTable.c;
        this.e = slotTable.d;
        this.g = i;
        this.h = -1;
    }

    public final Object b(int i, int[] iArr) {
        int length;
        if (SlotTableKt.b(i, iArr)) {
            int i2 = i * 5;
            if (i2 >= iArr.length) {
                length = iArr.length;
            } else {
                int i3 = iArr[i2 + 4];
                int i4 = 1;
                switch (iArr[i2 + 1] >> 29) {
                    case 0:
                        i4 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i4 = 2;
                        break;
                    default:
                        i4 = 3;
                        break;
                }
                length = i4 + i3;
            }
            return this.d[length];
        }
        return Composer.Companion.a;
    }

    public final Object i(int i, int[] iArr) {
        if (SlotTableKt.c(i, iArr)) {
            int i2 = i * 5;
            int i3 = iArr[i2 + 4];
            int i4 = 1;
            switch (iArr[i2 + 1] >> 30) {
                case 0:
                    i4 = 0;
                    break;
                case 1:
                case 2:
                case 4:
                    break;
                case 3:
                case 5:
                case 6:
                    i4 = 2;
                    break;
                default:
                    i4 = 3;
                    break;
            }
            return this.d[i4 + i3];
        }
        return null;
    }
}
