package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface ga3 extends ServiceConnection, ia3 {
    void a(gd3 gd3Var);

    void a(String str);

    boolean a();

    void b();

    void b(gd3 gd3Var);

    void b(String str);

    void c(ComponentName componentName, IBinder iBinder);

    void c(String str);

    boolean c();

    String d();

    void destroy();

    String e();

    boolean f();

    Context g();

    boolean h();

    String i();

    boolean j();

    IIgniteServiceAPI k();
}
