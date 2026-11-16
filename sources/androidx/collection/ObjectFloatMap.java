package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/ObjectFloatMap;", "K", "", "Landroidx/collection/MutableObjectFloatMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ObjectFloatMap<K> {
    public final int hashCode() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ObjectFloatMap) {
            throw null;
        }
        return false;
    }

    public final String toString() {
        return JsonUtils.EMPTY_JSON;
    }
}
