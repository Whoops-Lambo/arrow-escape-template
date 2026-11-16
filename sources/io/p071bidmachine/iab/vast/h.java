package io.p071bidmachine.iab.vast;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.ads.f;
import com.ironsource.C4700d4;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.eb1;
import defpackage.ic0;
import defpackage.ma;
import defpackage.pv1;
import defpackage.vq2;
import io.p071bidmachine.ads.networks.gam_dynamic.x;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.a;
import io.p071bidmachine.iab.b;
import io.p071bidmachine.iab.measurer.c;
import io.p071bidmachine.iab.utils.m;
import io.p071bidmachine.iab.utils.y;
import io.p071bidmachine.iab.vast.processor.VastAd;
import io.p071bidmachine.iab.vast.tags.e;
import io.p071bidmachine.iab.vast.tags.n;
import io.p071bidmachine.iab.vast.tags.p;
import io.p071bidmachine.internal.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static int u = 5;
    public Uri c;
    public VastAd d;
    public ma f;
    public c g;
    public Float i;
    public float j;
    public boolean k;
    public a b = a.a;
    public int e = 1;
    public float h = 3.0f;
    public int l = 0;
    public boolean m = false;
    public boolean n = true;
    public boolean o = false;
    public boolean p = false;
    public int q = -1;
    public float r = 5.0f;
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final AtomicBoolean t = new AtomicBoolean(false);
    public final String a = UUID.randomUUID().toString();

    public static Uri a(Context context, String str) throws IOException {
        String str2;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            str2 = externalFilesDir.getPath() + "/vast_rtb_cache/";
        } else {
            str2 = null;
        }
        if (str2 == null) {
            vq2.w("No dir for caching file");
            return null;
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        int length = 230 - file.getPath().length();
        String str3 = C4700d4.D + System.currentTimeMillis();
        String strReplace = str.substring(0, Math.min(length, str.length())).replace("/", "").replace(":", "");
        File file2 = new File(file, strReplace);
        if (file2.exists()) {
            return Uri.fromFile(file2);
        }
        File file3 = new File(file, str3);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        InputStream inputStreamUrlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        FileOutputStream fileOutputStreamFileOutputStreamCtor = BidMachineFilesBridge.fileOutputStreamCtor(file3);
        long contentLength = httpURLConnection.getContentLength();
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            int i = inputStreamUrlConnectionGetInputStream.read(bArr);
            if (i <= 0) {
                break;
            }
            fileOutputStreamFileOutputStreamCtor.write(bArr, 0, i);
            j += (long) i;
        }
        fileOutputStreamFileOutputStreamCtor.close();
        if (contentLength == j) {
            file3.renameTo(new File(file, strReplace));
            return Uri.fromFile(new File(file, strReplace));
        }
        e32.i("The downloaded file size does not match the stated size");
        return null;
    }

    public final void b(Context context) {
        File[] fileArrListFiles;
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            String str = externalFilesDir != null ? externalFilesDir.getPath() + "/vast_rtb_cache/" : null;
            if (str == null || (fileArrListFiles = new File(str).listFiles()) == null || fileArrListFiles.length <= u) {
                return;
            }
            g[] gVarArr = new g[fileArrListFiles.length];
            for (int i = 0; i < fileArrListFiles.length; i++) {
                File file = fileArrListFiles[i];
                g gVar = new g();
                gVar.b = file;
                gVar.a = file.lastModified();
                gVarArr[i] = gVar;
            }
            Arrays.sort(gVarArr);
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                fileArrListFiles[i2] = gVarArr[i2].b;
            }
            for (int i3 = u; i3 < fileArrListFiles.length; i3++) {
                if (!Uri.fromFile(fileArrListFiles[i3]).equals(this.c)) {
                    fileArrListFiles[i3].delete();
                }
            }
        } catch (Exception e) {
            c.a.C("VastRequest", e);
        }
    }

    public final boolean f() {
        try {
            Uri uri = this.c;
            return (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(this.c.getPath()).exists()) ? false : true;
        } catch (Exception unused) {
        }
    }

    public static void g(List list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list == null) {
            c.a("VastRequest", "Url list is null", new Object[0]);
            return;
        }
        x xVar = k.a;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strA = k.a(bundle2, (String) it.next());
            c.a("VastRequest", "Fire url: %s", strA);
            Handler handler = y.a;
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            if (TextUtils.isEmpty(strA)) {
                m.a("url is null or empty", new Object[0]);
            } else {
                try {
                    executorServiceNewSingleThreadExecutor.execute(new com.facebook.appevents.c(strA, 3));
                } catch (Exception e) {
                    m.a.C("Utils", e);
                }
            }
        }
    }

    public final void c(Context context, VastAd vastAd, com.facebook.ads.a aVar) {
        try {
            Uri uriA = a(context, vastAd.b.a);
            if (uriA != null && !TextUtils.isEmpty(uriA.getPath()) && new File(uriA.getPath()).exists()) {
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(uriA.getPath(), 1);
                if (bitmapCreateVideoThumbnail == null) {
                    c.a("VastRequest", "Video file not supported", new Object[0]);
                    j(j.h);
                    e(new b(3, "Failed to get thumbnail by file URI"), aVar);
                } else if (bitmapCreateVideoThumbnail.equals(Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), bitmapCreateVideoThumbnail.getConfig()))) {
                    c.a("VastRequest", "Empty thumbnail", new Object[0]);
                    j(j.h);
                    e(new b(3, "Thumbnail is empty"), aVar);
                } else {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(context, uriA);
                        Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                        this.c = uriA;
                        synchronized (this) {
                            if (this.f != null) {
                                y.e(new io.p071bidmachine.ads.networks.adaptiverendering.measurer.b(2, this, vastAd));
                            }
                        }
                        d(aVar);
                    } catch (Exception e) {
                        c.a.C("VastRequest", e);
                        j(j.h);
                        e(b.b("Exception during metadata retrieval", e), aVar);
                    }
                }
                b(context);
                return;
            }
            c.a("VastRequest", "fileUri is null", new Object[0]);
            j(j.e);
            e(new b(3, "Can't find video by local URI"), aVar);
        } catch (Exception e2) {
            c.a.C("VastRequest", e2);
            j(j.e);
            e(b.b("Exception during caching media file", e2), aVar);
        }
    }

    public final void d(com.facebook.ads.a aVar) {
        if (this.s.getAndSet(true)) {
            return;
        }
        c.a("VastRequest", "sendLoaded", new Object[0]);
        if (aVar != null) {
            y.e(new f(this, aVar));
        }
    }

    public final int h() {
        if (!this.m) {
            return 0;
        }
        VastAd vastAd = this.d;
        if (vastAd == null) {
            return 2;
        }
        n nVar = vastAd.b;
        int iF = nVar.f("width");
        int iF2 = nVar.f("height");
        Handler handler = y.a;
        return iF > iF2 ? 2 : 1;
    }

    public final void i(Context context, String str, com.facebook.ads.a aVar) {
        String strK;
        io.p071bidmachine.iab.vast.processor.a aVar2 = new io.p071bidmachine.iab.vast.processor.a();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        aVar2.a = displayMetrics.widthPixels * displayMetrics.heightPixels;
        Handler handler = y.a;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = context.getResources().getConfiguration().orientation;
        int i2 = 0;
        char c = '\t';
        if (i == 1) {
            if (rotation != 2 && rotation != 3) {
                c = 1;
            }
        } else if (i == 2) {
            c = (rotation == 2 || rotation == 3) ? '\b' : (char) 0;
        }
        aVar2.b = c == 0 || c == '\b' || c == 6;
        eb1 eb1Var = new eb1(this, aVar2);
        c.a("VastProcessor", "process", new Object[0]);
        ic0 ic0Var = new ic0(3);
        try {
            p pVarT = com.facebook.appevents.h.t(str);
            if (pVarT == null || ((ArrayList) pVarT.d).isEmpty()) {
                ic0Var.d = j.c;
            } else {
                ic0Var = eb1Var.a(null, pVarT, new io.p071bidmachine.iab.vast.processor.b(true, true, true));
            }
        } catch (Exception unused) {
            ic0Var.d = j.b;
        }
        VastAd vastAd = (VastAd) ic0Var.c;
        this.d = vastAd;
        if (vastAd == null) {
            j jVar = (j) ic0Var.d;
            if (jVar != null) {
                j(jVar);
                strK = pv1.k(jVar.a, "VastAd is null during loadVideoWithDataSync with VastSpecCode - ");
            } else {
                strK = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            e(new b(3, strK), aVar);
            return;
        }
        vastAd.c = this;
        e eVar = vastAd.j;
        if (eVar != null) {
            Boolean bool = eVar.p;
            if (bool != null) {
                if (bool.booleanValue()) {
                    this.m = false;
                    this.n = false;
                } else {
                    this.m = true;
                    this.n = true;
                }
            }
            float f = eVar.l.h;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.j = f;
            }
            this.o = eVar.t;
            this.p = eVar.u;
            Integer num = eVar.v;
            if (num != null) {
                this.q = num.intValue();
            }
        }
        VastAd vastAd2 = this.d;
        Float fValueOf = eVar != null ? eVar.q : null;
        if (this.k) {
            Float fValueOf2 = this.i;
            Handler handler2 = y.a;
            if (fValueOf == null) {
                fValueOf = fValueOf2;
            } else if (fValueOf2 != null) {
                fValueOf2 = Float.valueOf(Math.max(fValueOf.floatValue(), fValueOf2.floatValue()));
                fValueOf = fValueOf2;
            }
        }
        Float f2 = vastAd2.a.c;
        Handler handler3 = y.a;
        if (fValueOf == null) {
            fValueOf = f2;
        } else if (f2 != null) {
            fValueOf = Float.valueOf(Math.min(fValueOf.floatValue(), f2.floatValue()));
        }
        if (fValueOf == null) {
            fValueOf = Float.valueOf(5.0f);
        }
        this.r = fValueOf.floatValue();
        c cVar = this.g;
        if (cVar != null) {
            j.l(new l((io.p071bidmachine.internal.n) cVar, this, i2));
        }
        int i3 = e.a[this.b.ordinal()];
        if (i3 == 1) {
            c(context, this.d, aVar);
            return;
        }
        if (i3 == 2) {
            d(aVar);
        } else {
            if (i3 != 3) {
                return;
            }
            d(aVar);
            c(context, this.d, aVar);
        }
    }

    public final void e(b bVar, com.facebook.ads.a aVar) {
        c.a("VastRequest", "sendLoadFailed - %s", bVar);
        synchronized (this) {
            if (this.f != null) {
                y.e(new io.p071bidmachine.ads.networks.adaptiverendering.measurer.b(3, this, bVar));
            }
        }
        y.e(new com.facebook.applinks.a(1, this, bVar, aVar));
    }

    public final void j(j jVar) {
        c.a("VastRequest", "sendVastSpecError - %s", jVar);
        try {
            if (this.d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("params_error_code", jVar.a);
                g(this.d.f, bundle);
            }
        } catch (Exception e) {
            c.a.C("VastRequest", e);
        }
    }
}
