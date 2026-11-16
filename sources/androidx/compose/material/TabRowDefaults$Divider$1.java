package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TabRowDefaults$Divider$1 extends rc1 implements zr0 {
    public final /* synthetic */ TabRowDefaults i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ float k;
    public final /* synthetic */ long l;

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        long j = this.l;
        this.i.a(this.k, 3073, j, (Composer) obj, this.j);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$Divider$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i) {
        super(2);
        this.i = tabRowDefaults;
        this.j = modifier;
        this.k = f;
        this.l = j;
    }
}
