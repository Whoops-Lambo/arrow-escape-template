package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}
