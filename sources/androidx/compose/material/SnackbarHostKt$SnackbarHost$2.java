package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SnackbarHostKt$SnackbarHost$2 extends rc1 implements zr0 {
    public final /* synthetic */ SnackbarHostState i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ as0 k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$2(SnackbarHostState snackbarHostState, Modifier modifier, as0 as0Var, int i) {
        super(2);
        this.i = snackbarHostState;
        this.j = modifier;
        this.k = as0Var;
        this.l = i;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.l | 1;
        SnackbarHostKt.a(this.i, this.j, this.k, (Composer) obj, i);
        return az2.a;
    }
}
