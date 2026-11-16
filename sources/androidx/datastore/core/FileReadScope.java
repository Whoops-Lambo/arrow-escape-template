package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.nq2;
import defpackage.wz2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/FileReadScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/ReadScope;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FileReadScope<T> implements ReadScope<T> {
    public final File a;
    public final Serializer b;
    public final java.util.concurrent.atomic.AtomicBoolean c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.FileReadScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.datastore.core.FileReadScope] */
    public static Object f(FileReadScope fileReadScope, fy fyVar) {
        FileReadScope$readData$1 fileReadScope$readData$1;
        Throwable th;
        java.io.Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (fyVar instanceof FileReadScope$readData$1) {
            fileReadScope$readData$1 = (FileReadScope$readData$1) fyVar;
            int i = fileReadScope$readData$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                fileReadScope$readData$1.v = i - Integer.MIN_VALUE;
            } else {
                fileReadScope$readData$1 = new FileReadScope$readData$1(fileReadScope, fyVar);
            }
        } else {
            fileReadScope$readData$1 = new FileReadScope$readData$1(fileReadScope, fyVar);
        }
        Object obj = fileReadScope$readData$1.t;
        ?? r1 = fileReadScope$readData$1.v;
        dz dzVar = dz.a;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    fileInputStream = fileReadScope$readData$1.s;
                    r1 = (FileReadScope) fileReadScope$readData$1.r;
                    try {
                        wz2.a0(obj);
                        nq2.e(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            nq2.e(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r1 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (java.io.Closeable) fileReadScope$readData$1.r;
                try {
                    wz2.a0(obj);
                    nq2.e(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        nq2.e(closeable, th);
                        throw th6;
                    }
                }
            }
            wz2.a0(obj);
            if (fileReadScope.c.get()) {
                e32.i("This scope has already been closed.");
                return null;
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileReadScope.a);
                try {
                    Serializer serializer = fileReadScope.b;
                    fileReadScope$readData$1.r = fileReadScope;
                    fileReadScope$readData$1.s = fileInputStream2;
                    fileReadScope$readData$1.v = 1;
                    Object from = serializer.readFrom(fileInputStream2, fileReadScope$readData$1);
                    if (from != dzVar) {
                        fileInputStream = fileInputStream2;
                        obj = from;
                        nq2.e(fileInputStream, null);
                        return obj;
                    }
                    return dzVar;
                } catch (Throwable th7) {
                    r1 = fileReadScope;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                File file = fileReadScope.a;
                Serializer serializer2 = fileReadScope.b;
                if (!file.exists()) {
                    return serializer2.getDefaultValue();
                }
                FileInputStream fileInputStream3 = new FileInputStream(fileReadScope.a);
                try {
                    fileReadScope$readData$1.r = fileInputStream3;
                    fileReadScope$readData$1.s = null;
                    fileReadScope$readData$1.v = 2;
                    Object from2 = serializer2.readFrom(fileInputStream3, fileReadScope$readData$1);
                    if (from2 != dzVar) {
                        obj = from2;
                        closeable = fileInputStream3;
                        nq2.e(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            fileReadScope = r1;
        }
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.c.set(true);
    }

    @Override // androidx.datastore.core.ReadScope
    public final Object e(dy dyVar) {
        return f(this, (fy) dyVar);
    }

    public FileReadScope(File file, Serializer serializer) {
        serializer.getClass();
        this.a = file;
        this.b = serializer;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }
}
