package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends rc1 implements sr0 {
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ SaveableStateRegistry k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1$valueProvider$1(MutableState mutableState, MutableState mutableState2, SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.i = mutableState;
        this.j = mutableState2;
        this.k = saveableStateRegistry;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        Saver saver = (Saver) this.i.getA();
        final SaveableStateRegistry saveableStateRegistry = this.k;
        return saver.a(new SaverScope() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1
            @Override // androidx.compose.runtime.saveable.SaverScope
            public final boolean a(Object obj) {
                return saveableStateRegistry.a(obj);
            }
        }, this.j.getA());
    }
}
