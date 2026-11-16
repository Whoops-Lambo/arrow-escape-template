package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public abstract class ImageOutputBuffer extends DecoderOutputBuffer {

    @Nullable
    public Bitmap bitmap;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    @CallSuper
    public void clear() {
        this.bitmap = null;
        super.clear();
    }
}
