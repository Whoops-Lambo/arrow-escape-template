package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import defpackage.at;
import defpackage.az2;
import defpackage.dz;
import defpackage.fy;
import defpackage.ye2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    public final ye2 a = at.b(0, 16, 1);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final Object a(Interaction interaction, fy fyVar) throws Throwable {
        Object objEmit = this.a.emit(interaction, fyVar);
        return objEmit == dz.a ? objEmit : az2.a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final boolean b(Interaction interaction) {
        return this.a.f(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ye2 getA() {
        return this.a;
    }
}
