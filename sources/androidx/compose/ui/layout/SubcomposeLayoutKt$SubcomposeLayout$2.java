package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SubcomposeLayoutKt$SubcomposeLayout$2 extends rc1 implements zr0 {
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ zr0 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$2(Modifier modifier, zr0 zr0Var, int i, int i2) {
        super(2);
        this.i = modifier;
        this.j = zr0Var;
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.k | 1;
        int i2 = this.l;
        SubcomposeLayoutKt.a(this.i, this.j, (Composer) obj, i, i2);
        return az2.a;
    }
}
