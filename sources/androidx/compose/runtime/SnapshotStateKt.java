package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import defpackage.cg0;
import defpackage.dt1;
import defpackage.sr0;
import defpackage.vi2;
import defpackage.wr0;
import defpackage.z62;
import defpackage.zr0;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class SnapshotStateKt {
    public static final State b(sr0 sr0Var) {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.a;
        return new DerivedSnapshotState(sr0Var);
    }

    public static final SnapshotMutationPolicy e() {
        return NeverEqualPolicy.a;
    }

    public static final void f(wr0 wr0Var, wr0 wr0Var2, sr0 sr0Var) {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.a;
        PersistentList persistentList = (PersistentList) snapshotThreadLocal.a();
        try {
            Collection collection = (PersistentList) snapshotThreadLocal.a();
            if (collection == null) {
                collection = SmallPersistentVector.b;
            }
            snapshotThreadLocal.b(collection.add((Object) new dt1(wr0Var, wr0Var2)));
            ((ComposerImpl$doCompose$2$5) sr0Var).invoke();
        } finally {
            snapshotThreadLocal.b(persistentList);
        }
    }

    public static final SnapshotMutationPolicy h() {
        return ReferentialEqualityPolicy.a;
    }

    public static final z62 j(sr0 sr0Var) {
        return new z62(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(sr0Var, null));
    }

    public static final SnapshotMutationPolicy k() {
        return StructuralEqualityPolicy.a;
    }

    public static final MutableState a(vi2 vi2Var, Composer composer) {
        vi2Var.getClass();
        composer.B(-1439883919);
        Object value = vi2Var.getValue();
        composer.B(-606625098);
        cg0 cg0Var = cg0.a;
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(cg0Var, vi2Var, null);
        composer.B(-1703169085);
        composer.B(-492369756);
        Object objC = composer.C();
        if (objC == Composer.Companion.a) {
            objC = c(value, StructuralEqualityPolicy.a);
            composer.x(objC);
        }
        composer.J();
        MutableState mutableState = (MutableState) objC;
        EffectsKt.d(vi2Var, cg0Var, new SnapshotStateKt__ProduceStateKt$produceState$3(snapshotStateKt__SnapshotFlowKt$collectAsState$1, mutableState, null), composer);
        composer.J();
        composer.J();
        composer.J();
        return mutableState;
    }

    public static final ParcelableSnapshotMutableState c(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        snapshotMutationPolicy.getClass();
        int i = ActualAndroid_androidKt.a;
        return new ParcelableSnapshotMutableState(obj, snapshotMutationPolicy);
    }

    public static final MutableState g(Object obj, Object[] objArr, zr0 zr0Var, Composer composer) {
        composer.B(490154582);
        composer.B(-492369756);
        Object objC = composer.C();
        if (objC == Composer.Companion.a) {
            objC = c(obj, StructuralEqualityPolicy.a);
            composer.x(objC);
        }
        composer.J();
        MutableState mutableState = (MutableState) objC;
        EffectsKt.f(Arrays.copyOf(objArr, objArr.length), new SnapshotStateKt__ProduceStateKt$produceState$5(zr0Var, mutableState, null), composer);
        composer.J();
        return mutableState;
    }

    public static final MutableState i(Object obj, Composer composer) {
        composer.B(-1058319986);
        composer.B(-492369756);
        Object objC = composer.C();
        if (objC == Composer.Companion.a) {
            objC = c(obj, StructuralEqualityPolicy.a);
            composer.x(objC);
        }
        composer.J();
        MutableState mutableState = (MutableState) objC;
        mutableState.setValue(obj);
        composer.J();
        return mutableState;
    }
}
