package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1 extends rc1 implements zr0 {

    /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements as0 {

        /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes8.dex */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        final class AnonymousClass2 extends rc1 implements zr0 {
            @Override // defpackage.zr0
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !composer.b()) {
                    throw null;
                }
                composer.h();
                return az2.a;
            }
        }

        @Override // defpackage.as0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int iIntValue = ((Number) obj).intValue();
            Composer composer = (Composer) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            if ((iIntValue2 & 14) == 0) {
                iIntValue2 |= composer.p(iIntValue) ? 4 : 2;
            }
            if ((iIntValue2 & 91) != 18 || !composer.b()) {
                throw null;
            }
            composer.h();
            return az2.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass2 extends rc1 implements zr0 {
        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !composer.b()) {
                throw null;
            }
            composer.h();
            return az2.a;
        }
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !composer.b()) {
            throw null;
        }
        composer.h();
        return az2.a;
    }
}
