package defpackage;

import android.content.Context;
import com.facebook.a0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bo implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ bo(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return null;
            default:
                Context context = a0.k;
                if (context != null) {
                    return context.getCacheDir();
                }
                s71.D("applicationContext");
                throw null;
        }
    }
}
