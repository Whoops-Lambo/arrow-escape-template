package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.config.dynamic.utils.image.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p21 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ImageView c;

    public /* synthetic */ p21(Bitmap bitmap, ImageView imageView) {
        this.b = bitmap;
        this.c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ImageView imageView = this.c;
        Bitmap bitmap = this.b;
        switch (i) {
            case 0:
                imageView.setImageBitmap(bitmap);
                break;
            default:
                b.a(bitmap, imageView);
                break;
        }
    }

    public /* synthetic */ p21(ImageView imageView, Bitmap bitmap) {
        this.c = imageView;
        this.b = bitmap;
    }
}
