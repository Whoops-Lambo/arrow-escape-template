package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import defpackage.pv1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzij extends zzho {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public zzij() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
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
                    n();
                }
            } catch (IOException e) {
                throw new zzii(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                n();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) throws zzii {
        Uri uri = zziaVar.a;
        this.f = uri;
        k(zziaVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                long j = zziaVar.c;
                randomAccessFile.seek(j);
                long length = zziaVar.d;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new zzii(null, null, 2008);
                }
                this.h = true;
                l(zziaVar);
                return this.g;
            } catch (IOException e) {
                throw new zzii(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzii(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbR = pv1.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbR.append(fragment);
            throw new zzii(sbR.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new zzii(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzii(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) throws zzii {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = zzfq.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.g -= (long) i3;
                m(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new zzii(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        return this.f;
    }
}
