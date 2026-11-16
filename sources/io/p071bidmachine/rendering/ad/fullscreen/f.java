package io.p071bidmachine.rendering.ad.fullscreen;

import android.content.Context;
import com.facebook.internal.j0;
import io.p071bidmachine.rendering.ad.view.i;
import io.p071bidmachine.rendering.internal.state.d;
import io.p071bidmachine.rendering.model.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public final d a;
    public final i b;
    public j0 c;

    public f(Context context, b bVar) {
        bVar.getClass();
        this.a = new d("FullScreenAd");
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = new i(applicationContext, bVar);
    }
}
