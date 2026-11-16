package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/DynamicProvidableCompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public final SnapshotMutationPolicy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy snapshotMutationPolicy, sr0 sr0Var) {
        super(sr0Var);
        sr0Var.getClass();
        this.b = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public final State a(Object obj, Composer composer) {
        composer.B(-84026900);
        composer.B(-492369756);
        Object objC = composer.C();
        if (objC == Composer.Companion.a) {
            objC = SnapshotStateKt.c(obj, this.b);
            composer.x(objC);
        }
        composer.J();
        MutableState mutableState = (MutableState) objC;
        mutableState.setValue(obj);
        composer.J();
        return mutableState;
    }
}
