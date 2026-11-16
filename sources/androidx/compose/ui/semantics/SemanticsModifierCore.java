package androidx.compose.ui.semantics;

import defpackage.s71;
import defpackage.wr0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifierCore;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SemanticsModifierCore implements SemanticsModifier {
    public static final AtomicInteger c = new AtomicInteger(0);
    public final int a;
    public final SemanticsConfiguration b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifierCore$Companion;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsModifierCore)) {
            return false;
        }
        SemanticsModifierCore semanticsModifierCore = (SemanticsModifierCore) obj;
        return this.a == semanticsModifierCore.a && s71.b(this.b, semanticsModifierCore.b);
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    /* JADX INFO: renamed from: C0, reason: from getter */
    public final SemanticsConfiguration getB() {
        return this.b;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + (this.b.hashCode() * 31);
    }

    public SemanticsModifierCore(int i, boolean z, boolean z2, wr0 wr0Var) {
        wr0Var.getClass();
        this.a = i;
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.b = z;
        semanticsConfiguration.c = z2;
        wr0Var.invoke(semanticsConfiguration);
        this.b = semanticsConfiguration;
    }
}
