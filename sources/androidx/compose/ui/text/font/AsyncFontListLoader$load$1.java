package androidx.compose.ui.text.font;

import defpackage.fy;
import defpackage.t50;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@t50(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AsyncFontListLoader$load$1 extends fy {
    public AsyncFontListLoader r;
    public List s;
    public Font t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ AsyncFontListLoader x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, fy fyVar) {
        super(fyVar);
        this.x = asyncFontListLoader;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(this);
    }
}
