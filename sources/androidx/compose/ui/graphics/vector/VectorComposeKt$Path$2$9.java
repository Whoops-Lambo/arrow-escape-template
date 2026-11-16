package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeJoin;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class VectorComposeKt$Path$2$9 extends rc1 implements zr0 {
    public static final VectorComposeKt$Path$2$9 i = new VectorComposeKt$Path$2$9(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        PathComponent pathComponent = (PathComponent) obj;
        int i2 = ((StrokeJoin) obj2).a;
        pathComponent.getClass();
        pathComponent.i = i2;
        pathComponent.o = true;
        pathComponent.c();
        return az2.a;
    }
}
