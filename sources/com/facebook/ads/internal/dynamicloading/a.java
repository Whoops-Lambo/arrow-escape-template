package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements InvocationHandler {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ HashMap e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ Method h;
    public final /* synthetic */ Method i;

    public a(ArrayList arrayList, HashMap map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
        this.a = arrayList;
        this.b = map;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = map2;
        this.f = arrayList4;
        this.g = arrayList5;
        this.h = method;
        this.i = method2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object objNewProxyInstance;
        HashMap map;
        boolean zIsPrimitive = method.getReturnType().isPrimitive();
        HashMap map2 = this.b;
        int i = 0;
        if (zIsPrimitive) {
            if (method.getReturnType().equals(Void.TYPE)) {
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (DynamicLoaderFallback.equalsMethods(method, (Method) obj2) && DynamicLoaderFallback.reportError(obj, map2)) {
                        break;
                    }
                }
                ArrayList arrayList2 = this.c;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    if (DynamicLoaderFallback.equalsMethods(method, (Method) obj3) && DynamicLoaderFallback.reportError(obj, map2)) {
                        return null;
                    }
                }
                return null;
            }
            return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
        }
        if (method.getReturnType().equals(String.class)) {
            return "";
        }
        if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
            objNewProxyInstance = obj;
        } else {
            objNewProxyInstance = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (true) {
            map = this.e;
            if (i3 >= size3) {
                break;
            }
            Object obj4 = arrayList3.get(i3);
            i3++;
            if (DynamicLoaderFallback.equalsMethods(method, (Method) obj4)) {
                DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map.get(obj), (AdListener) objArr[0]);
                break;
            }
        }
        ArrayList arrayList4 = this.f;
        int size4 = arrayList4.size();
        int i4 = 0;
        while (i4 < size4) {
            Object obj5 = arrayList4.get(i4);
            i4++;
            if (DynamicLoaderFallback.equalsMethods(method, (Method) obj5)) {
                map.put(objNewProxyInstance, obj);
            }
        }
        ArrayList arrayList5 = this.g;
        int size5 = arrayList5.size();
        int i5 = 0;
        while (i5 < size5) {
            Object obj6 = arrayList5.get(i5);
            i5++;
            if (DynamicLoaderFallback.equalsMethods(method, (Method) obj6)) {
                for (Object obj7 : objArr) {
                    if (obj7 instanceof Ad) {
                        map2.put(objNewProxyInstance, (Ad) obj7);
                    }
                }
            }
        }
        if (DynamicLoaderFallback.equalsMethods(method, this.h)) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        if (DynamicLoaderFallback.equalsMethods(method, this.i)) {
            map2.put(objArr[1], (Ad) objArr[0]);
        }
        return objNewProxyInstance;
    }
}
