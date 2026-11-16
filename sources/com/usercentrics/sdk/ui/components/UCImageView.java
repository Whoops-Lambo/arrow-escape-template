package com.usercentrics.sdk.ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.usercentrics.sdk.UsercentricsImage;
import defpackage.a33;
import defpackage.aw2;
import defpackage.az2;
import defpackage.ba0;
import defpackage.cm2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.er;
import defpackage.fw2;
import defpackage.fy;
import defpackage.gw2;
import defpackage.hh;
import defpackage.j52;
import defpackage.k52;
import defpackage.kc2;
import defpackage.li2;
import defpackage.ni;
import defpackage.tb5;
import defpackage.u7;
import defpackage.wv2;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.xp;
import defpackage.xv2;
import defpackage.y80;
import defpackage.yv2;
import defpackage.zv2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/usercentrics/sdk/ui/components/UCImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "imageUrl", "Laz2;", "setImageUrl", "(Ljava/lang/String;)V", "Lcom/usercentrics/sdk/UsercentricsImage;", "image", "setImage", "(Lcom/usercentrics/sdk/UsercentricsImage;)V", "Lgw2;", "a", "Lgd1;", "getRemoteImageService", "()Lgw2;", "remoteImageService", "La33;", "b", "getLogger", "()La33;", "logger", "Lwv2;", "c", "Lwv2;", "getCornerSettings", "()Lwv2;", "setCornerSettings", "(Lwv2;)V", "cornerSettings", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UCImageView extends AppCompatImageView {
    public final cm2 a;
    public final cm2 b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public wv2 cornerSettings;
    public li2 d;

    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00b7, please report this as an issue */
    public static final Object d(UCImageView uCImageView, String str, fy fyVar) {
        yv2 yv2Var;
        String str2;
        Object j52Var;
        Throwable thB;
        UCImageView uCImageView2;
        Throwable th;
        a33 logger;
        UCImageView uCImageView3;
        if (fyVar instanceof yv2) {
            yv2Var = (yv2) fyVar;
            int i = yv2Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                yv2Var.x = i - Integer.MIN_VALUE;
            } else {
                yv2Var = new yv2(uCImageView, fyVar);
            }
        } else {
            yv2Var = new yv2(uCImageView, fyVar);
        }
        Object objE = yv2Var.v;
        int i2 = yv2Var.x;
        byte b = 0;
        dz dzVar = dz.a;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        uCImageView = (UCImageView) yv2Var.t;
                        str = yv2Var.s;
                        uCImageView3 = yv2Var.r;
                        try {
                            wz2.a0(objE);
                        } catch (Throwable th2) {
                            th = th2;
                            uCImageView = uCImageView3;
                            str2 = str;
                            j52Var = new j52(th);
                            thB = k52.b(j52Var);
                            if (thB != null) {
                                yv2Var.r = uCImageView;
                                yv2Var.s = str2;
                                yv2Var.t = j52Var;
                                yv2Var.u = thB;
                                yv2Var.x = 3;
                                if (ep0.P(yv2Var) == dzVar) {
                                    return dzVar;
                                }
                                uCImageView2 = uCImageView;
                                th = thB;
                                logger = uCImageView2.getLogger();
                                if (logger != null) {
                                    logger.error("Error when loading image with URL<" + str2 + ">, please make sure that you are proving a https:// URL in the Admin Interface", th);
                                }
                            }
                            return j52Var instanceof j52 ? null : j52Var;
                        }
                    } else {
                        if (i2 == 2) {
                            str = yv2Var.s;
                            uCImageView = yv2Var.r;
                            wz2.a0(objE);
                            str2 = str;
                            j52Var = (fw2) objE;
                            thB = k52.b(j52Var);
                            if (thB != null) {
                                yv2Var.r = uCImageView;
                                yv2Var.s = str2;
                                yv2Var.t = j52Var;
                                yv2Var.u = thB;
                                yv2Var.x = 3;
                                if (ep0.P(yv2Var) == dzVar) {
                                    return dzVar;
                                }
                                uCImageView2 = uCImageView;
                                th = thB;
                            }
                            return j52Var instanceof j52 ? null : j52Var;
                        }
                        if (i2 != 3) {
                            e32.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = yv2Var.u;
                        j52Var = yv2Var.t;
                        str2 = yv2Var.s;
                        uCImageView2 = yv2Var.r;
                        wz2.a0(objE);
                    }
                    logger = uCImageView2.getLogger();
                    if (logger != null) {
                        logger.error("Error when loading image with URL<" + str2 + ">, please make sure that you are proving a https:// URL in the Admin Interface", th);
                    }
                    return j52Var instanceof j52 ? null : j52Var;
                }
                wz2.a0(objE);
                yv2Var.r = uCImageView;
                yv2Var.s = str;
                yv2Var.t = uCImageView;
                yv2Var.x = 1;
                if (ep0.P(yv2Var) == dzVar) {
                    return dzVar;
                }
                uCImageView3 = uCImageView;
                uCImageView.getClass();
                ba0 ba0Var = xc0.a;
                objE = tb5.E(y80.c, new hh(uCImageView, str, b == true ? 1 : 0, 5), yv2Var);
                if (objE == dzVar) {
                    return dzVar;
                }
                uCImageView = uCImageView3;
                str2 = str;
                j52Var = (fw2) objE;
                thB = k52.b(j52Var);
                if (thB != null) {
                    yv2Var.r = uCImageView;
                    yv2Var.s = str2;
                    yv2Var.t = j52Var;
                    yv2Var.u = thB;
                    yv2Var.x = 3;
                    if (ep0.P(yv2Var) == dzVar) {
                        return dzVar;
                    }
                    uCImageView2 = uCImageView;
                    th = thB;
                    logger = uCImageView2.getLogger();
                    if (logger != null) {
                        logger.error("Error when loading image with URL<" + str2 + ">, please make sure that you are proving a https:// URL in the Admin Interface", th);
                    }
                }
                return j52Var instanceof j52 ? null : j52Var;
            } catch (Throwable th3) {
                th = th3;
                uCImageView = uCImageView3;
                str2 = str;
                j52Var = new j52(th);
            }
            yv2Var.r = uCImageView3;
            yv2Var.s = str;
            yv2Var.t = null;
            yv2Var.x = 2;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(UCImageView uCImageView, String str, byte[] bArr, fy fyVar) {
        zv2 zv2Var;
        UCImageView uCImageView2;
        Throwable th;
        Object j52Var;
        a33 logger;
        if (fyVar instanceof zv2) {
            zv2Var = (zv2) fyVar;
            int i = zv2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv2Var.w = i - Integer.MIN_VALUE;
            } else {
                zv2Var = new zv2(uCImageView, fyVar);
            }
        } else {
            zv2Var = new zv2(uCImageView, fyVar);
        }
        Object objE = zv2Var.u;
        int i2 = zv2Var.w;
        dy dyVar = null;
        az2 az2Var = az2.a;
        if (i2 == 0) {
            wz2.a0(objE);
            try {
                zv2Var.r = uCImageView;
                zv2Var.s = str;
                zv2Var.t = uCImageView;
                zv2Var.w = 1;
                ba0 ba0Var = xc0.a;
                objE = tb5.E(y80.c, new ni(bArr, dyVar, 6), zv2Var);
                dz dzVar = dz.a;
                if (objE == dzVar) {
                    return dzVar;
                }
                uCImageView2 = uCImageView;
            } catch (Throwable th2) {
                uCImageView2 = uCImageView;
                th = th2;
                j52Var = new j52(th);
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uCImageView = zv2Var.t;
            str = zv2Var.s;
            uCImageView2 = zv2Var.r;
            try {
                wz2.a0(objE);
            } catch (Throwable th3) {
                th = th3;
                j52Var = new j52(th);
            }
        }
        uCImageView.setImageBitmap((Bitmap) objE);
        j52Var = az2Var;
        Throwable thB = k52.b(j52Var);
        if (thB != null && (logger = uCImageView2.getLogger()) != null) {
            logger.error("Error when trying to use image with URL<" + str + "> as a Bitmap", thB);
        }
        return az2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(UCImageView uCImageView, String str, byte[] bArr, fy fyVar) {
        aw2 aw2Var;
        Object j52Var;
        a33 logger;
        if (fyVar instanceof aw2) {
            aw2Var = (aw2) fyVar;
            int i = aw2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw2Var.v = i - Integer.MIN_VALUE;
            } else {
                aw2Var = new aw2(uCImageView, fyVar);
            }
        } else {
            aw2Var = new aw2(uCImageView, fyVar);
        }
        Object obj = aw2Var.t;
        int i2 = aw2Var.v;
        az2 az2Var = az2.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                String str2 = new String(bArr, er.a);
                aw2Var.r = uCImageView;
                aw2Var.s = str;
                aw2Var.v = 1;
                ba0 ba0Var = xc0.a;
                Object objE = tb5.E(y80.c, new xv2(str2, uCImageView, null), aw2Var);
                dz dzVar = dz.a;
                if (objE != dzVar) {
                    objE = az2Var;
                }
                if (objE == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = aw2Var.s;
                uCImageView = aw2Var.r;
                wz2.a0(obj);
            }
            j52Var = az2Var;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null && (logger = uCImageView.getLogger()) != null) {
            if (thB instanceof NoClassDefFoundError) {
                logger.error("Error when trying to use image with URL<" + str + "> as a SVG because the optional SVG module is not present. Please add this module to your application: 'com.pixplicity.sharp'", null);
            } else {
                logger.error("Error when trying to use image with URL<" + str + "> as a SVG", thB);
            }
        }
        return az2Var;
    }

    private final a33 getLogger() {
        return (a33) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gw2 getRemoteImageService() {
        return (gw2) this.a.getValue();
    }

    @Nullable
    public final wv2 getCornerSettings() {
        return this.cornerSettings;
    }

    public final void setCornerSettings(@Nullable wv2 wv2Var) {
        this.cornerSettings = wv2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = new cm2(u7.F);
        this.b = new cm2(u7.E);
    }

    private final void setImageUrl(String imageUrl) {
        this.d = tb5.t(kc2.b(), null, null, new xp(this, imageUrl, (dy) null, 10), 3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        wv2 wv2Var = this.cornerSettings;
        if (wv2Var != null) {
            float width = getWidth();
            float height = getHeight();
            Float f = wv2Var.b;
            Float f2 = wv2Var.a;
            float[] fArr = {f2.floatValue(), f2.floatValue(), f.floatValue(), f.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f};
            Path path = new Path();
            path.addRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height), fArr, Path.Direction.CW);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public final void setImage(@NotNull UsercentricsImage image) {
        image.getClass();
        if (image instanceof UsercentricsImage.ImageDrawableId) {
            setImageResource(((UsercentricsImage.ImageDrawableId) image).getDrawableResId());
            return;
        }
        if (image instanceof UsercentricsImage.ImageBitmap) {
            setImageBitmap(((UsercentricsImage.ImageBitmap) image).getBitmap());
        } else if (image instanceof UsercentricsImage.ImageUrl) {
            setImageUrl(((UsercentricsImage.ImageUrl) image).getImageUrl());
        } else if (image instanceof UsercentricsImage.ImageDrawable) {
            setImageDrawable(((UsercentricsImage.ImageDrawable) image).getDrawable());
        }
    }
}
