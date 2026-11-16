package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.sy;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class CompositionContext {
    public abstract void a(CompositionImpl compositionImpl, ComposableLambdaImpl composableLambdaImpl);

    public abstract void b(MovableContentStateReference movableContentStateReference);

    public void c() {
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean getB();

    /* JADX INFO: renamed from: f */
    public abstract int getA();

    public abstract sy g();

    public abstract void h(MovableContentStateReference movableContentStateReference);

    public abstract void i(CompositionImpl compositionImpl);

    public abstract void j(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState);

    public void l(Set set) {
    }

    public void m(ComposerImpl composerImpl) {
    }

    public void n() {
    }

    public void o(ComposerImpl composerImpl) {
    }

    public abstract void p(CompositionImpl compositionImpl);

    public PersistentMap e() {
        return CompositionContextKt.a;
    }

    public MovableContentState k(MovableContentStateReference movableContentStateReference) {
        movableContentStateReference.getClass();
        return null;
    }
}
