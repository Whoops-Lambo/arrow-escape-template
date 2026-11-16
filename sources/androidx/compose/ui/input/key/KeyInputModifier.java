package androidx.compose.ui.input.key;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class KeyInputModifier implements ModifierLocalConsumer, ModifierLocalProvider<KeyInputModifier>, OnPlacedModifier {
    public final wr0 a;
    public final wr0 b;
    public FocusModifier c;
    public KeyInputModifier d;
    public LayoutNode e;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }

    public final boolean b(android.view.KeyEvent keyEvent) {
        wr0 wr0Var = this.a;
        Boolean bool = wr0Var != null ? (Boolean) wr0Var.invoke(new KeyEvent(keyEvent)) : null;
        if (s71.b(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        KeyInputModifier keyInputModifier = this.d;
        if (keyInputModifier != null) {
            return keyInputModifier.b(keyEvent);
        }
        return false;
    }

    public final boolean c(android.view.KeyEvent keyEvent) {
        KeyInputModifier keyInputModifier = this.d;
        Boolean boolValueOf = keyInputModifier != null ? Boolean.valueOf(keyInputModifier.c(keyEvent)) : null;
        if (s71.b(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        wr0 wr0Var = this.b;
        if (wr0Var != null) {
            return ((Boolean) wr0Var.invoke(new KeyEvent(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    /* JADX INFO: renamed from: getKey */
    public final ProvidableModifierLocal getD() {
        return KeyInputModifierKt.a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        MutableVector mutableVector;
        MutableVector mutableVector2;
        FocusModifier focusModifier = this.c;
        if (focusModifier != null && (mutableVector2 = focusModifier.p) != null) {
            mutableVector2.o(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) modifierLocalReadScope.a(FocusModifierKt.a);
        this.c = focusModifier2;
        if (focusModifier2 != null && (mutableVector = focusModifier2.p) != null) {
            mutableVector.b(this);
        }
        this.d = (KeyInputModifier) modifierLocalReadScope.a(KeyInputModifierKt.a);
    }

    public KeyInputModifier(wr0 wr0Var, wr0 wr0Var2) {
        this.a = wr0Var;
        this.b = wr0Var2;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public final void F(LayoutNodeWrapper layoutNodeWrapper) {
        layoutNodeWrapper.getClass();
        this.e = layoutNodeWrapper.e;
    }
}
