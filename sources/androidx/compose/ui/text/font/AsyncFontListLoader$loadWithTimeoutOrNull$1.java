package androidx.compose.ui.text.font;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@t50(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "loadWithTimeoutOrNull$ui_text_release")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends fy {
    public Font r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AsyncFontListLoader t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, fy fyVar) {
        super(fyVar);
        this.t = asyncFontListLoader;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.d(null, this);
    }
}
