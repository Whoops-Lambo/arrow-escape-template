package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface MenuProvider {
    void a(Menu menu, MenuInflater menuInflater);

    default void b(Menu menu) {
    }

    default void c(Menu menu) {
    }

    boolean d(MenuItem menuItem);
}
