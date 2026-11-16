package defpackage;

import android.content.Context;
import android.os.UserManager;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s80 implements yw0, zw0 {
    public final Lazy a;
    public final Context b;
    public final Provider c;
    public final Set d;
    public final Executor e;

    public s80(Context context, String str, Set set, Provider provider, Executor executor) {
        this.a = new Lazy(new cw(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = provider;
        this.b = context;
    }

    public final void a() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new r80(this, 1));
        }
    }
}
