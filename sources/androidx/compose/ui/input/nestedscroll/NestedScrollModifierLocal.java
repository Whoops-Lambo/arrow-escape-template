package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.Velocity;
import defpackage.cz;
import defpackage.dn;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NestedScrollModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<NestedScrollModifierLocal>, NestedScrollConnection {
    public final NestedScrollDispatcher a;
    public final NestedScrollConnection b;
    public final ParcelableSnapshotMutableState c;

    /* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcz;", "invoke", "()Lcz;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass1 extends rc1 implements sr0 {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            return NestedScrollModifierLocal.this.f();
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long c(int i, long j, long j2) {
        long jC = this.b.c(i, j, j2);
        NestedScrollModifierLocal nestedScrollModifierLocalG = g();
        return Offset.f(jC, nestedScrollModifierLocalG != null ? nestedScrollModifierLocalG.c(i, Offset.f(j, jC), Offset.e(j2, jC)) : Offset.b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object d(long j, long j2, fy fyVar) {
        NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$1;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (fyVar instanceof NestedScrollModifierLocal$onPostFling$1) {
            nestedScrollModifierLocal$onPostFling$1 = (NestedScrollModifierLocal$onPostFling$1) fyVar;
            int i = nestedScrollModifierLocal$onPostFling$1.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPostFling$1.w = i - Integer.MIN_VALUE;
            } else {
                nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, fyVar);
            }
        } else {
            nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, fyVar);
        }
        NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$2 = nestedScrollModifierLocal$onPostFling$1;
        Object objD = nestedScrollModifierLocal$onPostFling$2.u;
        int i2 = nestedScrollModifierLocal$onPostFling$2.w;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(objD);
            nestedScrollModifierLocal$onPostFling$2.r = this;
            nestedScrollModifierLocal$onPostFling$2.s = j;
            nestedScrollModifierLocal$onPostFling$2.t = j2;
            nestedScrollModifierLocal$onPostFling$2.w = 1;
            objD = this.b.d(j, j2, nestedScrollModifierLocal$onPostFling$2);
            if (objD != dzVar) {
                nestedScrollModifierLocal = this;
                j3 = j;
                j4 = j2;
            }
            return dzVar;
        }
        if (i2 == 1) {
            j4 = nestedScrollModifierLocal$onPostFling$2.t;
            j3 = nestedScrollModifierLocal$onPostFling$2.s;
            nestedScrollModifierLocal = nestedScrollModifierLocal$onPostFling$2.r;
            wz2.a0(objD);
        } else {
            if (i2 != 2) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = nestedScrollModifierLocal$onPostFling$2.s;
            wz2.a0(objD);
        }
        j6 = ((Velocity) objD).a;
        j5 = j7;
        return new Velocity(Velocity.d(j5, j6));
        j5 = ((Velocity) objD).a;
        NestedScrollModifierLocal nestedScrollModifierLocalG = nestedScrollModifierLocal.g();
        if (nestedScrollModifierLocalG != null) {
            long jD = Velocity.d(j3, j5);
            long jC = Velocity.c(j4, j5);
            nestedScrollModifierLocal$onPostFling$2.r = null;
            nestedScrollModifierLocal$onPostFling$2.s = j5;
            nestedScrollModifierLocal$onPostFling$2.w = 2;
            objD = nestedScrollModifierLocalG.d(jD, jC, nestedScrollModifierLocal$onPostFling$2);
            if (objD != dzVar) {
                j7 = j5;
                j6 = ((Velocity) objD).a;
                j5 = j7;
            }
            return dzVar;
        }
        j6 = Velocity.b;
        return new Velocity(Velocity.d(j5, j6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r13 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r13 == r5) goto L26;
     */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r11, defpackage.fy r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.t
            int r1 = r0.v
            r2 = 0
            r3 = 2
            r4 = 1
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            long r10 = r0.s
            defpackage.wz2.a0(r13)
            goto L70
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r10)
            return r2
        L33:
            long r11 = r0.s
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r10 = r0.r
            defpackage.wz2.a0(r13)
            goto L51
        L3b:
            defpackage.wz2.a0(r13)
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r13 = r10.g()
            if (r13 == 0) goto L5a
            r0.r = r10
            r0.s = r11
            r0.v = r4
            java.lang.Object r13 = r13.e(r11, r0)
            if (r13 != r5) goto L51
            goto L6f
        L51:
            androidx.compose.ui.unit.Velocity r13 = (androidx.compose.ui.unit.Velocity) r13
            long r6 = r13.a
        L55:
            r8 = r11
            r12 = r10
            r10 = r6
            r6 = r8
            goto L5d
        L5a:
            long r6 = androidx.compose.ui.unit.Velocity.b
            goto L55
        L5d:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = r12.b
            long r6 = androidx.compose.ui.unit.Velocity.c(r6, r10)
            r0.r = r2
            r0.s = r10
            r0.v = r3
            java.lang.Object r13 = r12.e(r6, r0)
            if (r13 != r5) goto L70
        L6f:
            return r5
        L70:
            androidx.compose.ui.unit.Velocity r13 = (androidx.compose.ui.unit.Velocity) r13
            long r12 = r13.a
            long r10 = androidx.compose.ui.unit.Velocity.d(r10, r12)
            androidx.compose.ui.unit.Velocity r12 = new androidx.compose.ui.unit.Velocity
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.e(long, fy):java.lang.Object");
    }

    public final NestedScrollModifierLocal g() {
        return (NestedScrollModifierLocal) this.c.getA();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    /* JADX INFO: renamed from: getKey */
    public final ProvidableModifierLocal getD() {
        return NestedScrollModifierLocalKt.a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        this.c.setValue((NestedScrollModifierLocal) modifierLocalReadScope.a(NestedScrollModifierLocalKt.a));
        this.a.c = g();
    }

    public NestedScrollModifierLocal(NestedScrollDispatcher nestedScrollDispatcher, NestedScrollConnection nestedScrollConnection) {
        nestedScrollConnection.getClass();
        this.a = nestedScrollDispatcher;
        this.b = nestedScrollConnection;
        nestedScrollDispatcher.a = new AnonymousClass1();
        this.c = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b(int i, long j) {
        long jB;
        NestedScrollModifierLocal nestedScrollModifierLocalG = g();
        if (nestedScrollModifierLocalG != null) {
            jB = nestedScrollModifierLocalG.b(i, j);
        } else {
            jB = Offset.b;
        }
        return Offset.f(jB, this.b.b(i, Offset.e(j, jB)));
    }

    public final cz f() {
        NestedScrollModifierLocal nestedScrollModifierLocalG = g();
        if (nestedScrollModifierLocalG != null) {
            return nestedScrollModifierLocalG.f();
        }
        dn dnVar = this.a.b;
        if (dnVar != null) {
            return dnVar;
        }
        e32.i("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
