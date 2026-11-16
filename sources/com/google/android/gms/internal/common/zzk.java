package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzk {
    public static Object a(Class cls, String str, zzj... zzjVarArr) {
        int length = zzjVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < zzjVarArr.length; i++) {
            zzj zzjVar = zzjVarArr[i];
            zzjVar.getClass();
            clsArr[i] = zzjVar.a;
            objArr[i] = zzjVarArr[i].b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
