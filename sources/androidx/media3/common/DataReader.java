package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public interface DataReader {
    int read(byte[] bArr, int i, int i2) throws IOException;
}
