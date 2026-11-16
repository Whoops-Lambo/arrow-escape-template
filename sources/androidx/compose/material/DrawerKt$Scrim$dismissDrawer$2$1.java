package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DrawerKt$Scrim$dismissDrawer$2$1 extends rc1 implements wr0 {
    public final /* synthetic */ String i;
    public final /* synthetic */ sr0 j;

    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements sr0 {
        public final /* synthetic */ sr0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sr0 sr0Var) {
            super(0);
            this.i = sr0Var;
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            ((DrawerKt$ModalDrawer$1$2$2) this.i).invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$dismissDrawer$2$1(String str, sr0 sr0Var) {
        super(1);
        this.i = str;
        this.j = sr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        semanticsPropertyReceiver.getClass();
        SemanticsPropertiesKt.g(this.i, semanticsPropertyReceiver);
        SemanticsPropertiesKt.e(semanticsPropertyReceiver, new AnonymousClass1(this.j));
        return az2.a;
    }
}
