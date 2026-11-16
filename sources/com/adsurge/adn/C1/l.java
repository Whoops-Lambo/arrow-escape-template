package com.adsurge.adn.C1;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class l {
    public static volatile l c;
    public ArrayBlockingQueue a;
    public int b = -1;

    public boolean b(h hVar) {
        WeakReference weakReference;
        if (hVar == null) {
            return false;
        }
        Iterator it = this.a.iterator();
        do {
            if (!it.hasNext()) {
                weakReference = null;
                break;
            }
            weakReference = (WeakReference) it.next();
        } while (hVar != weakReference.get());
        if (weakReference == null) {
            hVar.hashCode();
            return false;
        }
        boolean zRemove = this.a.remove(weakReference);
        hVar.hashCode();
        this.a.size();
        return zRemove;
    }

    public void a(h hVar) {
        WeakReference weakReference;
        h hVar2;
        if (hVar == null) {
            return;
        }
        if (b() == 0) {
            hVar.b();
            return;
        }
        if (this.a.size() == b() && (weakReference = (WeakReference) this.a.poll()) != null && (hVar2 = (h) weakReference.get()) != null) {
            hVar2.hashCode();
            hVar2.b();
        }
        this.a.offer(new WeakReference(hVar));
        hVar.hashCode();
        this.a.size();
    }

    public l() {
        this.a = null;
        this.a = new ArrayBlockingQueue(16);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    public final int b() {
        int i;
        int i2 = this.b;
        if (i2 >= 0) {
            return i2;
        }
        com.adsurge.adn.t1.a aVarC = com.adsurge.adn.s1.a.b().c();
        if (aVarC != null) {
            String strB = aVarC.b("maxCachedPlayerCount");
            if (TextUtils.isEmpty(strB)) {
                i = 0;
            } else {
                try {
                    i = Integer.parseInt(strB);
                } catch (Exception e) {
                    e.getMessage();
                    i = 0;
                }
            }
        } else {
            i = 0;
        }
        int i3 = i >= 0 ? i : 0;
        this.b = i3;
        return i3;
    }

    public static l a() {
        if (c == null) {
            synchronized (l.class) {
                try {
                    if (c == null) {
                        c = new l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }
}
