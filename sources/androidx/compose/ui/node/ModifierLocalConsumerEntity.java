package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import defpackage.az2;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/ModifierLocalConsumerEntity;", "Lkotlin/Function0;", "Laz2;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ModifierLocalConsumerEntity implements sr0, OwnerScope, ModifierLocalReadScope {
    public static final wr0 e = null;
    public static final ModifierLocalConsumerEntity$Companion$DetachedModifierLocalReadScope$1 f = new ModifierLocalConsumerEntity$Companion$DetachedModifierLocalReadScope$1();
    public ModifierLocalProviderEntity a;
    public final ModifierLocalConsumer b;
    public final MutableVector c;
    public boolean d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/ModifierLocalConsumerEntity$Companion;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final void b() {
        if (this.d) {
            this.c.h();
            LayoutNodeKt.a(this.a.a).getSnapshotObserver().b(this, ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1.i, new ModifierLocalConsumerEntity$notifyConsumerOfChanges$1(this));
        }
    }

    @Override // androidx.compose.ui.node.OwnerScope
    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    public ModifierLocalConsumerEntity(ModifierLocalProviderEntity modifierLocalProviderEntity, ModifierLocalConsumer modifierLocalConsumer) {
        modifierLocalProviderEntity.getClass();
        modifierLocalConsumer.getClass();
        this.a = modifierLocalProviderEntity;
        this.b = modifierLocalConsumer;
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new ModifierLocal[16];
        mutableVector.c = 0;
        this.c = mutableVector;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    public final Object a(ModifierLocal modifierLocal) {
        modifierLocal.getClass();
        this.c.b(modifierLocal);
        ModifierLocalProvider modifierLocalProviderB = this.a.b(modifierLocal);
        if (modifierLocalProviderB == null) {
            return modifierLocal.a.invoke();
        }
        return modifierLocalProviderB.getValue();
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        b();
        return az2.a;
    }
}
