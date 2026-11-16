package androidx.compose.ui.focus;

import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FocusPropertiesKt {
    public static final ProvidableModifierLocal a = new ProvidableModifierLocal(FocusPropertiesKt$ModifierLocalFocusProperties$1.i);

    public static final void a(FocusModifier focusModifier) {
        OwnerSnapshotObserver snapshotObserver;
        focusModifier.getClass();
        FocusPropertiesImpl focusPropertiesImpl = focusModifier.k;
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.m;
        if (layoutNodeWrapper == null) {
            return;
        }
        focusPropertiesImpl.getClass();
        focusPropertiesImpl.a = true;
        FocusRequester focusRequester = FocusRequester.b;
        focusRequester.getClass();
        focusPropertiesImpl.b = focusRequester;
        focusPropertiesImpl.c = focusRequester;
        focusPropertiesImpl.d = focusRequester;
        focusPropertiesImpl.e = focusRequester;
        focusPropertiesImpl.f = focusRequester;
        focusPropertiesImpl.g = focusRequester;
        focusPropertiesImpl.h = focusRequester;
        focusPropertiesImpl.i = focusRequester;
        Owner owner = layoutNodeWrapper.e.g;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            wr0 wr0Var = FocusModifier.q;
            snapshotObserver.b(focusModifier, FocusModifier$Companion$RefreshFocusProperties$1.i, new FocusPropertiesKt$refreshFocusProperties$1(focusModifier));
        }
        if (focusPropertiesImpl.a) {
            FocusTransactionsKt.a(focusModifier);
        } else {
            FocusTransactionsKt.d(focusModifier);
        }
    }
}
