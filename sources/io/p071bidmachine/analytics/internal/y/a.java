package io.p071bidmachine.analytics.internal.y;

import android.content.Context;
import defpackage.e32;
import defpackage.e80;
import defpackage.sr0;
import io.p071bidmachine.analytics.ReaderConfig;
import io.p071bidmachine.analytics.internal.I.g;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends io.p071bidmachine.analytics.internal.w.a {
    public static final C1616a i = new C1616a(null);
    private final sr0 g;
    private final String h = "aints";

    @Override // io.p071bidmachine.analytics.internal.p079h.d
    public void d(Context context) {
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.y.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1616a {
        public /* synthetic */ C1616a(e80 e80Var) {
            this();
        }

        private C1616a() {
        }
    }

    @Override // io.p071bidmachine.analytics.internal.w.a
    public File a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            return new File((File) this.g.invoke(), g.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()));
        }
        e32.i("Check failed.");
        return null;
    }

    public a(sr0 sr0Var) {
        this.g = sr0Var;
    }

    @Override // io.p071bidmachine.analytics.internal.p079h.d
    public String a() {
        return this.h;
    }
}
