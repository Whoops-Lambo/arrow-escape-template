package defpackage;

import com.ironsource.C4664b4;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xu4 extends gu4 implements RunnableFuture {
    public volatile q71 h;

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final String h() {
        q71 q71Var = this.h;
        if (q71Var == null) {
            return super.h();
        }
        String string = q71Var.toString();
        return jc1.o("task=[", string, new StringBuilder(string.length() + 7), C4664b4.j.e);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        q71 q71Var = this.h;
        if (q71Var != null) {
            q71Var.run();
        }
        this.h = null;
    }

    public xu4(Callable callable) {
        this.h = new wu4(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final void g() {
        q71 q71Var;
        if (m() && (q71Var = this.h) != null) {
            q71Var.x();
        }
        this.h = null;
    }
}
