package androidx.lifecycle;

import defpackage.d;
import defpackage.dr0;
import defpackage.vq2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
final class ClassesInfoCache {
    public static final ClassesInfoCache c = new ClassesInfoCache();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public static class CallbackInfo {
        public final HashMap a = new HashMap();
        public final HashMap b;

        public static void a(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    MethodReference methodReference = (MethodReference) list.get(size);
                    Method method = methodReference.b;
                    try {
                        int i = methodReference.a;
                        if (i == 0) {
                            method.invoke(obj, null);
                        } else if (i == 1) {
                            method.invoke(obj, lifecycleOwner);
                        } else if (i == 2) {
                            method.invoke(obj, lifecycleOwner, event);
                        }
                    } catch (IllegalAccessException e) {
                        dr0.m(e);
                        return;
                    } catch (InvocationTargetException e2) {
                        vq2.n("Failed to call observer method", e2.getCause());
                        return;
                    }
                }
            }
        }

        public CallbackInfo(HashMap map) {
            this.b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.a.put(event, arrayList);
                }
                arrayList.add((MethodReference) entry.getKey());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public static final class MethodReference {
        public final int a;
        public final Method b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.a == methodReference.a && this.b.getName().equals(methodReference.b.getName());
        }

        public final int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }

        public MethodReference(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }
    }

    public static void b(HashMap map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(methodReference);
        if (event2 != null && event != event2) {
            throw new IllegalArgumentException("Method " + methodReference.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        }
        if (event2 == null) {
            map.put(methodReference, event);
        }
    }

    public final CallbackInfo a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            CallbackInfo callbackInfoA = (CallbackInfo) map2.get(superclass);
            if (callbackInfoA == null) {
                callbackInfoA = a(superclass, null);
            }
            map.putAll(callbackInfoA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            CallbackInfo callbackInfoA2 = (CallbackInfo) map2.get(cls2);
            if (callbackInfoA2 == null) {
                callbackInfoA2 = a(cls2, null);
            }
            for (Map.Entry entry : callbackInfoA2.b.entrySet()) {
                b(map, (MethodReference) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        d.r("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                Lifecycle.Event eventValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        if (eventValue == Lifecycle.Event.ON_ANY) {
                            i = 2;
                        } else {
                            d.r("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        d.r("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(map, new MethodReference(i, method), eventValue, cls);
                    z = true;
                } else {
                    d.r("cannot have more than 2 params");
                    return null;
                }
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(map);
        map2.put(cls, callbackInfo);
        this.b.put(cls, Boolean.valueOf(z));
        return callbackInfo;
    }
}
