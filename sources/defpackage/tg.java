package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class tg extends View {
    public Bitmap a;
    public final /* synthetic */ sm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(sm smVar, Context context) {
        super(context);
        this.b = smVar;
    }

    public final void a(SurfaceView surfaceView) {
        this.a = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThreadH = jc1.h("PlaceHolderView");
        Semaphore semaphore = new Semaphore(0);
        PixelCopy.request(surfaceView, this.a, new t(this, semaphore), new Handler(handlerThreadH.getLooper()));
        try {
            if (!semaphore.tryAcquire(2000L, TimeUnit.MILLISECONDS)) {
                uj2.a(5, "Timeout while copying surface view.");
            }
        } catch (InterruptedException e) {
            uj2.a(6, e.getMessage());
        }
        handlerThreadH.quitSafely();
    }
}
