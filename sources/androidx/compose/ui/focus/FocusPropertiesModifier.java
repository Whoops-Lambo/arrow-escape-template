package androidx.compose.ui.focus;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Stable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FocusPropertiesModifier extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider<FocusPropertiesModifier> {
    public final wr0 b;
    public final ParcelableSnapshotMutableState c;
    public final ProvidableModifierLocal d;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FocusPropertiesModifier) {
            return s71.b(this.b, ((FocusPropertiesModifier) obj).b);
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final ProvidableModifierLocal getD() {
        return this.d;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        this.c.setValue((FocusPropertiesModifier) modifierLocalReadScope.a(FocusPropertiesKt.a));
    }

    public FocusPropertiesModifier(wr0 wr0Var, wr0 wr0Var2) {
        super(wr0Var2);
        this.b = wr0Var;
        this.c = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.d = FocusPropertiesKt.a;
    }

    public final void c(FocusProperties focusProperties) {
        focusProperties.getClass();
        this.b.invoke(focusProperties);
        FocusPropertiesModifier focusPropertiesModifier = (FocusPropertiesModifier) this.c.getA();
        if (focusPropertiesModifier != null) {
            focusPropertiesModifier.c(focusProperties);
        }
    }
}
