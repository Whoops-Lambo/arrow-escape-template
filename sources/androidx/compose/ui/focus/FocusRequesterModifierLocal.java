package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FocusRequesterModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<FocusRequesterModifierLocal> {
    public FocusRequesterModifierLocal a;
    public final MutableVector b;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }

    public final void b(FocusModifier focusModifier) {
        this.b.b(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.a;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.b(focusModifier);
        }
    }

    public final void d(FocusModifier focusModifier) {
        this.b.o(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.a;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.d(focusModifier);
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return FocusRequesterModifierKt.a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) modifierLocalReadScope.a(FocusRequesterModifierKt.a);
        if (s71.b(focusRequesterModifierLocal, this.a)) {
            return;
        }
        FocusRequesterModifierLocal focusRequesterModifierLocal2 = this.a;
        MutableVector mutableVector = this.b;
        if (focusRequesterModifierLocal2 != null) {
            focusRequesterModifierLocal2.e(mutableVector);
        }
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.c(mutableVector);
        }
        this.a = focusRequesterModifierLocal;
    }

    public FocusRequesterModifierLocal(FocusRequester focusRequester) {
        focusRequester.getClass();
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new FocusModifier[16];
        mutableVector.c = 0;
        this.b = mutableVector;
        focusRequester.a.b(this);
    }

    public final void c(MutableVector mutableVector) {
        mutableVector.getClass();
        MutableVector mutableVector2 = this.b;
        mutableVector2.c(mutableVector2.c, mutableVector);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.a;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.c(mutableVector);
        }
    }

    public final void e(MutableVector mutableVector) {
        mutableVector.getClass();
        this.b.p(mutableVector);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.a;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.e(mutableVector);
        }
    }
}
