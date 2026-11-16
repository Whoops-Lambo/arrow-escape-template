package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.caches.ContainerHelpersKt;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.SynchronizedObject;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "AsyncTypefaceResult", "Key", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AsyncTypefaceCache {
    public final LruCache a = new LruCache();
    public final SimpleArrayMap b;
    public final SynchronizedObject c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "result", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AsyncTypefaceResult {
        public final Object a;

        public final boolean equals(Object obj) {
            if (obj instanceof AsyncTypefaceResult) {
                return s71.b(this.a, ((AsyncTypefaceResult) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.a + ')';
        }

        public /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.a = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Key {
        public final Font a;
        public final Object b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return s71.b(this.a, key.a) && s71.b(this.b, key.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Key(font=" + this.a + ", loaderKey=" + this.b + ')';
        }

        public Key(Font font, Object obj) {
            font.getClass();
            this.a = font;
            this.b = obj;
        }
    }

    public AsyncTypefaceCache() {
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        simpleArrayMap.a = ContainerHelpersKt.a;
        simpleArrayMap.b = ContainerHelpersKt.b;
        simpleArrayMap.c = 0;
        this.b = simpleArrayMap;
        this.c = new SynchronizedObject();
    }

    public static void a(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj) {
        asyncTypefaceCache.getClass();
        platformFontLoader.getClass();
        Object obj2 = null;
        Key key = new Key(font, null);
        synchronized (asyncTypefaceCache.c) {
            try {
                if (obj == null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
