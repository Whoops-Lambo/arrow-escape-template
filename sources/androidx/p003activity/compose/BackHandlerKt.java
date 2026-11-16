package androidx.p003activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.p003activity.OnBackPressedCallback;
import androidx.p003activity.OnBackPressedDispatcher;
import androidx.p003activity.OnBackPressedDispatcherOwner;
import androidx.p003activity.ViewTreeOnBackPressedDispatcherOwner;
import defpackage.e32;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0003²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Laz2;", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackHandlerKt {
    public static final void a(boolean z, sr0 sr0Var, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplT = composer.t(-361453782);
        int i3 = i | 6;
        if (composerImplT.l(sr0Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        if (((i3 | i2) & 19) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else {
            final MutableState mutableStateI = SnapshotStateKt.i(sr0Var, composerImplT);
            composerImplT.B(-971159753);
            Object objB0 = composerImplT.b0();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
            if (objB0 == composer$Companion$Empty$1) {
                objB0 = new OnBackPressedCallback() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$backCallback$1$1
                    {
                        super(true);
                    }

                    @Override // androidx.p003activity.OnBackPressedCallback
                    public final void b() {
                        ((sr0) mutableStateI.getA()).invoke();
                    }
                };
                composerImplT.C0(objB0);
            }
            BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = (BackHandlerKt$BackHandler$backCallback$1$1) objB0;
            composerImplT.R(false);
            composerImplT.B(-971159481);
            boolean zL = composerImplT.l(backHandlerKt$BackHandler$backCallback$1$1) | composerImplT.m(true);
            Object objB1 = composerImplT.b0();
            if (zL || objB1 == composer$Companion$Empty$1) {
                objB1 = new BackHandlerKt$BackHandler$1$1(backHandlerKt$BackHandler$backCallback$1$1);
                composerImplT.C0(objB1);
            }
            composerImplT.R(false);
            EffectsKt.g((sr0) objB1, composerImplT);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalOnBackPressedDispatcherOwner.a;
            composerImplT.B(-2068013981);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerA = (OnBackPressedDispatcherOwner) composerImplT.v(LocalOnBackPressedDispatcherOwner.a);
            composerImplT.B(1680121597);
            if (onBackPressedDispatcherOwnerA == null) {
                onBackPressedDispatcherOwnerA = ViewTreeOnBackPressedDispatcherOwner.a((View) composerImplT.v(AndroidCompositionLocals_androidKt.f));
            }
            composerImplT.J();
            if (onBackPressedDispatcherOwnerA == null) {
                Object baseContext = (Context) composerImplT.v(AndroidCompositionLocals_androidKt.b);
                while (true) {
                    if (baseContext instanceof ContextWrapper) {
                        if (baseContext instanceof OnBackPressedDispatcherOwner) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    } else {
                        baseContext = null;
                        break;
                    }
                }
                onBackPressedDispatcherOwnerA = (OnBackPressedDispatcherOwner) baseContext;
            }
            composerImplT.J();
            if (onBackPressedDispatcherOwnerA != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwnerA.getOnBackPressedDispatcher();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplT.v(AndroidCompositionLocals_androidKt.d);
                composerImplT.B(-971159120);
                boolean zL2 = composerImplT.l(onBackPressedDispatcher) | composerImplT.l(lifecycleOwner) | composerImplT.l(backHandlerKt$BackHandler$backCallback$1$1);
                Object objB2 = composerImplT.b0();
                if (zL2 || objB2 == composer$Companion$Empty$1) {
                    objB2 = new BackHandlerKt$BackHandler$2$1(onBackPressedDispatcher, lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1);
                    composerImplT.C0(objB2);
                }
                composerImplT.R(false);
                EffectsKt.b(lifecycleOwner, onBackPressedDispatcher, (wr0) objB2, composerImplT);
                z = true;
            } else {
                e32.i("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT != null) {
            recomposeScopeImplT.d = new BackHandlerKt$BackHandler$3(z, sr0Var, i);
        }
    }
}
