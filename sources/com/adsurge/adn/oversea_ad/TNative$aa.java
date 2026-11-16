package com.adsurge.adn.oversea_ad;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.SparseArray;
import java.lang.reflect.InvocationHandler;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class TNative$aa {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class bb implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static native SparseArray<Object> a209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, Context context, Map<String, String> map, Map<Integer, String> map2, int i);

    public static native SparseArray<Object> b209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, byte[] bArr, Map<String, String> map, int i);

    public static native SparseArray<Object> c209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, Context context);

    public static native SparseArray<Object> d209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, Context context, int i);

    public static native SparseArray<Object> e209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, Context context, Map<String, String> map, int i);

    public static native SparseArray<Object> f209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, byte[] bArr, int i);

    public static native SparseArray<Object> g209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, Context context, Map<String, String> map, int i);

    public static native SparseArray<Object> h209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, Context context, Map<String, String> map, int i);

    public static native SparseArray<Object> i209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, Context context, Map<String, String> map, Object obj, Object obj2, Object obj3);

    public static native String j209406_E8E4F4D4F33FB8BF();

    public static native byte[] k209406_E8E4F4D4F33FB8BF(byte[] bArr);

    public static native void l209406_E8E4F4D4F33FB8BF(InvocationHandler invocationHandler, AtomicReference<Object> atomicReference, ClassLoader classLoader);

    public static native SparseArray<Object> m209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, Context context, Map<String, String> map);

    public static native SparseArray<Object> n209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, byte[] bArr, int i, String str, long j);

    public static native SparseArray<Object> o209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, String str, String str2, byte[] bArr, Map<String, String> map, String str3, byte[] bArr2, byte[] bArr3, byte[] bArr4, String str4);

    public static native SparseArray<Object> p209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native long q1209406_E8E4F4D4F33FB8BF(String str);

    public static native byte[] q2209406_E8E4F4D4F33FB8BF(long j, byte[] bArr, String str);

    public static native byte[] q3209406_E8E4F4D4F33FB8BF(byte[] bArr, byte[] bArr2);

    public static native byte[] q4209406_E8E4F4D4F33FB8BF(byte[] bArr, byte[] bArr2);

    public static native SparseArray<Object> s209406_E8E4F4D4F33FB8BF(SparseArray<Object> sparseArray, byte[] bArr, String str, String str2, int i, int i2, String str3, String str4, byte[] bArr2, Map<String, String> map);
}
