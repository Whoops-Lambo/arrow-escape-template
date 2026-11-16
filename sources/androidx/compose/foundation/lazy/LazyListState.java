package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyListState implements ScrollableState {
    public static final /* synthetic */ int r = 0;
    public final LazyListScrollPosition a;
    public float d;
    public LazyLayoutPrefetchState.PrefetchHandle i;
    public boolean j;
    public final AwaitFirstLayoutModifier l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public boolean o;
    public boolean p;
    public final LazyLayoutPrefetchState q;
    public final ParcelableSnapshotMutableState b = SnapshotStateKt.c(EmptyLazyListLayoutInfo.a, StructuralEqualityPolicy.a);
    public final MutableInteractionSource c = InteractionSourceKt.a();
    public final ParcelableSnapshotMutableState e = SnapshotStateKt.c(DensityKt.a(1.0f, 1.0f), StructuralEqualityPolicy.a);
    public final ScrollableState f = ScrollableStateKt.a(new LazyListState$scrollableState$1(this));
    public final boolean g = true;
    public int h = -1;
    public final ParcelableSnapshotMutableState k = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ListSaverKt.a(LazyListState$Companion$Saver$1.i, LazyListState$Companion$Saver$2.i);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float a(float f) {
        return this.f.a(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean b() {
        return this.f.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r6.c(r7, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(androidx.compose.foundation.MutatePriority r7, defpackage.zr0 r8, defpackage.fy r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            r4 = 0
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.wz2.a0(r9)
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            return r4
        L31:
            ul2 r6 = r0.t
            r8 = r6
            zr0 r8 = (defpackage.zr0) r8
            androidx.compose.foundation.MutatePriority r7 = r0.s
            androidx.compose.foundation.lazy.LazyListState r6 = r0.r
            defpackage.wz2.a0(r9)
            goto L55
        L3e:
            defpackage.wz2.a0(r9)
            r0.r = r6
            r0.s = r7
            r9 = r8
            ul2 r9 = (defpackage.ul2) r9
            r0.t = r9
            r0.w = r3
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r9 = r6.l
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r5) goto L55
            goto L65
        L55:
            androidx.compose.foundation.gestures.ScrollableState r6 = r6.f
            r0.r = r4
            r0.s = r4
            r0.t = r4
            r0.w = r2
            java.lang.Object r6 = r6.c(r7, r8, r0)
            if (r6 != r5) goto L66
        L65:
            return r5
        L66:
            az2 r6 = defpackage.az2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.c(androidx.compose.foundation.MutatePriority, zr0, fy):java.lang.Object");
    }

    public LazyListState(int i, int i2) {
        this.a = new LazyListScrollPosition(i, i2);
        new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void n0(Remeasurement remeasurement) {
                this.a.k.setValue(remeasurement);
            }
        };
        this.l = new AwaitFirstLayoutModifier();
        this.m = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.n = SnapshotStateKt.c(new Constraints(ConstraintsKt.b(0, 0, 15)), StructuralEqualityPolicy.a);
        this.q = new LazyLayoutPrefetchState();
    }
}
