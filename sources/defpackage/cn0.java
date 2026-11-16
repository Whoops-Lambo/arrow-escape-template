package defpackage;

import com.singular.sdk.internal.UserDetailsUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class cn0 extends h00 {
    public static final rm0 B(rm0 rm0Var) {
        File file = rm0Var.a;
        List<File> list = rm0Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!s71.b(name, UserDetailsUtils.UserDetailsLiterals.DOT)) {
                if (!s71.b(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || s71.b(((File) du.h0(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        return new rm0(file, arrayList);
    }

    public static String C(File file) throws IOException {
        Charset charset = er.a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strQ = h00.q(inputStreamReader);
            inputStreamReader.close();
            return strQ;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nq2.e(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static File D(File file, String str) {
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        if (h00.j(path) > 0) {
            return file2;
        }
        String string = file.toString();
        string.getClass();
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (!dk2.R(string, c)) {
                return new File(string + c + file2);
            }
        }
        return new File(string + file2);
    }

    public static void G(File file, String str) throws IOException {
        Charset charset = er.a;
        file.getClass();
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            H(fileOutputStream, str, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nq2.e(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static String A(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return dk2.r0('.', name, "");
    }

    public static final String E(File file, File file2) {
        String string;
        rm0 rm0VarB = B(h00.u(file));
        List list = rm0VarB.b;
        rm0 rm0VarB2 = B(h00.u(file2));
        List list2 = rm0VarB2.b;
        if (!rm0VarB.a.equals(rm0VarB2.a)) {
            string = null;
        } else {
            int size = list2.size();
            int size2 = list.size();
            int iMin = Math.min(size2, size);
            int i = 0;
            while (i < iMin && s71.b(list.get(i), list2.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (true) {
                    if (s71.b(((File) list2.get(i2)).getName(), "..")) {
                        string = null;
                    } else {
                        sb.append("..");
                        if (i2 != i) {
                            sb.append(File.separatorChar);
                        }
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
            }
            if (i < size2) {
                if (i < size) {
                    sb.append(File.separatorChar);
                }
                List listW = du.W(list, i);
                String str = File.separator;
                str.getClass();
                du.f0(listW, sb, str, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            }
            string = sb.toString();
        }
        if (string != null) {
            return string;
        }
        wb0.c(46, file, " and ", file2, "this and base files have different roots: ");
        return null;
    }

    public static final an0 F(File file, bn0 bn0Var) {
        file.getClass();
        return new an0(file, bn0Var, (dn0) null);
    }

    public static final void H(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        boolean z;
        str.getClass();
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (i3 == str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, z).isUnderflow()) {
                fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
                if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                    charBufferAllocate.put(0, charBufferAllocate.get());
                } else {
                    i2 = 0;
                }
                charBufferAllocate.clear();
                byteBufferAllocate.clear();
                i = i3;
            } else {
                e32.i("Check failed.");
                return;
            }
        }
    }

    public static void y(File file, File file2) throws IOException {
        file2.getClass();
        if (file.exists()) {
            if (file2.exists() && !file2.delete()) {
                throw new im0(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return;
                } else {
                    throw new tm0(file, file2, "Failed to create target directory.");
                }
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    h00.g(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        nq2.e(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    nq2.e(fileInputStream, th3);
                    throw th4;
                }
            }
        }
        throw new yq1(file, null, "The source file doesn't exist.", 2, null);
    }

    public static boolean z(File file) {
        file.getClass();
        ym0 ym0Var = new ym0(new an0(file, bn0.b, (dn0) null));
        while (true) {
            boolean z = true;
            while (ym0Var.hasNext()) {
                File file2 = (File) ym0Var.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }
}
