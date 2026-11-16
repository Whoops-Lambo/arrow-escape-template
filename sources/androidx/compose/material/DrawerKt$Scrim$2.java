package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DrawerKt$Scrim$2 extends rc1 implements zr0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ sr0 j;
    public final /* synthetic */ sr0 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DrawerKt.b(this.i, this.j, this.k, this.l, (Composer) obj, this.m | 1);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$2(boolean z, sr0 sr0Var, sr0 sr0Var2, long j, int i) {
        super(2);
        this.i = z;
        this.j = sr0Var;
        this.k = sr0Var2;
        this.l = j;
        this.m = i;
    }
}
