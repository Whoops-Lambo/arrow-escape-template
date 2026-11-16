package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SaveableStateHolderImpl$SaveableStateProvider$2 extends rc1 implements zr0 {
    public final /* synthetic */ SaveableStateHolderImpl i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ ComposableLambdaImpl k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$2(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.i = saveableStateHolderImpl;
        this.j = obj;
        this.k = composableLambdaImpl;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ComposableLambdaImpl composableLambdaImpl = this.k;
        this.i.a(this.j, composableLambdaImpl, (Composer) obj, 569);
        return az2.a;
    }
}
