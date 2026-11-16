package androidx.compose.ui.text.caches;

import androidx.compose.ui.text.platform.SynchronizedObject;
import defpackage.du;
import defpackage.os2;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", "V", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class LruCache<K, V> {
    public final SynchronizedObject a = new SynchronizedObject();
    public final HashMap b = new HashMap(0, 0.75f);
    public final LinkedHashSet c = new LinkedHashSet();
    public int d;
    public int e;
    public int f;

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        Object objZ;
        Object obj3;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.a) {
            try {
                this.d = d() + 1;
                objPut = this.b.put(obj, obj2);
                if (objPut != null) {
                    this.d = d() - 1;
                }
                if (this.c.contains(obj)) {
                    this.c.remove(obj);
                }
                this.c.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (this.a) {
                try {
                    if (d() >= 0 && (!this.b.isEmpty() || d() == 0)) {
                        if (this.b.isEmpty() != this.c.isEmpty()) {
                            break;
                        }
                        if (d() <= 16 || this.b.isEmpty()) {
                            objZ = null;
                            obj3 = null;
                        } else {
                            objZ = du.Z(this.c);
                            obj3 = this.b.get(objZ);
                            if (obj3 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            os2.h(this.b).remove(objZ);
                            os2.f(this.c).remove(objZ);
                            int iD = d();
                            objZ.getClass();
                            this.d = iD - 1;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objZ == null && obj3 == null) {
                return objPut;
            }
            objZ.getClass();
            obj3.getClass();
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public final Object a(Object obj) {
        synchronized (this.a) {
            Object obj2 = this.b.get(obj);
            if (obj2 == null) {
                this.f++;
                return null;
            }
            this.c.remove(obj);
            this.c.add(obj);
            this.e++;
            return obj2;
        }
    }

    public final Object c(Object obj) {
        Object objRemove;
        synchronized (this.a) {
            objRemove = this.b.remove(obj);
            this.c.remove(obj);
            if (objRemove != null) {
                this.d = d() - 1;
            }
        }
        return objRemove;
    }

    public final int d() {
        int i;
        synchronized (this.a) {
            i = this.d;
        }
        return i;
    }

    public final String toString() {
        String str;
        synchronized (this.a) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=16,hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
