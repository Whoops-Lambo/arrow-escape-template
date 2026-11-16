package androidx.p003activity.compose;

import androidx.compose.runtime.Composer;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class BackHandlerKt$BackHandler$3 extends rc1 implements zr0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ sr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$3(boolean z, sr0 sr0Var, int i) {
        super(2);
        this.i = z;
        this.j = sr0Var;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        sr0 sr0Var = this.j;
        BackHandlerKt.a(this.i, sr0Var, (Composer) obj, 1);
        return az2.a;
    }
}
