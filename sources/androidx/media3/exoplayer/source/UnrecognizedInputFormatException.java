package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import defpackage.d31;
import defpackage.y32;
import defpackage.z21;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public class UnrecognizedInputFormatException extends ParserException {
    public final d31 sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = d31.A(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, y32.e);
        z21 z21Var = d31.b;
    }
}
