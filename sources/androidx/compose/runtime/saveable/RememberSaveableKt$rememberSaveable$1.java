package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class RememberSaveableKt$rememberSaveable$1 extends rc1 implements wr0 {
    public final /* synthetic */ SaveableStateRegistry i;
    public final /* synthetic */ String j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1(SaveableStateRegistry saveableStateRegistry, String str, MutableState mutableState, MutableState mutableState2) {
        super(1);
        this.i = saveableStateRegistry;
        this.j = str;
        this.k = mutableState;
        this.l = mutableState2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        String str;
        ((DisposableEffectScope) obj).getClass();
        MutableState mutableState = this.k;
        MutableState mutableState2 = this.l;
        SaveableStateRegistry saveableStateRegistry = this.i;
        RememberSaveableKt$rememberSaveable$1$valueProvider$1 rememberSaveableKt$rememberSaveable$1$valueProvider$1 = new RememberSaveableKt$rememberSaveable$1$valueProvider$1(mutableState, mutableState2, saveableStateRegistry);
        Object objInvoke = rememberSaveableKt$rememberSaveable$1$valueProvider$1.invoke();
        if (objInvoke == null || saveableStateRegistry.a(objInvoke)) {
            final SaveableStateRegistry.Entry entryC = saveableStateRegistry.c(this.j, rememberSaveableKt$rememberSaveable$1$valueProvider$1);
            return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                    entryC.c();
                }
            };
        }
        if (objInvoke instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) objInvoke;
            if (snapshotMutableState.getA() == SnapshotStateKt.e() || snapshotMutableState.getA() == SnapshotStateKt.k() || snapshotMutableState.getA() == SnapshotStateKt.h()) {
                str = "MutableState containing " + snapshotMutableState.getA() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = objInvoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
