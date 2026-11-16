package androidx.core.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.d;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/core/util/Pools;", "", "Pool", "SimplePool", "SynchronizedPool", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Pools {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/core/util/Pools$Pool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Pool<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/Pools$SimplePool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/core/util/Pools$Pool;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SimplePool<T> implements Pool<T> {
        public final Object[] a;
        public int b;

        public Object a() {
            int i = this.b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.a;
            Object obj = objArr[i2];
            obj.getClass();
            objArr[i2] = null;
            this.b--;
            return obj;
        }

        public SimplePool(int i) {
            if (i > 0) {
                this.a = new Object[i];
            } else {
                d.r("The max pool size must be > 0");
                throw null;
            }
        }

        public boolean b(Object obj) {
            obj.getClass();
            int i = this.b;
            int i2 = 0;
            while (true) {
                Object[] objArr = this.a;
                if (i2 < i) {
                    if (objArr[i2] != obj) {
                        i2++;
                    } else {
                        e32.i("Already in the pool!");
                        return false;
                    }
                } else {
                    int i3 = this.b;
                    if (i3 >= objArr.length) {
                        return false;
                    }
                    objArr[i3] = obj;
                    this.b = i3 + 1;
                    return true;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/Pools$SynchronizedPool;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/core/util/Pools$SimplePool;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SynchronizedPool<T> extends SimplePool<T> {
        public final Object c;

        @Override // androidx.core.util.Pools.SimplePool
        public final Object a() {
            Object objA;
            synchronized (this.c) {
                objA = super.a();
            }
            return objA;
        }

        public SynchronizedPool(int i) {
            super(i);
            this.c = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool
        public final boolean b(Object obj) {
            boolean zB;
            obj.getClass();
            synchronized (this.c) {
                zB = super.b(obj);
            }
            return zB;
        }
    }
}
