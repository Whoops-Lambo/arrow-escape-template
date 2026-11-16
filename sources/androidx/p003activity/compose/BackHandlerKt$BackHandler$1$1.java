package androidx.p003activity.compose;

import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BackHandlerKt$BackHandler$1$1 extends rc1 implements sr0 {
    public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 i;

    @Override // defpackage.sr0
    public final Object invoke() {
        BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = this.i;
        backHandlerKt$BackHandler$backCallback$1$1.a = true;
        sr0 sr0Var = backHandlerKt$BackHandler$backCallback$1$1.c;
        if (sr0Var != null) {
            sr0Var.invoke();
        }
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1) {
        super(0);
        this.i = backHandlerKt$BackHandler$backCallback$1$1;
    }
}
