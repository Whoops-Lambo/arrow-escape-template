package com.inmobi.media;

import defpackage.ej1;
import defpackage.gd1;
import defpackage.s71;
import defpackage.wi3;
import defpackage.wr0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.xd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4518xd {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ExecutorService b = Executors.newSingleThreadExecutor(new ThreadFactoryC4239na("MultiEventBus", false));

    public final void a(C4009f3 c4009f3) {
        wr0 wr0Var;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        setEntrySet.getClass();
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.a.entrySet();
        setEntrySet2.getClass();
        for (Map.Entry entry2 : setEntrySet2) {
            entry2.getClass();
            Object key = entry2.getKey();
            key.getClass();
            wr0 wr0Var2 = (wr0) key;
            Object value = entry2.getValue();
            value.getClass();
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) wr0Var2.invoke(c4009f3)).booleanValue() && (wr0Var = (wr0) weakReference.get()) != null) {
                    wr0Var.invoke(c4009f3);
                }
            } catch (Exception e) {
                gd1 gd1Var = Ba.a;
                U9.a(e);
            }
        }
    }

    public final void b(C4009f3 c4009f3) {
        c4009f3.getClass();
        try {
            this.b.execute(new wi3(0, c4009f3, this));
        } catch (InternalError unused) {
            a(c4009f3);
        }
    }

    public static final boolean a(int[] iArr, C4009f3 c4009f3) {
        c4009f3.getClass();
        return defpackage.n8.M(iArr, c4009f3.a);
    }

    public final void a(int[] iArr, wr0 wr0Var) {
        iArr.getClass();
        wr0Var.getClass();
        this.a.put(new ej1(iArr, 24), new WeakReference(wr0Var));
    }

    public final void a(wr0 wr0Var) {
        wr0Var.getClass();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (s71.b(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), wr0Var)) {
                it.remove();
            }
        }
    }

    public static final void a(C4009f3 c4009f3, C4518xd c4518xd) {
        int i = c4009f3.a;
        c4518xd.a(c4009f3);
    }
}
