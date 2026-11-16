package io.p071bidmachine.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import defpackage.pv1;
import io.p071bidmachine.media3.common.util.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p extends c {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // io.p071bidmachine.media3.datasource.h
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    d();
                }
            } catch (IOException e) {
                throw new o(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                d();
            }
            throw th;
        }
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final long a(k kVar) throws o {
        Uri uri = kVar.a;
        long j = kVar.e;
        this.f = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = kVar.f;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new o(null, null, 2008);
                }
                this.h = true;
                f(kVar);
                return this.g;
            } catch (IOException e) {
                throw new o(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new o(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbR = pv1.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbR.append(fragment);
            throw new o(sbR.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new o(e3, 2006);
        } catch (RuntimeException e4) {
            throw new o(e4, 2000);
        }
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final Uri getUri() {
        return this.f;
    }

    @Override // io.p071bidmachine.media3.common.g
    public final int read(byte[] bArr, int i, int i2) throws o {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = x.a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.g -= (long) i4;
                c(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new o(e, 2000);
        }
    }
}
