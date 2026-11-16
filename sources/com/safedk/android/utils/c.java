package com.safedk.android.utils;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class c {
    private static final String a = "GzipUtil";

    /* JADX WARN: Code duplicated, block: B:49:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca A[Catch: IOException -> 0x00c6, TryCatch #4 {IOException -> 0x00c6, blocks: (B:46:0x00c2, B:50:0x00ca, B:52:0x00cf, B:54:0x00d4), top: B:61:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: IOException -> 0x00c6, TryCatch #4 {IOException -> 0x00c6, blocks: (B:46:0x00c2, B:50:0x00ca, B:52:0x00cf, B:54:0x00d4), top: B:61:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4 A[Catch: IOException -> 0x00c6, TRY_LEAVE, TryCatch #4 {IOException -> 0x00c6, blocks: (B:46:0x00c2, B:50:0x00ca, B:52:0x00cf, B:54:0x00d4), top: B:61:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static String a(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        InputStreamReader inputStreamReader;
        ?? bufferedReader;
        ?? r6;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot unzip null or empty bytes");
        }
        Logger.d(a, "unzip started, input size is ", Integer.valueOf(bArr.length));
        if (!c(bArr)) {
            Logger.d(a, "unzip started, input is not compressed");
            return new String(bArr);
        }
        String string = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    inputStreamReader = new InputStreamReader(gZIPInputStream, "UTF-8");
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                            }
                            Logger.d(a, "unzip started, output size is ", Integer.valueOf(sb.length()));
                            string = sb.toString();
                            r6 = bufferedReader;
                        } catch (IOException e) {
                            e = e;
                            Logger.d(a, "Exception in unzip: ", e.getMessage());
                            r6 = bufferedReader;
                        } catch (Throwable th) {
                            th = th;
                            Logger.d(a, "Exception in unzip: ", th.getMessage());
                            r6 = bufferedReader;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = 0;
                    }
                } catch (IOException e3) {
                    e = e3;
                    inputStreamReader = null;
                    bufferedReader = inputStreamReader;
                    Logger.d(a, "Exception in unzip: ", e.getMessage());
                    r6 = bufferedReader;
                    if (r6 != 0) {
                        try {
                            r6.close();
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                        } catch (IOException e4) {
                            Logger.d(a, "Exception in unzip finally block: ", e4.getMessage());
                        }
                    } else {
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    }
                    return string;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                    bufferedReader = inputStreamReader;
                    Logger.d(a, "Exception in unzip: ", th.getMessage());
                    r6 = bufferedReader;
                    if (r6 != 0) {
                        r6.close();
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    } else {
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                        if (byteArrayInputStream != null) {
                            byteArrayInputStream.close();
                        }
                    }
                    return string;
                }
            } catch (IOException e5) {
                e = e5;
                gZIPInputStream = null;
                inputStreamReader = null;
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
                inputStreamReader = null;
            }
        } catch (IOException e6) {
            e = e6;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th5) {
            th = th5;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            inputStreamReader = null;
        }
        if (r6 != 0) {
            r6.close();
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (gZIPInputStream != null) {
                gZIPInputStream.close();
            }
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
        } else {
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (gZIPInputStream != null) {
                gZIPInputStream.close();
            }
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
        }
        return string;
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int[] iArrD = d(bArr2);
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            while (i > 0 && bArr2[i] != bArr[i2]) {
                i = iArrD[i - 1];
            }
            if (bArr2[i] == bArr[i2]) {
                i++;
            }
            if (i == bArr2.length) {
                return (i2 - bArr2.length) + 1;
            }
        }
        return -1;
    }

    private static int[] d(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i = 0;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            while (i > 0 && bArr[i] != bArr[i2]) {
                i = iArr[i - 1];
            }
            if (bArr[i] == bArr[i2]) {
                i++;
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    public static byte[] b(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot unzip null or empty bytes");
        }
        if (!c(bArr)) {
            return bArr;
        }
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, bArr.length * 2));
                try {
                    try {
                        byte[] bArr2 = new byte[8192];
                        while (true) {
                            int i = gZIPInputStream.read(bArr2);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i);
                            th = th;
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (IOException e) {
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e2) {
                                throw th;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    Logger.d(a, "Exception in unzipToBytes: ", e.getMessage());
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e7) {
                        }
                    }
                    return null;
                }
            } catch (IOException e8) {
                e = e8;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (IOException e9) {
            e = e9;
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        }
    }

    public static boolean c(byte[] bArr) {
        return bArr[0] == 31 && bArr[1] == -117;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[SYNTHETIC] */
    public static String a(String str) throws Throwable {
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            try {
                gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrDecode));
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream(Math.max(1024, bArrDecode.length * 2));
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = gZIPInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i);
                        }
                        String str2 = new String(byteArrayOutputStream2.toByteArray(), Charset.forName("UTF-8"));
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e) {
                            }
                        }
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e2) {
                            }
                        }
                        return str2;
                    } catch (IOException e3) {
                        e = e3;
                        Logger.d(a, "First attempt failed, trying double decode: ", e.getMessage());
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e5) {
                            }
                        }
                        byte[] bArrDecode2 = Base64.decode(new String(bArrDecode, Charset.forName("UTF-8")), 0);
                        try {
                            GZIPInputStream gZIPInputStream3 = new GZIPInputStream(new ByteArrayInputStream(bArrDecode2));
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, bArrDecode2.length * 2));
                                try {
                                    byte[] bArr2 = new byte[8192];
                                    while (true) {
                                        int i2 = gZIPInputStream3.read(bArr2);
                                        if (i2 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i2);
                                    }
                                    String str3 = new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8"));
                                    if (gZIPInputStream3 != null) {
                                        try {
                                            gZIPInputStream3.close();
                                        } catch (IOException e6) {
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (IOException e7) {
                                        }
                                    }
                                    if (gZIPInputStream3 != null) {
                                        try {
                                            gZIPInputStream3.close();
                                        } catch (IOException e8) {
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (IOException e9) {
                                        }
                                    }
                                    return str3;
                                } catch (Throwable th) {
                                    th = th;
                                    gZIPInputStream2 = gZIPInputStream3;
                                    if (gZIPInputStream2 != null) {
                                        try {
                                            try {
                                                gZIPInputStream2.close();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                gZIPInputStream = gZIPInputStream2;
                                                if (gZIPInputStream != null) {
                                                    try {
                                                        gZIPInputStream.close();
                                                    } catch (IOException e10) {
                                                    }
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    throw th;
                                                }
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th;
                                                } catch (IOException e11) {
                                                    throw th;
                                                }
                                            }
                                        } catch (IOException e12) {
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e13) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                byteArrayOutputStream = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                        }
                    }
                } catch (IOException e14) {
                    e = e14;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream = null;
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        throw th;
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException e15) {
                e = e15;
                gZIPInputStream = null;
                byteArrayOutputStream2 = null;
            } catch (Throwable th6) {
                th = th6;
                gZIPInputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
