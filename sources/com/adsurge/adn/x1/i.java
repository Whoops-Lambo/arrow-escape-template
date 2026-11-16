package com.adsurge.adn.x1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.inmobi.media.core.config.models.AdConfig;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i {
    public static byte[] b(String str) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2;
        InputStream inputStream;
        ZipFile zipFile3 = null;
        try {
            zipFile2 = new ZipFile(str);
            try {
                ZipEntry entry = zipFile2.getEntry("AndroidManifest.xml");
                if (entry == null) {
                    a((Closeable) null);
                    a(zipFile2);
                    return null;
                }
                entry.getSize();
                entry.getCompressedSize();
                inputStream = zipFile2.getInputStream(entry);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, (int) entry.getSize()));
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            a(inputStream);
                            a(zipFile2);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    zipFile3 = inputStream;
                    zipFile = zipFile3;
                    zipFile3 = zipFile2;
                    a((Closeable) zipFile);
                    a(zipFile3);
                    throw th;
                }
            } catch (IOException unused2) {
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused3) {
            zipFile2 = null;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            zipFile = null;
        }
        a(inputStream);
        a(zipFile2);
        return null;
    }

    public static boolean a(byte[] bArr) {
        boolean z;
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        boolean z2 = false;
        int i = 8;
        if (byteBufferOrder.remaining() < 8) {
            int length = bArr.length;
            return false;
        }
        short s = 65535;
        int i2 = byteBufferOrder.getShort() & 65535;
        int i3 = byteBufferOrder.getShort() & 65535;
        int i4 = byteBufferOrder.getInt();
        if (i2 != 3 || i3 < 8 || i4 <= 0 || i4 > bArr.length) {
            int length2 = bArr.length;
            return false;
        }
        byteBufferOrder.position(i3);
        ArrayDeque arrayDeque = new ArrayDeque();
        String[] strArrA = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean zA = false;
        while (true) {
            if (byteBufferOrder.remaining() >= i) {
                int iPosition = byteBufferOrder.position();
                int i5 = byteBufferOrder.getShort() & s;
                int i6 = byteBufferOrder.getShort() & s;
                int i7 = byteBufferOrder.getInt();
                if (i7 > 0) {
                    int i8 = iPosition + i7;
                    z = z2;
                    if (i8 > bArr.length) {
                        break;
                    }
                    if (i5 == 1) {
                        strArrA = a(byteBufferOrder, iPosition, i6, i7);
                    } else if (i5 == 258 && strArrA != null) {
                        int i9 = iPosition + i6;
                        byteBufferOrder.position(i9);
                        byteBufferOrder.getInt();
                        int i10 = byteBufferOrder.getInt();
                        int i11 = byteBufferOrder.getShort() & s;
                        int i12 = byteBufferOrder.getShort() & s;
                        int i13 = byteBufferOrder.getShort() & s;
                        byteBufferOrder.getShort();
                        byteBufferOrder.getShort();
                        byteBufferOrder.getShort();
                        String strA = a(strArrA, i10);
                        arrayDeque.push(strA == null ? "" : strA);
                        if ("queries".equals(strA) || "intent".equals(strA)) {
                            zA = a(arrayDeque);
                            String.valueOf(zA);
                            arrayDeque.size();
                        }
                        if (zA && ("action".equals(strA) || "category".equals(strA))) {
                            String strA2 = a(byteBufferOrder, i9 + i11, i13, i12, strArrA);
                            if ("action".equals(strA) && "android.intent.action.MAIN".equals(strA2)) {
                                z3 = true;
                            } else if ("category".equals(strA) && "android.intent.category.LAUNCHER".equals(strA2)) {
                                z4 = true;
                            }
                            if (z3 && z4) {
                                return true;
                            }
                        }
                    } else if (i5 == 259) {
                        if (!arrayDeque.isEmpty()) {
                            arrayDeque.pop();
                        }
                        zA = a(arrayDeque);
                    }
                    byteBufferOrder.position(i8);
                    z2 = z;
                    i = 8;
                    s = 65535;
                }
            }
            z = z2;
            break;
        }
        String.valueOf(z3);
        String.valueOf(z4);
        if (z3 && z4) {
            return true;
        }
        return z;
    }

    public static int c(Context context) {
        if (Build.VERSION.SDK_INT < 30) {
            return 3;
        }
        if (context.getApplicationInfo().targetSdkVersion < 30) {
            return 4;
        }
        if (k.b(context)) {
            return 5;
        }
        return b(context) ? 1 : 2;
    }

    public static boolean b(Context context) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && applicationInfo.sourceDir != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(applicationInfo.sourceDir);
            String[] strArr = applicationInfo.splitSourceDirs;
            if (strArr != null) {
                for (String str : strArr) {
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
            arrayList.size();
            arrayList.size();
            int i = 0;
            while (i < arrayList.size()) {
                String str2 = (String) arrayList.get(i);
                i++;
                arrayList.size();
                if (a(str2)) {
                    z = true;
                    break;
                }
            }
            System.currentTimeMillis();
            System.currentTimeMillis();
            String.valueOf(z);
        }
        return z;
    }

    public static String b(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(i);
        a(byteBuffer);
        int iA = a(byteBuffer);
        if (iA > 0 && byteBuffer.position() + iA <= byteBuffer.limit()) {
            byte[] bArr = new byte[iA];
            byteBuffer.get(bArr);
            try {
                return new String(bArr, "UTF-8");
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static boolean a(String str) throws Throwable {
        byte[] bArrB = b(str);
        if (bArrB == null) {
            return false;
        }
        try {
            return a(bArrB);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static JSONObject a(Context context) {
        com.adsurge.adn.I0.e eVar = new com.adsurge.adn.I0.e();
        try {
            eVar.a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, c(context));
        } catch (Throwable th) {
            eVar.a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
            eVar.a("err_msg", th.toString());
            eVar.a("err_stack", Log.getStackTraceString(th));
        }
        return eVar.a();
    }

    public static boolean a(Deque deque) {
        if (deque.size() < 2) {
            return false;
        }
        Iterator it = deque.iterator();
        return "intent".equals((String) it.next()) && "queries".equals((String) it.next());
    }

    public static String a(ByteBuffer byteBuffer, int i, int i2, int i3, String[] strArr) {
        String strA;
        String strA2;
        int iPosition = byteBuffer.position();
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (i4 * i3) + i;
            try {
                if (i5 + i3 > byteBuffer.limit()) {
                    byteBuffer.position(iPosition);
                    return null;
                }
                byteBuffer.position(i5);
                byteBuffer.getInt();
                int i6 = byteBuffer.getInt();
                byteBuffer.getShort();
                byteBuffer.get();
                int i7 = byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i8 = byteBuffer.getInt();
                if ("name".equals(a(strArr, i6))) {
                    if (i7 == 3 && (strA2 = a(strArr, i8)) != null) {
                        byteBuffer.position(iPosition);
                        return strA2;
                    }
                    int i9 = byteBuffer.getInt();
                    if (i9 != -1 && i9 >= 0 && (strA = a(strArr, i9)) != null) {
                        byteBuffer.position(iPosition);
                        return strA;
                    }
                    String strA3 = a(strArr, i8);
                    byteBuffer.position(iPosition);
                    return strA3;
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                throw th;
            }
        }
        byteBuffer.position(iPosition);
        return null;
    }

    public static String[] a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byteBuffer.position(i + 8);
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        byteBuffer.getInt();
        boolean z = (i5 & 256) != 0;
        if (i4 >= 0 && i4 <= 200000) {
            int i7 = i2 + i;
            int i8 = i6 + i;
            int i9 = i + i3;
            if (i7 >= 0 && i8 >= 0) {
                if ((((long) i4) * 4) + ((long) i7) <= i9 && i8 <= i9) {
                    String[] strArr = new String[i4];
                    for (int i10 = 0; i10 < i4; i10++) {
                        byteBuffer.position((i10 * 4) + i7);
                        int i11 = byteBuffer.getInt() + i8;
                        if (i11 >= 0 && i11 < i9) {
                            strArr[i10] = z ? b(byteBuffer, i11) : a(byteBuffer, i11);
                        } else {
                            strArr[i10] = "";
                        }
                    }
                    return strArr;
                }
            }
        }
        return null;
    }

    public static String a(ByteBuffer byteBuffer, int i) {
        byteBuffer.position(i);
        short s = byteBuffer.getShort();
        int i2 = s & 65535;
        if ((Short.MIN_VALUE & s) != 0) {
            i2 = ((s & Short.MAX_VALUE) << 16) | (65535 & byteBuffer.getShort());
        }
        if (i2 > 0) {
            if ((i2 * 2) + byteBuffer.position() <= byteBuffer.limit()) {
                char[] cArr = new char[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    cArr[i3] = byteBuffer.getChar();
                }
                return new String(cArr);
            }
            return "";
        }
        return "";
    }

    public static int a(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        return (b & 128) != 0 ? (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((b & 127) << 8) : b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public static String a(String[] strArr, int i) {
        if (strArr == null || i < 0 || i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (Throwable unused) {
        }
    }
}
