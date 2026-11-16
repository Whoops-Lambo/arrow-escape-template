package androidx.p003activity;

import defpackage.sr0;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FullyDrawnReporter {
    public final Executor a;
    public final sr0 b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final b h;

    public final void a() {
        synchronized (this.c) {
            try {
                this.f = true;
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((sr0) obj).invoke();
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        int i;
        synchronized (this.c) {
            if (!this.f && (i = this.d) > 0) {
                int i2 = i - 1;
                this.d = i2;
                if (!this.e && i2 == 0) {
                    this.e = true;
                    this.a.execute(this.h);
                }
            }
        }
    }

    public FullyDrawnReporter(Executor executor, sr0 sr0Var) {
        executor.getClass();
        this.a = executor;
        this.b = sr0Var;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new b(this, 1);
    }
}
