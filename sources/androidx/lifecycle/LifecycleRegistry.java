package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import defpackage.ak1;
import defpackage.e32;
import defpackage.nj;
import defpackage.pv1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LifecycleRegistry extends Lifecycle {
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final boolean b = true;
    public FastSafeIterableMap c = new FastSafeIterableMap();
    public Lifecycle.State d = Lifecycle.State.b;
    public final ArrayList i = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ObserverWithState {
        public Lifecycle.State a;
        public LifecycleEventObserver b;

        public final void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State stateD = event.d();
            Lifecycle.State state = this.a;
            state.getClass();
            if (stateD.compareTo(state) < 0) {
                state = stateD;
            }
            this.a = state;
            this.b.onStateChanged(lifecycleOwner, event);
            this.a = stateD;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Lifecycle.State getD() {
        return this.d;
    }

    public final Lifecycle.State d(LifecycleObserver lifecycleObserver) {
        ObserverWithState observerWithState;
        Map.Entry entryE = this.c.e(lifecycleObserver);
        Lifecycle.State state = (entryE == null || (observerWithState = (ObserverWithState) entryE.getValue()) == null) ? null : observerWithState.a;
        ArrayList arrayList = this.i;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) nj.h(1, arrayList);
        Lifecycle.State state3 = this.d;
        state3.getClass();
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void e(String str) {
        if (this.b) {
            ArchTaskExecutor.a().a.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            ak1.b(pv1.n("Method ", str, " must be called on the main thread"));
        }
    }

    public final void g(Lifecycle.State state) {
        Lifecycle.State state2 = this.d;
        if (state2 == state) {
            return;
        }
        Lifecycle.State state3 = Lifecycle.State.b;
        Lifecycle.State state4 = Lifecycle.State.a;
        if (state2 == state3 && state == state4) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.d);
            Object obj = this.e.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.d = state;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        i();
        this.g = false;
        if (this.d == state4) {
            this.c = new FastSafeIterableMap();
        }
    }

    public final void h(Lifecycle.State state) {
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        Lifecycle.Event event;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.e.get();
        if (lifecycleOwner == null) {
            e32.i("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            FastSafeIterableMap fastSafeIterableMap = this.c;
            if (fastSafeIterableMap.d != 0) {
                SafeIterableMap.Entry entry = fastSafeIterableMap.a;
                entry.getClass();
                Lifecycle.State state = ((ObserverWithState) entry.getValue()).a;
                SafeIterableMap.Entry entry2 = this.c.b;
                entry2.getClass();
                Lifecycle.State state2 = ((ObserverWithState) entry2.getValue()).a;
                if (state == state2 && this.d == state2) {
                    break;
                }
                this.h = false;
                Lifecycle.State state3 = this.d;
                SafeIterableMap.Entry entry3 = this.c.a;
                entry3.getClass();
                int iCompareTo = state3.compareTo(((ObserverWithState) entry3.getValue()).a);
                ArrayList arrayList = this.i;
                if (iCompareTo < 0) {
                    Iterator itDescendingIterator = this.c.descendingIterator();
                    while (itDescendingIterator.hasNext() && !this.h) {
                        Map.Entry entry4 = (Map.Entry) itDescendingIterator.next();
                        entry4.getClass();
                        LifecycleObserver lifecycleObserver = (LifecycleObserver) entry4.getKey();
                        ObserverWithState observerWithState = (ObserverWithState) entry4.getValue();
                        while (observerWithState.a.compareTo(this.d) > 0 && !this.h && this.c.e.containsKey(lifecycleObserver)) {
                            Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                            Lifecycle.State state4 = observerWithState.a;
                            companion.getClass();
                            Lifecycle.Event eventA = Lifecycle.Event.Companion.a(state4);
                            if (eventA == null) {
                                e32.m(observerWithState.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(eventA.d());
                                observerWithState.a(lifecycleOwner, eventA);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                SafeIterableMap.Entry entry5 = this.c.b;
                if (!this.h && entry5 != null && this.d.compareTo(((ObserverWithState) entry5.getValue()).a) > 0) {
                    FastSafeIterableMap fastSafeIterableMap2 = this.c;
                    fastSafeIterableMap2.getClass();
                    SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                    fastSafeIterableMap2.c.put(iteratorWithAdditions, Boolean.FALSE);
                    while (iteratorWithAdditions.hasNext() && !this.h) {
                        Map.Entry entry6 = (Map.Entry) iteratorWithAdditions.next();
                        LifecycleObserver lifecycleObserver2 = (LifecycleObserver) entry6.getKey();
                        ObserverWithState observerWithState2 = (ObserverWithState) entry6.getValue();
                        while (observerWithState2.a.compareTo(this.d) < 0 && !this.h && this.c.e.containsKey(lifecycleObserver2)) {
                            arrayList.add(observerWithState2.a);
                            Lifecycle.Event.Companion companion2 = Lifecycle.Event.INSTANCE;
                            Lifecycle.State state5 = observerWithState2.a;
                            companion2.getClass();
                            state5.getClass();
                            int iOrdinal = state5.ordinal();
                            if (iOrdinal == 1) {
                                event = Lifecycle.Event.ON_CREATE;
                            } else if (iOrdinal != 2) {
                                event = iOrdinal != 3 ? null : Lifecycle.Event.ON_RESUME;
                            } else {
                                event = Lifecycle.Event.ON_START;
                            }
                            if (event == null) {
                                e32.m(observerWithState2.a, "no event up from ");
                                return;
                            } else {
                                observerWithState2.a(lifecycleOwner, event);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this.e = new WeakReference(lifecycleOwner);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(LifecycleObserver lifecycleObserver) {
        LifecycleEventObserver reflectiveGenericLifecycleObserver;
        LifecycleOwner lifecycleOwner;
        Lifecycle.Event event;
        lifecycleObserver.getClass();
        e("addObserver");
        Lifecycle.State state = this.d;
        Lifecycle.State state2 = Lifecycle.State.a;
        if (state != state2) {
            state2 = Lifecycle.State.b;
        }
        ObserverWithState observerWithState = new ObserverWithState();
        HashMap map = Lifecycling.a;
        boolean z = lifecycleObserver instanceof LifecycleEventObserver;
        boolean z2 = lifecycleObserver instanceof DefaultLifecycleObserver;
        boolean z3 = false;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) lifecycleObserver, (LifecycleEventObserver) lifecycleObserver);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) lifecycleObserver, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (LifecycleEventObserver) lifecycleObserver;
        } else {
            Class<?> cls = lifecycleObserver.getClass();
            if (Lifecycling.b(cls) == 2) {
                Object obj = Lifecycling.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(Lifecycling.a((Constructor) list.get(0), lifecycleObserver));
                } else {
                    int size = list.size();
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                    for (int i = 0; i < size; i++) {
                        generatedAdapterArr[i] = Lifecycling.a((Constructor) list.get(i), lifecycleObserver);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(lifecycleObserver);
            }
        }
        observerWithState.b = reflectiveGenericLifecycleObserver;
        observerWithState.a = state2;
        if (((ObserverWithState) this.c.c(lifecycleObserver, observerWithState)) != null || (lifecycleOwner = (LifecycleOwner) this.e.get()) == null) {
            return;
        }
        if (this.f != 0 || this.g) {
            z3 = true;
        }
        Lifecycle.State stateD = d(lifecycleObserver);
        this.f++;
        while (observerWithState.a.compareTo(stateD) < 0 && this.c.e.containsKey(lifecycleObserver)) {
            Lifecycle.State state3 = observerWithState.a;
            ArrayList arrayList = this.i;
            arrayList.add(state3);
            Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
            Lifecycle.State state4 = observerWithState.a;
            companion.getClass();
            state4.getClass();
            int iOrdinal = state4.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        event = null;
                    } else {
                        event = Lifecycle.Event.ON_RESUME;
                    }
                } else {
                    event = Lifecycle.Event.ON_START;
                }
            } else {
                event = Lifecycle.Event.ON_CREATE;
            }
            if (event != null) {
                observerWithState.a(lifecycleOwner, event);
                arrayList.remove(arrayList.size() - 1);
                stateD = d(lifecycleObserver);
            } else {
                e32.m(observerWithState.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            i();
        }
        this.f--;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(LifecycleObserver lifecycleObserver) {
        lifecycleObserver.getClass();
        e("removeObserver");
        this.c.d(lifecycleObserver);
    }

    public final void f(Lifecycle.Event event) {
        event.getClass();
        e("handleLifecycleEvent");
        g(event.d());
    }
}
