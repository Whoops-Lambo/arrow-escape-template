package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class pa3 {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final eh3 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final dj3 i;
    public na3 m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final mh3 k = new mh3(this, 0);
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public static /* bridge */ /* synthetic */ void b(pa3 pa3Var, kh3 kh3Var) {
        IInterface iInterface = pa3Var.n;
        eh3 eh3Var = pa3Var.b;
        ArrayList arrayList = pa3Var.d;
        int i = 0;
        if (iInterface != null || pa3Var.g) {
            if (!pa3Var.g) {
                kh3Var.run();
                return;
            } else {
                eh3Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(kh3Var);
                return;
            }
        }
        eh3Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(kh3Var);
        na3 na3Var = new na3(pa3Var, i);
        pa3Var.m = na3Var;
        pa3Var.g = true;
        if (pa3Var.a.bindService(pa3Var.h, na3Var, 1)) {
            return;
        }
        eh3Var.b("Failed to bind to the service.", new Object[0]);
        pa3Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((kh3) obj).a(new qa3());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(kh3 kh3Var, TaskCompletionSource taskCompletionSource) {
        a().post(new ii3(this, kh3Var.c(), taskCompletionSource, kh3Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new ma3(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }

    public pa3(Context context, eh3 eh3Var, String str, Intent intent, dj3 dj3Var) {
        this.a = context;
        this.b = eh3Var;
        this.c = str;
        this.h = intent;
        this.i = dj3Var;
    }
}
