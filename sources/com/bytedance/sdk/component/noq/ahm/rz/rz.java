package com.bytedance.sdk.component.noq.ahm.rz;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.noq.dg;
import com.bytedance.sdk.component.noq.fi;
import com.bytedance.sdk.component.noq.fpp;
import com.bytedance.sdk.component.noq.gf;
import com.bytedance.sdk.component.noq.gm;
import com.bytedance.sdk.component.noq.kus;
import com.bytedance.sdk.component.noq.nu;
import com.bytedance.sdk.component.noq.ra;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import defpackage.kg3;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz implements gf {
    private String ahm;
    private WeakReference<ImageView> at;
    private noq ay;
    private dg ct;
    private fpp dg;
    private int fi;
    private boolean fpp;
    private int fpz;
    private boolean ft;
    private int gf;
    private int gm;
    private com.bytedance.sdk.component.noq.ahm ioy;
    private ExecutorService jpc;
    Future<?> kgy;
    private boolean kus;
    private int lqi;
    private ImageView.ScaleType noq;
    private int nu;
    private fi ra;
    private String rz;
    private com.bytedance.sdk.component.noq.yo sx;
    private volatile boolean twf;
    private byte[] uf;
    private final Handler um;
    private String uq;
    private boolean vs;
    private kus wy;
    private int xh;
    private Bitmap.Config yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm implements ra {
        private ImageView ahm;
        private boolean at;
        private kus ay;
        private ImageView.ScaleType ct;
        private noq dg;
        private int fi;
        private int fpp;
        private boolean gm;
        private dg kgy;
        private String kus;
        private Bitmap.Config noq;
        private fpp nu;
        private String rz;
        private ExecutorService sx;
        private boolean twf;
        private int um;
        private String uq;
        private com.bytedance.sdk.component.noq.ahm vs;
        private fi xh;
        private int yo;
        private int gf = 1;
        private int ra = 5;

        @Override // com.bytedance.sdk.component.noq.ra
        public gf kgy(dg dgVar) {
            this.kgy = dgVar;
            return new rz(this).sx();
        }

        public ahm(noq noqVar) {
            this.dg = noqVar;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra ahm(int i) {
            this.fi = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra ct(int i) {
            this.fpp = i;
            return this;
        }

        public ra rz(String str) {
            this.uq = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra uq(int i) {
            this.um = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra ahm(String str) {
            this.kus = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra rz(int i) {
            this.gf = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra kgy(String str) {
            this.rz = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra kgy(ImageView.ScaleType scaleType) {
            this.ct = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra kgy(Bitmap.Config config) {
            this.noq = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra kgy(int i) {
            this.yo = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra kgy(fpp fppVar) {
            this.nu = fppVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra kgy(boolean z) {
            this.twf = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public gf kgy(dg dgVar, int i) {
            this.ra = i;
            return kgy(dgVar);
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public gf kgy(ImageView imageView) {
            this.ahm = imageView;
            return new rz(this).sx();
        }

        @Override // com.bytedance.sdk.component.noq.ra
        public ra kgy(fi fiVar) {
            this.xh = fiVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy implements dg {
        private dg ahm;

        public kgy(dg dgVar) {
            this.ahm = dgVar;
        }

        @Override // com.bytedance.sdk.component.noq.dg
        public void kgy(final nu nuVar) {
            Bitmap bitmapKgy;
            final ImageView imageView = (ImageView) rz.this.at.get();
            if (imageView != null && rz.this.nu != 3 && kgy(imageView)) {
                Object objAhm = nuVar.ahm();
                if (objAhm instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) nuVar.ahm();
                    rz.this.um.post(new Runnable() { // from class: com.bytedance.sdk.component.noq.ahm.rz.rz.kgy.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objAhm instanceof Drawable) {
                    final Drawable drawable = (Drawable) nuVar.ahm();
                    rz.this.um.post(new Runnable() { // from class: com.bytedance.sdk.component.noq.ahm.rz.rz.kgy.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && kg3.j(drawable)) {
                                kg3.d(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (rz.this.ra != null && (nuVar.ahm() instanceof Bitmap) && (bitmapKgy = rz.this.ra.kgy((Bitmap) nuVar.ahm())) != null) {
                    nuVar.kgy(bitmapKgy);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pVw==", "a+8qvA69bsKyT8ZIiQK0bHLjLJIGkGbGhE/FcYUCtC1V6z+iEb1514VY", "VOAegAC/bNST", IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW);
            }
            if (rz.this.xh == 5) {
                rz.this.um.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.noq.ahm.rz.rz.kgy.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (kgy.this.ahm != null) {
                            kgy.this.ahm.kgy(nuVar);
                        }
                    }
                });
                return;
            }
            dg dgVar = this.ahm;
            if (dgVar != null) {
                dgVar.kgy(nuVar);
            }
        }

        private boolean kgy(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(rz.this.rz)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.noq.dg
        public void kgy(final int i, final String str, final Throwable th) {
            if (rz.this.xh == 5) {
                rz.this.um.post(new Runnable() { // from class: com.bytedance.sdk.component.noq.ahm.rz.rz.kgy.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (kgy.this.ahm != null) {
                            kgy.this.ahm.kgy(i, str, th);
                        }
                    }
                });
                return;
            }
            dg dgVar = this.ahm;
            if (dgVar != null) {
                dgVar.kgy(i, str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gf sx() {
        try {
            if (this.ay == null) {
                dg dgVar = this.ct;
                if (dgVar != null) {
                    dgVar.kgy(1005, "not init !", null);
                    return this;
                }
            } else {
                String strKgy = kgy();
                if (TextUtils.isEmpty(strKgy)) {
                    this.ct.kgy(2000, "url is empty", null);
                    return this;
                }
                gm gmVarYo = this.ay.yo();
                if (!strKgy.startsWith(d.v) && !strKgy.startsWith("https://") && gmVarYo != null) {
                    gmVarYo.kgy(1006, "url is not validate ".concat(strKgy));
                }
                ExecutorService executorServiceNoq = this.jpc == null ? this.ay.noq() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.noq.ahm.rz.rz.1
                    @Override // java.lang.Runnable
                    public void run() {
                        rz rzVar = rz.this;
                        com.bytedance.sdk.component.noq.ahm.rz.kgy kgyVar = new com.bytedance.sdk.component.noq.ahm.rz.kgy(rzVar, rzVar.dg);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.noq.ahm.ahm.ahm());
                            arrayList.add(new com.bytedance.sdk.component.noq.ahm.ahm.ct());
                            arrayList.add(new com.bytedance.sdk.component.noq.ahm.ahm.kgy());
                            arrayList.add(new com.bytedance.sdk.component.noq.ahm.ahm.rz());
                            arrayList.add(new com.bytedance.sdk.component.noq.ahm.ahm.uq());
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (rz.this.twf) {
                                    kgyVar.kgy(1003, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.noq.ahm.ahm.noq noqVar = (com.bytedance.sdk.component.noq.ahm.ahm.noq) arrayList.get(i);
                                if (rz.this.dg != null && noqVar != null && !"data_intercept".equals(noqVar.kgy())) {
                                    rz.this.dg.kgy(noqVar.kgy(), rz.this);
                                }
                                rz rzVar2 = rz.this;
                                boolean zKgy = noqVar.kgy(rzVar2, rzVar2.dg, kgyVar);
                                if (rz.this.dg != null && !"data_intercept".equals(noqVar.kgy())) {
                                    rz.this.dg.ahm(noqVar.kgy(), rz.this);
                                }
                                if (!zKgy) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pVw==", "a+8qvA69bsKyT8ZIiQK0bAo=", "Sfsj", 378);
                            kgyVar.kgy(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.ft) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.jpc;
                if (executorService != null) {
                    this.kgy = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceNoq != null) {
                    this.kgy = executorServiceNoq.submit(runnable);
                }
            }
            return this;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pVw==", "a+8qvA69bsKyT8ZIiQK0", "Ses8gAavfQ==", 391);
            Log.e("ImageRequest", e.getMessage());
            return this;
        }
    }

    public void ahm(String str) {
        WeakReference<ImageView> weakReference = this.at;
        if (weakReference != null && weakReference.get() != null) {
            this.at.get().setTag(1094453505, str);
        }
        this.rz = str;
    }

    public boolean at() {
        return this.fpp;
    }

    public noq dg() {
        return this.ay;
    }

    public String fpp() {
        return fi() + nu();
    }

    public com.bytedance.sdk.component.noq.yo kus() {
        return this.sx;
    }

    public int nu() {
        return this.nu;
    }

    public Bitmap.Config ra() {
        return this.yo;
    }

    public byte[] twf() {
        return this.uf;
    }

    public kus um() {
        return this.wy;
    }

    public int vs() {
        return this.gm;
    }

    public com.bytedance.sdk.component.noq.ahm xh() {
        return this.ioy;
    }

    private rz(ahm ahmVar) {
        this.um = new Handler(Looper.getMainLooper());
        this.fpp = true;
        this.uf = null;
        this.ahm = ahmVar.uq;
        this.ct = new kgy(ahmVar.kgy);
        this.at = new WeakReference<>(ahmVar.ahm);
        this.noq = ahmVar.ct;
        this.yo = ahmVar.noq;
        this.fi = ahmVar.yo;
        this.gf = ahmVar.fi;
        this.nu = ahmVar.gf;
        this.xh = ahmVar.ra;
        this.dg = ahmVar.nu;
        this.ioy = kgy(ahmVar);
        if (!TextUtils.isEmpty(ahmVar.rz)) {
            ahm(ahmVar.rz);
            kgy(ahmVar.rz);
        }
        this.kus = ahmVar.at;
        this.vs = ahmVar.twf;
        this.ay = ahmVar.dg;
        this.ra = ahmVar.xh;
        this.fpz = ahmVar.fpp;
        this.lqi = ahmVar.um;
        this.jpc = ahmVar.sx;
        this.ft = ahmVar.gm;
        this.wy = ahmVar.ay;
    }

    private com.bytedance.sdk.component.noq.ahm kgy(ahm ahmVar) {
        if (ahmVar.vs != null) {
            return ahmVar.vs;
        }
        if (!TextUtils.isEmpty(ahmVar.kus)) {
            return com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.kgy(new File(ahmVar.kus));
        }
        return com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm.gf();
    }

    public int ct() {
        return this.fpz;
    }

    public String fi() {
        return this.rz;
    }

    public ImageView.ScaleType gf() {
        return this.noq;
    }

    public dg noq() {
        return this.ct;
    }

    public int uq() {
        return this.lqi;
    }

    public String yo() {
        return this.uq;
    }

    @Override // com.bytedance.sdk.component.noq.gf
    public int rz() {
        return this.gf;
    }

    @Override // com.bytedance.sdk.component.noq.gf
    public int ahm() {
        return this.fi;
    }

    @Override // com.bytedance.sdk.component.noq.gf
    public String kgy() {
        return this.ahm;
    }

    public void kgy(String str) {
        this.uq = str;
    }

    public void kgy(boolean z) {
        this.fpp = z;
    }

    public void kgy(byte[] bArr) {
        this.uf = bArr;
    }

    public void kgy(int i) {
        this.gm = i;
    }
}
