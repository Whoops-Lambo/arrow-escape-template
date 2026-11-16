package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class tt {
    public final WeakReference a;
    public final String b;

    public final View a() {
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public tt(View view, String str) {
        view.getClass();
        this.a = new WeakReference(view);
        this.b = str;
    }
}
