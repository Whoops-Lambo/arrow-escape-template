package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TextFieldDefaults$BorderBox$1 extends rc1 implements zr0 {
    public final /* synthetic */ TextFieldDefaults i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ InteractionSource l;
    public final /* synthetic */ TextFieldColors m;
    public final /* synthetic */ Shape n;
    public final /* synthetic */ float o;
    public final /* synthetic */ float p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.i.a(this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, this.q | 1, this.r);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$BorderBox$1(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2) {
        super(2);
        this.i = textFieldDefaults;
        this.j = z;
        this.k = z2;
        this.l = interactionSource;
        this.m = textFieldColors;
        this.n = shape;
        this.o = f;
        this.p = f2;
        this.q = i;
        this.r = i2;
    }
}
