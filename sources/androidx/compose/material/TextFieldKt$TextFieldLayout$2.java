package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
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
final class TextFieldKt$TextFieldLayout$2 extends rc1 implements zr0 {
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ zr0 j;
    public final /* synthetic */ zr0 k;
    public final /* synthetic */ as0 l;
    public final /* synthetic */ zr0 m;
    public final /* synthetic */ zr0 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ float p;
    public final /* synthetic */ PaddingValues q;
    public final /* synthetic */ int r;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TextFieldKt.a(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, this.r | 1);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextFieldLayout$2(Modifier modifier, zr0 zr0Var, zr0 zr0Var2, as0 as0Var, zr0 zr0Var3, zr0 zr0Var4, boolean z, float f, PaddingValues paddingValues, int i) {
        super(2);
        this.i = modifier;
        this.j = zr0Var;
        this.k = zr0Var2;
        this.l = as0Var;
        this.m = zr0Var3;
        this.n = zr0Var4;
        this.o = z;
        this.p = f;
        this.q = paddingValues;
        this.r = i;
    }
}
