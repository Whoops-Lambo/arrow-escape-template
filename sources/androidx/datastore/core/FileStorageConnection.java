package androidx.datastore.core;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.as0;
import defpackage.az2;
import defpackage.dr0;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.l7;
import defpackage.n30;
import defpackage.pp1;
import defpackage.sr0;
import defpackage.wz2;
import defpackage.zr0;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/StorageConnection;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileStorageConnection<T> implements StorageConnection<T> {
    public final File a;
    public final Serializer b;
    public final InterProcessCoordinator c;
    public final sr0 d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final pp1 f;

    /* JADX WARN: Code duplicated, block: B:43:0x00d3 A[Catch: all -> 0x010e, IOException -> 0x0110, TRY_ENTER, TryCatch #4 {IOException -> 0x0110, blocks: (B:43:0x00d3, B:45:0x00d9, B:47:0x00e1, B:51:0x00ed, B:52:0x010d, B:48:0x00e6, B:59:0x011b, B:66:0x0128, B:65:0x0125), top: B:84:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9 A[Catch: all -> 0x010e, IOException -> 0x0110, TryCatch #4 {IOException -> 0x0110, blocks: (B:43:0x00d3, B:45:0x00d9, B:47:0x00e1, B:51:0x00ed, B:52:0x010d, B:48:0x00e6, B:59:0x011b, B:66:0x0128, B:65:0x0125), top: B:84:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1 A[Catch: all -> 0x010e, IOException -> 0x0110, TryCatch #4 {IOException -> 0x0110, blocks: (B:43:0x00d3, B:45:0x00d9, B:47:0x00e1, B:51:0x00ed, B:52:0x010d, B:48:0x00e6, B:59:0x011b, B:66:0x0128, B:65:0x0125), top: B:84:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6 A[Catch: all -> 0x010e, IOException -> 0x0110, TryCatch #4 {IOException -> 0x0110, blocks: (B:43:0x00d3, B:45:0x00d9, B:47:0x00e1, B:51:0x00ed, B:52:0x010d, B:48:0x00e6, B:59:0x011b, B:66:0x0128, B:65:0x0125), top: B:84:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed A[Catch: all -> 0x010e, IOException -> 0x0110, TryCatch #4 {IOException -> 0x0110, blocks: (B:43:0x00d3, B:45:0x00d9, B:47:0x00e1, B:51:0x00ed, B:52:0x010d, B:48:0x00e6, B:59:0x011b, B:66:0x0128, B:65:0x0125), top: B:84:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011b A[Catch: all -> 0x010e, IOException -> 0x0110, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0110, blocks: (B:43:0x00d3, B:45:0x00d9, B:47:0x00e1, B:51:0x00ed, B:52:0x010d, B:48:0x00e6, B:59:0x011b, B:66:0x0128, B:65:0x0125), top: B:84:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00ed, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.core.StorageConnection
    public final Object a(zr0 zr0Var, fy fyVar) throws IOException {
        FileStorageConnection$writeScope$1 fileStorageConnection$writeScope$1;
        File file;
        Mutex mutex;
        FileWriteScope fileWriteScope;
        Throwable th;
        FileWriteScope fileWriteScope2;
        FileStorageConnection<T> fileStorageConnection;
        File file2;
        File file3;
        boolean zRenameTo;
        if (fyVar instanceof FileStorageConnection$writeScope$1) {
            fileStorageConnection$writeScope$1 = (FileStorageConnection$writeScope$1) fyVar;
            int i = fileStorageConnection$writeScope$1.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                fileStorageConnection$writeScope$1.x = i - Integer.MIN_VALUE;
            } else {
                fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, fyVar);
            }
        } else {
            fileStorageConnection$writeScope$1 = new FileStorageConnection$writeScope$1(this, fyVar);
        }
        Object obj = fileStorageConnection$writeScope$1.v;
        int i2 = fileStorageConnection$writeScope$1.x;
        dz dzVar = dz.a;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            wz2.a0(obj);
                            if (this.e.get()) {
                                e32.i("StorageConnection has already been disposed.");
                                return null;
                            }
                            File file4 = this.a;
                            File parentFile = file4.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    dr0.h(n30.j(file4, "Unable to create parent directories of "));
                                    return null;
                                }
                            }
                            fileStorageConnection$writeScope$1.r = this;
                            fileStorageConnection$writeScope$1.s = zr0Var;
                            pp1 pp1Var = this.f;
                            fileStorageConnection$writeScope$1.t = pp1Var;
                            fileStorageConnection$writeScope$1.x = 1;
                            if (pp1Var.e(fileStorageConnection$writeScope$1) != dzVar) {
                                mutex = pp1Var;
                            }
                            return dzVar;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                e32.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileWriteScope2 = fileStorageConnection$writeScope$1.u;
                            File file5 = (File) fileStorageConnection$writeScope$1.t;
                            mutex = (Mutex) fileStorageConnection$writeScope$1.s;
                            fileStorageConnection = fileStorageConnection$writeScope$1.r;
                            try {
                                wz2.a0(obj);
                                file2 = file5;
                                try {
                                    fileWriteScope2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    file3 = fileStorageConnection.a;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = Api26Impl.a(file2, file3);
                                    } else {
                                        zRenameTo = file2.renameTo(file3);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                ((pp1) mutex).g(null);
                                return az2.a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    fileWriteScope2.close();
                                } catch (Throwable th4) {
                                    l7.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        Mutex mutex2 = (Mutex) fileStorageConnection$writeScope$1.t;
                        zr0Var = (zr0) fileStorageConnection$writeScope$1.s;
                        FileStorageConnection<T> fileStorageConnection2 = fileStorageConnection$writeScope$1.r;
                        wz2.a0(obj);
                        mutex = mutex2;
                        this = fileStorageConnection2;
                        fileStorageConnection$writeScope$1.r = this;
                        fileStorageConnection$writeScope$1.s = mutex;
                        fileStorageConnection$writeScope$1.t = file;
                        fileStorageConnection$writeScope$1.u = fileWriteScope;
                        fileStorageConnection$writeScope$1.x = 2;
                        if (zr0Var.invoke(fileWriteScope, fileStorageConnection$writeScope$1) != dzVar) {
                            fileStorageConnection = this;
                            file2 = file;
                            fileWriteScope2 = fileWriteScope;
                            fileWriteScope2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                file3 = fileStorageConnection.a;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = Api26Impl.a(file2, file3);
                                } else {
                                    zRenameTo = file2.renameTo(file3);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            ((pp1) mutex).g(null);
                            return az2.a;
                        }
                        return dzVar;
                    } catch (Throwable th5) {
                        th = th5;
                        fileWriteScope2 = fileWriteScope;
                        fileWriteScope2.close();
                        throw th;
                    }
                    Serializer serializer = this.b;
                    serializer.getClass();
                    fileWriteScope = new FileWriteScope(file, serializer);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                ((pp1) mutex).g(null);
                throw th6;
            }
        } catch (IOException e2) {
            e = e2;
            file = zr0Var;
        }
    }

    @Override // androidx.datastore.core.StorageConnection
    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterProcessCoordinator getC() {
        return this.c;
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.e.set(true);
        ((FileStorage$createConnection$2) this.d).invoke();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:60:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.datastore.core.StorageConnection
    public final Object d(as0 as0Var, fy fyVar) throws Throwable {
        FileStorageConnection$readScope$1 fileStorageConnection$readScope$1;
        Throwable th;
        FileReadScope fileReadScope;
        FileStorageConnection<T> fileStorageConnection;
        boolean z;
        ?? r9;
        if (fyVar instanceof FileStorageConnection$readScope$1) {
            fileStorageConnection$readScope$1 = (FileStorageConnection$readScope$1) fyVar;
            int i = fileStorageConnection$readScope$1.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                fileStorageConnection$readScope$1.w = i - Integer.MIN_VALUE;
            } else {
                fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, fyVar);
            }
        } else {
            fileStorageConnection$readScope$1 = new FileStorageConnection$readScope$1(this, fyVar);
        }
        ?? r10 = fileStorageConnection$readScope$1.u;
        int i2 = fileStorageConnection$readScope$1.w;
        try {
            if (i2 == 0) {
                wz2.a0(r10);
                if (this.e.get()) {
                    e32.i("StorageConnection has already been disposed.");
                    return null;
                }
                boolean zF = this.f.f();
                FileReadScope fileReadScope2 = new FileReadScope(this.a, this.b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zF);
                    fileStorageConnection$readScope$1.r = this;
                    fileStorageConnection$readScope$1.s = fileReadScope2;
                    fileStorageConnection$readScope$1.t = zF;
                    fileStorageConnection$readScope$1.w = 1;
                    Object objInvoke = ((StorageConnectionKt$readData$2) as0Var).invoke(fileReadScope2, boolValueOf, fileStorageConnection$readScope$1);
                    dz dzVar = dz.a;
                    if (objInvoke == dzVar) {
                        return dzVar;
                    }
                    fileStorageConnection = this;
                    z = zF ? 1 : 0;
                    r9 = objInvoke;
                    fileReadScope = fileReadScope2;
                    fileReadScope.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z) {
                        fileStorageConnection.f.g(null);
                    }
                    return r9;
                } catch (Throwable th2) {
                    th = th2;
                    fileReadScope = fileReadScope2;
                    r10 = zF;
                    fileReadScope.close();
                    throw th;
                }
            }
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = fileStorageConnection$readScope$1.t;
            fileReadScope = fileStorageConnection$readScope$1.s;
            fileStorageConnection = fileStorageConnection$readScope$1.r;
            try {
                wz2.a0(r10);
                r9 = r10;
                try {
                    fileReadScope.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (th != null) {
                    if (z) {
                        fileStorageConnection.f.g(null);
                    }
                    return r9;
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    r10 = z;
                    this = fileStorageConnection;
                }
            } catch (Throwable th5) {
                r10 = z ? 1 : 0;
                this = fileStorageConnection;
                th = th5;
                try {
                    fileReadScope.close();
                    throw th;
                } catch (Throwable th6) {
                    l7.a(th, th6);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (r10 != 0) {
            this.f.g(null);
        }
        throw th;
    }

    public FileStorageConnection(File file, Serializer serializer, InterProcessCoordinator interProcessCoordinator, sr0 sr0Var) {
        serializer.getClass();
        interProcessCoordinator.getClass();
        this.a = file;
        this.b = serializer;
        this.c = interProcessCoordinator;
        this.d = sr0Var;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new pp1();
    }
}
