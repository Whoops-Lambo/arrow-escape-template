package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import defpackage.at;
import defpackage.az2;
import defpackage.bc1;
import defpackage.du;
import defpackage.dy;
import defpackage.e52;
import defpackage.eu;
import defpackage.n8;
import defpackage.n92;
import defpackage.pv1;
import defpackage.t50;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnapshotIdSet implements Iterable<Integer>, bc1 {
    public static final SnapshotIdSet e = new SnapshotIdSet(0, 0, 0, null);
    public final long a;
    public final long b;
    public final int c;
    public final int[] d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @t50(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {l.i, 300, 307}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln92;", "", "Laz2;", "<anonymous>", "(Ln92;)V"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass1 extends e52 implements zr0 {
        public int[] r;
        public int s;
        public int t;
        public int u;
        public /* synthetic */ Object v;

        public AnonymousClass1(dy dyVar) {
            super(2, dyVar);
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(dyVar);
            anonymousClass1.v = obj;
            return anonymousClass1;
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((n92) obj, (dy) obj2)).invokeSuspend(az2.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0084  */
        /* JADX WARN: Code duplicated, block: B:27:0x0098  */
        /* JADX WARN: Code duplicated, block: B:30:0x009d  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:26:0x0096). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00bd). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0098
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ph
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                androidx.compose.runtime.snapshots.SnapshotIdSet r1 = androidx.compose.runtime.snapshots.SnapshotIdSet.this
                long r2 = r1.a
                int r4 = r1.c
                long r5 = r1.b
                int r7 = r0.u
                r8 = 0
                r11 = 3
                r12 = 2
                r13 = 64
                r16 = 1
                r9 = 1
                dz r10 = defpackage.dz.a
                if (r7 == 0) goto L4e
                if (r7 == r9) goto L3d
                if (r7 == r12) goto L31
                if (r7 != r11) goto L2b
                int r1 = r0.s
                java.lang.Object r5 = r0.v
                n92 r5 = (defpackage.n92) r5
                defpackage.wz2.a0(r21)
                r18 = 0
                goto Lbd
            L2b:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.e32.i(r0)
                return r8
            L31:
                int r1 = r0.s
                java.lang.Object r7 = r0.v
                n92 r7 = (defpackage.n92) r7
                defpackage.wz2.a0(r21)
                r18 = 0
                goto L96
            L3d:
                int r1 = r0.t
                int r7 = r0.s
                int[] r14 = r0.r
                r18 = 0
                java.lang.Object r15 = r0.v
                n92 r15 = (defpackage.n92) r15
                defpackage.wz2.a0(r21)
                int r7 = r7 + r9
                goto L5e
            L4e:
                r18 = 0
                defpackage.wz2.a0(r21)
                java.lang.Object r7 = r0.v
                r15 = r7
                n92 r15 = (defpackage.n92) r15
                int[] r14 = r1.d
                if (r14 == 0) goto L75
                int r1 = r14.length
                r7 = 0
            L5e:
                if (r7 >= r1) goto L75
                r2 = r14[r7]
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r2)
                r0.v = r15
                r0.r = r14
                r0.s = r7
                r0.t = r1
                r0.u = r9
                r15.b(r0, r3)
                return r10
            L75:
                int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
                if (r1 == 0) goto L99
                r7 = r15
                r1 = 0
            L7b:
                if (r1 >= r13) goto L98
                long r14 = r16 << r1
                long r14 = r14 & r5
                int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
                if (r14 == 0) goto L96
                int r4 = r4 + r1
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r4)
                r0.v = r7
                r0.r = r8
                r0.s = r1
                r0.u = r12
                r7.b(r0, r2)
                return r10
            L96:
                int r1 = r1 + r9
                goto L7b
            L98:
                r15 = r7
            L99:
                int r1 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
                if (r1 == 0) goto Lc0
                r5 = r15
                r14 = 0
            L9f:
                if (r14 >= r13) goto Lc0
                long r6 = r16 << r14
                long r6 = r6 & r2
                int r1 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
                if (r1 == 0) goto Lbc
                int r1 = r14 + 64
                int r1 = r1 + r4
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r1)
                r0.v = r5
                r0.r = r8
                r0.s = r14
                r0.u = r11
                r5.b(r0, r2)
                return r10
            Lbc:
                r1 = r14
            Lbd:
                int r14 = r1 + 1
                goto L9f
            Lc0:
                az2 r0 = defpackage.az2.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final SnapshotIdSet c(int i) {
        int[] iArr;
        int iB;
        int i2 = this.c;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.b;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.a, j2 & (~j), i2, this.d);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.a;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet((~j3) & j4, this.b, i2, this.d);
            }
        } else if (i3 < 0 && (iArr = this.d) != null && (iB = SnapshotIdSetKt.b(i, iArr)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new SnapshotIdSet(this.a, this.b, this.c, null);
            }
            int[] iArr2 = new int[i4];
            if (iB > 0) {
                n8.O(0, 0, iB, iArr, iArr2);
            }
            if (iB < i4) {
                n8.O(iB, iB + 1, length, iArr, iArr2);
            }
            return new SnapshotIdSet(this.a, this.b, this.c, iArr2);
        }
        return this;
    }

    public final boolean d(int i) {
        int[] iArr;
        int i2 = i - this.c;
        if (i2 >= 0 && i2 < 64) {
            return (this.b & (1 << i2)) != 0;
        }
        if (i2 < 64 || i2 >= 128) {
            return i2 <= 0 && (iArr = this.d) != null && SnapshotIdSetKt.b(i, iArr) >= 0;
        }
        return (this.a & (1 << (i2 - 64))) != 0;
    }

    public final SnapshotIdSet h(int i) {
        int i2;
        long j;
        int i3 = this.c;
        int i4 = i - i3;
        long j2 = this.a;
        long j3 = this.b;
        int[] iArr = this.d;
        if (i4 >= 0 && i4 < 64) {
            long j4 = 1 << i4;
            if ((j3 & j4) == 0) {
                return new SnapshotIdSet(j2, j3 | j4, i3, iArr);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j5 = 1 << (i4 - 64);
            if ((j2 & j5) == 0) {
                return new SnapshotIdSet(j5 | j2, j3, i3, iArr);
            }
        } else if (i4 < 128) {
            if (iArr == null) {
                return new SnapshotIdSet(j2, j3, i3, new int[]{i});
            }
            int iB = SnapshotIdSetKt.b(i, iArr);
            if (iB < 0) {
                int i5 = -(iB + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                n8.O(0, 0, i5, iArr, iArr2);
                n8.O(i5 + 1, i5, length, iArr, iArr2);
                iArr2[i5] = i;
                return new SnapshotIdSet(this.a, this.b, this.c, iArr2);
            }
        } else if (!d(i)) {
            int i6 = ((i + 1) / 64) * 64;
            int i7 = this.c;
            ArrayList arrayList = null;
            long j6 = j2;
            while (true) {
                if (i7 >= i6) {
                    i2 = i7;
                    j = j3;
                    break;
                }
                if (j3 != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (iArr != null) {
                            int length2 = iArr.length;
                            for (int iF = 0; iF < length2; iF = pv1.f(iArr[iF], arrayList, iF, 1)) {
                            }
                        }
                    }
                    for (int i8 = 0; i8 < 64; i8++) {
                        if ((j3 & (1 << i8)) != 0) {
                            arrayList.add(Integer.valueOf(i8 + i7));
                        }
                    }
                }
                if (j6 == 0) {
                    i2 = i6;
                    j = 0;
                    break;
                }
                i7 += 64;
                j3 = j6;
                j6 = 0;
            }
            return new SnapshotIdSet(j6, j, i2, arrayList != null ? du.y0(arrayList) : iArr).h(i);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return at.t(new AnonymousClass1(null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(eu.f(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }

    public SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = iArr;
    }

    public final SnapshotIdSet a(SnapshotIdSet snapshotIdSet) {
        snapshotIdSet.getClass();
        SnapshotIdSet snapshotIdSet2 = e;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = snapshotIdSet.c;
        int i2 = this.c;
        if (i == i2) {
            int[] iArr = snapshotIdSet.d;
            int[] iArr2 = this.d;
            if (iArr == iArr2) {
                return new SnapshotIdSet((~snapshotIdSet.a) & this.a, (~snapshotIdSet.b) & this.b, i2, iArr2);
            }
        }
        Iterator<Integer> it = snapshotIdSet.iterator();
        while (it.hasNext()) {
            this = this.c(it.next().intValue());
        }
        return this;
    }

    public final SnapshotIdSet e(SnapshotIdSet snapshotIdSet) {
        snapshotIdSet.getClass();
        SnapshotIdSet snapshotIdSet2 = e;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i = snapshotIdSet.c;
        int i2 = this.c;
        if (i == i2) {
            int[] iArr = snapshotIdSet.d;
            int[] iArr2 = this.d;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.a | snapshotIdSet.a, this.b | snapshotIdSet.b, i2, iArr2);
            }
        }
        if (this.d == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.h(it.next().intValue());
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = snapshotIdSet.iterator();
        while (it2.hasNext()) {
            this = this.h(it2.next().intValue());
        }
        return this;
    }
}
