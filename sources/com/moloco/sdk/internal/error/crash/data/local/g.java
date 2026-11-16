package com.moloco.sdk.internal.error.crash.data.local;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import com.explorestack.protobuf.openrtb.Response;
import com.safedk.android.internal.partials.MolocoAdsFilesBridge;
import defpackage.cm2;
import defpackage.sg1;
import defpackage.wr0;
import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.AdRequest;
import io.p071bidmachine.AdRequestParameters;
import io.p071bidmachine.AdResponse;
import io.p071bidmachine.ImageData;
import io.p071bidmachine.ImageDataImpl;
import io.p071bidmachine.MediaAssetType;
import io.p071bidmachine.NetworkAdUnitManager;
import io.p071bidmachine.UrlProvider;
import io.p071bidmachine.d1;
import io.p071bidmachine.f1;
import io.p071bidmachine.f2;
import io.p071bidmachine.g1;
import io.p071bidmachine.nativead.l;
import io.p071bidmachine.w;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class g implements io.p071bidmachine.core.b, io.p071bidmachine.core.c {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(g gVar, Context context, Uri uri) throws Throwable {
        String path;
        Bitmap frameAtTime;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        File file;
        ImageDataImpl imageDataImpl;
        ImageDataImpl imageDataImpl2 = ((l) gVar.d).e;
        FileOutputStream fileOutputStream = null;
        Uri uriFromFile = null;
        String remoteUrl = imageDataImpl2 != null ? imageDataImpl2.getRemoteUrl() : null;
        if (uri == null || (path = uri.getPath()) == null) {
            return;
        }
        if ((remoteUrl == null || remoteUrl.length() == 0) && new File(path).exists()) {
            Handler handler = io.p071bidmachine.core.j.a;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(context, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata == null || (frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(strExtractMetadata), 2)) == null) {
                file = null;
            } else {
                try {
                    try {
                        try {
                            File file2 = new File(context.getCacheDir(), "native_video_thumb");
                            if (!file2.exists() && !file2.mkdirs()) {
                                file2 = null;
                            }
                            file = new File(file2, io.p071bidmachine.core.j.e(uri.toString()));
                            fileOutputStreamFileOutputStreamCtor = MolocoAdsFilesBridge.fileOutputStreamCtor(file);
                            try {
                                frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamFileOutputStreamCtor);
                                io.p071bidmachine.core.j.d(fileOutputStreamFileOutputStreamCtor);
                                io.p071bidmachine.core.j.a(fileOutputStreamFileOutputStreamCtor);
                            } catch (Exception e) {
                                e = e;
                                try {
                                    io.p071bidmachine.core.a.i(e);
                                    io.p071bidmachine.core.j.d(fileOutputStreamFileOutputStreamCtor);
                                    io.p071bidmachine.core.j.a(fileOutputStreamFileOutputStreamCtor);
                                    file = null;
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                    fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                                    io.p071bidmachine.core.j.d(fileOutputStreamFileOutputStreamCtor);
                                    io.p071bidmachine.core.j.a(fileOutputStreamFileOutputStreamCtor);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                io.p071bidmachine.core.j.d(fileOutputStreamFileOutputStreamCtor);
                                io.p071bidmachine.core.j.a(fileOutputStreamFileOutputStreamCtor);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStreamFileOutputStreamCtor = null;
                            io.p071bidmachine.core.a.i(e);
                            io.p071bidmachine.core.j.d(fileOutputStreamFileOutputStreamCtor);
                            io.p071bidmachine.core.j.a(fileOutputStreamFileOutputStreamCtor);
                            file = null;
                            io.p071bidmachine.nativead.f fVar = (io.p071bidmachine.nativead.f) gVar.e;
                            if (file != null) {
                                uriFromFile = Uri.fromFile(file);
                                uriFromFile.getClass();
                            }
                            imageDataImpl = fVar.m;
                            if (imageDataImpl != null) {
                                imageDataImpl.setLocalUri(uriFromFile);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                        io.p071bidmachine.core.j.d(fileOutputStreamFileOutputStreamCtor);
                        io.p071bidmachine.core.j.a(fileOutputStreamFileOutputStreamCtor);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            io.p071bidmachine.nativead.f fVar2 = (io.p071bidmachine.nativead.f) gVar.e;
            if (file != null) {
                uriFromFile = Uri.fromFile(file);
                uriFromFile.getClass();
            }
            imageDataImpl = fVar2.m;
            if (imageDataImpl != null) {
                imageDataImpl.setLocalUri(uriFromFile);
            }
        }
    }

    public void b() {
        ((AtomicBoolean) this.g).set(true);
        ((WeakReference) this.e).clear();
    }

    public d1 c() {
        WeakReference weakReference = (WeakReference) this.e;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
        if (((AtomicBoolean) this.g).get() || atomicBoolean.get() || weakReference.get() == null) {
            return null;
        }
        atomicBoolean.set(true);
        return (d1) weakReference.get();
    }

    public void d() {
        if (((CopyOnWriteArrayList) this.g).isEmpty()) {
            synchronized (this) {
                try {
                    if (!((io.p071bidmachine.nativead.g) this.b).b || g()) {
                        ((AdProcessCallback) this.c).processLoadSuccess();
                    } else {
                        ((AdProcessCallback) this.c).processLoadFail(io.p071bidmachine.utils.a.c("Native assets are invalid"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void e(ImageData imageData, wr0 wr0Var) {
        String remoteUrl;
        if (imageData == null || imageData.getImage() != null || (remoteUrl = imageData.getRemoteUrl()) == null || remoteUrl.length() == 0) {
            return;
        }
        ((CopyOnWriteArrayList) this.g).add(new io.p071bidmachine.nativead.tasks.d(this.a, (io.p071bidmachine.rendering.d) ((cm2) this.f).getValue(), new io.p071bidmachine.media3.exoplayer.offline.b(12, wr0Var, this), remoteUrl));
    }

    @Override // io.p071bidmachine.core.b
    public void f(Object obj) {
        io.p071bidmachine.utils.a aVar = (io.p071bidmachine.utils.a) obj;
        f2.a().c((String) this.a);
        NetworkAdUnitManager networkAdUnitManager = (NetworkAdUnitManager) this.d;
        networkAdUnitManager.notifyNetworkAuctionResult(null);
        networkAdUnitManager.notifyNetworkClearAuction();
        AdResponse adResponseE = f1.a().e((AdRequestParameters) this.c);
        if (adResponseE == null) {
            d1 d1VarC = c();
            if (d1VarC != null) {
                io.p071bidmachine.g gVar = (io.p071bidmachine.g) d1VarC;
                gVar.c.processApiRequestLoadedFail(gVar.b, aVar);
            }
            b();
            return;
        }
        d1 d1VarC2 = c();
        if (d1VarC2 != null) {
            io.p071bidmachine.g gVar2 = (io.p071bidmachine.g) d1VarC2;
            AdRequest adRequest = gVar2.c;
            adRequest.setAuctionUrl(gVar2.a);
            adRequest.processApiRequestSuccess(adResponseE);
        } else {
            adResponseE.setStatus(g1.a);
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0016, B:10:0x001e, B:12:0x0022, B:17:0x002c, B:19:0x0034, B:21:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x004a, B:30:0x0053), top: B:38:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0034 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0016, B:10:0x001e, B:12:0x0022, B:17:0x002c, B:19:0x0034, B:21:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x004a, B:30:0x0053), top: B:38:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0016, B:10:0x001e, B:12:0x0022, B:17:0x002c, B:19:0x0034, B:21:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x004a, B:30:0x0053), top: B:38:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0016, B:10:0x001e, B:12:0x0022, B:17:0x002c, B:19:0x0034, B:21:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x004a, B:30:0x0053), top: B:38:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0016, B:10:0x001e, B:12:0x0022, B:17:0x002c, B:19:0x0034, B:21:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x004a, B:30:0x0053), top: B:38:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x004a A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0016, B:10:0x001e, B:12:0x0022, B:17:0x002c, B:19:0x0034, B:21:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x004a, B:30:0x0053), top: B:38:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0009, B:5:0x0012, B:7:0x0016, B:10:0x001e, B:12:0x0022, B:17:0x002c, B:19:0x0034, B:21:0x0038, B:24:0x0040, B:26:0x0044, B:28:0x004a, B:30:0x0053), top: B:38:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[RETURN] */
    public boolean g() {
        boolean z;
        ImageDataImpl imageDataImpl;
        Uri localUri;
        ImageDataImpl imageDataImpl2;
        io.p071bidmachine.nativead.f fVar = (io.p071bidmachine.nativead.f) this.e;
        io.p071bidmachine.nativead.g gVar = (io.p071bidmachine.nativead.g) this.b;
        try {
            if (gVar.a(MediaAssetType.Icon)) {
                ImageDataImpl imageDataImpl3 = fVar.l;
                if ((imageDataImpl3 != null ? imageDataImpl3.getLocalUri() : null) == null) {
                    ImageDataImpl imageDataImpl4 = fVar.l;
                    if ((imageDataImpl4 != null ? imageDataImpl4.getImage() : null) != null) {
                        if (gVar.a(MediaAssetType.Image)) {
                            imageDataImpl = fVar.m;
                            if (imageDataImpl != null) {
                                localUri = imageDataImpl.getLocalUri();
                            } else {
                                localUri = null;
                            }
                            if (localUri != null) {
                                if (gVar.a(MediaAssetType.Video)) {
                                    z = ((l) this.d).i;
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    return true;
                                }
                            } else {
                                imageDataImpl2 = fVar.m;
                                if ((imageDataImpl2 != null ? imageDataImpl2.getImage() : null) != null) {
                                    if (gVar.a(MediaAssetType.Video)) {
                                        z = ((l) this.d).i;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        return true;
                                    }
                                }
                            }
                        } else {
                            if (gVar.a(MediaAssetType.Video)) {
                                z = ((l) this.d).i;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return true;
                            }
                        }
                    }
                } else if (gVar.a(MediaAssetType.Image)) {
                    if (gVar.a(MediaAssetType.Video)) {
                        z = ((l) this.d).i;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return true;
                    }
                } else {
                    imageDataImpl = fVar.m;
                    if (imageDataImpl != null) {
                        localUri = imageDataImpl.getLocalUri();
                    } else {
                        localUri = null;
                    }
                    if (localUri != null) {
                        if (gVar.a(MediaAssetType.Video)) {
                            z = ((l) this.d).i;
                        } else {
                            z = true;
                        }
                        if (z) {
                            return true;
                        }
                    } else {
                        imageDataImpl2 = fVar.m;
                        if ((imageDataImpl2 != null ? imageDataImpl2.getImage() : null) != null) {
                            if (gVar.a(MediaAssetType.Video)) {
                                z = ((l) this.d).i;
                            } else {
                                z = true;
                            }
                            if (z) {
                                return true;
                            }
                        }
                    }
                }
            } else if (gVar.a(MediaAssetType.Image)) {
                if (gVar.a(MediaAssetType.Video)) {
                    z = ((l) this.d).i;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            } else {
                imageDataImpl = fVar.m;
                if (imageDataImpl != null) {
                    localUri = imageDataImpl.getLocalUri();
                } else {
                    localUri = null;
                }
                if (localUri != null) {
                    if (gVar.a(MediaAssetType.Video)) {
                        z = ((l) this.d).i;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return true;
                    }
                } else {
                    imageDataImpl2 = fVar.m;
                    if ((imageDataImpl2 != null ? imageDataImpl2.getImage() : null) != null) {
                        if (gVar.a(MediaAssetType.Video)) {
                            z = ((l) this.d).i;
                        } else {
                            z = true;
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            io.p071bidmachine.core.a.i(e);
            return false;
        }
    }

    @Override // io.p071bidmachine.core.b
    public void onSuccess(Object obj) {
        f2.a().c((String) this.a);
        UrlProvider.setAuctionUrlFromSuccessRequest((String) this.b);
        w.a((AdRequestParameters) this.c, (NetworkAdUnitManager) this.d, (Response) obj, new com.facebook.ads.a(this, 25));
    }

    public g(CrashReportDb_Impl crashReportDb_Impl) {
        this.a = crashReportDb_Impl;
        this.b = new com.moloco.sdk.acm.db.f(crashReportDb_Impl);
        this.c = new com.moloco.sdk.acm.db.g(crashReportDb_Impl, 2);
        this.d = new com.moloco.sdk.acm.db.g(crashReportDb_Impl, 3);
        this.e = new com.moloco.sdk.acm.db.g(crashReportDb_Impl, 4);
        this.f = new com.moloco.sdk.acm.db.g(crashReportDb_Impl, 5);
        this.g = new com.moloco.sdk.acm.db.g(crashReportDb_Impl, 6);
    }

    @Override // io.p071bidmachine.core.c
    public void onCanceled() {
        f2.a().c((String) this.a);
        ((NetworkAdUnitManager) this.d).notifyNetworkClearAuction();
        d1 d1VarC = c();
        if (d1VarC != null) {
            ((io.p071bidmachine.g) d1VarC).c.processApiRequestCancel();
        }
        b();
    }

    public g(Context context, Object obj, io.p071bidmachine.nativead.g gVar, AdProcessCallback adProcessCallback, l lVar, io.p071bidmachine.nativead.f fVar) {
        context.getClass();
        obj.getClass();
        gVar.getClass();
        adProcessCallback.getClass();
        this.a = obj;
        this.b = gVar;
        this.c = adProcessCallback;
        this.d = lVar;
        this.e = fVar;
        this.f = new cm2(new sg1(context, 5));
        this.g = new CopyOnWriteArrayList();
    }

    public g(String str, String str2, AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, io.p071bidmachine.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = adRequestParameters;
        this.d = networkAdUnitManager;
        this.e = new WeakReference(gVar);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
    }
}
