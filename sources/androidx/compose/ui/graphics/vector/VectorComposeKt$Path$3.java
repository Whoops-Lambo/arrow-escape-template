package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Brush;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class VectorComposeKt$Path$3 extends rc1 implements zr0 {
    public final /* synthetic */ List i;
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;
    public final /* synthetic */ Brush l;
    public final /* synthetic */ float m;
    public final /* synthetic */ Brush n;
    public final /* synthetic */ float o;
    public final /* synthetic */ float p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ float u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComposeKt$Path$3(List list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4) {
        super(2);
        this.i = list;
        this.j = i;
        this.k = str;
        this.l = brush;
        this.m = f;
        this.n = brush2;
        this.o = f2;
        this.p = f3;
        this.q = i2;
        this.r = i3;
        this.s = f4;
        this.t = f5;
        this.u = f6;
        this.v = f7;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        float f = this.v;
        VectorComposeKt.b(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, f, (Composer) obj, 9);
        return az2.a;
    }
}
