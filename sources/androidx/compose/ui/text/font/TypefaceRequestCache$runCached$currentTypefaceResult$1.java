package androidx.compose.ui.text.font;

import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.SynchronizedObject;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "finalResult", "Laz2;", "invoke", "(Landroidx/compose/ui/text/font/TypefaceResult;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends rc1 implements wr0 {
    public final /* synthetic */ TypefaceRequestCache i;
    public final /* synthetic */ TypefaceRequest j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest) {
        super(1);
        this.i = typefaceRequestCache;
        this.j = typefaceRequest;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        TypefaceResult typefaceResult = (TypefaceResult) obj;
        typefaceResult.getClass();
        TypefaceRequestCache typefaceRequestCache = this.i;
        SynchronizedObject synchronizedObject = typefaceRequestCache.a;
        TypefaceRequest typefaceRequest = this.j;
        synchronized (synchronizedObject) {
            try {
                boolean b = typefaceResult.getB();
                LruCache lruCache = typefaceRequestCache.b;
                if (b) {
                    lruCache.b(typefaceRequest, typefaceResult);
                } else {
                    lruCache.c(typefaceRequest);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return az2.a;
    }
}
