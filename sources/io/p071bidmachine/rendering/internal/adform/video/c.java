package io.p071bidmachine.rendering.internal.adform.video;

import android.net.Uri;
import io.p071bidmachine.media3.exoplayer.video.x;
import io.p071bidmachine.rendering.utils.d;
import io.p071bidmachine.util.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements io.p071bidmachine.rendering.c {
    public final /* synthetic */ d a;

    public /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    @Override // io.p071bidmachine.util.i
    public void onSuccess(Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        d.a(new x(6, this.a, uri));
    }

    @Override // io.p071bidmachine.rendering.c
    public void e(e eVar) {
        eVar.getClass();
        this.a.F(eVar);
    }
}
