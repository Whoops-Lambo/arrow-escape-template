package androidx.compose.ui.layout;

import defpackage.ks0;
import defpackage.rd1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends ks0 implements zr0 {
    public static final AlignmentLineKt$FirstBaseline$1 b = new AlignmentLineKt$FirstBaseline$1(2, rd1.class, "min", "min(II)I", 1);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
