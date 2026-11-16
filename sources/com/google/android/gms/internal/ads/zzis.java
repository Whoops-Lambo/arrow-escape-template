package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.jc1;
import defpackage.pv1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzis extends zzho {
    public final Context e;
    public zzia f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public zzis(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        this.f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            n();
                        }
                    } catch (IOException e) {
                        throw new zzir(null, e, 2000);
                    }
                } catch (Throwable th) {
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            n();
                        }
                        throw th;
                    } catch (IOException e2) {
                        throw new zzir(null, e2, 2000);
                    }
                }
            } catch (Throwable th2) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    n();
                }
                throw th2;
            }
        } catch (IOException e3) {
            throw new zzir(null, e3, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) throws zzir {
        Resources resourcesForApplication;
        int identifier;
        Resources resources;
        long size;
        this.f = zziaVar;
        k(zziaVar);
        Uri uri = zziaVar.a;
        long j = zziaVar.c;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size2 = pathSegments.size();
                throw new zzir(pv1.l(size2, "rawresource:// URI must have exactly one path element, found ", new StringBuilder(String.valueOf(size2).length() + 61)));
            }
            try {
                identifier = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new zzir("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                String scheme = uriNormalizeScheme.getScheme();
                throw new zzir(jc1.o("Unsupported URI scheme (", scheme, new StringBuilder(String.valueOf(scheme).length() + 62), "). Only android.resource is supported."), null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzir("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new zzir("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(jc1.o(packageName, ":", new StringBuilder(packageName.length() + 1 + path.length()), path), "raw", null);
                if (identifier == 0) {
                    throw new zzir("Resource not found.", null, 2005);
                }
            }
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new zzir("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
            }
            this.g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
            this.h = fileInputStream;
            try {
                if (length != -1 && j > length) {
                    throw new zzir(null, null, 2008);
                }
                long startOffset = this.g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new zzir(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.i = -1L;
                        size = -1;
                    } else {
                        size = channel.size() - channel.position();
                        this.i = size;
                        if (size < 0) {
                            throw new zzir(null, null, 2008);
                        }
                    }
                } else {
                    size = length - jSkip;
                    this.i = size;
                    if (size < 0) {
                        throw new zzhx(2008);
                    }
                }
                long j2 = zziaVar.d;
                if (j2 != -1) {
                    this.i = size == -1 ? j2 : Math.min(size, j2);
                }
                this.j = true;
                l(zziaVar);
                return j2 != -1 ? j2 : this.i;
            } catch (zzir e2) {
                throw e2;
            } catch (IOException e3) {
                throw new zzir(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new zzir(null, e4, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) throws zzir {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzir(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.h;
            String str = zzfq.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            long j2 = this.i;
            if (i3 != -1) {
                if (j2 != -1) {
                    this.i = j2 - ((long) i3);
                }
                m(i3);
                return i3;
            }
            if (j2 != -1) {
                throw new zzir("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        zzia zziaVar = this.f;
        if (zziaVar != null) {
            return zziaVar.a;
        }
        return null;
    }
}
