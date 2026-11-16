package androidx.compose.ui.text.input;

import defpackage.dk;
import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {189}, m = "textInputCommandEventLoop")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class TextInputServiceAndroid$textInputCommandEventLoop$1 extends fy {
    public TextInputServiceAndroid r;
    public dk s;
    public /* synthetic */ Object t;
    public final /* synthetic */ TextInputServiceAndroid u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$textInputCommandEventLoop$1(TextInputServiceAndroid textInputServiceAndroid, fy fyVar) {
        super(fyVar);
        this.u = textInputServiceAndroid;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.e(this);
    }
}
