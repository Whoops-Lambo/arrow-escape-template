package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import com.ironsource.G5;
import defpackage.d;
import defpackage.du;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/collection/LruCache;", "", "K", "V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LruCache<K, V> {
    public final int a;
    public final LruHashMap b;
    public final Lock c;
    public int d;
    public int e;
    public int f;

    public final void h(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !this.b.a.isEmpty()) {
                        Set<Map.Entry<K, V>> setEntrySet = this.b.a.entrySet();
                        setEntrySet.getClass();
                        Map.Entry entry = (Map.Entry) du.b0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        LruHashMap lruHashMap = this.b;
                        lruHashMap.getClass();
                        key.getClass();
                        lruHashMap.a.remove(key);
                        this.d -= f(key, value);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public LruCache(int i) {
        this.a = i;
        if (i > 0) {
            this.b = new LruHashMap();
            this.c = new Lock();
        } else {
            d.r("maxSize <= 0");
            throw null;
        }
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            LruHashMap lruHashMap = this.b;
            lruHashMap.getClass();
            Object obj2 = lruHashMap.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    LruHashMap lruHashMap2 = this.b;
                    lruHashMap2.getClass();
                    objPut = lruHashMap2.a.put(obj, objA);
                    if (objPut != null) {
                        LruHashMap lruHashMap3 = this.b;
                        lruHashMap3.getClass();
                        lruHashMap3.a.put(obj, objPut);
                    } else {
                        this.d += f(obj, objA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                b(obj, objA, objPut);
                return objPut;
            }
            h(this.a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            this.d += f(obj, obj2);
            LruHashMap lruHashMap = this.b;
            lruHashMap.getClass();
            objPut = lruHashMap.a.put(obj, obj2);
            if (objPut != null) {
                this.d -= f(obj, objPut);
            }
        }
        if (objPut != null) {
            b(obj, objPut, obj2);
        }
        h(this.a);
        return objPut;
    }

    public final void e(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.c) {
            LruHashMap lruHashMap = this.b;
            lruHashMap.getClass();
            objRemove = lruHashMap.a.remove(obj);
            if (objRemove != null) {
                this.d -= f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            b(obj, objRemove, null);
        }
    }

    public final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(("Negative size: " + obj + G5.U + obj2).toString());
    }

    public int g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }
}
