package androidx.core.app;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class TaskStackBuilder implements Iterable<Intent> {
    public final ArrayList a = new ArrayList();
    public final AppCompatActivity b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.a.iterator();
    }

    public TaskStackBuilder(AppCompatActivity appCompatActivity) {
        this.b = appCompatActivity;
    }
}
