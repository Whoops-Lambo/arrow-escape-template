package com.adsurge.adn.p011c0;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(File file, Object obj);

        void a(Object obj, int i, Exception exc);
    }

    Bitmap a(File file);

    void a(Object obj, Bitmap bitmap, float f, ImageView imageView);

    void a(Object obj, a aVar);

    void a(String str, a aVar);
}
