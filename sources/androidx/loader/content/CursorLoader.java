package androidx.loader.content;

import android.content.ContentResolver;
import android.database.Cursor;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {
    public Cursor k;
    public CancellationSignal l;

    @Override // androidx.loader.content.AsyncTaskLoader
    public final void g() {
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.l;
                if (cancellationSignal != null) {
                    cancellationSignal.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final Object i() {
        android.os.CancellationSignal cancellationSignal;
        android.os.CancellationSignal cancellationSignal2;
        synchronized (this) {
            if (this.j != null) {
                throw new OperationCanceledException();
            }
            this.l = new CancellationSignal();
        }
        try {
            ContentResolver contentResolver = this.b.getContentResolver();
            CancellationSignal cancellationSignal3 = this.l;
            if (cancellationSignal3 != null) {
                synchronized (cancellationSignal3) {
                    try {
                        if (cancellationSignal3.c == null) {
                            android.os.CancellationSignal cancellationSignal4 = new android.os.CancellationSignal();
                            cancellationSignal3.c = cancellationSignal4;
                            if (cancellationSignal3.a) {
                                cancellationSignal4.cancel();
                            }
                        }
                        cancellationSignal2 = cancellationSignal3.c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                cancellationSignal = cancellationSignal2;
            } else {
                cancellationSignal = null;
            }
            try {
                Cursor cursorQuery = contentResolver.query(null, null, null, null, null, cancellationSignal);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.getCount();
                        cursorQuery.registerContentObserver(null);
                    } catch (RuntimeException e) {
                        cursorQuery.close();
                        throw e;
                    }
                }
                synchronized (this) {
                    this.l = null;
                }
                return cursorQuery;
            } catch (Exception e2) {
                if (e2 instanceof android.os.OperationCanceledException) {
                    throw new OperationCanceledException();
                }
                throw e2;
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.l = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.Loader
    public final void e() {
        Cursor cursor = this.k;
        if (cursor != null) {
            a(cursor);
        }
        boolean z = this.f;
        this.f = false;
        this.g |= z;
        if (z || this.k == null) {
            k();
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final void j(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // androidx.loader.content.Loader
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void a(Cursor cursor) {
        if (this.e) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.k;
        this.k = cursor;
        if (this.c) {
            super.a(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.b(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.k);
    }

    @Override // androidx.loader.content.Loader
    public final void d() {
        c();
        Cursor cursor = this.k;
        if (cursor != null && !cursor.isClosed()) {
            this.k.close();
        }
        this.k = null;
    }

    @Override // androidx.loader.content.Loader
    public final void f() {
        c();
    }
}
