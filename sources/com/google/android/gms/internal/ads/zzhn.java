package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhn extends zzho {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public zzhn(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) throws zzhm {
        try {
            Uri uri = zziaVar.a;
            this.f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            k(zziaVar);
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            long j = zziaVar.c;
            if (inputStreamOpen.skip(j) < j) {
                throw new zzhm(null, 2008);
            }
            long j2 = zziaVar.d;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            l(zziaVar);
            return this.h;
        } catch (zzhm e) {
            throw e;
        } catch (IOException e2) {
            throw new zzhm(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    n();
                }
            } catch (IOException e) {
                throw new zzhm(e, 2000);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                n();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) throws zzhm {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhm(e, 2000);
            }
        }
        InputStream inputStream = this.g;
        String str = zzfq.a;
        int i3 = inputStream.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - ((long) i3);
        }
        m(i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        return this.f;
    }
}
