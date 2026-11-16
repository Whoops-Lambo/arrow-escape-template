package androidx.compose.foundation;

import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Laz2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class ClickableKt$genericClickableWithoutGesture$clickSemantics$1 extends rc1 implements wr0 {
    public final /* synthetic */ Role i;
    public final /* synthetic */ String j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ sr0 l;

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
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

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass2 extends rc1 implements sr0 {
        @Override // defpackage.sr0
        public final Object invoke() {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$clickSemantics$1(Role role, String str, boolean z, sr0 sr0Var) {
        super(1);
        this.i = role;
        this.j = str;
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.l);
        KProperty[] kPropertyArr = SemanticsPropertiesKt.a;
        semanticsPropertyReceiver.a(SemanticsActions.b, new AccessibilityAction(this.j, anonymousClass1));
        if (!this.k) {
            SemanticsPropertiesKt.b(semanticsPropertyReceiver);
        }
        return az2.a;
    }
}
