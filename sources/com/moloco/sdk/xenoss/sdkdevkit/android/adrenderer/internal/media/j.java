package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Context;
import com.facebook.login.p;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.n0;
import com.moloco.sdk.internal.o0;
import com.moloco.sdk.internal.p0;
import com.moloco.sdk.internal.x;
import defpackage.ba0;
import defpackage.dn;
import defpackage.kc2;
import defpackage.xc0;
import defpackage.y80;
import io.p071bidmachine.t1;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public final p a;
    public final com.moloco.sdk.internal.error.crash.data.network.b b;
    public final com.moloco.sdk.internal.error.crash.anr.i c;
    public final dn d;
    public final ConcurrentHashMap e;
    public final HashSet f;
    public final ConcurrentHashMap g;

    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[Catch: Exception -> 0x002a, SecurityException -> 0x002d, IOException -> 0x0030, TRY_LEAVE, TryCatch #3 {IOException -> 0x0030, SecurityException -> 0x002d, Exception -> 0x002a, blocks: (B:3:0x0010, B:5:0x0016, B:7:0x0024, B:14:0x0033), top: B:48:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1 A[Catch: Exception -> 0x00c5, SecurityException -> 0x00c9, IOException -> 0x00cd, TRY_LEAVE, TryCatch #4 {IOException -> 0x00cd, SecurityException -> 0x00c9, Exception -> 0x00c5, blocks: (B:22:0x0099, B:24:0x009f, B:26:0x00b1, B:34:0x00d1), top: B:45:0x0099 }] */
    public final p0 c() {
        p0 n0Var;
        p0 n0Var2;
        Context context = this.c.a;
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                File file = new File(externalCacheDir, "com.moloco.sdk.xenoss.sdkdevkit.android.cache");
                file.mkdir();
                if (file.exists()) {
                    n0Var = new o0(file);
                } else {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", null, false, 12, null);
                    n0Var = new n0(new x("Failed to create cache directory in external storage", 102));
                }
            } else {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", null, false, 12, null);
                n0Var = new n0(new x("Failed to create cache directory in external storage", 102));
            }
        } catch (IOException e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e, false, 8, null);
            n0Var = new n0(new x("Failed to create cache directory in external storage", 101));
        } catch (SecurityException e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e2, false, 8, null);
            n0Var = new n0(new x("Failed to create cache directory in external storage", 100));
        } catch (Exception e3) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e3, false, 8, null);
            n0Var = new n0(new x("Failed to create cache directory in external storage", 200));
        }
        if (!(n0Var instanceof n0)) {
            if (n0Var instanceof o0) {
                return n0Var;
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }
        try {
            if (context.getCacheDir() != null) {
                File file2 = new File(context.getCacheDir(), "com.moloco.sdk.xenoss.sdkdevkit.android.cache");
                file2.mkdir();
                if (file2.exists()) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Able to write to internal storage cache directory", false, 4, null);
                    n0Var2 = new o0(file2);
                } else {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in internal storage", null, false, 12, null);
                    n0Var2 = new n0(new x("Failed to create cache directory in internal storage", 102));
                }
            } else {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in internal storage", null, false, 12, null);
                n0Var2 = new n0(new x("Failed to create cache directory in internal storage", 102));
            }
        } catch (IOException e4) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e4, false, 8, null);
            n0Var2 = new n0(new x("Failed to create cache directory in internal storage", 101));
        } catch (SecurityException e5) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e5, false, 8, null);
            n0Var2 = new n0(new x("Failed to create cache directory in internal storage", 100));
        } catch (Exception e6) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e6, false, 8, null);
            n0Var2 = new n0(new x("Failed to create cache directory in internal storage", 200));
        }
        return n0Var2;
    }

    public j(k kVar, p pVar, com.moloco.sdk.internal.error.crash.data.network.b bVar, com.moloco.sdk.internal.error.crash.anr.i iVar) {
        kVar.getClass();
        this.a = pVar;
        this.b = bVar;
        this.c = iVar;
        ba0 ba0Var = xc0.a;
        y80 y80Var = y80.c;
        this.d = kc2.a(y80Var);
        this.e = new ConcurrentHashMap();
        this.f = new HashSet();
        this.g = new ConcurrentHashMap();
        kc2.a(y80Var);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g a(String str) {
        str.getClass();
        p0 p0VarB = b();
        if (p0VarB instanceof n0) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g) ((n0) p0VarB).a;
        }
        if (p0VarB instanceof o0) {
            File file = new File((File) ((o0) p0VarB).a, t1.q(str));
            if (file.exists() && com.moloco.sdk.internal.error.crash.data.network.b.o(file)) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c(file);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b) this.g.get(str);
            if (bVar != null) {
                return bVar.a;
            }
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h.a);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return null;
    }

    public final p0 b() {
        p0 p0VarC = c();
        if (p0VarC instanceof n0) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb = new StringBuilder("Failed to retrieve storageDir with error code: ");
            x xVar = (x) ((n0) p0VarC).a;
            sb.append(xVar.b);
            MolocoLogger.warn$default(molocoLogger, "MediaCacheRepository", sb.toString(), null, false, 12, null);
            switch (xVar.b) {
                case 100:
                    return new n0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(g.c));
                case 101:
                    return new n0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(g.b));
                case 102:
                    return new n0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(g.a));
                default:
                    return new n0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(g.d));
            }
        }
        if (p0VarC instanceof o0) {
            return new o0(((o0) p0VarC).a);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return null;
    }
}
