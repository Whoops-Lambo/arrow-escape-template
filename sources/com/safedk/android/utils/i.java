package com.safedk.android.utils;

import android.util.Base64;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class i {
    private static final String a = "SerializingUtils";

    public static String a(Object obj) {
        Closeable closeable;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        String str = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            synchronized (obj) {
                                objectOutputStream.writeObject(obj);
                            }
                            objectOutputStream.flush();
                            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            try {
                                n.a((Closeable) objectOutputStream);
                                n.a((Closeable) byteArrayOutputStream);
                                return strEncodeToString;
                            } catch (Throwable th) {
                                th = th;
                                str = strEncodeToString;
                                Logger.d(a, "failed during serializing object : ", th.getMessage(), " for object : ", obj, th);
                                new CrashReporter().caughtException(th);
                                return str;
                            }
                        } catch (IOException e) {
                            e = e;
                            Logger.d(a, "failed during serialization object: ", obj, " : ", e.getMessage(), e);
                            n.a((Closeable) objectOutputStream);
                            n.a((Closeable) byteArrayOutputStream);
                            return null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        objectOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = null;
                        n.a(closeable);
                        n.a((Closeable) byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    byteArrayOutputStream = null;
                    objectOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    closeable = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static Object a(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream2.readObject();
                    n.a((Closeable) objectInputStream2);
                    n.a((Closeable) byteArrayInputStream);
                    return object;
                } catch (Throwable th) {
                    objectInputStream = objectInputStream2;
                    th = th;
                    n.a((Closeable) objectInputStream);
                    n.a((Closeable) byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
        }
    }
}
