package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import defpackage.as0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*D\b\u0002\u0010\u0004\"\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Function0;", "Laz2;", "Landroidx/compose/runtime/Composable;", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SnackbarHostKt {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            iArr[2] = 1;
            iArr[1] = 2;
            iArr[0] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(SnackbarHostState snackbarHostState, Modifier modifier, as0 as0Var, Composer composer, int i) {
        int i2;
        int i3;
        snackbarHostState.getClass();
        ComposerImpl composerImplT = composer.t(431012348);
        if ((i & 14) == 0) {
            if (composerImplT.l(snackbarHostState)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (((i2 | 432) & 731) == 146 && composerImplT.b()) {
            composerImplT.h();
            RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new SnackbarHostKt$SnackbarHost$2(snackbarHostState, modifier, as0Var, i);
            return;
        }
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SnackbarHostKt.a;
        throw null;
    }
}
