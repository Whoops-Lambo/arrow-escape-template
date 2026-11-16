package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CompositionLocalsKt {
    public static final StaticProvidableCompositionLocal a = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalAccessibilityManager$1.i);
    public static final StaticProvidableCompositionLocal b = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalAutofill$1.i);
    public static final StaticProvidableCompositionLocal c = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalAutofillTree$1.i);
    public static final StaticProvidableCompositionLocal d = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalClipboardManager$1.i);
    public static final StaticProvidableCompositionLocal e = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.i);
    public static final StaticProvidableCompositionLocal f = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalFocusManager$1.i);
    public static final StaticProvidableCompositionLocal g = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalFontLoader$1.i);
    public static final StaticProvidableCompositionLocal h = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalFontFamilyResolver$1.i);
    public static final StaticProvidableCompositionLocal i = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalHapticFeedback$1.i);
    public static final StaticProvidableCompositionLocal j = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalInputModeManager$1.i);
    public static final StaticProvidableCompositionLocal k = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalLayoutDirection$1.i);
    public static final StaticProvidableCompositionLocal l = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalTextInputService$1.i);
    public static final StaticProvidableCompositionLocal m = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalTextToolbar$1.i);
    public static final StaticProvidableCompositionLocal n = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalUriHandler$1.i);
    public static final StaticProvidableCompositionLocal o = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalViewConfiguration$1.i);
    public static final StaticProvidableCompositionLocal p = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalWindowInfo$1.i);
    public static final StaticProvidableCompositionLocal q = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalPointerIconService$1.i);

    public static final void a(Owner owner, UriHandler uriHandler, zr0 zr0Var, Composer composer, int i2) {
        int i3;
        uriHandler.getClass();
        zr0Var.getClass();
        ComposerImpl composerImplT = composer.t(874662829);
        if ((i2 & 14) == 0) {
            i3 = (composerImplT.l(owner) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerImplT.l(uriHandler) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerImplT.l(zr0Var) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && composerImplT.b()) {
            composerImplT.h();
        } else {
            ProvidedValue providedValueB = a.b(owner.getAccessibilityManager());
            ProvidedValue providedValueB2 = b.b(owner.getAutofill());
            ProvidedValue providedValueB3 = c.b(owner.getAutofillTree());
            ProvidedValue providedValueB4 = d.b(owner.getClipboardManager());
            ProvidedValue providedValueB5 = e.b(owner.getDensity());
            ProvidedValue providedValueB6 = f.b(owner.getFocusManager());
            Font.ResourceLoader fontLoader = owner.getFontLoader();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = g;
            staticProvidableCompositionLocal.getClass();
            ProvidedValue providedValue = new ProvidedValue(staticProvidableCompositionLocal, fontLoader, false);
            FontFamily.Resolver fontFamilyResolver = owner.getFontFamilyResolver();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = h;
            staticProvidableCompositionLocal2.getClass();
            CompositionLocalKt.a(new ProvidedValue[]{providedValueB, providedValueB2, providedValueB3, providedValueB4, providedValueB5, providedValueB6, providedValue, new ProvidedValue(staticProvidableCompositionLocal2, fontFamilyResolver, false), i.b(owner.getHapticFeedBack()), j.b(owner.getInputModeManager()), k.b(owner.getLayoutDirection()), l.b(owner.getTextInputService()), m.b(owner.getTextToolbar()), n.b(uriHandler), o.b(owner.getViewConfiguration()), p.b(owner.getWindowInfo()), q.b(owner.getPointerIconService())}, zr0Var, composerImplT, ((i3 >> 3) & 112) | 8);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new CompositionLocalsKt$ProvideCommonCompositionLocals$1(owner, uriHandler, zr0Var, i2);
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
