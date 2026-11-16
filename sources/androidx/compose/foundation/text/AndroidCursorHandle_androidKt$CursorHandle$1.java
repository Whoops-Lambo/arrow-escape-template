package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AndroidCursorHandle_androidKt$CursorHandle$1 extends rc1 implements zr0 {
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$1(Modifier modifier, int i) {
        super(2);
        this.i = modifier;
        this.j = i;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && composer.b()) {
            composer.h();
        } else {
            composer.B(1275643833);
            AndroidCursorHandle_androidKt.b(this.i, composer, (this.j >> 3) & 14);
            composer.J();
        }
        return az2.a;
    }
}
