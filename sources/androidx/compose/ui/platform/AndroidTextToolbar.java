package androidx.compose.ui.platform;

import android.view.ActionMode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidTextToolbar implements TextToolbar {
    public final AndroidComposeView a;
    public ActionMode b;
    public final TextActionModeCallback c = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this));
    public TextToolbarStatus d = TextToolbarStatus.b;

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void a(Rect rect, sr0 sr0Var, sr0 sr0Var2, sr0 sr0Var3, sr0 sr0Var4) {
        TextActionModeCallback textActionModeCallback = this.c;
        textActionModeCallback.getClass();
        textActionModeCallback.b = rect;
        textActionModeCallback.c = sr0Var;
        textActionModeCallback.e = sr0Var3;
        textActionModeCallback.d = sr0Var2;
        textActionModeCallback.f = sr0Var4;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.d = TextToolbarStatus.a;
        this.b = TextToolbarHelperMethods.a.b(this.a, new FloatingTextActionModeCallback(textActionModeCallback), 1);
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    /* JADX INFO: renamed from: getStatus, reason: from getter */
    public final TextToolbarStatus getD() {
        return this.d;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void hide() {
        this.d = TextToolbarStatus.b;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.b = null;
    }

    public AndroidTextToolbar(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }
}
