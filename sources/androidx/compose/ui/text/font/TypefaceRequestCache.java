package androidx.compose.ui.text.font;

import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TypefaceRequestCache {
    public final SynchronizedObject a = new SynchronizedObject();
    public final LruCache b = new LruCache();
}
