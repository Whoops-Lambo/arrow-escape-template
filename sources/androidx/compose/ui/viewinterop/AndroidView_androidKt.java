package androidx.compose.ui.viewinterop;

import android.content.Context;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidView_androidKt {
    public static final wr0 a = null;

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0159  */
    /* JADX WARN: Code duplicated, block: B:52:0x0169 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0178  */
    public static final void a(wr0 wr0Var, Modifier modifier, wr0 wr0Var2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier.Companion companion;
        Modifier modifier3;
        Object objB0;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Object objB1;
        Modifier modifierC;
        Density density;
        LayoutDirection layoutDirection;
        SaveableStateRegistry saveableStateRegistry;
        String strValueOf;
        Object objB2;
        Ref ref;
        LifecycleOwner lifecycleOwner;
        SavedStateRegistryOwner savedStateRegistryOwner;
        AndroidView_androidKt$AndroidView$1 androidView_androidKt$AndroidView$1;
        wr0 wr0Var3;
        RecomposeScopeImpl recomposeScopeImplT;
        int i5;
        wr0Var.getClass();
        ComposerImpl composerImplT = composer.t(-1783766393);
        if ((i & 14) == 0) {
            if (composerImplT.l(wr0Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i | i5;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                if (composerImplT.l(modifier2)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if (((i3 | 384) & 731) != 146 && composerImplT.b()) {
                composerImplT.h();
                wr0Var3 = wr0Var2;
            } else {
                companion = Modifier.Companion.a;
                if (i6 != 0) {
                    modifier3 = companion;
                } else {
                    modifier3 = modifier2;
                }
                Context context = (Context) composerImplT.v(AndroidCompositionLocals_androidKt.b);
                composerImplT.B(-492369756);
                objB0 = composerImplT.b0();
                composer$Companion$Empty$1 = Composer.Companion.a;
                if (objB0 == composer$Companion$Empty$1) {
                    objB0 = new AndroidView_androidKt$AndroidView$noOpConnection$1$1();
                    composerImplT.C0(objB0);
                }
                composerImplT.R(false);
                AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$1 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) objB0;
                composerImplT.B(-492369756);
                objB1 = composerImplT.b0();
                if (objB1 == composer$Companion$Empty$1) {
                    objB1 = new NestedScrollDispatcher();
                    composerImplT.C0(objB1);
                }
                composerImplT.R(false);
                NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) objB1;
                modifierC = ComposedModifierKt.c(composerImplT, SemanticsModifierKt.a(modifier3.N(NestedScrollModifierKt.a(companion, androidView_androidKt$AndroidView$noOpConnection$1$1, nestedScrollDispatcher)), true, AndroidView_androidKt$AndroidView$modifierWithSemantics$1.i));
                density = (Density) composerImplT.v(CompositionLocalsKt.e);
                layoutDirection = (LayoutDirection) composerImplT.v(CompositionLocalsKt.k);
                CompositionContext compositionContextB = ComposablesKt.b(composerImplT);
                saveableStateRegistry = (SaveableStateRegistry) composerImplT.v(SaveableStateRegistryKt.a);
                strValueOf = String.valueOf(composerImplT.L);
                composerImplT.B(-492369756);
                objB2 = composerImplT.b0();
                if (objB2 == composer$Companion$Empty$1) {
                    objB2 = new Ref();
                    composerImplT.C0(objB2);
                }
                composerImplT.R(false);
                ref = (Ref) objB2;
                lifecycleOwner = (LifecycleOwner) composerImplT.v(AndroidCompositionLocals_androidKt.d);
                savedStateRegistryOwner = (SavedStateRegistryOwner) composerImplT.v(AndroidCompositionLocals_androidKt.e);
                androidView_androidKt$AndroidView$1 = new AndroidView_androidKt$AndroidView$1(context, compositionContextB, nestedScrollDispatcher, wr0Var, saveableStateRegistry, strValueOf, ref);
                composerImplT.B(1886828752);
                if (composerImplT.a instanceof UiApplier) {
                    composerImplT.t0();
                    if (composerImplT.K) {
                        composerImplT.E(new AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1(androidView_androidKt$AndroidView$1));
                    } else {
                        composerImplT.d();
                    }
                    Updater.a(new AndroidView_androidKt$AndroidView$2$1(ref), composerImplT, modifierC);
                    Updater.a(new AndroidView_androidKt$AndroidView$2$2(ref), composerImplT, density);
                    Updater.a(new AndroidView_androidKt$AndroidView$2$3(ref), composerImplT, lifecycleOwner);
                    Updater.a(new AndroidView_androidKt$AndroidView$2$4(ref), composerImplT, savedStateRegistryOwner);
                    AndroidView_androidKt$AndroidView$2$5 androidView_androidKt$AndroidView$2$5 = new AndroidView_androidKt$AndroidView$2$5(ref);
                    AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.i;
                    Updater.a(androidView_androidKt$AndroidView$2$5, composerImplT, androidView_androidKt$NoOpUpdate$1);
                    Updater.a(new AndroidView_androidKt$AndroidView$2$6(ref), composerImplT, layoutDirection);
                    composerImplT.R(true);
                    composerImplT.R(false);
                    if (saveableStateRegistry != null) {
                        EffectsKt.b(saveableStateRegistry, strValueOf, new AndroidView_androidKt$AndroidView$3(saveableStateRegistry, strValueOf, ref), composerImplT);
                    }
                    wr0Var3 = androidView_androidKt$NoOpUpdate$1;
                    modifier2 = modifier3;
                } else {
                    ComposablesKt.a();
                    throw null;
                }
            }
            recomposeScopeImplT = composerImplT.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new AndroidView_androidKt$AndroidView$4(wr0Var, modifier2, wr0Var3, i, i2);
        }
        modifier2 = modifier;
        if (((i3 | 384) & 731) != 146) {
            companion = Modifier.Companion.a;
            if (i6 != 0) {
                modifier3 = companion;
            } else {
                modifier3 = modifier2;
            }
            Context context2 = (Context) composerImplT.v(AndroidCompositionLocals_androidKt.b);
            composerImplT.B(-492369756);
            objB0 = composerImplT.b0();
            composer$Companion$Empty$1 = Composer.Companion.a;
            if (objB0 == composer$Companion$Empty$1) {
                objB0 = new AndroidView_androidKt$AndroidView$noOpConnection$1$1();
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$2 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) objB0;
            composerImplT.B(-492369756);
            objB1 = composerImplT.b0();
            if (objB1 == composer$Companion$Empty$1) {
                objB1 = new NestedScrollDispatcher();
                composerImplT.C0(objB1);
            }
            composerImplT.R(false);
            NestedScrollDispatcher nestedScrollDispatcher2 = (NestedScrollDispatcher) objB1;
            modifierC = ComposedModifierKt.c(composerImplT, SemanticsModifierKt.a(modifier3.N(NestedScrollModifierKt.a(companion, androidView_androidKt$AndroidView$noOpConnection$1$2, nestedScrollDispatcher2)), true, AndroidView_androidKt$AndroidView$modifierWithSemantics$1.i));
            density = (Density) composerImplT.v(CompositionLocalsKt.e);
            layoutDirection = (LayoutDirection) composerImplT.v(CompositionLocalsKt.k);
            CompositionContext compositionContextB2 = ComposablesKt.b(composerImplT);
            saveableStateRegistry = (SaveableStateRegistry) composerImplT.v(SaveableStateRegistryKt.a);
            strValueOf = String.valueOf(composerImplT.L);
            composerImplT.B(-492369756);
            objB2 = composerImplT.b0();
            if (objB2 == composer$Companion$Empty$1) {
                objB2 = new Ref();
                composerImplT.C0(objB2);
            }
            composerImplT.R(false);
            ref = (Ref) objB2;
            lifecycleOwner = (LifecycleOwner) composerImplT.v(AndroidCompositionLocals_androidKt.d);
            savedStateRegistryOwner = (SavedStateRegistryOwner) composerImplT.v(AndroidCompositionLocals_androidKt.e);
            androidView_androidKt$AndroidView$1 = new AndroidView_androidKt$AndroidView$1(context2, compositionContextB2, nestedScrollDispatcher2, wr0Var, saveableStateRegistry, strValueOf, ref);
            composerImplT.B(1886828752);
            if (composerImplT.a instanceof UiApplier) {
                composerImplT.t0();
                if (composerImplT.K) {
                    composerImplT.E(new AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1(androidView_androidKt$AndroidView$1));
                } else {
                    composerImplT.d();
                }
                Updater.a(new AndroidView_androidKt$AndroidView$2$1(ref), composerImplT, modifierC);
                Updater.a(new AndroidView_androidKt$AndroidView$2$2(ref), composerImplT, density);
                Updater.a(new AndroidView_androidKt$AndroidView$2$3(ref), composerImplT, lifecycleOwner);
                Updater.a(new AndroidView_androidKt$AndroidView$2$4(ref), composerImplT, savedStateRegistryOwner);
                AndroidView_androidKt$AndroidView$2$5 androidView_androidKt$AndroidView$2$6 = new AndroidView_androidKt$AndroidView$2$5(ref);
                AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$2 = AndroidView_androidKt$NoOpUpdate$1.i;
                Updater.a(androidView_androidKt$AndroidView$2$6, composerImplT, androidView_androidKt$NoOpUpdate$2);
                Updater.a(new AndroidView_androidKt$AndroidView$2$6(ref), composerImplT, layoutDirection);
                composerImplT.R(true);
                composerImplT.R(false);
                if (saveableStateRegistry != null) {
                    EffectsKt.b(saveableStateRegistry, strValueOf, new AndroidView_androidKt$AndroidView$3(saveableStateRegistry, strValueOf, ref), composerImplT);
                }
                wr0Var3 = androidView_androidKt$NoOpUpdate$2;
                modifier2 = modifier3;
            } else {
                ComposablesKt.a();
                throw null;
            }
        } else {
            companion = Modifier.Companion.a;
            if (i6 != 0) {
                modifier3 = companion;
            } else {
                modifier3 = modifier2;
            }
            Context context3 = (Context) composerImplT.v(AndroidCompositionLocals_androidKt.b);
            composerImplT.B(-492369756);
            objB0 = composerImplT.b0();
            composer$Companion$Empty$1 = Composer.Companion.a;
            if (objB0 == composer$Companion$Empty$1) {
                objB0 = new AndroidView_androidKt$AndroidView$noOpConnection$1$1();
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$3 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) objB0;
            composerImplT.B(-492369756);
            objB1 = composerImplT.b0();
            if (objB1 == composer$Companion$Empty$1) {
                objB1 = new NestedScrollDispatcher();
                composerImplT.C0(objB1);
            }
            composerImplT.R(false);
            NestedScrollDispatcher nestedScrollDispatcher3 = (NestedScrollDispatcher) objB1;
            modifierC = ComposedModifierKt.c(composerImplT, SemanticsModifierKt.a(modifier3.N(NestedScrollModifierKt.a(companion, androidView_androidKt$AndroidView$noOpConnection$1$3, nestedScrollDispatcher3)), true, AndroidView_androidKt$AndroidView$modifierWithSemantics$1.i));
            density = (Density) composerImplT.v(CompositionLocalsKt.e);
            layoutDirection = (LayoutDirection) composerImplT.v(CompositionLocalsKt.k);
            CompositionContext compositionContextB3 = ComposablesKt.b(composerImplT);
            saveableStateRegistry = (SaveableStateRegistry) composerImplT.v(SaveableStateRegistryKt.a);
            strValueOf = String.valueOf(composerImplT.L);
            composerImplT.B(-492369756);
            objB2 = composerImplT.b0();
            if (objB2 == composer$Companion$Empty$1) {
                objB2 = new Ref();
                composerImplT.C0(objB2);
            }
            composerImplT.R(false);
            ref = (Ref) objB2;
            lifecycleOwner = (LifecycleOwner) composerImplT.v(AndroidCompositionLocals_androidKt.d);
            savedStateRegistryOwner = (SavedStateRegistryOwner) composerImplT.v(AndroidCompositionLocals_androidKt.e);
            androidView_androidKt$AndroidView$1 = new AndroidView_androidKt$AndroidView$1(context3, compositionContextB3, nestedScrollDispatcher3, wr0Var, saveableStateRegistry, strValueOf, ref);
            composerImplT.B(1886828752);
            if (composerImplT.a instanceof UiApplier) {
                composerImplT.t0();
                if (composerImplT.K) {
                    composerImplT.E(new AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1(androidView_androidKt$AndroidView$1));
                } else {
                    composerImplT.d();
                }
                Updater.a(new AndroidView_androidKt$AndroidView$2$1(ref), composerImplT, modifierC);
                Updater.a(new AndroidView_androidKt$AndroidView$2$2(ref), composerImplT, density);
                Updater.a(new AndroidView_androidKt$AndroidView$2$3(ref), composerImplT, lifecycleOwner);
                Updater.a(new AndroidView_androidKt$AndroidView$2$4(ref), composerImplT, savedStateRegistryOwner);
                AndroidView_androidKt$AndroidView$2$5 androidView_androidKt$AndroidView$2$7 = new AndroidView_androidKt$AndroidView$2$5(ref);
                AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$3 = AndroidView_androidKt$NoOpUpdate$1.i;
                Updater.a(androidView_androidKt$AndroidView$2$7, composerImplT, androidView_androidKt$NoOpUpdate$3);
                Updater.a(new AndroidView_androidKt$AndroidView$2$6(ref), composerImplT, layoutDirection);
                composerImplT.R(true);
                composerImplT.R(false);
                if (saveableStateRegistry != null) {
                    EffectsKt.b(saveableStateRegistry, strValueOf, new AndroidView_androidKt$AndroidView$3(saveableStateRegistry, strValueOf, ref), composerImplT);
                }
                wr0Var3 = androidView_androidKt$NoOpUpdate$3;
                modifier2 = modifier3;
            } else {
                ComposablesKt.a();
                throw null;
            }
        }
        recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new AndroidView_androidKt$AndroidView$4(wr0Var, modifier2, wr0Var3, i, i2);
    }
}
