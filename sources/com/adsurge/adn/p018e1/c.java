package com.adsurge.adn.p018e1;

import android.os.Looper;
import com.adsurge.adn.I0.g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c {
    public final Vector a = new Vector();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.a);
        }
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference != null) {
                        d dVar = (d) weakReference.get();
                        if (dVar != null) {
                            dVar.a(obj);
                        } else {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(obj);
        } else {
            g.a(new a(obj));
        }
    }

    public void a(d dVar) {
        this.a.add(new WeakReference(dVar));
    }

    public void a() {
        b(null);
    }
}
