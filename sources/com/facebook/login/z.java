package com.facebook.login;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.internal.q0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends q0 {
    public final String l;
    public final String m;
    public final long n;

    @Override // com.facebook.internal.q0
    public final void e(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.LOGGER_REF", this.l);
        bundle.putString("com.facebook.platform.extra.GRAPH_API_VERSION", this.m);
        bundle.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", this.n);
    }

    public z(Activity activity, String str, String str2, String str3, String str4) {
        super(activity, 65546, 65547, 20170411, str, str2, null);
        this.l = str3;
        this.m = str4;
        this.n = 5000L;
    }
}
