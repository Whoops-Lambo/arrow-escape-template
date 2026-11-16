package com.adsurge.adn.p042m1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public final InputStream a;
    public final File b;
    public final c c;
    public String d;
    public AtomicBoolean e = new AtomicBoolean(false);

    public abstract int a(FileOutputStream fileOutputStream);

    /* JADX INFO: renamed from: com.adsurge.adn.m1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0122a extends IOException {
        public C0122a(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b extends IOException {
        public b(IOException iOException) {
            super(iOException);
        }
    }

    public int a() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.b, true);
            try {
                return a(fileOutputStream);
            } catch (IOException e) {
                this.d = "UnknowIOExceptionWhileDoPartitionRW:" + e.getMessage();
                try {
                    return 2;
                } catch (Throwable unused) {
                    return 2;
                }
            } catch (SocketException e2) {
                this.d = "UnknowSocketExceptionWhileDoPartitionRW:" + e2.getMessage();
                try {
                    return 4194304;
                } catch (Throwable unused2) {
                    return 4194304;
                }
            } catch (SocketTimeoutException e3) {
                this.d = "SocketTimeoutExceptionWhileDoPartitionRW:" + e3.getMessage();
                try {
                    return 16777216;
                } catch (Throwable unused3) {
                    return 16777216;
                }
            } catch (C0122a e4) {
                this.d = "ReadIOExceptionWhileDoPartitionRW:" + e4.getMessage();
                try {
                    return 524288;
                } catch (Throwable unused4) {
                    return 524288;
                }
            } catch (b e5) {
                this.d = "WriteIOExceptionWhileDoPartitionRW:" + e5.getMessage();
                return 512;
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused5) {
                }
            }
        } catch (IOException e6) {
            this.d = "UnKnownExceptionWhileCreateOutputStreamForPartitionFile:" + e6.getMessage();
            return 512;
        }
    }

    public String b() {
        return this.d;
    }

    public a(InputStream inputStream, File file, c cVar) {
        this.a = inputStream;
        this.b = file;
        this.c = cVar;
    }
}
