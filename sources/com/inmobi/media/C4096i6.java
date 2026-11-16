package com.inmobi.media;

import com.ironsource.C4664b4;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import defpackage.dr0;
import defpackage.dt1;
import defpackage.qh1;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4096i6 implements Closeable {
    public static final Pattern p = Pattern.compile("[a-z0-9_-]{1,64}");
    public static final C3901b6 q = new C3901b6();
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final InterfaceC4040g6 g;
    public final long j;
    public BufferedWriter l;
    public int m;
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final LinkedHashMap i = new LinkedHashMap(0, 0.75f, true);
    public long k = 0;
    public long n = 0;
    public final CallableC3929c6 o = new CallableC3929c6(this);
    public final int f = 1;
    public final int h = 2;

    public final synchronized void a(C3984e6 c3984e6, boolean z) {
        int i;
        C4012f6 c4012f6 = c3984e6.a;
        if (c4012f6.d != c3984e6) {
            throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
        }
        if (z && !c4012f6.c) {
            for (int i2 = 0; i2 < this.h; i2++) {
                if (!c3984e6.b[i2]) {
                    c3984e6.d.a(c3984e6, false);
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!c4012f6.b(i2).exists()) {
                    c3984e6.d.a(c3984e6, false);
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.h; i3++) {
            File fileB = c4012f6.b(i3);
            if (z) {
                if (fileB.exists()) {
                    File fileA = c4012f6.a(i3);
                    fileB.renameTo(fileA);
                    long j = c4012f6.b[i3];
                    long length = fileA.length();
                    c4012f6.b[i3] = length;
                    this.k = (this.k - j) + length;
                }
            } else if (fileB.exists() && !fileB.delete()) {
                throw new IOException();
            }
        }
        this.m++;
        c4012f6.d = null;
        if (c4012f6.c || z) {
            c4012f6.c = true;
            BufferedWriter bufferedWriter = this.l;
            StringBuilder sb = new StringBuilder("CLEAN ");
            sb.append(c4012f6.a);
            StringBuilder sb2 = new StringBuilder();
            for (long j2 : c4012f6.b) {
                sb2.append(' ');
                sb2.append(j2);
            }
            sb.append(sb2.toString());
            sb.append('\n');
            bufferedWriter.write(sb.toString());
            if (z) {
                this.n++;
            }
        } else {
            this.i.remove(c4012f6.a);
            this.l.write("REMOVE " + c4012f6.a + '\n');
        }
        this.l.flush();
        if (this.k > this.j || ((i = this.m) >= 2000 && i >= this.i.size())) {
            this.a.submit(this.o);
        }
    }

    public final synchronized C4068h6 b(String str) {
        InputStream inputStream;
        if (this.l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        C4012f6 c4012f6 = (C4012f6) this.i.get(str);
        if (c4012f6 == null) {
            return null;
        }
        if (!c4012f6.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.h];
        for (int i = 0; i < this.h; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(c4012f6.a(i));
            } catch (FileNotFoundException unused) {
                if (this.g != null) {
                    str.getClass();
                    LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("urlKey", str));
                    C4111im c4111im = C4111im.a;
                    C4111im.b("ResourceDiskCacheFileMissing", linkedHashMapZ, EnumC4223mm.SDK);
                }
                for (int i2 = 0; i2 < this.h && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    AbstractC4252nn.a(inputStream);
                }
                return null;
            }
        }
        this.m++;
        this.l.append((CharSequence) ("READ " + str + '\n'));
        int i3 = this.m;
        if (i3 >= 2000 && i3 >= this.i.size()) {
            this.a.submit(this.o);
        }
        return new C4068h6(inputStreamArr);
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.l;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(InMobiFilesBridge.fileOutputStreamCtor(this.d), AbstractC4252nn.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C4012f6 c4012f6 : this.i.values()) {
                    if (c4012f6.d != null) {
                        bufferedWriter2.write("DIRTY " + c4012f6.a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(c4012f6.a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j : c4012f6.b) {
                            sb2.append(' ');
                            sb2.append(j);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.c.exists()) {
                    File file = this.c;
                    File file2 = this.e;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.d.renameTo(this.c)) {
                    throw new IOException();
                }
                this.e.delete();
                this.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), AbstractC4252nn.a));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.l == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.i.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C3984e6 c3984e6 = ((C4012f6) obj).d;
                if (c3984e6 != null) {
                    c3984e6.d.a(c3984e6, false);
                }
            }
            while (this.k > this.j) {
                d((String) ((Map.Entry) this.i.entrySet().iterator().next()).getKey());
            }
            this.l.close();
            this.l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(String str) {
        if (this.l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        C4012f6 c4012f6 = (C4012f6) this.i.get(str);
        if (c4012f6 != null && c4012f6.d == null) {
            for (int i = 0; i < this.h; i++) {
                File fileA = c4012f6.a(i);
                if (this.g != null) {
                    fileA.getClass();
                    if (str != null && i == 0) {
                        String str2 = "";
                        try {
                            String strA = AbstractC4252nn.a(new InputStreamReader(new FileInputStream(fileA), AbstractC4252nn.b));
                            strA.getClass();
                            str2 = strA;
                        } catch (Exception unused) {
                        }
                        LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("urlKey", str), new dt1("url", str2));
                        C4111im c4111im = C4111im.a;
                        C4111im.b("ResourceDiskCacheFileEvicted", linkedHashMapZ, EnumC4223mm.SDK);
                    }
                }
                if (fileA.exists() && !fileA.delete()) {
                    throw new IOException("failed to delete " + fileA);
                }
                long j = this.k;
                long[] jArr = c4012f6.b;
                this.k = j - jArr[i];
                jArr[i] = 0;
            }
            this.m++;
            this.l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.i.remove(str);
            int i2 = this.m;
            if (i2 >= 2000 && i2 >= this.i.size()) {
                this.a.submit(this.o);
            }
        }
    }

    public C4096i6(File file, long j, InterfaceC4040g6 interfaceC4040g6) {
        this.b = file;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.j = j;
        this.g = interfaceC4040g6;
    }

    public final void b() {
        C4361rl c4361rl = new C4361rl(new FileInputStream(this.c), AbstractC4252nn.a);
        try {
            String strA = c4361rl.a();
            String strA2 = c4361rl.a();
            String strA3 = c4361rl.a();
            String strA4 = c4361rl.a();
            String strA5 = c4361rl.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f).equals(strA3) || !Integer.toString(this.h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C4664b4.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    c(c4361rl.a());
                    i++;
                } catch (EOFException unused) {
                    this.m = i - this.i.size();
                    AbstractC4252nn.a(c4361rl);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC4252nn.a(c4361rl);
            throw th;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.i.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i, iIndexOf2);
            }
            C4012f6 c4012f6 = (C4012f6) this.i.get(strSubstring);
            if (c4012f6 == null) {
                c4012f6 = new C4012f6(this, strSubstring);
                this.i.put(strSubstring, c4012f6);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                c4012f6.c = true;
                c4012f6.d = null;
                if (strArrSplit.length == c4012f6.e.h) {
                    for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                        try {
                            c4012f6.b[i2] = Long.parseLong(strArrSplit[i2]);
                        } catch (NumberFormatException unused) {
                            io.p071bidmachine.media3.extractor.ts.y.i(Arrays.toString(strArrSplit), "unexpected journal line: ");
                            return;
                        }
                    }
                    return;
                }
                io.p071bidmachine.media3.extractor.ts.y.i(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c4012f6.d = new C3984e6(this, c4012f6);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                dr0.h("unexpected journal line: ".concat(str));
                return;
            }
        }
        dr0.h("unexpected journal line: ".concat(str));
    }

    public final C3984e6 a(String str) {
        synchronized (this) {
            try {
                if (this.l != null) {
                    if (p.matcher(str).matches()) {
                        C4012f6 c4012f6 = (C4012f6) this.i.get(str);
                        if (c4012f6 == null) {
                            c4012f6 = new C4012f6(this, str);
                            this.i.put(str, c4012f6);
                        } else if (c4012f6.d != null) {
                            return null;
                        }
                        C3984e6 c3984e6 = new C3984e6(this, c4012f6);
                        c4012f6.d = c3984e6;
                        this.l.write("DIRTY " + str + '\n');
                        this.l.flush();
                        return c3984e6;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() throws IOException {
        File file = this.d;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            C4012f6 c4012f6 = (C4012f6) it.next();
            int i = 0;
            if (c4012f6.d == null) {
                while (i < this.h) {
                    this.k += c4012f6.b[i];
                    i++;
                }
            } else {
                c4012f6.d = null;
                while (i < this.h) {
                    File fileA = c4012f6.a(i);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = c4012f6.b(i);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }
}
