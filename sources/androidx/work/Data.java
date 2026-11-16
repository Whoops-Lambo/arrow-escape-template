package androidx.work;

import android.util.Log;
import defpackage.d10;
import defpackage.e32;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Data {
    public static final String b = Logger.g("Data");
    public static final Data c = new Builder().a();
    public final HashMap a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public final HashMap a = new HashMap();

        public final Data a() throws Throwable {
            Data data = new Data(this.a);
            Data.c(data);
            return data;
        }

        public final void b(String str, Object obj) {
            HashMap map = this.a;
            if (obj == null) {
                map.put(str, null);
                return;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                map.put(str, obj);
                return;
            }
            int i = 0;
            if (cls == boolean[].class) {
                boolean[] zArr = (boolean[]) obj;
                String str2 = Data.b;
                Boolean[] boolArr = new Boolean[zArr.length];
                while (i < zArr.length) {
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                    i++;
                }
                map.put(str, boolArr);
                return;
            }
            if (cls == byte[].class) {
                byte[] bArr = (byte[]) obj;
                String str3 = Data.b;
                Byte[] bArr2 = new Byte[bArr.length];
                while (i < bArr.length) {
                    bArr2[i] = Byte.valueOf(bArr[i]);
                    i++;
                }
                map.put(str, bArr2);
                return;
            }
            if (cls == int[].class) {
                int[] iArr = (int[]) obj;
                String str4 = Data.b;
                Integer[] numArr = new Integer[iArr.length];
                while (i < iArr.length) {
                    numArr[i] = Integer.valueOf(iArr[i]);
                    i++;
                }
                map.put(str, numArr);
                return;
            }
            if (cls == long[].class) {
                long[] jArr = (long[]) obj;
                String str5 = Data.b;
                Long[] lArr = new Long[jArr.length];
                while (i < jArr.length) {
                    lArr[i] = Long.valueOf(jArr[i]);
                    i++;
                }
                map.put(str, lArr);
                return;
            }
            if (cls == float[].class) {
                float[] fArr = (float[]) obj;
                String str6 = Data.b;
                Float[] fArr2 = new Float[fArr.length];
                while (i < fArr.length) {
                    fArr2[i] = Float.valueOf(fArr[i]);
                    i++;
                }
                map.put(str, fArr2);
                return;
            }
            if (cls != double[].class) {
                d10.c("Key ", str, "has invalid type ", cls);
                return;
            }
            double[] dArr = (double[]) obj;
            String str7 = Data.b;
            Double[] dArr2 = new Double[dArr.length];
            while (i < dArr.length) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            map.put(str, dArr2);
        }

        public final void c(HashMap map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && Data.class == obj.getClass()) {
                HashMap map = ((Data) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (setKeySet.equals(map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0034 A[EXC_TOP_SPLITTER, PHI: r8
  0x0034: PHI (r8v11 java.io.ObjectInputStream) = (r8v8 java.io.ObjectInputStream), (r8v13 java.io.ObjectInputStream) binds: [B:31:0x0051, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static Data a(byte[] bArr) throws Throwable {
        Throwable e;
        ObjectInputStream objectInputStream;
        String str = b;
        ?? r4 = 0;
        if (bArr.length > 10240) {
            e32.i("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i = objectInputStream.readInt(); i > 0; i--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                } catch (IOException e2) {
                    e = e2;
                    Log.e(str, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new Data(map);
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    Log.e(str, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new Data(map);
                }
            } catch (IOException e4) {
                e = e4;
                e = e;
                objectInputStream = null;
                Log.e(str, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new Data(map);
            } catch (ClassNotFoundException e5) {
                e = e5;
                e = e;
                objectInputStream = null;
                Log.e(str, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new Data(map);
            } catch (Throwable th) {
                th = th;
                if (r4 != 0) {
                    try {
                        r4.close();
                    } catch (IOException e6) {
                        Log.e(str, "Error in Data#fromByteArray: ", e6);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e7) {
                    Log.e(str, "Error in Data#fromByteArray: ", e7);
                    throw th;
                }
            }
            try {
                objectInputStream.close();
            } catch (IOException e8) {
                Log.e(str, "Error in Data#fromByteArray: ", e8);
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e9) {
                Log.e(str, "Error in Data#fromByteArray: ", e9);
            }
            return new Data(map);
        } catch (Throwable th2) {
            th = th2;
            r4 = bArr;
            if (r4 != 0) {
                r4.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static byte[] c(Data data) throws Throwable {
        String str = b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.a.size());
                    for (Map.Entry entry : data.a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        Log.e(str, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(str, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    e32.i("Data cannot occupy more than 10240 bytes when serialized");
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            Log.e(str, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(str, "Error in Data#toByteArray: ", e5);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(str, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Log.e(str, "Error in Data#toByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e = e8;
        }
    }

    public final String b(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public Data(Data data) {
        this.a = new HashMap(data.a);
    }

    public Data(HashMap map) {
        this.a = new HashMap(map);
    }
}
