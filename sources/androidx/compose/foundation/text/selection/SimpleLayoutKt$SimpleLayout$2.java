package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SimpleLayoutKt$SimpleLayout$2 extends rc1 implements zr0 {
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ ComposableLambdaImpl j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleLayoutKt$SimpleLayout$2(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.i = modifier;
        this.j = composableLambdaImpl;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ComposableLambdaImpl composableLambdaImpl = this.j;
        SimpleLayoutKt.a(this.i, composableLambdaImpl, (Composer) obj, 49);
        return az2.a;
    }
}
