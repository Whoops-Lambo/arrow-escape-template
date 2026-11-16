package androidx.compose.ui.input.focus;

import androidx.compose.ui.input.focus.FocusAwareEvent;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "Landroidx/compose/ui/input/focus/FocusAwareEvent;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class FocusAwareInputModifier<T extends FocusAwareEvent> implements ModifierLocalConsumer, ModifierLocalProvider<FocusAwareInputModifier<T>> {
    public final wr0 a;
    public FocusAwareInputModifier b;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }

    public FocusAwareInputModifier(wr0 wr0Var) {
        ProvidableModifierLocal providableModifierLocal = RotaryInputModifierKt.a;
        this.a = wr0Var;
    }

    public final boolean b(RotaryScrollEvent rotaryScrollEvent) {
        if (((Boolean) this.a.invoke(rotaryScrollEvent)).booleanValue()) {
            return true;
        }
        FocusAwareInputModifier focusAwareInputModifier = this.b;
        if (focusAwareInputModifier != null) {
            return focusAwareInputModifier.b(rotaryScrollEvent);
        }
        return false;
    }

    public final boolean c(RotaryScrollEvent rotaryScrollEvent) {
        FocusAwareInputModifier focusAwareInputModifier = this.b;
        return focusAwareInputModifier != null && focusAwareInputModifier.c(rotaryScrollEvent);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return RotaryInputModifierKt.a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        this.b = (FocusAwareInputModifier) modifierLocalReadScope.a(RotaryInputModifierKt.a);
    }
}
