package defpackage;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import com.inmobi.media.Ih;
import com.vungle.ads.internal.util.j;
import io.p071bidmachine.rendering.internal.screenshot.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f21 implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f21(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                Ih.a((h32) obj2, (Ih) obj, i);
                break;
            case 1:
                a aVar = (a) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i != 0) {
                    aVar.a();
                } else {
                    aVar.a(bitmap);
                }
                break;
            default:
                j.a((wr0) obj2, (Bitmap) obj, i);
                break;
        }
    }
}
