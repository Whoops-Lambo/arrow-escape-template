package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/ViewLayer$Companion$OutlineProvider$1", "Landroid/view/ViewOutlineProvider;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewLayer$Companion$OutlineProvider$1 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        view.getClass();
        outline.getClass();
        Outline outlineB = ((ViewLayer) view).e.b();
        outlineB.getClass();
        outline.set(outlineB);
    }
}
