package io.p071bidmachine.analytics.internal.p079h;

import android.content.Context;
import defpackage.e80;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final a c = new a(null);
    private final Object a = new Object();
    private b b = b.EMPTY;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        EMPTY,
        CREATED,
        ENABLED,
        DISABLED,
        DESTROYED
    }

    public abstract String a();

    public abstract void b(Object obj);

    public abstract void d(Context context);

    public abstract void e(Context context);

    public abstract void f(Context context);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            b bVar = this.b;
            if (bVar == b.CREATED || bVar == b.DISABLED) {
                b(obj);
                this.b = b.DISABLED;
            }
        }
    }

    public final void b(Context context) {
        synchronized (this.a) {
            if (this.b != b.ENABLED) {
                return;
            }
            try {
                e(context);
            } catch (Throwable unused) {
            }
            this.b = b.DISABLED;
        }
    }

    public final void c(Context context) {
        synchronized (this.a) {
            if (this.b != b.DISABLED) {
                return;
            }
            try {
                f(context);
            } catch (Throwable unused) {
            }
            this.b = b.ENABLED;
        }
    }

    public final void a(Context context) {
        synchronized (this.a) {
            if (this.b != b.EMPTY) {
                return;
            }
            d(context);
            this.b = b.CREATED;
        }
    }
}
