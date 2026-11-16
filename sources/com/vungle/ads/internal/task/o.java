package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class o implements d {
    public final Context a;
    public final PathProvider b;

    public o(Context context, PathProvider pathProvider) {
        context.getClass();
        pathProvider.getClass();
        this.a = context;
        this.b = pathProvider;
    }

    public final c a(String str) throws n {
        str.getClass();
        if (str.length() != 0) {
            if (str.equals("CleanupJob")) {
                return new b(this.a, this.b);
            }
            if (str.equals("ResendTpatJob")) {
                return new l(this.a, this.b);
            }
            throw new n(com.iab.omid.library.vungle.d.a("Unknown Job Type ", str));
        }
        throw new n("Job tag is null");
    }
}
