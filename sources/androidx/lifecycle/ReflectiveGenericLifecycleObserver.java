package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    public final Object a;
    public final ClassesInfoCache.CallbackInfo b;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        HashMap map = this.b.a;
        List list = (List) map.get(event);
        Object obj = this.a;
        ClassesInfoCache.CallbackInfo.a(list, lifecycleOwner, event, obj);
        ClassesInfoCache.CallbackInfo.a((List) map.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
    }

    public ReflectiveGenericLifecycleObserver(LifecycleObserver lifecycleObserver) {
        this.a = lifecycleObserver;
        ClassesInfoCache classesInfoCache = ClassesInfoCache.c;
        Class<?> cls = lifecycleObserver.getClass();
        ClassesInfoCache.CallbackInfo callbackInfo = (ClassesInfoCache.CallbackInfo) classesInfoCache.a.get(cls);
        this.b = callbackInfo == null ? classesInfoCache.a(cls, null) : callbackInfo;
    }
}
