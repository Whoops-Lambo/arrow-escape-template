package io.p071bidmachine.rendering.internal.adform.countdown;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.os.StatFs;
import com.explorestack.protobuf.Struct;
import com.facebook.appevents.k;
import com.facebook.internal.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import defpackage.eu;
import defpackage.p62;
import defpackage.q7;
import defpackage.vj0;
import io.p071bidmachine.AdsType;
import io.p071bidmachine.ApiRequest;
import io.p071bidmachine.TrackEventType;
import io.p071bidmachine.core.b;
import io.p071bidmachine.f2;
import io.p071bidmachine.iab.mraid.MraidAdView;
import io.p071bidmachine.l1;
import io.p071bidmachine.media3.extractor.text.j;
import io.p071bidmachine.protobuf.AdExtension;
import io.p071bidmachine.protobuf.InitResponse;
import io.p071bidmachine.protobuf.analytics.events.SDKEvent;
import io.p071bidmachine.protobuf.sdk.Error;
import io.p071bidmachine.rendering.internal.adform.video.player.media.i;
import io.p071bidmachine.rendering.internal.view.c;
import io.p071bidmachine.rendering.internal.view.h;
import io.p071bidmachine.rendering.model.y;
import io.p071bidmachine.util.gradient.e;
import io.p071bidmachine.util.p;
import io.p071bidmachine.w1;
import io.p071bidmachine.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a implements c, io.p071bidmachine.rendering.c, i, io.p071bidmachine.rendering.internal.screenshot.a, b, e, io.p071bidmachine.utils.data.a {
    public final /* synthetic */ int a;
    public Object b;

    public String g(Object obj) {
        if (obj == null) {
            return null;
        }
        String strV = ((j) this.b).v(obj);
        if (strV != null) {
            return strV;
        }
        try {
            return String.valueOf(obj);
        } catch (Exception e) {
            io.p071bidmachine.core.a.i(e);
            return null;
        }
    }

    public a(int i) {
        this.a = i;
        switch (i) {
            case 16:
                this.b = new j(13);
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                executorServiceNewSingleThreadExecutor.getClass();
                this.b = executorServiceNewSingleThreadExecutor;
                break;
        }
    }

    public static boolean h(AdExtension.EventConfiguration eventConfiguration, int i, boolean z, long j, long j2, AdsType adsType, String str, Double d, Struct struct, io.p071bidmachine.utils.a aVar) {
        String url;
        if (eventConfiguration != null) {
            try {
                if (eventConfiguration.getActionsList().contains(Integer.valueOf(i)) && (url = eventConfiguration.getUrl()) != null && url.length() != 0) {
                    int i2 = 1;
                    if (aVar == null) {
                        io.p071bidmachine.core.a.a(new vj0(i, 10));
                    } else {
                        io.p071bidmachine.core.a.a(new l1(i, aVar, i2));
                    }
                    SDKEvent.Builder finishTime = SDKEvent.newBuilder().setAction(i).setBillable(z).setContext(eventConfiguration.getContext()).setStartTime(d.t(j)).setFinishTime(d.t(j2));
                    if (adsType != null) {
                        finishTime.setAdType(io.p071bidmachine.media3.common.audio.c.w(adsType.name()));
                    }
                    if (str != null && str.length() != 0) {
                        finishTime.setNetwork(io.p071bidmachine.media3.common.audio.c.w(str));
                    }
                    if (d != null) {
                        finishTime.setPrice(d.doubleValue());
                    }
                    if (struct != null) {
                        finishTime.setCustomParams(struct);
                    }
                    if (aVar != null) {
                        Error.Builder builderNewBuilder = Error.newBuilder();
                        Error.Data dataBuild = Error.Data.newBuilder().setCode(aVar.a).setDescription(aVar.b).build();
                        dataBuild.getClass();
                        Error.Builder error = builderNewBuilder.setError(dataBuild);
                        error.getClass();
                        io.p071bidmachine.utils.a aVar2 = aVar.d;
                        if (aVar2 != null) {
                            Error.Data dataBuild2 = Error.Data.newBuilder().setCode(aVar2.a).setDescription(aVar2.b).build();
                            dataBuild2.getClass();
                            error.setReason(dataBuild2);
                        }
                        finishTime.setError(error);
                    }
                    new ApiRequest.Builder().url(url).setMethod(io.p071bidmachine.core.e.Post).setDataBinder(new ApiRequest.ApiEventDataBinder()).setRequestData(finishTime.build()).request();
                    return true;
                }
            } catch (Throwable th) {
                io.p071bidmachine.core.a.i(th);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // io.p071bidmachine.rendering.internal.screenshot.a
    public void a(Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap;
        io.p071bidmachine.rendering.internal.detector.brokencreative.b bVar = (io.p071bidmachine.rendering.internal.detector.brokencreative.b) this.b;
        CopyOnWriteArrayList copyOnWriteArrayList = bVar.i;
        AtomicBoolean atomicBoolean = bVar.b;
        if (atomicBoolean.get()) {
            try {
                bitmap.recycle();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        double d = bVar.d;
        if (d > 1.0d) {
            try {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) / d), (int) (((double) bitmap.getHeight()) / d), true);
            } catch (Throwable unused2) {
                bitmapCreateScaledBitmap = null;
            }
            if (bitmapCreateScaledBitmap == null) {
                bitmapCreateScaledBitmap = bitmap;
            }
        } else {
            bitmapCreateScaledBitmap = bitmap;
        }
        if (!bitmapCreateScaledBitmap.equals(bitmap)) {
            try {
                bitmap.recycle();
            } catch (Throwable unused3) {
            }
        }
        if (atomicBoolean.get()) {
            try {
                bitmap.recycle();
                return;
            } catch (Throwable unused4) {
                return;
            }
        }
        ArrayList arrayList = bVar.e;
        ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(new io.p071bidmachine.rendering.internal.detector.brokencreative.a((io.p071bidmachine.rendering.internal.detector.brokencreative.algorithm.b) obj, bitmapCreateScaledBitmap, new q7(bVar, 2)));
        }
        copyOnWriteArrayList.addAll(arrayList2);
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            io.p071bidmachine.rendering.internal.detector.brokencreative.a aVar = (io.p071bidmachine.rendering.internal.detector.brokencreative.a) obj2;
            if (!bVar.g.a(aVar)) {
                copyOnWriteArrayList.remove(aVar);
                if (copyOnWriteArrayList.isEmpty() && !atomicBoolean.get()) {
                    bVar.f.invoke(bVar.j);
                }
            }
        }
    }

    @Override // io.p071bidmachine.util.gradient.e
    public Shader b(boolean z) {
        return (Shader) this.b;
    }

    public io.p071bidmachine.util.file.a c() {
        try {
            StatFs statFs = new StatFs(((File) this.b).getAbsolutePath());
            return new io.p071bidmachine.util.file.a(statFs.getTotalBytes(), statFs.getAvailableBytes());
        } catch (Throwable unused) {
            return null;
        }
    }

    public Float d(Object obj) {
        j jVar = (j) this.b;
        if (obj != null) {
            Float fU = jVar.u(obj);
            if (fU != null) {
                return fU;
            }
            Integer numA = jVar.a(obj);
            if (numA != null) {
                return Float.valueOf(numA.floatValue());
            }
            String strG = g(obj);
            if (strG != null) {
                try {
                    return Float.valueOf(strG);
                } catch (Exception e) {
                    io.p071bidmachine.core.a.i(e);
                }
            }
        }
        return null;
    }

    @Override // io.p071bidmachine.core.b
    public void f(Object obj) {
        io.p071bidmachine.utils.a aVar = (io.p071bidmachine.utils.a) obj;
        x1 x1Var = ((w1) this.b).a;
        long j = 0;
        if (x1Var.f.isEmpty()) {
            long j2 = x1Var.h;
            if (j2 <= 0) {
                x1Var.h = 2000L;
            } else {
                long j3 = j2 * 2;
                x1Var.h = j3;
                if (j3 >= 128000) {
                    x1Var.h = 128000L;
                }
            }
            j = x1Var.h;
            io.p071bidmachine.core.a.a(new p62(j));
            f2 f2Var = x1Var.g;
            if (f2Var != null) {
                f2Var.f(aVar);
            }
        }
        io.p071bidmachine.core.j.b.postDelayed(x1Var.d, j);
        x1Var.c.eventFinish(TrackEventType.InitLoading, null, null, aVar);
    }

    @Override // io.p071bidmachine.util.i
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 1:
                String str = (String) obj;
                str.getClass();
                ((j0) this.b).onSuccess(str);
                break;
            default:
                InitResponse initResponse = (InitResponse) obj;
                x1 x1Var = ((w1) this.b).a;
                x1Var.h = 0L;
                io.p071bidmachine.core.j.b.removeCallbacks(x1Var.d);
                f2 f2Var = x1Var.g;
                if (f2Var != null) {
                    f2Var.onSuccess(initResponse);
                }
                x1Var.c.eventFinish(TrackEventType.InitLoading, null, null, null);
                io.p071bidmachine.internal.e eVar = x1Var.i;
                eVar.getClass();
                try {
                    File file = new File(eVar.a.getFilesDir(), "bm/quality/startup");
                    file.mkdirs();
                    k.j(file);
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }

    @Override // io.p071bidmachine.rendering.c
    public void e(io.p071bidmachine.util.e eVar) {
        eVar.getClass();
        MraidAdView mraidAdView = (MraidAdView) ((j0) this.b).b;
        mraidAdView.o.set(false);
        mraidAdView.f.y(mraidAdView);
    }

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public a(AdExtension.EventConfiguration eventConfiguration) {
        this.a = 12;
        this.b = eventConfiguration == AdExtension.EventConfiguration.getDefaultInstance() ? null : eventConfiguration;
    }

    @Override // io.p071bidmachine.rendering.internal.view.c, io.p071bidmachine.rendering.internal.screenshot.a
    public void a() {
        switch (this.a) {
            case 0:
                ((b) this.b).a.b(y.OnComplete, null, null);
                break;
            case 4:
                io.p071bidmachine.rendering.internal.detector.brokencreative.b bVar = (io.p071bidmachine.rendering.internal.detector.brokencreative.b) this.b;
                if (!bVar.b.get()) {
                    bVar.f.invoke(bVar.j);
                    break;
                }
                break;
            default:
                h hVar = (h) this.b;
                p.A(hVar.a);
                p.W(hVar.b);
                break;
        }
    }

    @Override // io.p071bidmachine.utils.data.a
    public Integer a(Object obj) {
        j jVar = (j) this.b;
        if (obj != null) {
            Integer numA = jVar.a(obj);
            if (numA != null) {
                return numA;
            }
            Double dT = jVar.t(obj);
            if (dT != null) {
                return Integer.valueOf(dT.intValue());
            }
            Float fU = jVar.u(obj);
            if (fU != null) {
                return Integer.valueOf(fU.intValue());
            }
            String strV = jVar.v(obj);
            if (strV != null) {
                try {
                    return Integer.valueOf(strV);
                } catch (Exception e) {
                    io.p071bidmachine.core.a.i(e);
                }
            }
        }
        return null;
    }
}
