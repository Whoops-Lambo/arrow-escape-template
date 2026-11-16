package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import com.ironsource.C4664b4;
import com.safedk.android.analytics.brandsafety.m;
import defpackage.d;
import defpackage.jc1;
import defpackage.vq2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class AdapterHelper implements OpReorderer.Callback {
    public final RecyclerView.AnonymousClass6 d;
    public final Pools.SimplePool a = new Pools.SimplePool(30);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int f = 0;
    public final OpReorderer e = new OpReorderer(this);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class UpdateOp {
        public int a;
        public int b;
        public Object c;
        public int d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof UpdateOp)) {
                    return false;
                }
                UpdateOp updateOp = (UpdateOp) obj;
                int i = this.a;
                if (i != updateOp.a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != updateOp.b || this.b != updateOp.d) {
                    if (this.d != updateOp.d || this.b != updateOp.b) {
                        return false;
                    }
                    Object obj2 = this.c;
                    Object obj3 = updateOp.c;
                    if (obj2 != null) {
                        if (!obj2.equals(obj3)) {
                            return false;
                        }
                    } else if (obj3 != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(C4664b4.j.d);
            int i = this.a;
            if (i == 1) {
                str = m.l;
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            return jc1.p(sb, this.c, C4664b4.j.e);
        }
    }

    public final boolean a(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = updateOp.b;
                    int i5 = updateOp.d + i4;
                    while (i4 < i5) {
                        if (f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(updateOp.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a((UpdateOp) arrayList.get(i));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(UpdateOp updateOp) {
        int i;
        Pools.SimplePool simplePool;
        int i2 = updateOp.a;
        if (i2 == 1 || i2 == 8) {
            d.r("should not dispatch add or move for pre layout");
            return;
        }
        int iL = l(updateOp.b, i2);
        int i3 = updateOp.b;
        int i4 = updateOp.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                vq2.r(updateOp, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = updateOp.d;
            simplePool = this.a;
            if (i5 >= i7) {
                break;
            }
            int iL2 = l((i * i5) + updateOp.b, updateOp.a);
            int i8 = updateOp.a;
            if (i8 == 2 ? iL2 != iL : !(i8 == 4 && iL2 == iL + 1)) {
                UpdateOp updateOpH = h(i8, iL, i6, updateOp.c);
                e(updateOpH, i3);
                updateOpH.c = null;
                simplePool.b(updateOpH);
                if (updateOp.a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iL = iL2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = updateOp.c;
        updateOp.c = null;
        simplePool.b(updateOp);
        if (i6 > 0) {
            UpdateOp updateOpH2 = h(updateOp.a, iL, i6, obj);
            e(updateOpH2, i3);
            updateOpH2.c = null;
            simplePool.b(updateOpH2);
        }
    }

    public final void e(UpdateOp updateOp, int i) {
        RecyclerView.AnonymousClass6 anonymousClass6 = this.d;
        anonymousClass6.a(updateOp);
        int i2 = updateOp.a;
        if (i2 == 2) {
            anonymousClass6.f(i, updateOp.d);
        } else if (i2 == 4) {
            anonymousClass6.c(i, updateOp.d, updateOp.c);
        } else {
            d.r("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i, int i2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.a;
            int i4 = updateOp.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = updateOp.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (updateOp.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = updateOp.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += updateOp.d;
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final UpdateOp h(int i, int i2, int i3, Object obj) {
        UpdateOp updateOp = (UpdateOp) this.a.a();
        if (updateOp != null) {
            updateOp.a = i;
            updateOp.b = i2;
            updateOp.d = i3;
            updateOp.c = obj;
            return updateOp;
        }
        UpdateOp updateOp2 = new UpdateOp();
        updateOp2.a = i;
        updateOp2.b = i2;
        updateOp2.d = i3;
        updateOp2.c = obj;
        return updateOp2;
    }

    public final void i(UpdateOp updateOp) {
        this.c.add(updateOp);
        int i = updateOp.a;
        RecyclerView.AnonymousClass6 anonymousClass6 = this.d;
        if (i == 1) {
            anonymousClass6.d(updateOp.b, updateOp.d);
            return;
        }
        if (i == 2) {
            int i2 = updateOp.b;
            int i3 = updateOp.d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i2, i3, false);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            anonymousClass6.c(updateOp.b, updateOp.d, updateOp.c);
        } else if (i == 8) {
            anonymousClass6.e(updateOp.b, updateOp.d);
        } else {
            vq2.r(updateOp, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:102:0x0187  */
    /* JADX WARN: Code duplicated, block: B:181:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    /* JADX WARN: Code duplicated, block: B:82:0x013b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0146  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x014e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:0x015f  */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0175  */
    public final void j() {
        ArrayList arrayList;
        int i;
        byte b;
        boolean z;
        byte b2;
        UpdateOp updateOpH;
        int i2;
        int i3;
        int i4;
        UpdateOp updateOpH2;
        boolean z2;
        boolean z3;
        UpdateOp updateOpH3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        OpReorderer opReorderer = this.e;
        opReorderer.getClass();
        while (true) {
            arrayList = this.b;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                b = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((UpdateOp) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i13 = size + 1;
            AdapterHelper adapterHelper = opReorderer.a;
            Pools.SimplePool simplePool = adapterHelper.a;
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(i13);
            int i14 = updateOp2.a;
            if (i14 == 1) {
                int i15 = updateOp.d;
                int i16 = updateOp2.b;
                int i17 = i15 < i16 ? -1 : 0;
                int i18 = updateOp.b;
                if (i18 < i16) {
                    i17++;
                }
                if (i16 <= i18) {
                    updateOp.b = i18 + updateOp2.d;
                }
                int i19 = updateOp2.b;
                if (i19 <= i15) {
                    updateOp.d = i15 + updateOp2.d;
                }
                updateOp2.b = i19 + i17;
                arrayList.set(size, updateOp2);
                arrayList.set(i13, updateOp);
            } else if (i14 == 2) {
                int i20 = updateOp.b;
                int i21 = updateOp.d;
                int i22 = updateOp2.b;
                if (i20 < i21) {
                    z3 = i22 == i20 && updateOp2.d == i21 - i20;
                    z2 = false;
                } else if (i22 == i21 + 1 && updateOp2.d == i20 - i21) {
                    z3 = true;
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i21 < i22) {
                    updateOp2.b = i22 - 1;
                } else {
                    int i23 = updateOp2.d;
                    if (i21 < i22 + i23) {
                        updateOp2.d = i23 - 1;
                        updateOp.a = 2;
                        updateOp.d = 1;
                        if (updateOp2.d == 0) {
                            arrayList.remove(i13);
                            updateOp2.c = null;
                            simplePool.b(updateOp2);
                        }
                    }
                }
                int i24 = updateOp.b;
                int i25 = updateOp2.b;
                if (i24 <= i25) {
                    updateOp2.b = i25 + 1;
                } else {
                    int i26 = i25 + updateOp2.d;
                    if (i24 < i26) {
                        updateOpH3 = adapterHelper.h(2, i24 + 1, i26 - i24, null);
                        updateOp2.d = updateOp.b - updateOp2.b;
                    }
                    if (z3) {
                        arrayList.set(size, updateOp2);
                        arrayList.remove(i13);
                        updateOp.c = null;
                        simplePool.b(updateOp);
                    } else {
                        if (z2) {
                            if (updateOpH3 != null) {
                                i11 = updateOp.b;
                                if (i11 > updateOpH3.b) {
                                    updateOp.b = i11 - updateOpH3.d;
                                }
                                i12 = updateOp.d;
                                if (i12 > updateOpH3.b) {
                                    updateOp.d = i12 - updateOpH3.d;
                                }
                            }
                            i9 = updateOp.b;
                            if (i9 > updateOp2.b) {
                                updateOp.b = i9 - updateOp2.d;
                            }
                            i10 = updateOp.d;
                            if (i10 > updateOp2.b) {
                                updateOp.d = i10 - updateOp2.d;
                            }
                        } else {
                            if (updateOpH3 != null) {
                                i7 = updateOp.b;
                                if (i7 >= updateOpH3.b) {
                                    updateOp.b = i7 - updateOpH3.d;
                                }
                                i8 = updateOp.d;
                                if (i8 >= updateOpH3.b) {
                                    updateOp.d = i8 - updateOpH3.d;
                                }
                            }
                            i5 = updateOp.b;
                            if (i5 >= updateOp2.b) {
                                updateOp.b = i5 - updateOp2.d;
                            }
                            i6 = updateOp.d;
                            if (i6 >= updateOp2.b) {
                                updateOp.d = i6 - updateOp2.d;
                            }
                        }
                        arrayList.set(size, updateOp2);
                        if (updateOp.b != updateOp.d) {
                            arrayList.set(i13, updateOp);
                        } else {
                            arrayList.remove(i13);
                        }
                        if (updateOpH3 != null) {
                            arrayList.add(size, updateOpH3);
                        }
                    }
                }
                updateOpH3 = null;
                if (z3) {
                    arrayList.set(size, updateOp2);
                    arrayList.remove(i13);
                    updateOp.c = null;
                    simplePool.b(updateOp);
                } else {
                    if (z2) {
                        if (updateOpH3 != null) {
                            i11 = updateOp.b;
                            if (i11 > updateOpH3.b) {
                                updateOp.b = i11 - updateOpH3.d;
                            }
                            i12 = updateOp.d;
                            if (i12 > updateOpH3.b) {
                                updateOp.d = i12 - updateOpH3.d;
                            }
                        }
                        i9 = updateOp.b;
                        if (i9 > updateOp2.b) {
                            updateOp.b = i9 - updateOp2.d;
                        }
                        i10 = updateOp.d;
                        if (i10 > updateOp2.b) {
                            updateOp.d = i10 - updateOp2.d;
                        }
                    } else {
                        if (updateOpH3 != null) {
                            i7 = updateOp.b;
                            if (i7 >= updateOpH3.b) {
                                updateOp.b = i7 - updateOpH3.d;
                            }
                            i8 = updateOp.d;
                            if (i8 >= updateOpH3.b) {
                                updateOp.d = i8 - updateOpH3.d;
                            }
                        }
                        i5 = updateOp.b;
                        if (i5 >= updateOp2.b) {
                            updateOp.b = i5 - updateOp2.d;
                        }
                        i6 = updateOp.d;
                        if (i6 >= updateOp2.b) {
                            updateOp.d = i6 - updateOp2.d;
                        }
                    }
                    arrayList.set(size, updateOp2);
                    if (updateOp.b != updateOp.d) {
                        arrayList.set(i13, updateOp);
                    } else {
                        arrayList.remove(i13);
                    }
                    if (updateOpH3 != null) {
                        arrayList.add(size, updateOpH3);
                    }
                }
            } else if (i14 == 4) {
                int i27 = updateOp.d;
                int i28 = updateOp2.b;
                if (i27 < i28) {
                    updateOp2.b = i28 - 1;
                } else {
                    int i29 = updateOp2.d;
                    if (i27 < i28 + i29) {
                        updateOp2.d = i29 - 1;
                        updateOpH = adapterHelper.h(4, updateOp.b, 1, updateOp2.c);
                    }
                    i2 = updateOp.b;
                    i3 = updateOp2.b;
                    if (i2 <= i3) {
                        updateOp2.b = i3 + 1;
                    } else {
                        i4 = i3 + updateOp2.d;
                        if (i2 < i4) {
                            int i30 = i4 - i2;
                            updateOpH2 = adapterHelper.h(4, i2 + 1, i30, updateOp2.c);
                            updateOp2.d -= i30;
                        }
                        arrayList.set(i13, updateOp);
                        if (updateOp2.d > 0) {
                            arrayList.set(size, updateOp2);
                        } else {
                            arrayList.remove(size);
                            updateOp2.c = null;
                            simplePool.b(updateOp2);
                        }
                        if (updateOpH != null) {
                            arrayList.add(size, updateOpH);
                        }
                        if (updateOpH2 != null) {
                            arrayList.add(size, updateOpH2);
                        }
                    }
                    updateOpH2 = null;
                    arrayList.set(i13, updateOp);
                    if (updateOp2.d > 0) {
                        arrayList.set(size, updateOp2);
                    } else {
                        arrayList.remove(size);
                        updateOp2.c = null;
                        simplePool.b(updateOp2);
                    }
                    if (updateOpH != null) {
                        arrayList.add(size, updateOpH);
                    }
                    if (updateOpH2 != null) {
                        arrayList.add(size, updateOpH2);
                    }
                }
                updateOpH = null;
                i2 = updateOp.b;
                i3 = updateOp2.b;
                if (i2 <= i3) {
                    updateOp2.b = i3 + 1;
                } else {
                    i4 = i3 + updateOp2.d;
                    if (i2 < i4) {
                        int i31 = i4 - i2;
                        updateOpH2 = adapterHelper.h(4, i2 + 1, i31, updateOp2.c);
                        updateOp2.d -= i31;
                    }
                    arrayList.set(i13, updateOp);
                    if (updateOp2.d > 0) {
                        arrayList.set(size, updateOp2);
                    } else {
                        arrayList.remove(size);
                        updateOp2.c = null;
                        simplePool.b(updateOp2);
                    }
                    if (updateOpH != null) {
                        arrayList.add(size, updateOpH);
                    }
                    if (updateOpH2 != null) {
                        arrayList.add(size, updateOpH2);
                    }
                }
                updateOpH2 = null;
                arrayList.set(i13, updateOp);
                if (updateOp2.d > 0) {
                    arrayList.set(size, updateOp2);
                } else {
                    arrayList.remove(size);
                    updateOp2.c = null;
                    simplePool.b(updateOp2);
                }
                if (updateOpH != null) {
                    arrayList.add(size, updateOpH);
                }
                if (updateOpH2 != null) {
                    arrayList.add(size, updateOpH2);
                }
            }
        }
        int size2 = arrayList.size();
        int i32 = 0;
        while (i32 < size2) {
            UpdateOp updateOpH4 = (UpdateOp) arrayList.get(i32);
            int i33 = updateOpH4.a;
            if (i33 != 1) {
                Pools.SimplePool simplePool2 = this.a;
                RecyclerView.AnonymousClass6 anonymousClass6 = this.d;
                if (i33 == 2) {
                    int i34 = updateOpH4.b;
                    int i35 = updateOpH4.d + i34;
                    int i36 = i34;
                    int i37 = 0;
                    byte b3 = -1;
                    while (i36 < i35) {
                        if (anonymousClass6.b(i36) != null || a(i36)) {
                            if (b3 == 0) {
                                d(h(2, i34, i37, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                i(h(2, i34, i37, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i36 -= i37;
                            i35 -= i37;
                            i37 = 1;
                        } else {
                            i37++;
                        }
                        i36++;
                        b3 = b2;
                    }
                    if (i37 != updateOpH4.d) {
                        updateOpH4.c = null;
                        simplePool2.b(updateOpH4);
                        updateOpH4 = h(2, i34, i37, null);
                    }
                    if (b3 == 0) {
                        d(updateOpH4);
                    } else {
                        i(updateOpH4);
                    }
                } else if (i33 == 4) {
                    int i38 = updateOpH4.b;
                    int i39 = updateOpH4.d + i38;
                    int i40 = i38;
                    int i41 = 0;
                    while (i38 < i39) {
                        if (anonymousClass6.b(i38) != null || a(i38)) {
                            if (b == 0) {
                                d(h(4, i40, i41, updateOpH4.c));
                                i40 = i38;
                                i41 = 0;
                            }
                            b = 1;
                        } else {
                            if (b == 1) {
                                i(h(4, i40, i41, updateOpH4.c));
                                i40 = i38;
                                i41 = 0;
                            }
                            b = 0;
                        }
                        i41++;
                        i38++;
                    }
                    if (i41 != updateOpH4.d) {
                        Object obj = updateOpH4.c;
                        updateOpH4.c = null;
                        simplePool2.b(updateOpH4);
                        updateOpH4 = h(4, i40, i41, obj);
                    }
                    if (b == 0) {
                        d(updateOpH4);
                    } else {
                        i(updateOpH4);
                    }
                } else if (i33 == i) {
                    i(updateOpH4);
                }
            } else {
                i(updateOpH4);
            }
            i32++;
            i = 8;
            b = -1;
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            int i5 = updateOp.a;
            int i6 = updateOp.b;
            if (i5 == 8) {
                int i7 = updateOp.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            updateOp.b = i6 + 1;
                            updateOp.d = i7 + 1;
                        } else if (i2 == 2) {
                            updateOp.b = i6 - 1;
                            updateOp.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        updateOp.d = i7 + 1;
                    } else if (i2 == 2) {
                        updateOp.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        updateOp.b = i6 + 1;
                    } else if (i2 == 2) {
                        updateOp.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= updateOp.d;
                } else if (i5 == 2) {
                    i += updateOp.d;
                }
            } else if (i2 == 1) {
                updateOp.b = i6 + 1;
            } else if (i2 == 2) {
                updateOp.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(size2);
            int i8 = updateOp2.a;
            int i9 = updateOp2.d;
            Pools.SimplePool simplePool = this.a;
            if (i8 == 8) {
                if (i9 == updateOp2.b || i9 < 0) {
                    arrayList.remove(size2);
                    updateOp2.c = null;
                    simplePool.b(updateOp2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                updateOp2.c = null;
                simplePool.b(updateOp2);
            }
        }
        return i;
    }

    public AdapterHelper(RecyclerView.AnonymousClass6 anonymousClass6) {
        this.d = anonymousClass6;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i);
            int i2 = updateOp.a;
            RecyclerView.AnonymousClass6 anonymousClass6 = this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            anonymousClass6.a(updateOp);
                            anonymousClass6.e(updateOp.b, updateOp.d);
                        }
                    } else {
                        anonymousClass6.a(updateOp);
                        anonymousClass6.c(updateOp.b, updateOp.d, updateOp.c);
                    }
                } else {
                    anonymousClass6.a(updateOp);
                    anonymousClass6.f(updateOp.b, updateOp.d);
                }
            } else {
                anonymousClass6.a(updateOp);
                anonymousClass6.d(updateOp.b, updateOp.d);
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i);
            updateOp.c = null;
            this.a.b(updateOp);
        }
        arrayList.clear();
    }
}
