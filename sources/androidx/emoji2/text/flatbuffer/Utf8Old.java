package androidx.emoji2.text.flatbuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class Utf8Old extends Utf8 {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Cache {
    }

    static {
        final a aVar = new a();
        new ThreadLocal() { // from class: d43
            @Override // java.lang.ThreadLocal
            public final /* synthetic */ Object initialValue() {
                return aVar.get();
            }
        };
    }
}
