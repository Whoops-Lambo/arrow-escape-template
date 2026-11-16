package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import defpackage.az2;
import defpackage.m72;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends rc1 implements sr0 {
    public final /* synthetic */ Lifecycle i;
    public final /* synthetic */ m72 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, m72 m72Var) {
        super(0);
        this.i = lifecycle;
        this.j = m72Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        this.i.c(this.j);
        return az2.a;
    }
}
