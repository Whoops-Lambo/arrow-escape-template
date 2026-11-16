package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import defpackage.d;
import defpackage.e32;
import defpackage.pv1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LiveData<T> {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final SafeIterableMap b = new SafeIterableMap();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean d() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        public final LifecycleOwner e;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer observer) {
            super(observer);
            this.e = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final void b() {
            this.e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean c(LifecycleOwner lifecycleOwner) {
            return this.e == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean d() {
            return this.e.getLifecycle().getD().compareTo(Lifecycle.State.d) >= 0;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            LifecycleOwner lifecycleOwner2 = this.e;
            Lifecycle.State stateB = lifecycleOwner2.getLifecycle().getD();
            if (stateB == Lifecycle.State.a) {
                LiveData.this.h(this.a);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateB) {
                a(d());
                state = stateB;
                stateB = lifecycleOwner2.getLifecycle().getD();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public abstract class ObserverWrapper {
        public final Observer a;
        public boolean b;
        public int c = -1;

        public void b() {
        }

        public boolean c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean d();

        public final void a(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            int i = z ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i2 = liveData.c;
            liveData.c = i + i2;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i3 = liveData.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.f();
                        } else if (z3) {
                            liveData.g();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        liveData.d = false;
                        throw th;
                    }
                }
                liveData.d = false;
            }
            if (this.b) {
                liveData.c(this);
            }
        }

        public ObserverWrapper(Observer observer) {
            this.a = observer;
        }
    }

    public void f() {
    }

    public void g() {
    }

    public final void b(ObserverWrapper observerWrapper) {
        if (observerWrapper.b) {
            if (!observerWrapper.d()) {
                observerWrapper.a(false);
                return;
            }
            int i = observerWrapper.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            observerWrapper.c = i2;
            observerWrapper.a.a(this.e);
        }
    }

    public final void c(ObserverWrapper observerWrapper) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (observerWrapper != null) {
                b(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap safeIterableMap = this.b;
                safeIterableMap.getClass();
                SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                safeIterableMap.c.put(iteratorWithAdditions, Boolean.FALSE);
                while (iteratorWithAdditions.hasNext()) {
                    b((ObserverWrapper) ((Map.Entry) iteratorWithAdditions.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(LifecycleOwner lifecycleOwner, Observer observer) {
        a("observe");
        if (lifecycleOwner.getLifecycle().getD() == Lifecycle.State.a) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.b.c(observer, lifecycleBoundObserver);
        if (observerWrapper != null && !observerWrapper.c(lifecycleOwner)) {
            d.r("Cannot add the same observer with different lifecycles");
        } else {
            if (observerWrapper != null) {
                return;
            }
            lifecycleOwner.getLifecycle().a(lifecycleBoundObserver);
        }
    }

    public final void e(Observer observer) {
        a("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.b.c(observer, alwaysActiveObserver);
        if (observerWrapper instanceof LifecycleBoundObserver) {
            d.r("Cannot add the same observer with different lifecycles");
        } else {
            if (observerWrapper != null) {
                return;
            }
            alwaysActiveObserver.a(true);
        }
    }

    public void h(Observer observer) {
        a("removeObserver");
        ObserverWrapper observerWrapper = (ObserverWrapper) this.b.d(observer);
        if (observerWrapper == null) {
            return;
        }
        observerWrapper.b();
        observerWrapper.a(false);
    }

    public void i(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public LiveData() {
        Object obj = k;
        this.f = obj;
        this.j = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (LiveData.this.a) {
                    obj2 = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                }
                LiveData.this.i(obj2);
            }
        };
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        ArchTaskExecutor.a().a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        e32.i(pv1.n("Cannot invoke ", str, " on a background thread"));
    }
}
