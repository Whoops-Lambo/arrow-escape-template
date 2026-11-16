package androidx.p003activity;

import defpackage.sr0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OnBackPressedCallback {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public sr0 c;

    public void a() {
    }

    public abstract void b();

    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    public OnBackPressedCallback(boolean z) {
        this.a = z;
    }

    public void c(BackEventCompat backEventCompat) {
        backEventCompat.getClass();
    }

    public void d(BackEventCompat backEventCompat) {
        backEventCompat.getClass();
    }
}
