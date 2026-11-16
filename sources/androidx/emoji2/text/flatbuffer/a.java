package androidx.emoji2.text.flatbuffer;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = Utf8Old.b;
        Utf8Old.Cache cache = new Utf8Old.Cache();
        Charset charset = StandardCharsets.UTF_8;
        charset.newEncoder();
        charset.newDecoder();
        return cache;
    }
}
