package androidx.compose.foundation;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class Clickable_androidKt {
    public static final long a = ViewConfiguration.getTapTimeout();
    public static final /* synthetic */ int b = 0;

    public static final sr0 a(Composer composer) {
        composer.B(-1990508712);
        Clickable_androidKt$isComposeRootInScrollableContainer$1 clickable_androidKt$isComposeRootInScrollableContainer$1 = new Clickable_androidKt$isComposeRootInScrollableContainer$1((View) composer.v(AndroidCompositionLocals_androidKt.f));
        composer.J();
        return clickable_androidKt$isComposeRootInScrollableContainer$1;
    }
}
