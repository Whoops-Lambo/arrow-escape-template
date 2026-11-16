package io.p071bidmachine.analytics.internal.x;

import android.content.Context;
import defpackage.e32;
import defpackage.e80;
import io.p071bidmachine.analytics.ReaderConfig;
import io.p071bidmachine.analytics.internal.I.g;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends io.p071bidmachine.analytics.internal.w.a {
    public static final C1615a h = new C1615a(null);
    private final String g = "aexs";

    @Override // io.p071bidmachine.analytics.internal.p079h.d
    public void d(Context context) {
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.x.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1615a {
        public /* synthetic */ C1615a(e80 e80Var) {
            this();
        }

        private C1615a() {
        }
    }

    @Override // io.p071bidmachine.analytics.internal.w.a
    public File a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            return new File(g.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()));
        }
        e32.i("Check failed.");
        return null;
    }

    @Override // io.p071bidmachine.analytics.internal.p079h.d
    public String a() {
        return this.g;
    }
}
