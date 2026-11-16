package androidx.compose.foundation.selection;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ToggleableKt$toggleableImpl$1$semantics$1 extends rc1 implements wr0 {
    public final /* synthetic */ Role i;
    public final /* synthetic */ ToggleableState j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ sr0 l;

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$semantics$1$1, reason: invalid class name */
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
            this.i.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1$semantics$1(Role role, ToggleableState toggleableState, boolean z, sr0 sr0Var) {
        super(1);
        this.i = role;
        this.j = toggleableState;
        this.k = z;
        this.l = sr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        semanticsPropertyReceiver.getClass();
        Role role = this.i;
        if (role != null) {
            SemanticsPropertiesKt.i(semanticsPropertyReceiver, role.a);
        }
        KProperty[] kPropertyArr = SemanticsPropertiesKt.a;
        ToggleableState toggleableState = this.j;
        toggleableState.getClass();
        SemanticsPropertiesKt.o.a(semanticsPropertyReceiver, SemanticsPropertiesKt.a[15], toggleableState);
        SemanticsPropertiesKt.e(semanticsPropertyReceiver, new AnonymousClass1(this.l));
        if (!this.k) {
            SemanticsPropertiesKt.b(semanticsPropertyReceiver);
        }
        return az2.a;
    }
}
